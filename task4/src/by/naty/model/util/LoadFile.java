package by.naty.model.util;

import by.naty.model.entity.Employee;
import by.naty.model.entity.Team;
import by.naty.serialization.FileSerialization;
import by.naty.serialization.Serialization;

import java.io.File;

public class LoadFile {

    public static void loadFromFile(File file)
    {
        try (Serialization reader = new FileSerialization(file)) {
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
        }
        catch (Exception e) {
            System.err.println("Error loading from file '" + file.getAbsolutePath() + "': " + e.getMessage());
        }
    }

}
