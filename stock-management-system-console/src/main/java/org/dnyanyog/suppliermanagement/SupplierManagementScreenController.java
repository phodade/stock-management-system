package org.dnyanyog.suppliermanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;
import org.dnyanyog.supplier.AddSupplierScreen;

public class SupplierManagementScreenController {

  @FXML private Button Logout;

  @FXML private Button DashBoard;

  @FXML private Button Users;

  @FXML private Button Product;

  @FXML private Button Orders;

  @FXML private Button AddSupplier;

  @FXML private Button EditSupplier;

  @FXML private Button DeleteSupplier;

  @FXML private Button Suppliers;

  @FXML
  void LogoutButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void DashBoardButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void UsersButton(ActionEvent event) {
    new UserManagementScreen().show();
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
  void SuppliersButton(ActionEvent event) {
    new SupplierManagementScreen().show();
  }

  @FXML
  void AddSupplierButton(ActionEvent event) {
    new AddSupplierScreen().show();
  }

  @FXML
  void EditSupplierButton(ActionEvent event) {
    
  }

  @FXML
  void DeleteSupplierButton(ActionEvent event) {
    
  }
}
