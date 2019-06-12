package main.by.naty.model.entity.position;

import main.by.naty.model.entity.Employee;

import java.util.Optional;

public class Senior extends Employee {

    public Senior(Optional<Integer> hour, Optional<Double> salary, Optional<String> position) {
        super(hour, salary, position);
    }

}