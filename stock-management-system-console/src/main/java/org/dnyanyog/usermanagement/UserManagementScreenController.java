package org.dnyanyog.usermanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import org.dnyanyog.dashboard.DashBoardScreen;
import org.dnyanyog.inventorymanagement.InventoryManagementScreen;
import org.dnyanyog.ordermanagement.OrderManagementScreen;
import org.dnyanyog.productmanagement.ProductManagementScreen;
import org.dnyanyog.suppliermanagement.SupplierManagementScreen;
import org.dnyanyog.user.AddUserScreen;
import org.dnyanyog.usermanagement.UserManagementScreen;

public class UserManagementScreenController {

	@FXML
	private Button Logout;

	@FXML
	private Button Adduser;

	@FXML
	private Button Searchuser;

	@FXML
	private Button Edituser;

	@FXML
	private Button Deleteuser;

	@FXML
	private Button DashBoard;

	@FXML
	private Button Users;

	@FXML
	private Button Product;

	@FXML
	private Button Inventory;

	@FXML
	private Button Supplier;

	@FXML
	private Button Order;

	@FXML
	void LogoutButton(ActionEvent event) {
		new DashBoardScreen().show();
	}

	@FXML
	void DashBoardButton(ActionEvent event) {
		new DashBoardScreen().show();
	}

	@FXML
	void UserButton(ActionEvent event) {
		new UserManagementScreen().show();
	}

	@FXML
	void AddUserButton(ActionEvent event) {
		new AddUserScreen().show();
	}

	@FXML
	void SearchUserButton(ActionEvent event) {
// Implement search user screen
	}

	@FXML
	void DeleteUserButton(ActionEvent event) {
// Implement delete user screen
	}

	@FXML
	void EditUserButton(ActionEvent event) {
// Implement edit user screen
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
	void SupplierButton(ActionEvent event) {
		new SupplierManagementScreen().show();
	}

	@FXML
	void OrderButton(ActionEvent event) {
		new OrderManagementScreen().show();
	}
}