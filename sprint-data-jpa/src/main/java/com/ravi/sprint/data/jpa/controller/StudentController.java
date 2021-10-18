package com.ravi.sprint.data.jpa.controller;

import com.ravi.sprint.data.jpa.model.entity.Student;
import com.ravi.sprint.data.jpa.model.entity.StudentResponse;
import com.ravi.sprint.data.jpa.model.repository.service.StudentServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * created by ravichandra chakka
 */
@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;

    @PostMapping("/saveStudentDetails")
    public Student saveUserDetails(@RequestBody Student student){
        log.info("controller:: save data");
        return studentServiceImp.saveStudentDetails(student);
    }
    @GetMapping("/getStudentList")
    public StudentResponse getStudentDetails(){
       return  studentServiceImp.getStudentDetails();
    }

    @PutMapping("/updateStudentById")
    public StudentResponse updateStudentDetailsById(@RequestBody Student student){
        return studentServiceImp.updateStudentById(student);
    }
}
