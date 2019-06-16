package com.ts.lab.ts.Interfaces;

import com.ts.lab.ts.DataBases.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Course, Long> {
}
