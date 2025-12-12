package org.dnyanyog.service;

import org.dnyanyog.dto.SupplierRequest;
import org.dnyanyog.dto.SupplierResponse;

public interface SupplierService {
  SupplierResponse addSupplier(SupplierRequest request);
  SupplierResponse updateSupplier(Long supplierId, SupplierRequest request);
  SupplierResponse getSupplierById(Long supplierId);
  SupplierResponse deleteSupplier(Long supplierId);
  SupplierResponse getAllSuppliers();
  SupplierResponse restockFromSupplier(Long supplierId);
}
