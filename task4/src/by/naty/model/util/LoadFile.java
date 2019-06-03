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
            while (reader.hasMoreTokens()) {
                try {
                    Employee employee = new Employee();
                    employee.deserialize(reader);
                    team.add(employee);

                    if (!reader.readDelimiter()) {
                        throw new IllegalArgumentException("Deserialize didn't consume all its input");
                    }
                }
                catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
            return team;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
