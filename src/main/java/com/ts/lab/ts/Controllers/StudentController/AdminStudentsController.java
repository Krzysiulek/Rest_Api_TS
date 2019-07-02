package com.ts.lab.ts.Controllers.StudentController;

import com.ts.lab.ts.Interfaces.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/students")
public class AdminStudentsController {
    @Autowired
    private StudentsRepository studentsRepository;

    @DeleteMapping("")
    private void deleteAll(){
        studentsRepository.deleteAll();
    }
}
