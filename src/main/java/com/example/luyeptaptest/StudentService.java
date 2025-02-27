package com.example.luyeptaptest;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<>();

    public void add(Student student) {
        if (student.getId().isBlank() || student.getTen().isBlank()) {
            throw new NullPointerException("Khong dc de trong");
        }
        list.add(student);
    }

    public boolean delete(String id) {
        if (id.isBlank()){
            throw new IllegalArgumentException("Khong de trong");
        } else if (id == null) {
            throw new NullPointerException("Khong de trong");
        }
        return list.removeIf(student -> student.getId().equalsIgnoreCase(id));
    }

    public boolean update(String id,Student newStudent) {
        if (newStudent.getId()==null||newStudent.getTen()==null){
            throw new IllegalArgumentException("Khong bo trong");
        }
        for (Student student : list) {
            if (student.getId().equalsIgnoreCase(newStudent.getId())) {
                student.setTen(newStudent.getTen());
                return true;
            }
        }
        return false;
    }


    public Student timKiem(String id) {
        if (id.isBlank()){
            throw new IllegalArgumentException("ID ko de trong");
        }
        return list.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
