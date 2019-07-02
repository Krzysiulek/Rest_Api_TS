package com.ts.lab.ts.Controllers.CourseController;

import com.ts.lab.ts.DataBases.Course;
import com.ts.lab.ts.Interfaces.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/courses")
public class AdminCoursesController {
    CoursesRepository coursesRepository;

    public AdminCoursesController(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @DeleteMapping("")
    private void deleteAll() {
        coursesRepository.deleteAll();
    }
}
