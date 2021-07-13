package com.blackmolecaptures.sbapi.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class contains all the resources for the API
 */

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {



//    public StudentController() {
//        studentService = new StudentService();
//    }



    // In order to tell that this service should be injected into The StudentController we need to
    // use the autowired annotation
    private final StudentService studentService;


//    @Autowired
    // The Autowired annotation is used to tell that the StudentService is automatically instantiated and injected into this constructor.

    // Doesn't seem to be mandatory if you use @Service or @Component in the StudentService class
    // This is called Dependency-Injection which here is done by using annotations
    public StudentController(StudentService studentService) {

        /** This is used in order to instantiate the service everytime StudentController is called
        this.studentService = studentService; or this.studentService = new StudentService();
         ***************************
         APPLICATION FAILED TO START
         ***************************

         Description:

         Parameter 0 of constructor in com.blackmolecaptures.sbapi.student.StudentController required a bean of type 'com.blackmolecaptures.sbapi.student.StudentService' that could not be found.


         Action:

         Consider defining a bean of type 'com.blackmolecaptures.sbapi.student.StudentService' in your configuration.
         **/
        this.studentService = studentService;

    }


    @GetMapping("/getstudent")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @GetMapping("/wassup")
    public String wassup() {
        return "Great things happen with small steps taken consistently!!!";
    }

    @GetMapping
    public String showup() {
        return "Show up to things that you have promised to do!!!";
    }
}
