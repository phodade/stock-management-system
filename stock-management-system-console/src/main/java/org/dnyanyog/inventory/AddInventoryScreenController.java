package org.dnyanyog.inventory;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import org.dnyanyog.common.RestUtil;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.inventorymanagement.InventoryManagementScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;

public class AddInventoryScreenController {

    @FXML private TextField productCodeField;
    @FXML private TextField quantityField;
    @FXML private TextField warehouseLocationField;
    @FXML private TextField statusField;

    @FXML
    void handleDashboard(ActionEvent event) {
        new DashBoardScreen().show();
    }

    @FXML
    void handleProduct(ActionEvent event) {
        new ProductManagementScreen().show();
    }

    @FXML
    void handleOrders(ActionEvent event) {
        new OrderManagementScreen().show();
    }

    @FXML
    void handleUsers(ActionEvent event) {
        new UserManagementScreen().show();
    }

    @FXML
    void handleSuppliers(ActionEvent event) {
        new SupplierManagementScreen().show();
    }

    @FXML
    void handleInventory(ActionEvent event) {
        new InventoryManagementScreen().show();
    }

    @FXML
    void handleLogout(ActionEvent event) {
        new DashBoardScreen().show();
    }

    @FXML
    void handleCancel(ActionEvent event) {
        new InventoryManagementScreen().show();
    }

    @FXML
    void handleSave(ActionEvent event) {
        String prodCode = productCodeField.getText().trim();
        String qtyText = quantityField.getText().trim();
        String location = warehouseLocationField.getText().trim();
        String invStatus = statusField.getText().trim();

        if (prodCode.isEmpty() || qtyText.isEmpty() || location.isEmpty() || invStatus.isEmpty()) {
            showAlert("Missing Fields", "Please fill all fields before submitting.");
            return;
        }

        int qty;
        try {
            qty = Integer.parseInt(qtyText);
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Quantity must be a valid number.");
            return;
        }

        InventoryRequest request = new InventoryRequest();
        request.setProductCode(prodCode);
        request.setQuantity(qty);
        request.setWarehouseLocation(location);
        request.setStatus(invStatus);

        try {
            InventoryResponse response = RestUtil.sendPostRequest(
                "http://localhost:8082/api/v1/inventory/add", InventoryResponse.class, request);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Inventory Added");
            alert.setContentText(
                response.getMessage() != null ? response.getMessage() : "Inventory added successfully."
            );
            alert.show();

        } catch (IOException | InterruptedException e) {
            showAlert("Request Failed", "Unable to connect to server or send data.");
            e.printStackTrace();
        }
    }

    private void showAlert(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }
}
