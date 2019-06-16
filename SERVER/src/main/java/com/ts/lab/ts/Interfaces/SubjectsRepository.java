package com.ts.lab.ts.Interfaces;

import com.ts.lab.ts.DataBases.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends CrudRepository<Subject, Long> {
}
