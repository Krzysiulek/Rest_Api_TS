package com.ts.lab.ts.Interfaces;

import com.ts.lab.ts.DataBases.Grade;
import com.ts.lab.ts.DataBases.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends CrudRepository<Grade, Long> {
    Iterable<Grade> findByIndex(long index);
}
