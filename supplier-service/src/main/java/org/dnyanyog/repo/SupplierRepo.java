package org.dnyanyog.repo;

import org.dnyanyog.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Long> {
    Optional<Supplier> findBySupplierName(String supplierName);
    List<Supplier> findByActiveTrue();
}
