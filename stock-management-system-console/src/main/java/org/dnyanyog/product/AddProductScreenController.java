package org.dnyanyog.product;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.dnyanyog.common.RestUtil;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.inventorymanagement.InventoryManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;

public class AddProductScreenController {

    @FXML private TextField txtProductId;
    @FXML private TextField txtProductName;
    @FXML private TextArea txtDescription;
    @FXML private TextField txtPrice;
    @FXML private TextField txtQuantity;
    @FXML private TextField txtCategory;

    private static final String API_URL = "http://localhost:8081/api/v1/product/add";

  
    @FXML void handleDashboard(ActionEvent event) {
        new DashBoardScreen().show();
    }

    @FXML void handleProduct(ActionEvent event) {
        new ProductManagementScreen().show();
    }

    @FXML void handleOrders(ActionEvent event) {
        new OrderManagementScreen().show();
    }

    @FXML void handleUsers(ActionEvent event) {
        new UserManagementScreen().show();
    }

    @FXML void handleSuppliers(ActionEvent event) {
        new SupplierManagementScreen().show();
    }

    @FXML void handleInventory(ActionEvent event) {
        new InventoryManagementScreen().show();
    }

    @FXML void handleLogout(ActionEvent event) {
        new DashBoardScreen().show(); 
    }

    @FXML void handleCancel(ActionEvent event) {
        new ProductManagementScreen().show();
    }

    @FXML void handleSave(ActionEvent event) {
        ProductRequest request = new ProductRequest();
        request.setproductId(txtProductId.getText().trim());
        request.setproductName(txtProductName.getText().trim());
        request.setDescription(txtDescription.getText().trim());

        try {
            request.setPrice(Double.parseDouble(txtPrice.getText().trim()));
            request.setQuantity(Integer.parseInt(txtQuantity.getText().trim()));
        } catch (NumberFormatException e) {
            showAlert("Invalid input", "Price and Quantity must be numbers.");
            return;
        }

        request.setcategory(txtCategory.getText().trim());

        try {
            ProductResponse response =
                RestUtil.sendPostRequest(API_URL, ProductResponse.class, request);

            if (response != null && "SUCCESS".equalsIgnoreCase(response.getStatus())) {
                showAlert("Product Added", "Product added successfully.");
                clearFields();
            } else {
                showAlert("Failed", response != null ? response.getMessage() : "Unknown error occurred.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to connect to the server.");
        }
    }

    private void clearFields() {
        txtProductId.clear();
        txtProductName.clear();
        txtDescription.clear();
        txtPrice.clear();
        txtQuantity.clear();
        txtCategory.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
