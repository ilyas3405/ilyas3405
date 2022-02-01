package com.ilinesoft.springboot.employee.employee.poc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface POCdaorepository extends JpaRepository<Employee, Integer>{

}
