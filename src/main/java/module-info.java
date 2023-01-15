module com.example.javasudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javasudoku to javafx.fxml;
    exports com.example.javasudoku;
    exports com.example.javasudoku;
    opens com.example.javasudoku to javafx.fxml;
    exports com.example.javasudoku.ProblemDomain;
    opens com.example.javasudoku.ProblemDomain to javafx.fxml;
}