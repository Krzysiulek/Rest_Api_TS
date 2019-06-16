package com.ts.lab.ts.Controllers.SubjectController;

import com.ts.lab.ts.Interfaces.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/subjects")
public class AdminSubjectsController {
    @Autowired
    SubjectsRepository subjectsRepository;

    @DeleteMapping("")
    private void deleteAll() {
        subjectsRepository.deleteAll();
    }
}
