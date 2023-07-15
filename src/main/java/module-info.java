module vn.aptech.project_k2_g1_c2206l {
    requires javafx.controls;
    requires javafx.fxml;

    opens vn.aptech.project_k2_g1_c2206l to javafx.fxml;
    exports vn.aptech.project_k2_g1_c2206l;
    exports vn.aptech.project_k2_g1_c2206l.Controller;
    exports vn.aptech.project_k2_g1_c2206l.Controller.Admin;
}