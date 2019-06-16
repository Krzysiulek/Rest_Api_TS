package com.ts.lab.ts.Controllers.SubjectController;

import com.ts.lab.ts.DataBases.Subject;
import com.ts.lab.ts.Interfaces.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/subject")
public class AdminSubjectController {
    @Autowired
    SubjectsRepository subjectsRepository;

    @PostMapping("")
    private Subject addSubject(@RequestBody Subject subject) {
        subjectsRepository.save(subject);
        return subject;
    }

    @DeleteMapping("/{id}")
    private void deleteById(@PathVariable long id) {
        subjectsRepository.deleteById(id);
    }


    @PutMapping("")
    private Subject updateSubject(@RequestBody Subject subject) {
        if (subjectsRepository.existsById(subject.getId())) {
            subjectsRepository.save(subject);
            return subject;
        } else return null;
    }


}
