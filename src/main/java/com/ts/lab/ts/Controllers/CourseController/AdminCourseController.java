package com.ts.lab.ts.Controllers.CourseController;

import com.ts.lab.ts.DataBases.Course;
import com.ts.lab.ts.Interfaces.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("admin/course")
public class AdminCourseController {
    @Autowired
    CoursesRepository coursesRepository;

    @DeleteMapping("/{id}")
    private Course deleteById(@PathVariable long id) {
        Optional<Course> course = coursesRepository.findById(id);
        coursesRepository.deleteById(id);
        return course.get();
    }

    @PostMapping("")
    private Course addCourse(@RequestBody Course course) {
        coursesRepository.save(course);
        return course;
    }

    @PutMapping("")
    private Course updateCourse(@RequestBody Course course) {
        coursesRepository.save(course);
        return course;
    }

}
