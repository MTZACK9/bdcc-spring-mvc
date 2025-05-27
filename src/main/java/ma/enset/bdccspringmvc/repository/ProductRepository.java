package ma.enset.bdccspringmvc.repository;

import ma.enset.bdccspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
