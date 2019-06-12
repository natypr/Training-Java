package main.by.naty.model.entity.position;

import main.by.naty.model.entity.Employee;

import java.util.Optional;

public class TeamLead extends Employee {

    public TeamLead(Optional<Integer> hour, Optional<Double> salary, Optional<String> position) {
        super(hour, salary, position);
    }

}
