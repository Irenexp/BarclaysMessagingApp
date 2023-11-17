package com.barclays;

import com.barclays.util.Populator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BarclaysMessagingAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BarclaysMessagingAppApplication.class, args);

//		MessagePopulator populator = context.getBean(MessagePopulator.class);
//		populator.populate();

//	  	Populator populator2 = context.getBean(Populator.class);
//		populator2.populatePerson();
//	  	populator2.populateAddress();
	}

}
