package vn.aptech.project_k2_g1_c2206l.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import vn.aptech.project_k2_g1_c2206l.Model.Model;
import vn.aptech.project_k2_g1_c2206l.Views.AdminMenuOptions;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button dashboard_btn;
    public Button management_btn;
    public Button ticket_btn;
    public Button report_btn;
    public Button logout_btn;
    public Button task_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(actionEvent -> onDashboard());
        management_btn.setOnAction(actionEvent -> onManagement());
        task_btn.setOnAction(actionEvent -> onTask());
        ticket_btn.setOnAction(actionEvent -> onTicket());
        report_btn.setOnAction(actionEvent -> onReport());
    }
    public void onDashboard() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.DASHBOARD);
    }
    public void onManagement() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.MANAGEMENT);
    }

    public void onTask() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.TASK);
    }

    public void onTicket() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.TICKET);
    }
    public void onReport() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.REPORT);
    }


}
