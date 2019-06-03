package by.naty.model.entity;

import by.naty.serialization.Serialization;

import java.util.Comparator;
import java.util.Optional;

public class Employee extends Person {

    private Optional<Integer> hour;

    private Optional<Double> salary;

    private Optional<String> position;

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
        setFirstName(reader.readString());
        setLastName(reader.readString());
        setAge(reader.readInteger());
        setHour(reader.readInteger());
        setSalary(reader.readDouble());
        setPosition(reader.readString());
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

    public static final Comparator<Employee> COMPARATOR_OF_SALARY =
            Comparator.comparing(obj -> obj.getSalary().orElse(0.0));

    public static Comparator<Employee> COMPARATOR_OF_HOUR =
            COMPARATOR_OF_SALARY.thenComparing(obj -> obj.getHour().orElse(0));

    public static Comparator<Employee> COMPARATOR_OF_POSITION =
            COMPARATOR_OF_HOUR.thenComparing(obj -> obj.getPosition().orElse(""));

    public static Comparator<Employee> COMPARATOR_OF_AGE =
            COMPARATOR_OF_POSITION.thenComparing(obj -> obj.getAge().orElse(0));

    public static Comparator<Employee> COMPARATOR_OF_FIRST_NAME =
            COMPARATOR_OF_AGE.thenComparing(obj -> obj.getFirstName().orElse(""));
}
