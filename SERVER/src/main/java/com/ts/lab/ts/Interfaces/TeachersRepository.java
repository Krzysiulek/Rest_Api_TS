package com.ts.lab.ts.Interfaces;

import com.ts.lab.ts.DataBases.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends CrudRepository<Teacher, Long> {
}
