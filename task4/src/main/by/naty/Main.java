package main.by.naty;

import main.by.naty.model.entity.Team;
import main.by.naty.model.logic.Manager;
import main.by.naty.util.LoadFile;
import main.by.naty.util.ConsoleInput;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import static main.by.naty.model.logic.Manager.COMPARATOR_OF_SALARY;
import static main.by.naty.model.logic.Manager.COMPARATOR_OF_SALARY_AND_HOUR;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        log.info("Start application.");

        Team team;
        try(InputStream stream = Main.class.getClassLoader().getResourceAsStream("/employee.txt")){
            team = LoadFile.loadFromFile(stream);
            log.info("End of loading.");
        }

        System.out.println("Team list:");
        team.toString();

        System.out.println("\nSort by salary:");
      //  Manager.sort(COMPARATOR_OF_SALARY);
        Manager.insertionSort(team, team.size(), COMPARATOR_OF_SALARY);
        team.toString();

        System.out.println("\nSort by salary and hour:");
      //  Manager.sort(COMPARATOR_OF_SALARY_AND_HOUR);
        Manager.insertionSort(team, team.size(), COMPARATOR_OF_SALARY_AND_HOUR);
        team.toString();


        double cost = Manager.costInManHours(team);
        System.out.println("\nTeam cost in man-hours is " + cost);


        double min, max;
        System.out.print("\nInput minimum salary to search: ");
        min = ConsoleInput.readDouble();
        System.out.print("Input maximum salary to search: ");
        max = ConsoleInput.readDouble();

        System.out.println("\nFilter by salary: ");
        Manager.filterBySalary(team, min, max);
        team.toString();
    }
}
