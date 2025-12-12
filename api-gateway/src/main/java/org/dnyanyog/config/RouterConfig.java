package org.dnyanyog.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
    
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("inventory-service", r -> r.path("/api/v1/inventor**").uri("http://localhost:8082"))
                .route("notification-service", r -> r.path("/api/v1/notify**").uri("http://localhost:8085"))
                .route("order-service", r -> r.path("/api/v1/orders**").uri("http://localhost:8083"))
                .route("product-service", r -> r.path("/api/v1/product**").uri("http://localhost:8081"))
                .route("supplier-service", r -> r.path("/api/v1/supplier**").uri("http://localhost:8084"))
                .route("directory-service", r -> r.path("/api/v1/auth/user/**").uri("http://localhost:8086"))
                .build();
    }
}
