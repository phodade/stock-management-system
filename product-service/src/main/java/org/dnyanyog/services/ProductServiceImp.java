package org.dnyanyog.services;

import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.ProductData;
import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.dnyanyog.entity.Product;
import org.dnyanyog.repo.ProductServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp {

  @Autowired
  private ProductServiceRepository productRepo;

  public ProductResponse addProduct(@Valid ProductRequest request) {
    ProductResponse productResponse = new ProductResponse(); 

    try {
      List<Product> existingProducts = productRepo.findByproductName(request.getproductName());
      if (!existingProducts.isEmpty()) {
        productResponse.setStatus(ResponseCode.PRODUCT_ADD_FAILED.getStatus());
        productResponse.setMessage(ResponseCode.PRODUCT_ADD_FAILED.getMessage());
        return productResponse;
      }

      Product newProduct = new Product();
      newProduct.setproductName(request.getproductName());
      newProduct.setDescription(request.getDescription());
      newProduct.setcategory(request.getcategory());
      newProduct.setPrice(request.getPrice());
      newProduct.setQuantity(request.getQuantity());
      newProduct.generateProductId();
      newProduct.setStatus(Product.Status.ACTIVE);

      productRepo.save(newProduct);
      populateProductResponse(productResponse, newProduct);
      productResponse.setStatus(ResponseCode.PRODUCT_ADDED.getStatus());
      productResponse.setMessage(ResponseCode.PRODUCT_ADDED.getMessage());
    } catch (Exception e) {
      productResponse.setStatus(ResponseCode.PRODUCT_ADD_FAILED.getStatus());
      productResponse.setMessage(ResponseCode.PRODUCT_ADD_FAILED.getMessage());
    }
    return productResponse;
  }


  private void populateProductResponse(ProductResponse response, Product product) {
    ProductData data = new ProductData();
    data.setproductId(product.getproductId());
    data.setproductName(product.getproductName());
    data.setDescription(product.getDescription());
    data.setcategory(product.getcategory());
    data.setPrice(product.getPrice());
    data.setQuantity(product.getQuantity());

    response.setData(data);
  }
  
  public ProductResponse updateProduct(String productId, ProductRequest request) {
	  ProductResponse productResponse = new ProductResponse();
	  List<Product> optionalProduct = productRepo.findByProductId(productId);

	  if (optionalProduct.isEmpty()) {
	    productResponse.setStatus(ResponseCode.PRODUCT_UPDATE_FAILED.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_UPDATE_FAILED.getMessage());
	  } else {
	    Product product = optionalProduct.get(0);
	    product.setproductName(request.getproductName());
	    product.setDescription(request.getDescription());
	    product.setcategory(request.getcategory());
	    product.setPrice(request.getPrice());
	    product.setQuantity(request.getQuantity());

	    productRepo.save(product);
	    populateProductResponse(productResponse, product);
	    productResponse.setStatus(ResponseCode.PRODUCT_UPDATED.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_UPDATED.getMessage());
	  }
	  return productResponse;
	}

  public ProductResponse getProductById(String productId) {
	  ProductResponse productResponse = new ProductResponse();
	  List<Product> optionalProduct = productRepo.findByProductId(productId);

	  if (optionalProduct.isEmpty()) {
	    productResponse.setStatus(ResponseCode.PRODUCT_NOT_FOUND.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_NOT_FOUND.getMessage());
	  } else {
	    Product product = optionalProduct.get(0);
	    populateProductResponse(productResponse, product);
	    productResponse.setStatus(ResponseCode.PRODUCT_FOUND.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_FOUND.getMessage());
	  }

	  return productResponse;
	}

  public ProductResponse deleteProduct(String productId) {
	  ProductResponse productResponse = new ProductResponse();
	  List<Product> optionalProduct = productRepo.findByProductId(productId);

	  if (optionalProduct.isEmpty()) {
	    productResponse.setStatus(ResponseCode.PRODUCT_DELETE_FAILED.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_DELETE_FAILED.getMessage());
	  } else {
	    Product product = optionalProduct.get(0);
	    product.setStatus(Product.Status.DELETED);
	    productRepo.save(product);

	    populateProductResponse(productResponse, product);
	    productResponse.setStatus(ResponseCode.PRODUCT_DELETED.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_DELETED.getMessage());
	  }

	  return productResponse;
	}

  public ProductResponse getAllProducts() {
	  ProductResponse productResponse = new ProductResponse();

	  // ✅ Correct method to fetch by status
	  List<Product> allProducts = productRepo.findByStatus(Product.Status.ACTIVE);

	  if (allProducts.isEmpty()) {
	    productResponse.setStatus(ResponseCode.PRODUCT_NOT_FOUND.getStatus());
	    productResponse.setMessage(ResponseCode.PRODUCT_NOT_FOUND.getMessage());
	    return productResponse;
	  }

	  List<ProductData> productDataList = new ArrayList<>();
	  for (Product product : allProducts) {
	    ProductData data = new ProductData();
	    data.setproductId(product.getproductId());
	    data.setproductName(product.getproductName());
	    data.setDescription(product.getDescription());
	    data.setcategory(product.getcategory());
	    data.setPrice(product.getPrice());
	    data.setQuantity(product.getQuantity());
	    productDataList.add(data);
	  }

	  productResponse.setDataList(productDataList);
	  productResponse.setStatus(ResponseCode.PRODUCT_FOUND.getStatus());
	  productResponse.setMessage(ResponseCode.PRODUCT_FOUND.getMessage());

	  return productResponse;
	}
  

}

