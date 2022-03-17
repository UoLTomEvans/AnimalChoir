package home.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Hashtable;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private AnchorPane homePage;

    @FXML
    private AnchorPane textInput;

    @FXML
    private AnchorPane MIDIFileUpload;

    // scene switch handling
    @FXML
    public void switchToHome(ActionEvent event) throws IOException {
        homePage.setVisible(true);
        textInput.setVisible(false);
        MIDIFileUpload.setVisible(false);
    }

    @FXML
    public void switchToTextInput(ActionEvent event) throws IOException {
        homePage.setVisible(false);
        textInput.setVisible(true);
        MIDIFileUpload.setVisible(false);
    }

    @FXML
    public void switchToMIDIUpload(ActionEvent event) throws IOException {
        homePage.setVisible(false);
        textInput.setVisible(false);
        MIDIFileUpload.setVisible(true);
    }

    // hyperlink
    @FXML
    public void openLink(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.dogsandbirds.co.uk/how-it-works/"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        homePage.setVisible(true);
        textInput.setVisible(false);
        MIDIFileUpload.setVisible(false);

        // Note types
        String[] noteTypes = {"e2", "f2", "g2", "a2", "b2", "c3", "d3", "e3", "f3", "g3", "a3", "b3", "c4", "d4", "e4", "f4", "g4", "a4", "b4", "c5", "d5", "e5", "f5", "g5"};
        String[] noteLengths = {"quarter", "half", "whole"};

        // Create dictionary of notes with string keys
        Hashtable<String, ImageView> noteSheet = new Hashtable<String, ImageView>();



    }
}
