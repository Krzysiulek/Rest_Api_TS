package com.ts.lab.ts.Controllers.CourseController;

import com.ts.lab.ts.DataBases.Course;
import com.ts.lab.ts.Interfaces.CoursesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {
    private CoursesRepository coursesRepository;

    public CourseController(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @GetMapping("/{id}")
    private Optional<Course> getCourseById(@PathVariable long id) {
        return coursesRepository.findById(id);
    }


}
