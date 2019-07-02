package com.ts.lab.ts.Controllers.TeacherController;

import com.ts.lab.ts.DataBases.Teacher;
import com.ts.lab.ts.Interfaces.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeachersRepository teachersRepository;

    @GetMapping("/{id}")
    private Optional<Teacher> getById(@PathVariable long id) {
        return teachersRepository.findById(id);
    }

}
