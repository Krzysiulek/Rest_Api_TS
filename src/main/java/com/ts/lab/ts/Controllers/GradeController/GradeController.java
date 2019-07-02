package com.ts.lab.ts.Controllers.GradeController;

import com.ts.lab.ts.DataBases.Grade;
import com.ts.lab.ts.Interfaces.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    GradesRepository gradesRepository;

    @GetMapping("/{id}")
    public Optional<Grade> getGradeById(@PathVariable long id) {
        return gradesRepository.findById(id);
    }


}
