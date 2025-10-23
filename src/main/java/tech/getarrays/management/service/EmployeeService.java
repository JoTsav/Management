package tech.getarrays.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.management.model.Employee;
import tech.getarrays.management.repository.EmployeRepository;

import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeRepository employeeRepository;

    /**
     * Constructor for EmployeeService with dependency injection of EmployeRepository.
     *      the autowired annotation tells Spring to inject the EmployeRepository bean
     *      when creating an instance of EmployeeService.
     * @param employeeRepository
     */
    @Autowired
    public EmployeeService(EmployeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Method to add a new employee to the repository.
     * @param employee
     * @return
     */
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
