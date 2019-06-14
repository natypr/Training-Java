package main.by.naty.model.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team {

    private final List<Employee> team = new ArrayList<>();

    public void add(Employee employee) {
        team.add(employee);
    }

    public List<Employee> getTeam(){
        return team;
    }

    public Employee getEmployee(int index) {
        return team.get(index);
    }

    public Employee setEmployee(Employee employee, int index) {
        return team.set(index, employee);
    }

    public int size() {
        return team.size();
    }

    public void sort(Comparator<Employee> comparator){
        team.sort(comparator);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Employee emp : team) {
            str.append(emp).append(" ");
        }
        return str.toString();
    }
}
