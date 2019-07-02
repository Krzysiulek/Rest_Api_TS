package com.ts.lab.ts.Controllers.DemoControllers;

import com.ts.lab.ts.DataBases.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class DemoController {

    Student student = new Student(1, "Krzysiek", "M", 123, "mail@mail.com", "Poznan");

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public Student demoGet(){
        return student;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("")
    public Student demoPost(RequestBody requestBody){
        return new Student(123, "dupa", "dupa", 123, "dupadsadas", "dasfahf;");
    }
}
