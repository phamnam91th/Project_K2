package vn.aptech.project_k2_g1_c2206l.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import vn.aptech.project_k2_g1_c2206l.Model.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case MANAGEMENT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getManagementView());
                case TASK -> admin_parent.setCenter(Model.getInstance().getViewFactory().getTaskView());
                case TICKET -> admin_parent.setCenter(Model.getInstance().getViewFactory().getTicketView());
                case REPORT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getReportView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
