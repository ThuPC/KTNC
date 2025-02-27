package com.example.luyeptaptest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private StudentService service;
    private Student student1,student2;
    @BeforeEach
    void setUp(){
        service = new StudentService();
        student1 = new Student("1","Thu");
        student2 = new Student("2","Ha");
        service.add(student1);
        service.add(student2);
    }
    @Test
    public void testAdd(){
        Student student = new Student("3","Thu");
        service.add(student);
        Assertions.assertEquals(student,service.timKiem("3"));
    }
    @Test
    public void testAddExp(){
        Assertions.assertThrows(NullPointerException.class,(() -> service.add(new Student("   ","   "))));
    }
    @Test
    public void testAddExpNull(){
        Assertions.assertThrows(NullPointerException.class,(() -> service.add(new Student(null,null))));
    }
    @Test
    public void testDelete(){
        Student student = new Student("1","Thu");
        service.add(student);
       Assertions.assertTrue(service.delete("1"));
       Assertions.assertNull(service.timKiem("1"));
    }
    @Test
    public void testDelete_IdKhongTonTai(){
        Assertions.assertFalse(service.delete("4"));
    }
    @Test
    public void testDeleteExp_KhoangTrang(){
        Assertions.assertThrows(IllegalArgumentException.class,()->service.delete("   "));
    }
    @Test
    public void testDeleteExp_Null(){
        Assertions.assertThrows(NullPointerException.class,()->service.delete(null));
    }
    @Test
    public void testUpdate_Ten(){
        Student newStudent = new Student("1","Thu haha");
        Assertions.assertTrue(service.update("1",newStudent));
        Assertions.assertEquals("Thu haha",service.timKiem("1").getTen());
    }
    @Test
    public void testUpdate_IDKhongTonTai(){
        Student newStudent = new Student("10","Thu haha");
        Assertions.assertFalse(service.update("1",newStudent));
        Assertions.assertEquals("Thu",service.timKiem("1").getTen());
    }
    @Test
    public void testTimKiem_IdRong(){
        Assertions.assertThrows(IllegalArgumentException.class,()->service.timKiem(""));
    }
    @Test
    public void testTimKiem_Id(){
        Assertions.assertEquals(student1,service.timKiem("1"));
    }
    @Test
    public void testTimKiem_IdKhongTonTai(){
        Assertions.assertNull(service.timKiem("10"));
    }


}