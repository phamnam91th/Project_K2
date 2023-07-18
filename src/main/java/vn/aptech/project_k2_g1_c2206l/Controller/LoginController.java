package vn.aptech.project_k2_g1_c2206l.Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import vn.aptech.project_k2_g1_c2206l.Model.Model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ImageView logo;
    public TextField username_tf;
    public TextField password_tf;
    public Button login_btn;
    public Label error_lbl;
    public Button close_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(actionEvent -> {
            try {
                onLogin();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        close_btn.setOnAction(actionEvent -> {
            System.exit(0);
        });
    }

    public void onLogin() throws IOException {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewFactory().showAdminWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
    }
}
