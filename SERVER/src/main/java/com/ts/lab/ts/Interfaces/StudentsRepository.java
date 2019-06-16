package com.ts.lab.ts.Interfaces;

import com.ts.lab.ts.DataBases.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends CrudRepository<Student, Long> {
}
