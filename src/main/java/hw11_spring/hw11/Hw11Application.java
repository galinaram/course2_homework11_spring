package hw11_spring.hw11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw11Application {

	public static void main(String[] args) {
//		System.setProperty("server.servlet.context-path", "/store/order/");
		SpringApplication.run(Hw11Application.class, args);
	}

}
