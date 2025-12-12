package org.dnyanyog.order;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.dnyanyog.common.RestUtil;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;

public class AddOrderScreenController {

  @FXML private Button Logout;
  @FXML private Button Orders;
  @FXML private Button Cancel;
  @FXML private Button Product;
  @FXML private Button Save;
  @FXML private Button Supplier;
  @FXML private Button DashBoard;
  @FXML private Button Users;

  @FXML private TextField customerName;
  @FXML private TextField productName;
  @FXML private TextField quantity;

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
  void SupplierButton(ActionEvent event) {
    new SupplierManagementScreen().show();
  }

  @FXML
  void OrdersButton(ActionEvent event) {
    new OrderManagementScreen().show();
  }

  @FXML
  void CancelButton(ActionEvent event) {
    new OrderManagementScreen().show(); // Corrected spelling
  }

  @FXML
  void SaveButton(ActionEvent event) {
    OrderRequest addOrder = new OrderRequest();

    addOrder.setCustomerName(customerName.getText());
    addOrder.setProductName(productName.getText());

    try {
      int qty = Integer.parseInt(quantity.getText());
      addOrder.setQuantity(qty);

      OrderResponse response =
          RestUtil.sendPostRequest(
              "http://localhost:8083/api/v1/orders/place", OrderResponse.class, addOrder);

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle("Order Added");
      alert.setHeaderText("Success!!");
      alert.setContentText("Order has been placed successfully.");
      alert.show();

    } catch (NumberFormatException e) {
      Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Input Error");
      alert.setHeaderText("Invalid Quantity");
      alert.setContentText("Please enter a valid integer for quantity.");
      alert.show();
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
