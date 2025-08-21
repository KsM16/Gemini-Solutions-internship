module org.example.testngassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;


    opens org.example.testngassignment to javafx.fxml;
    exports org.example.testngassignment;
}