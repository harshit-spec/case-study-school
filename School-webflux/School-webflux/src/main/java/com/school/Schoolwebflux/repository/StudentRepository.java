package com.school.Schoolwebflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.school.Schoolwebflux.entity.Student;

import reactor.core.publisher.Flux;
@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String>{

	Flux<Student> findByBranch(String branch);

}
