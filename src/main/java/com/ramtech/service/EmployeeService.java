package com.ramtech.service;

import com.ramtech.entity.Employee;
import com.ramtech.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee update(Long id, Employee emp) {
        Employee existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setEmpName(emp.getEmpName());
            existing.setEmpEmail(emp.getEmpEmail());
            existing.setAge(emp.getAge());
            existing.setCity(emp.getCity());
            return repo.save(existing);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}