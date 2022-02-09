package home.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
    }
}
