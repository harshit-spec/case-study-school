package com.student.school.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.school.entity.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {

}
