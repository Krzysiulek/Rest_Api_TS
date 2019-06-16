package com.ts.lab.ts.Controllers.TeacherController;

import com.ts.lab.ts.DataBases.Teacher;
import com.ts.lab.ts.Interfaces.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class TeachersController {
    @Autowired
    TeachersRepository teachersRepository;

    @GetMapping
    private Iterable<Teacher> getAll(){
        return teachersRepository.findAll();
    }

}
