package by.naty;

import by.naty.model.entity.Team;
import by.naty.model.logic.Calculate;
import by.naty.model.util.LoadFile;

import java.io.IOException;
import java.io.InputStream;

import static by.naty.model.logic.Calculate.COMPARATOR_OF_SALARY;
import static by.naty.model.logic.Calculate.COMPARATOR_OF_SALARY_AND_HOUR;
import static by.naty.model.util.ConsoleInput.readDouble;

public class Main {

    public static void main(String[] args) throws IOException {

        Team team;
        try(InputStream stream = Main.class.getClassLoader().getResourceAsStream("employee.txt")){
            team = LoadFile.loadFromFile(stream);
        }

        System.out.println("Team list:");
        team.toString();

        System.out.println("\nSort by salary:");
        Calculate.sort(COMPARATOR_OF_SALARY);
        team.toString();

        System.out.println("\nSort by salary and hour:");
        Calculate.sort(COMPARATOR_OF_SALARY_AND_HOUR);
        team.toString();


        double cost = Calculate.costInManHours(team);
        System.out.println("\nTeam cost in man-hours is " + cost);


        double min, max;
        System.out.print("\nInput minimum salary to search: ");
        min = readDouble();
        System.out.print("Input maximum salary to search: ");
        max = readDouble();

        System.out.println("\nFilter by salary: ");
        Calculate.filterBySalary(team, min, max);
        team.toString();
    }
}
