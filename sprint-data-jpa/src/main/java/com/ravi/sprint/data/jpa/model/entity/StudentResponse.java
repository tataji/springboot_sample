package com.ravi.sprint.data.jpa.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;
/**
 * created by ravichandra chakka
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private List<Student> studentList;
    private boolean success;
}
