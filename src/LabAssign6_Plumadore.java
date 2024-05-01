/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Lab Assingment 6 Ainsley Plumadore

/**
 *
 * @author ainsl
 */
public class LabAssign6_Plumadore extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane pane = new BorderPane();
        
        // H & V boxes
        VBox vBox = new VBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        
        //Create the top of the pane(VBox)
        Text title = new Text("Pick your fav celeb!");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
        
        TextField tf = new TextField("");
        tf.setEditable(false);
        
        //Create content for HBox1 (two buttons with images)
        //Celeb Images
        Image theRock = new Image("https://imageio.forbes.com/specials-images/imageserve/6504630c3d69b479bdfdab51/0x0.jpg?format=jpg&crop=1543,869,x0,y159,safe&height=600&width=1200&fit=bounds", 175, 175, false, false);
        Image lm = new Image("https://cdn.britannica.com/35/238335-050-2CB2EB8A/Lionel-Messi-Argentina-Netherlands-World-Cup-Qatar-2022.jpg", 175, 175, false, false);
        Image sg = new Image("https://media.allure.com/photos/6564b69be7c6b379f991b3ed/16:9/w_2560%2Cc_limit/selena%2520gomez%2520chunky%2520blonde%2520highlights.jpg", 350, 350, false, false);
        Image ts = new Image("https://cloudfront-us-east-1.images.arcpublishing.com/pmn/GNTWHNK3RNCEJEOUBVKVLHMRWU.jpg", 175, 175, false, false);
        
        Button theRockButton = new Button();
        theRockButton.setGraphic(new ImageView(theRock));

        theRockButton.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "Dwyane The Rock Johnson", "Success isn't always about greatness...");
        });
        
        Button lmButton = new Button();
        lmButton.setGraphic(new ImageView(lm));

        lmButton.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "Lionel Messi", "There are more important things in life than winning and loosing a game...");
        });

        Button sgButton = new Button();
        sgButton.setGraphic(new ImageView(sg));

        sgButton.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "Selena Gomez", "Kill Em with Kindness");
        });
        
        Button tsButton = new Button();
        tsButton.setGraphic(new ImageView(ts));

        tsButton.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "Taylor Swift", "I never want to change so much that people can't recognize me.");
        });
        
        //Add content to the pane
        //Add VBox elements
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(title, tf);
        
        //Add HBox1 Elements
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setSpacing(100);
        hBox1.getChildren().addAll(theRockButton, lmButton);
        
        //Add HBox2 Elements
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setSpacing(100);
        hBox2.getChildren().addAll(sgButton, tsButton);
        
        //Add VBox to the top of pane
        pane.setTop(vBox);
        pane.setCenter(hBox1);
        pane.setBottom(hBox2);
        
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Who's your fav celebrity?");
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void buttonPressed(TextField tf, String celebName, String m) {
        tf.setText(celebName);
        System.out.println(celebName + ": " + m);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
