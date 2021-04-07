package com.bit.springbootdemo.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bit.springbootdemo.jpa.StudentRepository;
import com.bit.springbootdemo.model.Student;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository)
	{
		return args -> {
		Student anand=new Student("Anand","Anand@gmail.com",LocalDate.of(1984,Month.NOVEMBER,01));
		Student balaji=new Student("Balaji","Balaji@gmail.com",LocalDate.of(1981,Month.JANUARY,05));
		Student chandra=new Student("Chandra","Chandra@gmail.com",LocalDate.of(1982,Month.JULY,10));
		Student eswar=new Student("Eswar","Eswar@gmail.com",LocalDate.of(1982,Month.JULY,13));
		Student damodhar=new Student("Damodhar","Dhamodar@gmail.com",LocalDate.of(1983,Month.APRIL,10));
		repository.saveAll(List.of(anand,balaji,chandra,damodhar,eswar));
		};
	}
}
