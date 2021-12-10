package com.app.techworm.main.serviceinterface;

import com.app.techworm.main.model.Student;
import java.util.List;
public interface StudentInterface {
	//to save new student
	public Student saveStudent(Student student);
	
	//to update Student
	public Student updateStudent(Student student);
	
	//to fetch all students from database
	public List<Student> findAllStudents();
	
	//to delete student
	public void deleteStudent(int id);
}
