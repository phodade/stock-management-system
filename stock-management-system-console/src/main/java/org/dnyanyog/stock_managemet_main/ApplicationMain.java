package org.dnyanyog.stock_managemet_main;

import org.dnyanyog.common.StageFactory;
import org.dnyanyog.login.LoginScreen;

import javafx.application.Application;
import javafx.stage.Stage;


public class ApplicationMain extends Application {

  public static void main(String args[]) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {

    StageFactory.stage = stage;
    new LoginScreen().show();
  }
}
