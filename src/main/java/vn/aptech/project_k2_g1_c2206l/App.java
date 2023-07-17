package vn.aptech.project_k2_g1_c2206l;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vn.aptech.project_k2_g1_c2206l.Model.Model;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
