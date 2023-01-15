package com.example.javasudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SodokuApplication extends Application {

    private IUserInterfaceContract.View uiImpl;
    @Override
    public void start(Stage stage) throws IOException {
        uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            sudokuBuildLogic.build(uiImpl);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}