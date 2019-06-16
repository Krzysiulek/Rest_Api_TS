package com.ts.lab.ts.Controllers.GradeController;

import com.ts.lab.ts.Interfaces.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/grades")
public class AdminGradesController {
    @Autowired
    GradesRepository gradesRepository;

    @DeleteMapping("")
    public void deleteAll(){
        gradesRepository.deleteAll();
    }
}
