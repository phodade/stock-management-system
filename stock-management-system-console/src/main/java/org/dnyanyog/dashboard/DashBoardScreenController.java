package org.dnyanyog.dashboard;

import org.dnyanyog.inventorymanagement.InventoryManagementScreen;
import org.dnyanyog.login.LoginScreen;
import org.dnyanyog.notification.NotificationScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class DashBoardScreenController {

  @FXML private Button Product;
  @FXML private Button Inventory;
  @FXML private Button Order;
  @FXML private Button Supplier;
  @FXML private Button Notification;
  @FXML private Button Users;
  @FXML private Button Logout;
  @FXML private Button DashBoard;

  @FXML
  void DashBoardButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void ProductButton(ActionEvent event) {
    new ProductManagementScreen().show();
  }

  @FXML
  void InventoryButton(ActionEvent event) {
    new InventoryManagementScreen().show();
  }

  @FXML
  void OrderButton(ActionEvent event) {
    new OrderManagementScreen().show();
  }

  @FXML
  void SupplierButton(ActionEvent event) {
    new SupplierManagementScreen().show();
  }

  @FXML
  void NotificationButton(ActionEvent event) {
    new NotificationScreen().show();
  }

  @FXML
  void UsersButton(ActionEvent event) {
    new UserManagementScreen().show();
  }

  @FXML
  void LogOutButton(ActionEvent event) {
    new LoginScreen().show();
  }
}
