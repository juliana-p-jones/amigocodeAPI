package com.sb.amigostutorial;

import com.sb.amigostutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class AmigostutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigostutorialApplication.class, args);
	}


}