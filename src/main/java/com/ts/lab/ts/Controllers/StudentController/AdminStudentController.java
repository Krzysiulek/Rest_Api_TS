package com.ts.lab.ts.Controllers.StudentController;

import com.ts.lab.ts.DataBases.Student;
import com.ts.lab.ts.Interfaces.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/student")
public class AdminStudentController {
    @Autowired
    private StudentsRepository studentsRepository;

    @PostMapping("")
    private void addStudent(@RequestBody Student student) {
        studentsRepository.save(student);
    }

    @PutMapping("")
    private void updateStudent(@RequestBody Student student) {
        if (studentsRepository.existsById(student.getIndex())) {
            studentsRepository.save(student);
        }
    }

    @DeleteMapping("/{index}")
    private void deleteByIndex(@PathVariable long index) {
        studentsRepository.deleteById(index);
    }
    // TODO: 2019-06-06 ask about delete - if it really have to delete from DB, or just may can update status to Graduated


}
