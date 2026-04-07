package com.ramtech.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empName;
    private String empEmail;
    private int age;
    private String city;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getEmpName() { return empName; }

    public void setEmpName(String empName) { this.empName = empName; }

    public String getEmpEmail() { return empEmail; }

    public void setEmpEmail(String empEmail) { this.empEmail = empEmail; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }
}