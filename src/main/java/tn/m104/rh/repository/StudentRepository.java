package tn.m104.rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.m104.rh.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
