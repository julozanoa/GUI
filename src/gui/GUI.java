/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 *
 * @author Estudiante
 */
public class GUI extends Application{

    /**
     * @param args the command line arguments
     */
    
    private Label label1;
    private Label label2;
    
    @Override
    public void start(Stage primaryStage)throws Exception{
        VBox layout = new VBox();
        HBox layoutFila1 = new HBox();
        HBox layoutFila2 = new HBox();
        HBox layoutFila3 = new HBox();
        HBox layoutFila4 = new HBox();
        HBox layoutFila5 = new HBox();
        Button button1 = new Button("Ingresar");
        this.label1 = new Label("Nombre");
        this.label2 = new Label("Apellido");
        TextField Lnombre = new TextField();
        TextField Lapellido = new TextField();
        layoutFila1.getChildren().add(label1);
        layoutFila1.getChildren().add(Lnombre);
        layoutFila2.getChildren().add(label2);
        layoutFila2.getChildren().add(Lapellido);
        VBox radiobuttons = new VBox();
        HBox otro = new HBox();
        Label genero = new Label("Género");
        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Masculino");
        rb1.setToggleGroup(group);
        RadioButton rb2 = new RadioButton("Femenino");
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton("Otro");
        rb3.setToggleGroup(group);
        Label labelotro = new Label("¡Cual?");
        TextField Lotro = new TextField();
        otro.getChildren().add(rb3);
        otro.getChildren().add(labelotro);
        otro.getChildren().add(Lotro);
        radiobuttons.getChildren().add(rb1);
        radiobuttons.getChildren().add(rb2);
        radiobuttons.getChildren().add(otro);
        layoutFila3.getChildren().add(genero);
        layoutFila3.getChildren().add(radiobuttons);
        TableView table = new TableView();
        table.setEditable(true);
        TableColumn col1 = new TableColumn("Nombre");
        TableColumn col2 = new TableColumn("Apellido");
        TableColumn col3 = new TableColumn("Género");
        table.getColumns().addAll(col1,col2,col3);
        layoutFila5.getChildren().add(table);
        layout.getChildren().add(layoutFila1);
        layout.getChildren().add(layoutFila2);
        layout.getChildren().add(layoutFila3);
        layout.getChildren().add(button1);
        layout.getChildren().add(layoutFila5);
        primaryStage.setTitle("Ejercico");
        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        Evento evento = new Evento();
        button1.setOnAction(evento);
    }
    
    private class Evento implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            System.out.println(label1.getText());
            System.out.println(label2.getText());
        }
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
