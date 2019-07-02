package com.ts.lab.ts.Controllers.GradeController;

import com.ts.lab.ts.DataBases.Grade;
import com.ts.lab.ts.Interfaces.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grades")
public class GradesController {
    @Autowired
    GradesRepository gradesRepository;

    @GetMapping("")
    public Iterable<Grade> getAllGrades() {
        return gradesRepository.findAll();
    }

    @GetMapping("/{index}")
    public Iterable<Grade> getGradesByIndex(@PathVariable long index) {
        return gradesRepository.findByIndex(index);
    }

}
