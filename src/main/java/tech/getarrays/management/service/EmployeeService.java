package tech.getarrays.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.management.exception.UserNotFoundException;
import tech.getarrays.management.model.Employee;
import tech.getarrays.management.repository.EmployeRepository;

import java.util.List;
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

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //  find by id
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }

    // finding by id
    public Employee findEmployeeById(Long id) {
        // Optional handling: if not found throw exception
        return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("" +
                "User by id " + id + " was not found."));
    }
}
