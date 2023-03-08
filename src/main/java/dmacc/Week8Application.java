package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beans.Address;
import beans.House;
import controller.BeanConfiguration;
import repository.HouseRepository;

@SpringBootApplication
public class Week8Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8Application.class, args);
	}
	
	@Autowired
	HouseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House c = appContext.getBean("house", House.class);
		repo.save(c);
		
		House d = new House("georgetown", "nice", 100000, "M");
		Address a = new Address("123 main street", "Des Moines", "Iowa");
		
		d.setAddress(a);
		repo.save(d);
		
		List<House> allMyHouses = repo.findAll();
		for(House h: allMyHouses) {
			System.out.println(h.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
