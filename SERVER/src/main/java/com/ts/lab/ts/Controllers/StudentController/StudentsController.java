package com.ts.lab.ts.Controllers.StudentController;

import com.ts.lab.ts.DataBases.Student;
import com.ts.lab.ts.Interfaces.StudentsRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentsController {
    private StudentsRepository studentsRepository;

    public StudentsController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("")
    public Iterable<Student> getAll(){
        return studentsRepository.findAll();
    }



    /*
        Żeby były ze dwie klasy ze świata rzeczywistego (PUT, POST, DELETE, GET)

        1) interfejs, z którym gada maszyna a nie człowiek
        2) klient
        3)
     */


}
