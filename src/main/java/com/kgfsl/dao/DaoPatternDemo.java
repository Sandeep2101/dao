package com.kgfsl.dao;


public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao obj1 = new StudentDaoImpl();

      //Create student
      obj1.createStudent(0,"abc", 20);
      obj1.createStudent(1, "def", 21);
      obj1.createStudent(2, "ghi", 23);
      //print all students
      obj1.display();
      System.out.println("\n");
      //update student
      obj1.updateStudent(0,"kik",20);
      obj1.display();
      System.out.println("\n");
      //delete student
      obj1.deleteStudent(1);
      obj1.display();
      obj1.createStudent(4, "fjk", 25);
      System.out.println("\n");
      obj1.display();
     /* // studentDao.deleteStudent(student);

    //  for (Student stu : studentDao.getAllStudents()) {
      //  System.out.println("Student: [RollNo : " + stu.getRollNo() + ", Name : " + stu.getName() + " ]");*/
     }
   }
