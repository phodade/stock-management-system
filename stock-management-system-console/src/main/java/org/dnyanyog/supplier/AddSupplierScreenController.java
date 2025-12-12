package org.dnyanyog.supplier;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import org.dnyanyog.common.RestUtil;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.dto.SupplierRequest;
import org.dnyanyog.dto.SupplierResponse;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;

public class AddSupplierScreenController {

  @FXML private Button Logout;
  @FXML private Button DashBoard;
  @FXML private Button Product;
  @FXML private Button Orders;
  @FXML private Button Users;
  @FXML private Button Suppliers;
  @FXML private Button Save;
  @FXML private Button Cancel;

  @FXML private TextField supplierName;
  @FXML private TextField contact;
  @FXML private TextField address;

  @FXML
  void LogoutButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void DashBoardButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void ProductButton(ActionEvent event) {
    new ProductManagementScreen().show();
  }

  @FXML
  void OrdersButton(ActionEvent event) {
    new OrderManagementScreen().show();
  }

  @FXML
  void UsersButton(ActionEvent event) {
    new UserManagementScreen().show();
  }

  @FXML
  void SuppliersButton(ActionEvent event) {
    new SupplierManagementScreen().show();
  }

  @FXML
  void CancelButton(ActionEvent event) {
    new SupplierManagementScreen().show();
  }

  @FXML
  void SaveButton(ActionEvent event) {
    SupplierRequest request = new SupplierRequest();
    request.setsupplierName(supplierName.getText());
    request.setContact(contact.getText());
    request.setAddress(address.getText());

    try {
      SupplierResponse response = RestUtil.sendPostRequest(
        "http://localhost:8084/api/v1/supplier/add", SupplierResponse.class, request);

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle("Supplier Added");
      alert.setHeaderText("Success");
      alert.setContentText("Supplier added successfully!");
      alert.show();
    } catch (IOException | InterruptedException e) {
      Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Error");
      alert.setHeaderText("Failed to Add Supplier");
      alert.setContentText("Something went wrong. Please try again.");
      alert.show();
      e.printStackTrace();
    }
  }
}
