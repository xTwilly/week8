/**
 * @author Chance - cbenna
 * CIS175 - Spring 2023
 * Mar 7, 2023
 */
package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.House;

/**
 * @author Chance
 *
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public House house() {
		House bean = new House();
		bean.setQuality("nice");
		bean.setNeighborhood("Bricktowne");
		bean.setPrice(300000);
		bean.setSize("L");
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("2522 Nw heritage ave", "Ankeny", "Iowa");
		return bean;
	}

}
