package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Feb 29, 2024
 */

@Entity
public class MenuItem {

	@Id
	@GeneratedValue
	private int id;
	private String itemName;
	private double itemCost;
	private int itemCalories;
	
	public MenuItem() {
		super();
	}

	public MenuItem(String itemName) {
		super();
		this.itemName = itemName;
	}

	public MenuItem(String itemName, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public MenuItem(String itemName, double itemCost, int itemCalories) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemCalories = itemCalories;
	}

	public MenuItem(int id, String itemName, double itemCost, int itemCalories) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemCalories = itemCalories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	public int getItemCalories() {
		return itemCalories;
	}

	public void setItemCalories(int itemCalories) {
		this.itemCalories = itemCalories;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", itemName=" + itemName + ", itemCost=" + itemCost + ", itemCalories="
				+ itemCalories + "]";
	}
		
}
