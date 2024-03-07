package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.MenuItem;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Feb 29, 2024
 */

@Configuration
public class BeanConfiguration {

	@Bean
	public MenuItem item() {
		
		MenuItem item = new MenuItem();
		
		return item;
		
	}
	
}
