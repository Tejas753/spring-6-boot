package guru.springframework.spring6boot;

import guru.springframework.spring6boot.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6BootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6BootApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
