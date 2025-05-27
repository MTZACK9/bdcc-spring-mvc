package ma.enset.bdccspringmvc;

import ma.enset.bdccspringmvc.entities.Product;
import ma.enset.bdccspringmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdccSpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().name("Laptop").price(1000).quantity(10).build());
            productRepository.save(Product.builder().name("Smartphone").price(500).quantity(105).build());
            productRepository.save(Product.builder().name("Watch").price(99).quantity(15).build());


            productRepository.findAll().forEach(System.out::println);
        };
    }
}
