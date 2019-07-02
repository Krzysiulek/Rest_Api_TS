package com.ts.lab.ts.Controllers.CourseController;

import com.ts.lab.ts.DataBases.Course;
import com.ts.lab.ts.Interfaces.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    CoursesRepository coursesRepository;

    @GetMapping("")
    private Iterable<Course> getAll() {
        return coursesRepository.findAll();
    }


}
