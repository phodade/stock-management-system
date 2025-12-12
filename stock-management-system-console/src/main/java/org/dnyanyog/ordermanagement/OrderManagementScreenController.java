package org.dnyanyog.ordermanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.inventorymanagement.InventoryManagementScreen;
import org.dnyanyog.order.AddOrderScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;


public class OrderManagementScreenController {

  @FXML private Button Logout;
  @FXML private Button DashBoard;
  @FXML private Button AddOrder;
  @FXML private Button EditOrder;
  @FXML private Button DeleteOrder;
  @FXML private Button SearchOrder;
  @FXML private Button Orders;
  @FXML private Button Product;
  @FXML private Button Users;
  @FXML private Button Suppliers;
  @FXML private Button Inventory;

  @FXML
  void LogoutButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void DashBoardButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void OrdersButton(ActionEvent event) {
    new OrderManagementScreen().show();
  }

  @FXML
  void AddOrderButton(ActionEvent event) {
    new AddOrderScreen().show();
  }

  @FXML
  void EditOrderButton(ActionEvent event) {
    // You can implement logic here
    System.out.println("Edit Order clicked");
  }

  @FXML
  void DeleteOrderButton(ActionEvent event) {
    // You can implement logic here
    System.out.println("Delete Order clicked");
  }

  @FXML
  void SearchOrderButton(ActionEvent event) {
    // You can implement logic here
    System.out.println("Search Order clicked");
  }

  @FXML
  void ProductButton(ActionEvent event) {
    new ProductManagementScreen().show();
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
  void InventoryButton(ActionEvent event) {
    new InventoryManagementScreen().show();
  }
}
