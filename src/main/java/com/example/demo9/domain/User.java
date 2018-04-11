package com.example.demo9.domain;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{

    private Integer id;
    private String name;
    private Date birthday;
    private Double salary;
    private Boolean status;

    public User() {
    }

    public User(String name, Date birthday, Double salary, Boolean status) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.status = status;
    }

    public User(Integer id, String name, Date birthday, Double salary, Boolean status) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }
}
