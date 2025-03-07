package com.codingshuttle.bharath.week1intro.IntrotoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntrotoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntrotoSpringBootApplication.class, args);
			// Inject ChocolateFrosting and ChocolateSyrup into CakeBaker
			CakeBaker chocolateCakeBaker = new CakeBaker(new ChocolateFrosting(), new ChocolateSyrup());
			chocolateCakeBaker.bakeCake();

			// Inject StrawberryFrosting and StrawberrySyrup into CakeBaker
			CakeBaker strawberryCakeBaker = new CakeBaker(new StrawberryFrosting(), new StrawberrySyrup());
			strawberryCakeBaker.bakeCake();
	}

}