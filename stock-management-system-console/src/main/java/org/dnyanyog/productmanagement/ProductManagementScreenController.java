package org.dnyanyog.productmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.inventorymanagement.InventoryManagementScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.product.AddProductScreen;
// Uncomment these if you implement them
// import org.dnyanyog.product.EditProductScreen;
// import org.dnyanyog.product.DeleteProductScreen;

public class ProductManagementScreenController {

  @FXML private Button AddProduct;
  @FXML private Button EditProduct;
  @FXML private Button DeleteProduct;
  @FXML private Button SearchProduct;
  @FXML private Button Inventory;
  @FXML private Button Orders;
  @FXML private Button Suppliers;
  @FXML private Button Dashboard;
  @FXML private Button Logout;

  @FXML
  void AddProductButton(ActionEvent event) {
    new AddProductScreen().show();
  }

  
   @FXML
   void EditProductButton(ActionEvent event) {
    
   }

  @FXML
 void DeleteProductButton(ActionEvent event) {
     
   }

  @FXML
  void SearchProductButton(ActionEvent event) {
    // TODO: Implement search product functionality
  }

  @FXML
  void InventoryButton(ActionEvent event) {
    new InventoryManagementScreen().show();
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
  void DashboardButton(ActionEvent event) {
    new DashBoardScreen().show();
  }

  @FXML
  void LogoutButton(ActionEvent event) {
    // Typically you should redirect to a LoginScreen or close the application
    new DashBoardScreen().show(); // Placeholder, replace if you have a LoginScreen
  }
}
