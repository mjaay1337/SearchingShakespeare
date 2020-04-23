/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuffixTree;


import java.io.IOException;
import javafx.scene.layout.*;
import java.awt.event.ActionEvent;
import java.util.List;
import javafx.geometry.Pos;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import utilities.FileUtility;

public class run extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FileUtility fu = new FileUtility();
        String[] file = fu.toStringArray("src/shakespeare.txt", "[^a-zA-Z0-9]");
        SuffixTree.Suffix_tree sfn = new SuffixTree.Suffix_tree();
        for (String string : file) {
            sfn.add(string);
        }

        Text text1 = new Text("Search Shakespeare word");
        TextField search_input = new TextField("hamlet");
        TextArea result_first = new TextArea();
        result_first.setPrefWidth(750);
        Button btn = new Button();
        Button btn1 = new Button();
        btn.setText("Search Locate");
        btn1.setText("Search Find");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(800, 400);
        //gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(search_input, 0, 1);
        gridPane.add(result_first, 0, 4);
        gridPane.add(btn, 0, 2);
        gridPane.add(btn1, 0, 3);

        btn.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                String res = sfn.locate("hamlet");
                result_first.setText("Root found at index : " + res);
            }
        });
        btn1.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                List res = sfn.find("hamlet");
                String result = "";
                for (Object re : res) {
                    result += "Suffix found at index : " + re + "\n";
                }
                result_first.setText(result);
            }
        });

        // when button is pressed 
        Scene scene = new Scene(gridPane);
        stage.setTitle("Searching Shakespeare");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}
