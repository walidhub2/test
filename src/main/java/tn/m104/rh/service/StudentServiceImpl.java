package tn.m104.rh.service;

import java.util.List;

import tn.m104.rh.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import tn.m104.rh.repository.StudentRepository;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements IStudentService {

	private StudentRepository studentRepository;


	public Student registerStudent(Student student) {

		return  studentRepository.save(student);
		//return s;
	}

	public List<Student> getStudents() {
		//int i = 10/0;
		return (List<Student>)studentRepository.findAll();
	}

	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	public Student updateStudent(Student student) {
		Integer rollNumber = student.getRollNumber();
		Student std = studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		std.setPercentage(student.getPercentage());

		return studentRepository.save(std);
	}



}
