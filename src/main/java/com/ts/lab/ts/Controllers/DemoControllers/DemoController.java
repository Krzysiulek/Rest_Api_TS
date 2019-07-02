package com.ts.lab.ts.Controllers.DemoControllers;

import com.ts.lab.ts.DataBases.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class DemoController {

    Student student = new Student(1, "Krzysiek", "M", 123, "mail@mail.com", "Poznan");

    @GetMapping("")
    public Student demoGet(){
        return student;
    }

    @PostMapping("")
    public Student demoPost(RequestBody requestBody){
        return (Student) requestBody;
    }
}
