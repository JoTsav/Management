package tech.getarrays.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.management.model.Employee;

/**
 * @author jotsh
 * EmployeRepository extends JpaRepository to provide CRUD operations for Employee entities.
 * Passing in Employee class type and Long for the ID type
 */
public interface EmployeRepository extends JpaRepository<Employee, Long> {
}
