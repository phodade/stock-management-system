package org.dnyanyog.inventorymanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.inventory.AddInventoryScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;


public class InventoryManagementScreenController {

    @FXML
    private Button DashBoard;

    @FXML
    private Button Product;

    @FXML
    private Button Orders;

    @FXML
    private Button Users;

    @FXML
    private Button Suppliers;

    @FXML
    private Button Inventory;

    @FXML
    private Button Logout;

    @FXML
    private Button AddInventory;
    
    @FXML
    private Button EditInventory;
    
    @FXML
    private Button SearchInventory;
    
    @FXML
    private Button DeleteInventory;

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
    void InventoryButton(ActionEvent event) {
        new InventoryManagementScreen().show();  // Reload or refresh
    }

    @FXML
    void LogoutButton(ActionEvent event) {
        new DashBoardScreen().show();  // Or navigate to login screen if applicable
    }

    @FXML
    void AddInventoryButton(ActionEvent event) {
        new AddInventoryScreen().show();  // Navigates to add inventory screen
    }
    
    @FXML
    void EditInventoryButton(ActionEvent event) {
      
    }
    
    @FXML
    void SearchInventoryButton(ActionEvent event) {
      
    }
    
    @FXML
    void DeleteInventoryButton(ActionEvent event) {
      
    }
}
