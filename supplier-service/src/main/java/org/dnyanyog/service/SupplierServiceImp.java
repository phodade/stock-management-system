package org.dnyanyog.service;

import jakarta.validation.Valid;
import org.dnyanyog.common.SupplierResponseCode;
import org.dnyanyog.dto.SupplierData;
import org.dnyanyog.dto.SupplierRequest;
import org.dnyanyog.dto.SupplierResponse;
import org.dnyanyog.entity.Supplier;
import org.dnyanyog.repo.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SupplierServiceImp implements SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    @Override
    public SupplierResponse addSupplier(@Valid SupplierRequest request) {
        SupplierResponse response = new SupplierResponse();
        Optional<Supplier> existing = supplierRepo.findBySupplierName(request.getsupplierName());

        if (existing.isPresent()) {
            response.setResponseCode(SupplierResponseCode.SUPPLIER_ADD_FAILED.getStatus());
            response.setResponseMessage("Supplier already exists!");
            return response;
        }

        Supplier supplier = new Supplier();
        supplier.setSupplierName(request.getsupplierName());
        supplier.setContact(request.getContact());
        supplier.setAddress(request.getAddress());
        supplier.setActive(true);

        supplierRepo.save(supplier);

        response.setResponseCode(SupplierResponseCode.SUPPLIER_ADDED.getStatus());
        response.setResponseMessage(SupplierResponseCode.SUPPLIER_ADDED.getMessage());
        response.setData(convertToData(supplier));

        return response;
    }

    @Override
    public SupplierResponse updateSupplier(Long supplierId, @Valid SupplierRequest request) {
        SupplierResponse response = new SupplierResponse();
        Optional<Supplier> optionalSupplier = supplierRepo.findById(supplierId);

        if (optionalSupplier.isEmpty()) {
            response.setResponseCode(SupplierResponseCode.SUPPLIER_UPDATE_FAILED.getStatus());
            response.setResponseMessage(SupplierResponseCode.SUPPLIER_UPDATE_FAILED.getMessage());
            return response;
        }

        Supplier supplier = optionalSupplier.get();
        supplier.setSupplierName(request.getsupplierName());
        supplier.setContact(request.getContact());
        supplier.setAddress(request.getAddress());

        supplierRepo.save(supplier);

        response.setResponseCode(SupplierResponseCode.SUPPLIER_UPDATED.getStatus());
        response.setResponseMessage(SupplierResponseCode.SUPPLIER_UPDATED.getMessage());
        response.setData(convertToData(supplier));

        return response;
    }

    @Override
    public SupplierResponse getSupplierById(Long supplierId) {
        SupplierResponse response = new SupplierResponse();
        Optional<Supplier> optionalSupplier = supplierRepo.findById(supplierId);

        if (optionalSupplier.isEmpty()) {
            response.setResponseCode(SupplierResponseCode.SUPPLIER_NOT_FOUND.getStatus());
            response.setResponseMessage(SupplierResponseCode.SUPPLIER_NOT_FOUND.getMessage());
            return response;
        }

        response.setResponseCode(SupplierResponseCode.SUPPLIER_FOUND.getStatus());
        response.setResponseMessage(SupplierResponseCode.SUPPLIER_FOUND.getMessage());
        response.setData(convertToData(optionalSupplier.get()));

        return response;
    }

    @Override
    public SupplierResponse deleteSupplier(Long supplierId) {
        SupplierResponse response = new SupplierResponse();
        Optional<Supplier> optionalSupplier = supplierRepo.findById(supplierId);

        if (optionalSupplier.isEmpty()) {
            response.setResponseCode(SupplierResponseCode.SUPPLIER_DELETE_FAILED.getStatus());
            response.setResponseMessage(SupplierResponseCode.SUPPLIER_DELETE_FAILED.getMessage());
            return response;
        }

        supplierRepo.deleteById(supplierId);
        response.setResponseCode(SupplierResponseCode.SUPPLIER_DELETED.getStatus());
        response.setResponseMessage(SupplierResponseCode.SUPPLIER_DELETED.getMessage());

        return response;
    }

    @Override
    public SupplierResponse getAllSuppliers() {
        SupplierResponse response = new SupplierResponse();
        List<Supplier> suppliers = supplierRepo.findAll();

        if (suppliers.isEmpty()) {
            response.setResponseCode(SupplierResponseCode.SUPPLIER_NOT_FOUND.getStatus());
            response.setResponseMessage(SupplierResponseCode.SUPPLIER_NOT_FOUND.getMessage());
            response.setDataList(Collections.emptyList());
            return response;
        }

        List<SupplierData> supplierDataList = new ArrayList<>();
        for (Supplier supplier : suppliers) {
            supplierDataList.add(convertToData(supplier));
        }

        response.setResponseCode(SupplierResponseCode.SUPPLIER_FOUND.getStatus());
        response.setResponseMessage(SupplierResponseCode.SUPPLIER_FOUND.getMessage());
        response.setDataList(supplierDataList);

        return response;
    }

    @Override
    public SupplierResponse restockFromSupplier(Long supplierId) {
        SupplierResponse response = new SupplierResponse();
        Optional<Supplier> optionalSupplier = supplierRepo.findById(supplierId);

        if (optionalSupplier.isEmpty()) {
            response.setResponseCode(SupplierResponseCode.RESTOCK_FAILED.getStatus());
            response.setResponseMessage(SupplierResponseCode.RESTOCK_FAILED.getMessage());
            return response;
        }

        Supplier supplier = optionalSupplier.get();
        String restockMessage = "Restocking initiated for supplier: " + supplier.getSupplierName();

        response.setResponseCode(SupplierResponseCode.RESTOCK_INITIATED.getStatus());
        response.setResponseMessage(restockMessage);
        response.setData(convertToData(supplier));

        return response;
    }

    private SupplierData convertToData(Supplier supplier) {
        SupplierData data = new SupplierData();
        data.setsupplierName(supplier.getSupplierName());
        data.setContact(supplier.getContact());
        data.setAddress(supplier.getAddress());
        return data;
    }
}
