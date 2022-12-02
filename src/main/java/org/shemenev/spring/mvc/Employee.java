package org.shemenev.spring.mvc;

import org.shemenev.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;

public class Employee {
    @Size(min = 2, message = "name must be longer than 2")
    private String name;
    @NotBlank(message = "required filed")
    private String surname;
    @Min(value = 500, message = "must be bigger than 499")
    @Max(value = 5000, message = "must be less than 5000")
    private int salary;

    private String department;

    private String carBrand;

    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please, use pattern xxx-xxx-xx-xx")
    private String phoneNumber;

    @CheckEmail(value = "gmail.com", message = "email must ends with abc.com ")
    private String email;


    public Employee() {
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
