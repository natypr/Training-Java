package main.by.naty.util;

import main.by.naty.model.entity.Employee;
import main.by.naty.model.entity.Team;
import main.by.naty.model.factory.EmployeeType;
import main.by.naty.model.factory.Factory;
import main.by.naty.model.serialization.FileSerialization;
import main.by.naty.model.serialization.Serialization;

import java.io.InputStream;
import java.util.logging.Logger;

public class LoadFile {
    private static final Logger log = Logger.getLogger(LoadFile.class.getName());

    public static Team loadFromFile(InputStream stream)
    {
        try (Serialization reader = new FileSerialization(stream)) {
            log.info("Serialization.");
            Team team = new Team();

            Factory factory = Factory.getInstance();

            while (reader.hasMoreTokens()) {
                log.info("There are still tokens.");

                try {
                    EmployeeType positionType = EmployeeType.valueOf(reader.readString());
                    log.info("An employee of type " + positionType + " will be created.");

                    Employee employee = factory.create(positionType, new Employee());

                    employee.deserialize(reader);

                    if (!reader.readDelimiter()) {
                        log.warning("Non deserialized values remain!");
                        throw new IllegalArgumentException("Deserialize didn't consume all its input");
                    }

                    team.add(employee);
                    log.info("Employee has been added.");

                } catch (Exception e) {
                    log.warning("Unknown exception: " + e + "!");
                    System.err.println(e.getMessage());
                }
            }
            return team;

        } catch (Exception e) {
            log.warning("Serialization didn't occur: " + e + "!");
            throw new RuntimeException(e);
        }
    }

}
