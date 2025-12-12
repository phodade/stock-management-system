package org.dnyanyog.repo;

import java.util.List;
import org.dnyanyog.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends JpaRepository<Product, Long> {

  List<Product> findByProductId(String productId);

  List<Product> findByproductName(String productName);

 // List<Product> findByproductCategory(String productCategory); // ✅ FIXED

  List<Product> findByStatus(Product.Status status);
  
  List<Product> findByCategory(String category); 
  
  public interface ProductRepo extends JpaRepository<Product, Long> {}
}
