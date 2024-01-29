module com.example.csc325_introproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc325_introproj to javafx.fxml;
    exports com.example.csc325_introproj;
}