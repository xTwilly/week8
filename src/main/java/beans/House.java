/**
 * @author Chance - cbenna
 * CIS175 - Spring 2023
 * Mar 7, 2023
 */
package beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Chance
 *
 */
@Entity
public class House {
	@Id
	@GeneratedValue
	private long id;
	private String size;
	private int price;
	private String quality;
	private String neighborhood;
	@Autowired
	private Address address;
	
	public House() {
		super();
		this.neighborhood = "georgetown";
	}
	
	public House(String neighborhood) {
		super();
		this.neighborhood = neighborhood;
	}
	
	public House(String neighborhood, String quality, int price, String size) {
		super();
		this.neighborhood = neighborhood;
		this.quality = quality;
		this.price = price;
		this.size = size;
	}
	
	public House(long id, String neighborhood, String quality, int price, String size) {
		super();
		this.id=id;
		this.neighborhood = neighborhood;
		this.quality = quality;
		this.price = price;
		this.size = size;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	public String getNeighborhood() {
		return neighborhood;
	}
	
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address add) {
		this.address = add;
	}
	
	@Override
	public String toString() {
		return "House [id = " + id + ", size=" + size + ", quality=" + quality + ", price=" + price + ", neighborhood=" + neighborhood + ", address=" + address +"]";
	}

}
