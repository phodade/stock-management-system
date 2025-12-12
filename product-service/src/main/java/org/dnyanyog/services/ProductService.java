package org.dnyanyog.services;

import jakarta.validation.Valid;
import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.springframework.stereotype.Service;

public interface ProductService {

public ProductResponse addProduct(@Valid ProductRequest request) throws Exception;

public ProductResponse updateProduct(String productproductId, @Valid ProductRequest request);

public ProductResponse getProductByproductId(String productproductId);

public ProductResponse getProductByName(String productName);

public ProductResponse deleteProduct(String productId);

//ProductResponse addProduct(ProductRequest request);
ProductResponse getAllProducts();
}