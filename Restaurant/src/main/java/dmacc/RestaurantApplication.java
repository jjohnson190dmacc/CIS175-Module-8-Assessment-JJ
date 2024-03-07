package dmacc;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.MenuItem;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.IMenuItemRepository;

@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
		
	}
	
	@Autowired
	IMenuItemRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		MenuItem newItem = appContext.getBean("item", MenuItem.class);
		
		System.out.print("Please Enter Menu Item Name: ");
		newItem.setItemName(in.nextLine());
		System.out.print("Please Enter Menu Item Price: ");
		newItem.setItemCost(in.nextDouble());
		System.out.print("Please Enter Menu Item Calories: ");
		newItem.setItemCalories(in.nextInt());
		repo.save(newItem);
		
		List<MenuItem> allItems = repo.findAll();
		
		for (MenuItem item : allItems) {
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println(item.toString());
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		}
		
		((AbstractApplicationContext) appContext).close();
		in.close();		
	}

}
