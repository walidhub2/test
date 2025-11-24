package tn.m104.rh.service;

import tn.m104.rh.entity.Student;

import java.util.List;

public interface IStudentService {


    public Student registerStudent(Student student);
    public List<Student> getStudents();
    public void deleteStudent(Integer id);
    public Student updateStudent(Student student);


}
