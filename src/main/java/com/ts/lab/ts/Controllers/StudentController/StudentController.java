package com.ts.lab.ts.Controllers.StudentController;

import com.ts.lab.ts.DataBases.Student;
import com.ts.lab.ts.Interfaces.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentsRepository studentsRepository;

    @GetMapping("/{index}")
    public Optional<Student> getByIndex(@PathVariable long index){
        return studentsRepository.findById(index);
    }

}
