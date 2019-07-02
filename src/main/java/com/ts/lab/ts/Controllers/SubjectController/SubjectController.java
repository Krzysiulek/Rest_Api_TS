package com.ts.lab.ts.Controllers.SubjectController;

import com.ts.lab.ts.DataBases.Subject;
import com.ts.lab.ts.Interfaces.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectsRepository subjectsRepository;

    @GetMapping("/{id}")
    private Optional<Subject> getSubjectById(@PathVariable long id) {
        return subjectsRepository.findById(id);
    }
}
