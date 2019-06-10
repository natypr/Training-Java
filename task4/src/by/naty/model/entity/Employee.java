package by.naty.model.entity;

import by.naty.serialization.Serialization;

import java.util.Optional;

public class Employee extends Person {

    private Optional<Integer> hour;

    private Optional<Double> salary;

    private Optional<String> position;

    public Employee() { }

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
