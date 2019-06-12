package main.by.naty.model.entity.position;

import main.by.naty.model.entity.Employee;

import java.util.Optional;

public class Junior extends Employee {

    public Junior(Optional<Integer> hour, Optional<Double> salary, Optional<String> position) {
        super(hour, salary, position);
    }

}
