// package com.example.demo;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.layout.Pane;
// import javafx.stage.Stage;
// import javafx.scene.shape.Line;
// import javafx.scene.shape.Arc;
// import javafx.scene.paint.Color;

// import java.io.IOException;
// // Create the letters DC
// public class HelloApplication extends Application {
//     @Override
//     public void start(Stage stage) throws IOException {
//         Pane pane = new Pane();
//         Line line = new Line(35,60,35,240); // Line for the D
//         Arc arc = new Arc(35 ,150, 100, 90, -90, 180); // Arc for the D
//         arc.setFill(Color.TRANSPARENT);
//         arc.setStroke(Color.BLACK);
//         Arc arc2 = new Arc(250 ,150, 100, 90, 90, 180); // Arc for the C
//         arc2.setFill(Color.TRANSPARENT);
//         arc2.setStroke(Color.BLACK);
//         pane.getChildren().add(line);
//         pane.getChildren().add(arc);
//         pane.getChildren().add(arc2);
//         Scene scene = new Scene(pane, 300, 300);
//         stage.setTitle("Dyl!");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch();
//     }
// }