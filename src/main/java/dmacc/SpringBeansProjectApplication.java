package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

//@SpringBootApplication
//public class SpringBeansProjectApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBeansProjectApplication.class, args);
//	}
//
//}



@SpringBootApplication
@ComponentScan(basePackages = "dmacc.beans")
public class SpringBeansProjectApplication implements CommandLineRunner {

    @Autowired
    PhoneRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(SpringBeansProjectApplication.class, args);
    }

    public void run(String... args) throws Exception {
        // Create a bean to use - not managed by Spring
        Phone phone1 = new Phone("Apple", "IPhone 15", 850, 2023);
        Phone phone2 = new Phone("Samsung", "S22 Ultra", 1050, 2023);

        // Save phones to repository
        repo.save(phone1);
        repo.save(phone2);

        // Fetch all phones from repository
        List<Phone> allPhones = repo.findAll();
        for (Phone phone : allPhones) {
            System.out.println(phone.toString());
        }
    }
}
