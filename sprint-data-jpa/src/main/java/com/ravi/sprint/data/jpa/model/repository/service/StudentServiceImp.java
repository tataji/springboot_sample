package com.ravi.sprint.data.jpa.model.repository.service;

import com.ravi.sprint.data.jpa.model.entity.Student;
import com.ravi.sprint.data.jpa.model.entity.StudentResponse;
import com.ravi.sprint.data.jpa.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * created by ravichandra chakka
 */
@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudentDetails(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentResponse getStudentDetails() {
        List<Student> studentList = studentRepository.findAll();
        StudentResponse studentResponse =  new StudentResponse().builder()
                .studentList(studentList)
                .success(true)
                .build();
        return studentResponse;
    }

    @Override
    public StudentResponse updateStudentById(Student student) {
        int result = studentRepository.updateStudentById(student.getStudentId(),student.getEmailId(),student.getFirstName(),student.getLastName(),student.getGuardianEmail(),student.getGuardianName(),student.getGuardianMobile());
        boolean success = false;
        List<Student> studentList = new ArrayList<>();
        if(result == 1){
            success = true;
            studentList.add(student);
        }
        StudentResponse studentResponse =  new StudentResponse().builder()
                .studentList(studentList)
                .success(success)
                .build();

        return studentResponse;
    }
}
