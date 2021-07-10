package com.blackmolecaptures.sbapi;

import com.blackmolecaptures.sbapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SbapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbapiApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		List<Student> returnStringList = new ArrayList<>();
		returnStringList.add(new Student(1L,"Nikhil","Nikhkk@gmail.com", LocalDate.of(1989, Month.MARCH,18), 32));
		returnStringList.add(new Student(2L,"Anusha","anusha.rao2701@gmail.com", LocalDate.of(1991, Month.JANUARY,27), 30));
		return returnStringList;
	}

}
