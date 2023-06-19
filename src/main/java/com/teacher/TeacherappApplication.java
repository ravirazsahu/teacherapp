package com.teacher;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.teacher.controller.EmployeeController;
import com.teacher.model.Employee;

/*If you want to specify multiple packages to be scanned by Spring, you can simply provide a list of package names in the basePackages attribute of the @ComponentScan or @SpringBootApplication annotation. Here is an example of how you can specify multiple packages to be scanned:

Copy code
@Configuration
@ComponentScan(basePackages = { "com.example.controller", "com.example.service" })
public class AppConfig {
   // other configuration goes here
}
In the above example, Spring will scan both the "com.example.controller" and "com.example.service" packages for components.

You can also use scanBasePackageClasses attribute of @SpringBootApplication annotation to scan package of multiple classes.

Copy code
@SpringBootApplication(scanBasePackageClasses = { MyController.class, MyService.class })
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
This will scan the package of the MyController.class and MyService.class for components.

You can also use basePackages attribute of @SpringBootApplication annotation to specify multiple package names to be scanned.

Copy code
@SpringBootApplication(basePackages = { "com.example.controller", "com.example.service" })
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
This will scan both the "com.example.controller" and "com.example.service" packages for components.

Note that, you can use any of the above approach, but you should use only one approach at a time in your application.*/
//@SpringBootApplication(scanBasePackages = {"com.teacher","com.dev"})
@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com"})
//@EnableJpaRepositories(basePackages = {"com"})
//@EnableTransactionManagement
//@EntityScan(basePackages="com")
public class TeacherappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(TeacherappApplication.class, args);
		System.out.println(cont.getBean(EmployeeController.class));
	}

}
