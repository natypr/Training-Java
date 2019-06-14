package main.by.naty.model.logic;

import main.by.naty.model.entity.Employee;
import main.by.naty.model.entity.Team;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private static final Logger log = Logger.getLogger(Manager.class);

    public static final Comparator<Employee> COMPARATOR_OF_SALARY =
            Comparator.comparing(obj -> obj.getSalary().orElse(0.0));

    public static final Comparator<Employee> COMPARATOR_OF_SALARY_AND_HOUR =
            COMPARATOR_OF_SALARY.thenComparing(obj -> obj.getHour().orElse(0));


    public static double costInManHours(Team team) {
        log.info("Man hour counting.");
        double sum = 0;
        for (Employee employee : team.getTeam()) {
            sum += employee.getSalary().orElse(0.0) / employee.getHour().orElse(1);
        }
        return sum;
    }


    public static List<Employee> filterBySalary(Team team, double min, double max) {
        log.info("Filtering list by salary.");
        List<Employee> list = new ArrayList<>();
        for (Employee employee : team.getTeam()) {
            if ((employee.getSalary().orElse(-1.0) >= min) && (employee.getSalary().orElse(-1.0) <= max)) {
                list.add(employee);
            }
        }
        return list;
    }


    /*public static void sort(Comparator<Employee> comparator) {
        log.info("Inline sorting.");
        sort(comparator);
    }*/


    public static void insertionSort(Team team, int size, Comparator<Employee> comparator){
        log.info("My insertion sort.");
        int j = 0;
        Employee temp = null;

        for (int i = 0; i < size - 1; i++){
            if (comparator.compare(team.getEmployee(i), team.getEmployee(i+1)) > 0) {	//array[i] > array[i+1]
                temp = team.getEmployee(i+1);					                            //temp = array[i+1];
                team.setEmployee(team.getEmployee(i), i+1);			                    //array[i+1] = array[i];
                j = i;
            }
            while ((j > 0) && (comparator.compare(team.getEmployee(j-1), temp) > 0)){	//(array[j-1] > temp)
                team.setEmployee(team.getEmployee(j-1), j);				                //array[j] = array[j-1];
                j--;
            }
            team.setEmployee(temp, j);			                                                //array[j] = temp;
        }
    }
}
