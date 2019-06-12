package main.by.naty.util;

import main.by.naty.model.entity.Employee;
import main.by.naty.model.entity.Team;
import main.by.naty.model.factory.EmployeeType;
import main.by.naty.model.factory.Factory;
import main.by.naty.model.serialization.FileSerialization;
import main.by.naty.model.serialization.Serialization;

import java.io.InputStream;

public class LoadFile {

    public static Team loadFromFile(InputStream stream)
    {
        try (Serialization reader = new FileSerialization(stream)) {
            Team team = new Team();

            Factory factory = Factory.getInstance();

            while (reader.hasMoreTokens()) {
                try {
                    EmployeeType positionType = EmployeeType.valueOf(reader.readString());
                    Employee employee = factory.create(positionType, new Employee());

                    employee.deserialize(reader);

                    if (!reader.readDelimiter()) {
                        throw new IllegalArgumentException("Deserialize didn't consume all its input");
                    }

                    team.add(employee);

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            return team;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
