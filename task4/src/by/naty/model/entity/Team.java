package by.naty.model.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team {

    private final List<Employee> team = new ArrayList<>();

    public void add(Employee employee)
    {
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

}
