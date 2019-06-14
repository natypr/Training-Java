package main.by.naty;

import main.by.naty.model.entity.Team;
import main.by.naty.model.logic.Manager;
import main.by.naty.util.LoadFile;
import main.by.naty.util.ConsoleInput;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

import static main.by.naty.model.logic.Manager.COMPARATOR_OF_SALARY;
import static main.by.naty.model.logic.Manager.COMPARATOR_OF_SALARY_AND_HOUR;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        log.info("Start application.");

        Team team;
        try(InputStream stream = Main.class.getClassLoader().getResourceAsStream("employee.txt")){
            if (stream == null) {
                System.out.println("Employees file cannot be found as resource!!!");
                System.exit(0);
            }
            team = LoadFile.loadFromFile(stream);
            log.info("End of loading.");
        }

        System.out.println("Team list:");
        System.out.println(team.toString());

        System.out.println("\nSort by salary:");
      //  team.sort(COMPARATOR_OF_SALARY);
        Manager.insertionSort(team, team.size(), COMPARATOR_OF_SALARY);
        System.out.println(team.toString());

        System.out.println("\nSort by salary and hour:");
        Manager.insertionSort(team, team.size(), COMPARATOR_OF_SALARY_AND_HOUR);
        System.out.println(team.toString());


      //  double cost = Manager.costInManHours(team);
      //  System.out.println("\nTeam cost in man-hours is " + cost);


        double min, max;
        System.out.print("\nInput minimum salary to search: ");
        min = ConsoleInput.readDouble();
        System.out.print("Input maximum salary to search: ");
        max = ConsoleInput.readDouble();

        System.out.println("\nFilter by salary: ");
      //  Manager.filterBySalary(team, min, max);
        System.out.println(team.toString());
    }
}
