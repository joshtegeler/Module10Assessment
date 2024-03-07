package dmacc.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */

@Entity
public class Phone {
	@Id
	@GeneratedValue
	private long id;
	String brand;
	String model;
	int price;
	int releaseYear;
	
	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Phone(String brand) {
		super();
		this.brand = brand;
	}

	public Phone(String brand, String model, int price, int releaseYear) {
		super();
		this.brand = brand;
		this.model= model;
		this.price = price;
		this.releaseYear = releaseYear;
	}
	public Phone(long id, String brand, String model, int price, int releaseYear) {
		super();
		this.id = id;
		this.brand = brand;
		this.model= model;
		this.price = price;
		this.releaseYear = releaseYear;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", releaseYear="
				+ releaseYear + "]";
	}
	
	

}
