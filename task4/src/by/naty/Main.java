package by.naty;

import by.naty.model.entity.Team;
import by.naty.model.util.LoadFile;

import java.io.IOException;
import java.io.InputStream;

import static by.naty.model.entity.Team.COMPARATOR_OF_SALARY;
import static by.naty.model.entity.Team.COMPARATOR_OF_SALARY_AND_HOUR;
import static by.naty.model.util.ConsoleInput.readDouble;

public class Main {

    public static void main(String[] args) throws IOException {

        Team team;
        //todo чтение не читает(
        try(InputStream stream = Main.class.getClassLoader().getResourceAsStream("src\\resources\\employee.txt")){
            team = LoadFile.loadFromFile(stream);
        }

        System.out.println("Team list:");
        team.toString();

        System.out.println("\nSort by salary:");
        team.sort(COMPARATOR_OF_SALARY);
        team.toString();

        System.out.println("\nSort by salary and hour:");
        team.sort(COMPARATOR_OF_SALARY_AND_HOUR);
        team.toString();


        double cost = team.costInManHours();
        System.out.println("\nTeam cost in man-hours is " + cost);


        double min, max;
        System.out.print("\nInput minimum salary to search: ");
        min = readDouble();
        System.out.print("Input maximum salary to search: ");
        max = readDouble();

        System.out.println("\nFilter by salary: ");
        team.filterBySalary(min, max);
        team.toString();
    }
}
