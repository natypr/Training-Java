package main.by.naty.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(team);
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < team.size(); i++) {
            str += team.get(i) + " ";
        }
        return str;
    }
}
