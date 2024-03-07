package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;


/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */


/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */

@Configuration
public class BeanConfiguration {

	@Bean
	public Phone phone() {
		Phone bean = new Phone("Apple", "IPhone 15", 850, 2024);
		return bean;
	}
}

