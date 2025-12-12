package org.dnyanyog.controller;

import org.dnyanyog.dto.SupplierRequest;
import org.dnyanyog.dto.SupplierResponse;
import org.dnyanyog.service.SupplierServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierServiceController {

  @Autowired
  private SupplierServiceImp supplierService;

  @PostMapping(
      path = "/add",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public SupplierResponse addSupplier(@RequestBody SupplierRequest request) {
    return supplierService.addSupplier(request);
  }

  @PutMapping(
      path = "/{supplierId}",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public SupplierResponse updateSupplier(
      @PathVariable("supplierId") Long supplierId,
      @RequestBody SupplierRequest request) {
    return supplierService.updateSupplier(supplierId, request);
  }

  @GetMapping(
      path = "/{supplierId}",
      produces = {"application/json", "application/xml"})
  public SupplierResponse getSupplier(@PathVariable("supplierId") Long supplierId) {
    return supplierService.getSupplierById(supplierId);
  }

  @DeleteMapping(
      path = "/{supplierId}",
      produces = {"application/json", "application/xml"})
  public SupplierResponse deleteSupplier(@PathVariable("supplierId") Long supplierId) {
    return supplierService.deleteSupplier(supplierId);
  }

  @GetMapping(
      path = "/all",
      produces = {"application/json", "application/xml"})
  public SupplierResponse getAllSuppliers() {
    return supplierService.getAllSuppliers();
  }

  @PostMapping(
      path = "/restock/{supplierId}",
      produces = {"application/json", "application/xml"})
  public SupplierResponse restockSupplier(@PathVariable("supplierId") Long supplierId) {
    return supplierService.restockFromSupplier(supplierId);
  }
}
