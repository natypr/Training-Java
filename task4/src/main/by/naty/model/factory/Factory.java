package main.by.naty.model.factory;

import main.by.naty.model.entity.Employee;
import main.by.naty.model.entity.position.Junior;
import main.by.naty.model.entity.position.Senior;
import main.by.naty.model.entity.position.TeamLead;

import java.util.logging.Logger;


public class Factory {
    private static final Logger log = Logger.getLogger(Factory.class.getName());

    private static Factory instance = null;

    private Factory() {}

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public Employee create(EmployeeType employeeType, Employee employee) {
        log.info("Create factory.");
        switch (employeeType) {
            case TeamLead:
                return new TeamLead(employee.getHour(), employee.getSalary(), employee.getPosition());
            case Senior:
                return new Senior(employee.getHour(), employee.getSalary(), employee.getPosition());
            case Junior:
                return new Junior(employee.getHour(), employee.getSalary(), employee.getPosition());
            default:
                log.warning("Unsupported type: " + employeeType + "!");
                throw new IllegalArgumentException("Unsupported type: " + employeeType);
        }
    }

}
