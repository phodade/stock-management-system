package org.dnyanyog.controller;

import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.dnyanyog.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductServiceController {

  @Autowired
  private ProductServiceImp productService;

  @PostMapping(
      path = "/add",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public ProductResponse addProduct(@RequestBody ProductRequest productRequest) throws Exception {
    return productService.addProduct(productRequest);
  }

  @PutMapping(
		    path = "/{productId}",
		    consumes = {"application/json", "application/xml"},
		    produces = {"application/json", "application/xml"})
		public ProductResponse updateProduct(
		    @PathVariable("productId") String productId,
		    @RequestBody ProductRequest request) {
		  return productService.updateProduct(productId, request);
		}



  @GetMapping(
		    path = "/{productId}",
		    produces = {"application/json", "application/xml"})
		public ProductResponse getProduct(@PathVariable("productId") String productId) {
		    return productService.getProductById(productId);
		}


  @DeleteMapping(
	      path = "/{productId}",
	      produces = {"application/json", "application/xml"})
	  public ProductResponse deleteProduct(@PathVariable("productId") String productId) {
	    return productService.deleteProduct(productId);
	  }

  @GetMapping(
      path = "/all",
      produces = {"application/json", "application/xml"})
  public ProductResponse getAllProducts() {
    return productService.getAllProducts();
  }
}
