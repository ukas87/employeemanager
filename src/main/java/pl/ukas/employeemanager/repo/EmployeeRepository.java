package pl.ukas.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ukas.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);

    Optional findEmployeeById(Long id);
}

