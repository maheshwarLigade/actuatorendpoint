package com.techwasti.demo.actuatorendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ActuatorendpointApplication {

	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(ActuatorendpointApplication.class);
		app.setApplicationStartup(new BufferingApplicationStartup(1500));
		app.run(args);

	}

}

@RestController
class GreetController{


	public GreetController() throws InterruptedException{
		Thread.sleep(2000);
	}


	@GetMapping("/")
	String greetInMorning(){
		return "Good Morning Developers";
	}
}
