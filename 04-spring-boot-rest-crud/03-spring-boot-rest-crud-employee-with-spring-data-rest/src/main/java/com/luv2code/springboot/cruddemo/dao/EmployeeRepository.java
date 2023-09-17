package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// JPARepository<EntityType, PrimaryKey Type>
// @RepositoryRestResource(path="members") // So now instead of employees, spring data rest will expose /members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code
}
