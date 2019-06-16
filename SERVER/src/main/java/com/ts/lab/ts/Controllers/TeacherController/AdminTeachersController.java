package com.ts.lab.ts.Controllers.TeacherController;

import com.ts.lab.ts.Interfaces.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/teachers")
public class AdminTeachersController {
    @Autowired
    TeachersRepository teachersRepository;

    @DeleteMapping("")
    private void deleteAll(){
        teachersRepository.deleteAll();
    }

}
