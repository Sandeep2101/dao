package com.kgfsl.dao;

import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
  // public void getStudent(int rollNo);
   public void display();
   public void createStudent(int rno,String name,int age);
   public void updateStudent(int rno,String name,int age);
   public void deleteStudent(int rno);
}