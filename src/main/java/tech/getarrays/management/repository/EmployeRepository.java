package tech.getarrays.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.management.model.Employee;

import java.util.Optional;

/**
 * @author jotsh
 * EmployeRepository extends JpaRepository to provide CRUD operations for Employee entities.
 * Passing in Employee class type and Long for the ID type
 */
public interface EmployeRepository extends JpaRepository<Employee, Long> {

    /**
     * Query Methods in Spring Data JPA
     *      JPA understands and implements the query based on method name
     */
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
