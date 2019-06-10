package by.naty.model.util;

import by.naty.model.entity.Employee;
import by.naty.model.entity.Junior;
import by.naty.model.entity.Senior;
import by.naty.model.entity.TeamLead;


public class Factory {

    private static Factory instance = null;

    private Factory() {}

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public Employee create(EmployeeType employeeType, Employee employee) {
        switch (employeeType) {
            case TeamLead:
                return new TeamLead(employee.getHour(), employee.getSalary(), employee.getPosition());
            case Senior:
                return new Senior(employee.getHour(), employee.getSalary(), employee.getPosition());
            case Junior:
                return new Junior(employee.getHour(), employee.getSalary(), employee.getPosition());
            default:
                throw new IllegalArgumentException("Unsupported type: " + employeeType);
        }
    }

}
