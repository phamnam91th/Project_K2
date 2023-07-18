module vn.aptech.project_k2_g1_c2206l {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
    requires org.controlsfx.controls;

    opens vn.aptech.project_k2_g1_c2206l to javafx.fxml;
    exports vn.aptech.project_k2_g1_c2206l;
    exports vn.aptech.project_k2_g1_c2206l.Controller;
    exports vn.aptech.project_k2_g1_c2206l.Controller.Admin;
    exports vn.aptech.project_k2_g1_c2206l.Controller.Admin.Management;
    exports vn.aptech.project_k2_g1_c2206l.Views;
    exports vn.aptech.project_k2_g1_c2206l.Model;
}