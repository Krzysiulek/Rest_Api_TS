package com.ts.lab.ts.Controllers.GradeController;

import com.ts.lab.ts.DataBases.Grade;
import com.ts.lab.ts.Interfaces.GradesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/grade")
public class AdminGradeController {
    GradesRepository gradesRepository;

    public AdminGradeController(GradesRepository gradesRepository) {
        this.gradesRepository = gradesRepository;
        // TODO: 2019-06-06 init some grades here
    }

    @PostMapping("")
    private void addGrade(@RequestBody Grade grade) {
        gradesRepository.save(grade);
    }

    @PutMapping("")
    private void updateGrade(@RequestBody Grade grade) {
        gradesRepository.save(grade);
    }

    @DeleteMapping("/{id}")
    private void deleteGradeById(@PathVariable long id){
        gradesRepository.deleteById(id);
    }
}
