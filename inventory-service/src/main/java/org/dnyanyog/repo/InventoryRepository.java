package org.dnyanyog.repo;

import java.util.List;
import java.util.Optional;

import org.dnyanyog.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    // Find by product code
    Optional<Inventory> findByProductCode(String productCode);

    // Find by status (e.g., IN_STOCK, OUT_OF_STOCK)
    List<Inventory> findByStatus(String status);

    // Find by warehouse location
    List<Inventory> findByWarehouseLocation(String warehouseLocation);

    // Optional: Find by product code and warehouse location
    Optional<Inventory> findByProductCodeAndWarehouseLocation(String productCode, String warehouseLocation);
}
