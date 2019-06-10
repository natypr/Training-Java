package by.naty.model.logic;

import by.naty.model.entity.Employee;
import by.naty.model.entity.Team;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Calculate {

    public static final Comparator<Employee> COMPARATOR_OF_SALARY =
            Comparator.comparing(obj -> obj.getSalary().orElse(0.0));

    public static final Comparator<Employee> COMPARATOR_OF_SALARY_AND_HOUR =
            COMPARATOR_OF_SALARY.thenComparing(obj -> obj.getHour().orElse(0));


    public static double costInManHours(Team team) {
        double sum = 0;
        for (Employee employee : team) {
            sum += employee.getSalary().orElse(0.0) / employee.getHour().orElse(1);
        }
        return sum;
    }


    public static List<Employee> filterBySalary(Team team, double min, double max) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : team) {
            if ((employee.getSalary().orElse(-1.0) >= min) && (employee.getSalary().orElse(-1.0) <= max)) {
                list.add(employee);
            }
        }
        return list;
    }

    public static void sort(Comparator<Employee> comparator) {
        sort(comparator);
    }
}
