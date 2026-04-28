package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;

import javafx.scene.image.ImageView;


import java.awt.*;
import java.io.IOException;

public class Main extends Application {

    @Override
            public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.BLUE);
        Image icon = new Image("WATE.jpg");
        stage.getIcons().addAll(icon);
        stage.setTitle("Arcane");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        stage.setFullScreen(true);

        stage.setFullScreenExitHint("Press the letter v to exit fullscreen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("v"));


        Text text = new Text();
        text.setText("Paint the town Blue!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("josefin sans", 50));
        text.setFill(Color.PURPLE);

        Line line = new Line();
        line.setStartX(300);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(8);
        line.setStroke(Color.ROSYBROWN);
//        line.setOpacity(0.5);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(80);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(200);
        rectangle.setFill(Color.ROSYBROWN);
        rectangle.setStrokeWidth(4);
        rectangle.setStroke(Color.BLACK);
        rectangle.setRotate(45);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
            400.0,400.0,
                500.0,500.0,
                400.0,500.0
        );
        triangle.setFill(Color.MINTCREAM);
        triangle.setStrokeWidth(4);
        triangle.setStroke(Color.BLACK);


        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(45);
        circle.setFill(Color.DARKGRAY);
        circle.setStroke(Color.BLACK);

        Image image = new Image("WATE.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(400);

        root.getChildren().add(circle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
