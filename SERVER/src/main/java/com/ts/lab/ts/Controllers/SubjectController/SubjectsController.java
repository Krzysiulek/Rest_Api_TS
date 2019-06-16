package com.ts.lab.ts.Controllers.SubjectController;

import com.ts.lab.ts.DataBases.Subject;
import com.ts.lab.ts.Interfaces.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectsController {
    @Autowired
    SubjectsRepository subjectsRepository;

    @GetMapping("")
    private Iterable<Subject> getSubjectById() {
        return subjectsRepository.findAll();
    }
}
