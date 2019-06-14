package main.by.naty.util;

import main.by.naty.model.entity.Employee;
import main.by.naty.model.entity.Team;
import main.by.naty.model.factory.EmployeeType;
import main.by.naty.model.factory.Factory;
import main.by.naty.model.serialization.FileSerialization;
import main.by.naty.model.serialization.ISerialization;
import org.apache.log4j.Logger;

import java.io.InputStream;

public class LoadFile {
    private static final Logger log = Logger.getLogger(LoadFile.class);

    public static Team loadFromFile(InputStream stream)
    {
        try (ISerialization reader = new FileSerialization(stream)) {
            log.info("Serialization.");
            Team team = new Team();

            Factory factory = Factory.getInstance();

            while (reader.hasMoreTokens()) {

                EmployeeType positionType = EmployeeType.valueOf(reader.readString());
                log.info("An employee of type " + positionType + " will be created.");

                Employee employee = factory.create(positionType, new Employee());

                employee.deserialize(reader);

                if (!reader.readDelimiter()) {
                    log.warn("Non deserialized values remain!");
                    throw new MyException("Deserialize didn't consume all its input");
                }

                team.add(employee);
                log.info("Employee has been added.");

            }
            return team;

        } catch (Exception e) {
            log.warn("ISerialization didn't occur: " + e + "!");
            throw new RuntimeException(e);
        }
    }

}
