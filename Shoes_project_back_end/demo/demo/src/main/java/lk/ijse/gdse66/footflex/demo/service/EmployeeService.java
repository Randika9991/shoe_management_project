package lk.ijse.gdse66.footflex.demo.service;/*
    this application is copyright protected
    Author : kumara
    Date : 5/3/2024
*/

import lk.ijse.gdse66.footflex.demo.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    boolean deleteEmployee(String id);
    List<EmployeeDTO> getAllEmployee();
    List<EmployeeDTO> searchEmployee(String name);
    EmployeeDTO searchEmployeeById(String id);
    String generateNextId();
    EmployeeDTO searchByEmail(String email);
}
