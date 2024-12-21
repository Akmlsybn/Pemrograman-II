package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tabel = new TableView<>();

        TableColumn<Mahasiswa, Integer> kolom1 = new TableColumn<>("ID");
        TableColumn<Mahasiswa, String> kolom2 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String> kolom3 = new TableColumn<>("Nama");

        kolom1.setCellValueFactory(new PropertyValueFactory<>("id"));  
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nim")); 
        kolom3.setCellValueFactory(new PropertyValueFactory<>("nama")); 

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getColumns().add(kolom3);

        tabel.getItems().add(new Mahasiswa(1, "2310817310010", "Akmallullail Sya'ban"));
        tabel.getItems().add(new Mahasiswa(2, "2310817310011", "Muhammad Rizky"));
        tabel.getItems().add(new Mahasiswa(3, "2310817120002", "Siti Ratna Dwinta Sari"));
        tabel.getItems().add(new Mahasiswa(4, "2310817110015", "Akhmad Chaidar Ananda"));
        tabel.getItems().add(new Mahasiswa(5, "2310817210020", "Muhammad Hasbiyan Rusyadi"));
        tabel.getItems().add(new Mahasiswa(6, "2310817120001", "Dina Izzati Elfadheya"));
        tabel.getItems().add(new Mahasiswa(7, "2310817210012", "Nazmi Hakim"));
        tabel.getItems().add(new Mahasiswa(8, "2310817110006", "Adrian Bintang Saputera"));
        tabel.getItems().add(new Mahasiswa(9, "2310817120014", "Aliya Raffa Naura Ayu"));
        tabel.getItems().add(new Mahasiswa(10,"2310817210007", "Raymond Hariyono"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }
}
