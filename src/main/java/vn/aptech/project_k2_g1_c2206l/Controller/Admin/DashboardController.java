package vn.aptech.project_k2_g1_c2206l.Controller.Admin;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public StackedBarChart<String, Number> stackChart;
    public CategoryAxis x;
    public NumberAxis y;
    public PieChart myPieChart;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Customer");
        series1.getData().add(new XYChart.Data<>("1",200));
        series1.getData().add(new XYChart.Data<>("2",310));
        series1.getData().add(new XYChart.Data<>("3",240));
        series1.getData().add(new XYChart.Data<>("4",150));
        series1.getData().add(new XYChart.Data<>("5",200));
        series1.getData().add(new XYChart.Data<>("6",310));
        series1.getData().add(new XYChart.Data<>("7",240));
        series1.getData().add(new XYChart.Data<>("8",150));

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Product");
        series2.getData().add(new XYChart.Data<>("1", 20));
        series2.getData().add(new XYChart.Data<>("2", 60));
        series2.getData().add(new XYChart.Data<>("3", 40));
        series2.getData().add(new XYChart.Data<>("4", 30));
        series2.getData().add(new XYChart.Data<>("5", 20));
        series2.getData().add(new XYChart.Data<>("6", 60));
        series2.getData().add(new XYChart.Data<>("7", 40));
        series2.getData().add(new XYChart.Data<>("8", 30));

        stackChart.getData().addAll(series1, series2);


        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("Ha Noi", 200),
                new PieChart.Data("Thanh Hoa", 160),
                new PieChart.Data("Bac Giang", 189),
                new PieChart.Data("Thai Binh", 220)
        );
        myPieChart.dataProperty().set(data);
        myPieChart.setTitle("Doanh thu tung co so");
        myPieChart.setClockwise(true);
        myPieChart.setAnimated(true);

    }


}
