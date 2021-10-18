package com.ravi.sprint.data.jpa.model.repository;

import com.ravi.sprint.data.jpa.model.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * created by ravichandra chakka
 */
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .firstName("tataji")
                .lastName("")
                .emailId("tataji@gmail.com")
                .guardianName("ajay2")
                .guardianEmail("ajay2@gmail.com")
                .guardianMobile("8976543210")
                .build();
        Student result = studentRepository.save(student);
        System.out.println("result = " + result);
    }

    @Test
    public void getStudentList(){
       List<Student> studentList =  studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void updateStudentList(){
        Student student = Student.builder()
                .firstName("sagar22")
                .lastName("reddy22")
                .emailId("sagar22@gmail.com")
                .guardianName("ajay22")
                .guardianEmail("ajay22@gmail.com")
                .guardianMobile("2276543210")
                .build();
        int result = studentRepository.updateStudentById(2L,student.getEmailId(),student.getFirstName(),student.getLastName(),student.getGuardianEmail(),student.getGuardianName(),student.getGuardianMobile());
        System.out.println("result = " + result);
    }
}