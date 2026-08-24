package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext (AppConfirgu.class);
		School1 s =context.getBean(School1.class);
		//school.start();
		s.start();
	}
}


/* What happened internally?
Spring starts
@ComponentScan scans package
Finds @Component classes → Student, School
Creates objects (beans)
Sees @Autowired → injects Student into School
You get ready object and call method*/
