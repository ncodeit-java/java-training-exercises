package com.example.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatjpaApplication 
//implements CommandLineRunner 
{
	
   // @Autowired
   // private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatjpaApplication.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running");
		
		Student student1 = new Student("IT101", "st1"); 
		studentService.save(student1);
		
		Student student2 = new Student("IT102", "st2"); 
		Student student3 = new Student("IT103", "st3"); 
		Student student4 = new Student("IT104", "st4"); 
		Student student5 = new Student("IT105", "st5"); 
		List<Student> students=Arrays.asList(student2,student3,student3,student4,student5);
		studentService.saveAll(students);		
		
		Student st1=studentService.findStudent(1);
		System.out.println("Student Name after find "+st1.getStudentName());
		
		st1.setStudentName("st11");
		st1=studentService.updateStudent(st1);
		System.out.println("updated student Name: "+st1.getStudentName());
		
		studentService.deleteStudent(st1);
		
		
		Student st4=studentService.findByName("st4");
		System.out.println("Student Id: "+st4.getStudentId());
		
		Student st5=studentService.getStudent("ST5");
		System.out.println("Student Id: "+st5.getStudentId());	
		
		Student st2=studentService.getStudent(2,"st2");
		System.out.println("Student Id: "+st2.getStudentId());
		
		List<Student> list=studentService.getAllStudents(
				PageRequest.of(0, 2,Sort.by("studentName").descending()));
		list.stream().forEach(r->{
			System.out.println(r.getStudentName());
		});
		
		System.out.println("done");
	}
*/
}
