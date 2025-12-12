package org.dnyanyog.repo;

import org.dnyanyog.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerName(String customerName);
    List<Order> findByStatus(String status);
    Optional<Order> findByOrderId(Long orderId);
}
