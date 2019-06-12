package main.by.naty.model.entity;

import main.by.naty.model.serialization.Serialization;

import java.util.Optional;
import java.util.logging.Logger;

public class Employee extends Person {
    private static final Logger log = Logger.getLogger(Employee.class.getName());

    private Optional<Integer> hour;

    private Optional<Double> salary;

    private Optional<String> position;

    public Employee() {
        hour = Optional.of(0);
        salary = Optional.of(0.0);
        position = Optional.of("None");
    }

    public Employee(Optional<Integer> hour, Optional<Double> salary, Optional<String> position) {
        this.hour = hour;
        this.salary = salary;
        this.position = position;
    }


    public Optional<Integer> getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = Optional.of(hour);
    }

    public Optional<Double> getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = Optional.of(salary);
    }

    public Optional<String> getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = Optional.of(position);
    }


    public void deserialize(Serialization reader) {
        setPosition(reader.readString());
        setFirstName(reader.readString());
        setLastName(reader.readString());
        setAge(reader.readInteger());
        setHour(reader.readInteger());
        setSalary(reader.readDouble());
    }

    public String toString() {
        log.info("Transformation team to string.");
        String str = String.valueOf(
                getFirstName()) + " " +
                getLastName() + "  " +
                getAge() + " years  " +
                getHour() + " h  " +
                getSalary() + " $  " +
                getPosition() + "\n";

        return str;
    }

}
