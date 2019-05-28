package by.naty.model.entity;

import java.util.Optional;

public class Person {

    private Optional<String> firstName;

    private Optional<String> lastName;

    private Optional<Integer> age;

    public Optional<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = Optional.of(firstName);
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = Optional.of(lastName);
    }

    public Optional<Integer> getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = Optional.of(age);
    }

}
