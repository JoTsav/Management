package tech.getarrays.management;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarrays.management.model.Employee;
import tech.getarrays.management.service.EmployeeService;

import java.util.List;

/**
 * EmployeeResource is a REST controller that handles HTTP requests related to Employee entities.
 */
@RestController
@RequestMapping("/employee") // base path for all endpoints in this controller
public class EmployeeResource {

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // note ResponseEntity is a generic class that represents the whole HTTP response
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK); // 200 OK with the list of employees
    }
}
