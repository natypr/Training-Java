package main.by.naty.model.entity;


import java.util.Optional;

public class Senior extends Employee {

    public Senior(Optional<Integer> hour, Optional<Double> salary, Optional<String> position) {
        super(hour, salary, position);
    }

}