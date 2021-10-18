package com.ravi.sprint.data.jpa.model.repository;

import com.ravi.sprint.data.jpa.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * created by ravichandra chakka
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Modifying
    @Transactional
    @Query(value = "update table_student set email_address = :emailAddress,first_name=:firstName,last_name=:lastName,guardian_email=:guardianEmailAddress,guardian_name=:guardianName,guardian_mobile=:guardianMobile  where student_id = :id", nativeQuery = true)
    int updateStudentById(@Param("id") Long studentId, @Param("emailAddress") String emailAddress,@Param("firstName") String firstName,@Param("lastName") String lastName,@Param("guardianEmailAddress") String guardianEmailAddress,@Param("guardianName") String guardianName,@Param("guardianMobile") String guardianMobile);



}
