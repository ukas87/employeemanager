package pl.ukas.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ukas.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
