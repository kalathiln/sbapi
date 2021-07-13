package com.blackmolecaptures.sbapi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains the required services for the Student.
 * This is using a N-tier Design pattern
 */

// We need to tell the interpreter that this class has to be instantiated
// i.e This should be spring bean
// This makes sure that this in order to be used should be instantiated from the controller side
// Done using the @Autowired annotation

@Service
public class StudentService {

    public List<Student> getStudent() {
        List<Student> returnStringList = new ArrayList<>();
        returnStringList.add(new Student(1L, "Nikhil", "Nikhkk@gmail.com", LocalDate.of(1989, Month.MARCH, 18), 32));
        returnStringList.add(new Student(2L, "Anusha", "anusha.rao2701@gmail.com", LocalDate.of(1991, Month.JANUARY, 27), 30));
        return returnStringList;
    }
}
