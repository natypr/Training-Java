package by.naty.model.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team {

    private final List<Employee> team = new ArrayList<>();

    public static final Comparator<Employee> COMPARATOR_OF_SALARY =
            Comparator.comparing(obj -> obj.getSalary().orElse(0.0));

    public static final Comparator<Employee> COMPARATOR_OF_SALARY_AND_HOUR =
            COMPARATOR_OF_SALARY.thenComparing(obj -> obj.getHour().orElse(0));

    public void add(Employee employee) {
        team.add(employee);
    }

    public void sort(Comparator<Employee> comparator){
        team.sort(comparator);
    }

    public List<Employee> filterBySalary(double min, double max) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : team) {
            if ((employee.getSalary().orElse(-1.0) >= min) && (employee.getSalary().orElse(-1.0) <= max)) {
                list.add(employee);
            }
        }
        return list;
    }

    public double costInManHours(){
        double sum = 0;
        for (Employee employee : team){
            sum += employee.getSalary().orElse(0.0) / employee.getHour().orElse(1);
        }
        return sum;
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < team.size(); i++) {
            str += team.get(i) + " ";
        }
        return str;
    }
}
