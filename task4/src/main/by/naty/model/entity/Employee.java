package main.by.naty.model.entity;

import main.by.naty.model.serialization.ISerialization;
import org.apache.log4j.Logger;

import java.util.Objects;
import java.util.Optional;

public class Employee extends Person {
    private static final Logger log = Logger.getLogger(Employee.class);

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


    public void deserialize(ISerialization reader) {
       // setPosition(reader.readString());
        setFirstName(reader.readString());
        setLastName(reader.readString());
        setAge(reader.readInteger());
        setHour(reader.readInteger());
        setSalary(reader.readDouble());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return hour == employee.hour &&
                salary == employee.salary &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, salary, position);
    }

    public String toString() {
        log.info("Transformation team to string.");
        String str = getFirstName() + " " +
                getLastName() + "  " +
                getAge() + " years  " +
                getHour() + " h  " +
                getSalary() + " $\n";

        return str;
    }

}
