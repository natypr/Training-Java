package by.naty.model.util;

import by.naty.model.entity.Employee;
import by.naty.model.entity.Team;
import by.naty.serialization.FileSerialization;
import by.naty.serialization.Serialization;

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
