package by.naty.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final List<Employee> team = new ArrayList<>();

    public void add(Employee employee)
    {
        team.add(employee);
    }

}
