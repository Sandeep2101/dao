package com.kgfsl.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   //list is working as a database
   List<Student> students=new ArrayList<Student>();


   public List<Student> getAllStudents() {
      return students;
   }
   
   public void display(){
               for (Student student : getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + ", Age :"+student.getAge()+" ]");
         }
   }

  /* public void getStudent(int rollNo) {
    Student stud=  students.get(rollNo);
    //  studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + stud.getRollNo() + ", Name : " + stud.getName() + ",Age :"+stud.getAge()+" ]");	
     
   }*/


   public void updateStudent(int rno,String name, int age) {
      Student student =this.getAllStudents().get(rno);
     student.setName(name);
     student.setAge(age);
      student.setRollNo(rno);      
   }

public void createStudent(int rno,String name,int age) {
   
    Student student1 = new Student(rno,name,age);
    students.add(student1);	
}

public void deleteStudent(int rno) {
	students.remove(rno);
      System.out.println("Student: Roll No " + rno + ", deleted from database");
}

}