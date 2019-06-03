package by.naty;

import by.naty.model.entity.Team;
import by.naty.model.util.LoadFile;

import java.io.IOException;
import java.io.InputStream;

import static by.naty.model.entity.Employee.COMPARATOR_OF_HOUR;
import static by.naty.model.entity.Employee.COMPARATOR_OF_SALARY;
import static by.naty.model.util.ConsoleInput.readDouble;

public class Main {
    public static void main(String[] args) throws IOException {

        Team team;
        try(InputStream stream = Main.class.getClassLoader().getResourceAsStream("employee.txt")){
            team = LoadFile.loadFromFile(stream);
        }

        team.sort(COMPARATOR_OF_SALARY);
        team.sort(COMPARATOR_OF_HOUR);

        double cost = team.costInManHours();
        System.out.println("Team cost in man-hours is " + cost);


        double min, max;
        System.out.print("\nInput minimum salary to search: ");
        min = readDouble();
        System.out.print("Input maximum salary to search: ");
        max = readDouble();

        team.filterBySalary(min, max);
    }
}
