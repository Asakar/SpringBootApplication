package com.application.services;

import com.application.entities.Student;
import com.application.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudentByID(long id) {
        studentRepository.deleteById(id);
    }

    public Student getById(long id) {
        return studentRepository.getOne(id);
    }

    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

}
