package com.example.demo1_01march;

public class Student {
    private String name;
    private Integer age;
    private String university;

    public Student(){}

    public Student(String name, Integer age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
