package com.ts.lab.ts.Controllers.TeacherController;

import com.ts.lab.ts.DataBases.Teacher;
import com.ts.lab.ts.Interfaces.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/teacher")
public class AdminTeacherController {
    @Autowired
    TeachersRepository teachersRepository;

    @PostMapping("")
    private void addTeacher(@RequestBody Teacher teacher) {
        teachersRepository.save(teacher);
    }

    @PutMapping("")
    private void updateTeacher(@RequestBody Teacher teacher) {
        if (teachersRepository.existsById(teacher.getId())) {
            teachersRepository.save(teacher);
        }
    }

    @DeleteMapping("/{id}")
    private void deleteTeacher(@PathVariable long id){
        teachersRepository.deleteById(id);
    }


}
