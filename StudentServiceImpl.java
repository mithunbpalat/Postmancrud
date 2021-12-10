package com.app.techworm.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.app.techworm.main.dao.StudentRepository;
import com.app.techworm.main.model.Student;
import com.app.techworm.main.serviceinterface.StudentInterface;
import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentInterface{
	
	@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		//same save method is used for save and update
		return studentRepo.save(student);
	}
	
	@Override
	public List<Student> findAllStudents() {
		// It returns a list so casting is needed
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// to delete Student
		studentRepo.deleteById(id);
	}

}
