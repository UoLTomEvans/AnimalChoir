package home.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.regex.Pattern;


public class Controller implements Initializable{

    @FXML
    private AnchorPane homePage;

    @FXML
    private AnchorPane textInput;

    @FXML
    private AnchorPane helpPage;

    @FXML
    private TextField txtFieldNotes;

    @FXML
    private Text errorText;

    // ImageView notes called
    @FXML
    private ImageView p10_a2_half;

    @FXML
    private ImageView p10_a2_quarter;

    @FXML
    private ImageView p10_a2_whole;

    @FXML
    private ImageView p10_a3_half;

    @FXML
    private ImageView p10_a3_quarter;

    @FXML
    private ImageView p10_a3_whole;

    @FXML
    private ImageView p10_a4_half;

    @FXML
    private ImageView p10_a4_quarter;

    @FXML
    private ImageView p10_a4_whole;

    @FXML
    private ImageView p10_b2_half;

    @FXML
    private ImageView p10_b2_quarter;

    @FXML
    private ImageView p10_b2_whole;

    @FXML
    private ImageView p10_b3_half;

    @FXML
    private ImageView p10_b3_quarter;

    @FXML
    private ImageView p10_b3_whole;

    @FXML
    private ImageView p10_b4_half;

    @FXML
    private ImageView p10_b4_quarter;

    @FXML
    private ImageView p10_b4_whole;

    @FXML
    private ImageView p10_c3_half;

    @FXML
    private ImageView p10_c3_quarter;

    @FXML
    private ImageView p10_c3_whole;

    @FXML
    private ImageView p10_c4_half;

    @FXML
    private ImageView p10_c4_quarter;

    @FXML
    private ImageView p10_c4_whole;

    @FXML
    private ImageView p10_c5_half;

    @FXML
    private ImageView p10_c5_quarter;

    @FXML
    private ImageView p10_c5_whole;

    @FXML
    private ImageView p10_d3_half;

    @FXML
    private ImageView p10_d3_quarter;

    @FXML
    private ImageView p10_d3_whole;

    @FXML
    private ImageView p10_d4_half;

    @FXML
    private ImageView p10_d4_quarter;

    @FXML
    private ImageView p10_d4_whole;

    @FXML
    private ImageView p10_d5_half;

    @FXML
    private ImageView p10_d5_quarter;

    @FXML
    private ImageView p10_d5_whole;

    @FXML
    private ImageView p10_e2_half;

    @FXML
    private ImageView p10_e2_quarter;

    @FXML
    private ImageView p10_e2_whole;

    @FXML
    private ImageView p10_e3_half;

    @FXML
    private ImageView p10_e3_quarter;

    @FXML
    private ImageView p10_e3_whole;

    @FXML
    private ImageView p10_e4_half;

    @FXML
    private ImageView p10_e4_quarter;

    @FXML
    private ImageView p10_e4_whole;

    @FXML
    private ImageView p10_e5_half;

    @FXML
    private ImageView p10_e5_quarter;

    @FXML
    private ImageView p10_e5_whole;

    @FXML
    private ImageView p10_f2_half;

    @FXML
    private ImageView p10_f2_quarter;

    @FXML
    private ImageView p10_f2_whole;

    @FXML
    private ImageView p10_f3_half;

    @FXML
    private ImageView p10_f3_quarter;

    @FXML
    private ImageView p10_f3_whole;

    @FXML
    private ImageView p10_f4_half;

    @FXML
    private ImageView p10_f4_quarter;

    @FXML
    private ImageView p10_f4_whole;

    @FXML
    private ImageView p10_f5_half;

    @FXML
    private ImageView p10_f5_quarter;

    @FXML
    private ImageView p10_f5_whole;

    @FXML
    private ImageView p10_g2_half;

    @FXML
    private ImageView p10_g2_quarter;

    @FXML
    private ImageView p10_g2_whole;

    @FXML
    private ImageView p10_g3_half;

    @FXML
    private ImageView p10_g3_quarter;

    @FXML
    private ImageView p10_g3_whole;

    @FXML
    private ImageView p10_g4_half;

    @FXML
    private ImageView p10_g4_quarter;

    @FXML
    private ImageView p10_g4_whole;

    @FXML
    private ImageView p10_g5_half;

    @FXML
    private ImageView p10_g5_quarter;

    @FXML
    private ImageView p10_g5_whole;

    @FXML
    private ImageView p11_a2_half;

    @FXML
    private ImageView p11_a2_quarter;

    @FXML
    private ImageView p11_a2_whole;

    @FXML
    private ImageView p11_a3_half;

    @FXML
    private ImageView p11_a3_quarter;

    @FXML
    private ImageView p11_a3_whole;

    @FXML
    private ImageView p11_a4_half;

    @FXML
    private ImageView p11_a4_quarter;

    @FXML
    private ImageView p11_a4_whole;

    @FXML
    private ImageView p11_b2_half;

    @FXML
    private ImageView p11_b2_quarter;

    @FXML
    private ImageView p11_b2_whole;

    @FXML
    private ImageView p11_b3_half;

    @FXML
    private ImageView p11_b3_quarter;

    @FXML
    private ImageView p11_b3_whole;

    @FXML
    private ImageView p11_b4_half;

    @FXML
    private ImageView p11_b4_quarter;

    @FXML
    private ImageView p11_b4_whole;

    @FXML
    private ImageView p11_c3_half;

    @FXML
    private ImageView p11_c3_quarter;

    @FXML
    private ImageView p11_c3_whole;

    @FXML
    private ImageView p11_c4_half;

    @FXML
    private ImageView p11_c4_quarter;

    @FXML
    private ImageView p11_c4_whole;

    @FXML
    private ImageView p11_c5_half;

    @FXML
    private ImageView p11_c5_quarter;

    @FXML
    private ImageView p11_c5_whole;

    @FXML
    private ImageView p11_d3_half;

    @FXML
    private ImageView p11_d3_quarter;

    @FXML
    private ImageView p11_d3_whole;

    @FXML
    private ImageView p11_d4_half;

    @FXML
    private ImageView p11_d4_quarter;

    @FXML
    private ImageView p11_d4_whole;

    @FXML
    private ImageView p11_d5_half;

    @FXML
    private ImageView p11_d5_quarter;

    @FXML
    private ImageView p11_d5_whole;

    @FXML
    private ImageView p11_e2_half;

    @FXML
    private ImageView p11_e2_quarter;

    @FXML
    private ImageView p11_e2_whole;

    @FXML
    private ImageView p11_e3_half;

    @FXML
    private ImageView p11_e3_quarter;

    @FXML
    private ImageView p11_e3_whole;

    @FXML
    private ImageView p11_e4_half;

    @FXML
    private ImageView p11_e4_quarter;

    @FXML
    private ImageView p11_e4_whole;

    @FXML
    private ImageView p11_e5_half;

    @FXML
    private ImageView p11_e5_quarter;

    @FXML
    private ImageView p11_e5_whole;

    @FXML
    private ImageView p11_f2_half;

    @FXML
    private ImageView p11_f2_quarter;

    @FXML
    private ImageView p11_f2_whole;

    @FXML
    private ImageView p11_f3_half;

    @FXML
    private ImageView p11_f3_quarter;

    @FXML
    private ImageView p11_f3_whole;

    @FXML
    private ImageView p11_f4_half;

    @FXML
    private ImageView p11_f4_quarter;

    @FXML
    private ImageView p11_f4_whole;

    @FXML
    private ImageView p11_f5_half;

    @FXML
    private ImageView p11_f5_quarter;

    @FXML
    private ImageView p11_f5_whole;

    @FXML
    private ImageView p11_g2_half;

    @FXML
    private ImageView p11_g2_quarter;

    @FXML
    private ImageView p11_g2_whole;

    @FXML
    private ImageView p11_g3_half;

    @FXML
    private ImageView p11_g3_quarter;

    @FXML
    private ImageView p11_g3_whole;

    @FXML
    private ImageView p11_g4_half;

    @FXML
    private ImageView p11_g4_quarter;

    @FXML
    private ImageView p11_g4_whole;

    @FXML
    private ImageView p11_g5_half;

    @FXML
    private ImageView p11_g5_quarter;

    @FXML
    private ImageView p11_g5_whole;

    @FXML
    private ImageView p12_a2_half;

    @FXML
    private ImageView p12_a2_quarter;

    @FXML
    private ImageView p12_a2_whole;

    @FXML
    private ImageView p12_a3_half;

    @FXML
    private ImageView p12_a3_quarter;

    @FXML
    private ImageView p12_a3_whole;

    @FXML
    private ImageView p12_a4_half;

    @FXML
    private ImageView p12_a4_quarter;

    @FXML
    private ImageView p12_a4_whole;

    @FXML
    private ImageView p12_b2_half;

    @FXML
    private ImageView p12_b2_quarter;

    @FXML
    private ImageView p12_b2_whole;

    @FXML
    private ImageView p12_b3_half;

    @FXML
    private ImageView p12_b3_quarter;

    @FXML
    private ImageView p12_b3_whole;

    @FXML
    private ImageView p12_b4_half;

    @FXML
    private ImageView p12_b4_quarter;

    @FXML
    private ImageView p12_b4_whole;

    @FXML
    private ImageView p12_c3_half;

    @FXML
    private ImageView p12_c3_quarter;

    @FXML
    private ImageView p12_c3_whole;

    @FXML
    private ImageView p12_c4_half;

    @FXML
    private ImageView p12_c4_quarter;

    @FXML
    private ImageView p12_c4_whole;

    @FXML
    private ImageView p12_c5_half;

    @FXML
    private ImageView p12_c5_quarter;

    @FXML
    private ImageView p12_c5_whole;

    @FXML
    private ImageView p12_d3_half;

    @FXML
    private ImageView p12_d3_quarter;

    @FXML
    private ImageView p12_d3_whole;

    @FXML
    private ImageView p12_d4_half;

    @FXML
    private ImageView p12_d4_quarter;

    @FXML
    private ImageView p12_d4_whole;

    @FXML
    private ImageView p12_d5_half;

    @FXML
    private ImageView p12_d5_quarter;

    @FXML
    private ImageView p12_d5_whole;

    @FXML
    private ImageView p12_e2_half;

    @FXML
    private ImageView p12_e2_quarter;

    @FXML
    private ImageView p12_e2_whole;

    @FXML
    private ImageView p12_e3_half;

    @FXML
    private ImageView p12_e3_quarter;

    @FXML
    private ImageView p12_e3_whole;

    @FXML
    private ImageView p12_e4_half;

    @FXML
    private ImageView p12_e4_quarter;

    @FXML
    private ImageView p12_e4_whole;

    @FXML
    private ImageView p12_e5_half;

    @FXML
    private ImageView p12_e5_quarter;

    @FXML
    private ImageView p12_e5_whole;

    @FXML
    private ImageView p12_f2_half;

    @FXML
    private ImageView p12_f2_quarter;

    @FXML
    private ImageView p12_f2_whole;

    @FXML
    private ImageView p12_f3_half;

    @FXML
    private ImageView p12_f3_quarter;

    @FXML
    private ImageView p12_f3_whole;

    @FXML
    private ImageView p12_f4_half;

    @FXML
    private ImageView p12_f4_quarter;

    @FXML
    private ImageView p12_f4_whole;

    @FXML
    private ImageView p12_f5_half;

    @FXML
    private ImageView p12_f5_quarter;

    @FXML
    private ImageView p12_f5_whole;

    @FXML
    private ImageView p12_g2_half;

    @FXML
    private ImageView p12_g2_quarter;

    @FXML
    private ImageView p12_g2_whole;

    @FXML
    private ImageView p12_g3_half;

    @FXML
    private ImageView p12_g3_quarter;

    @FXML
    private ImageView p12_g3_whole;

    @FXML
    private ImageView p12_g4_half;

    @FXML
    private ImageView p12_g4_quarter;

    @FXML
    private ImageView p12_g4_whole;

    @FXML
    private ImageView p12_g5_half;

    @FXML
    private ImageView p12_g5_quarter;

    @FXML
    private ImageView p12_g5_whole;

    @FXML
    private ImageView p13_a2_half;

    @FXML
    private ImageView p13_a2_quarter;

    @FXML
    private ImageView p13_a2_whole;

    @FXML
    private ImageView p13_a3_half;

    @FXML
    private ImageView p13_a3_quarter;

    @FXML
    private ImageView p13_a3_whole;

    @FXML
    private ImageView p13_a4_half;

    @FXML
    private ImageView p13_a4_quarter;

    @FXML
    private ImageView p13_a4_whole;

    @FXML
    private ImageView p13_b2_half;

    @FXML
    private ImageView p13_b2_quarter;

    @FXML
    private ImageView p13_b2_whole;

    @FXML
    private ImageView p13_b3_half;

    @FXML
    private ImageView p13_b3_quarter;

    @FXML
    private ImageView p13_b3_whole;

    @FXML
    private ImageView p13_b4_half;

    @FXML
    private ImageView p13_b4_quarter;

    @FXML
    private ImageView p13_b4_whole;

    @FXML
    private ImageView p13_c3_half;

    @FXML
    private ImageView p13_c3_quarter;

    @FXML
    private ImageView p13_c3_whole;

    @FXML
    private ImageView p13_c4_half;

    @FXML
    private ImageView p13_c4_quarter;

    @FXML
    private ImageView p13_c4_whole;

    @FXML
    private ImageView p13_c5_half;

    @FXML
    private ImageView p13_c5_quarter;

    @FXML
    private ImageView p13_c5_whole;

    @FXML
    private ImageView p13_d3_half;

    @FXML
    private ImageView p13_d3_quarter;

    @FXML
    private ImageView p13_d3_whole;

    @FXML
    private ImageView p13_d4_half;

    @FXML
    private ImageView p13_d4_quarter;

    @FXML
    private ImageView p13_d4_whole;

    @FXML
    private ImageView p13_d5_half;

    @FXML
    private ImageView p13_d5_quarter;

    @FXML
    private ImageView p13_d5_whole;

    @FXML
    private ImageView p13_e2_half;

    @FXML
    private ImageView p13_e2_quarter;

    @FXML
    private ImageView p13_e2_whole;

    @FXML
    private ImageView p13_e3_half;

    @FXML
    private ImageView p13_e3_quarter;

    @FXML
    private ImageView p13_e3_whole;

    @FXML
    private ImageView p13_e4_half;

    @FXML
    private ImageView p13_e4_quarter;

    @FXML
    private ImageView p13_e4_whole;

    @FXML
    private ImageView p13_e5_half;

    @FXML
    private ImageView p13_e5_quarter;

    @FXML
    private ImageView p13_e5_whole;

    @FXML
    private ImageView p13_f2_half;

    @FXML
    private ImageView p13_f2_quarter;

    @FXML
    private ImageView p13_f2_whole;

    @FXML
    private ImageView p13_f3_half;

    @FXML
    private ImageView p13_f3_quarter;

    @FXML
    private ImageView p13_f3_whole;

    @FXML
    private ImageView p13_f4_half;

    @FXML
    private ImageView p13_f4_quarter;

    @FXML
    private ImageView p13_f4_whole;

    @FXML
    private ImageView p13_f5_half;

    @FXML
    private ImageView p13_f5_quarter;

    @FXML
    private ImageView p13_f5_whole;

    @FXML
    private ImageView p13_g2_half;

    @FXML
    private ImageView p13_g2_quarter;

    @FXML
    private ImageView p13_g2_whole;

    @FXML
    private ImageView p13_g3_half;

    @FXML
    private ImageView p13_g3_quarter;

    @FXML
    private ImageView p13_g3_whole;

    @FXML
    private ImageView p13_g4_half;

    @FXML
    private ImageView p13_g4_quarter;

    @FXML
    private ImageView p13_g4_whole;

    @FXML
    private ImageView p13_g5_half;

    @FXML
    private ImageView p13_g5_quarter;

    @FXML
    private ImageView p13_g5_whole;

    @FXML
    private ImageView p14_a2_half;

    @FXML
    private ImageView p14_a2_quarter;

    @FXML
    private ImageView p14_a2_whole;

    @FXML
    private ImageView p14_a3_half;

    @FXML
    private ImageView p14_a3_quarter;

    @FXML
    private ImageView p14_a3_whole;

    @FXML
    private ImageView p14_a4_half;

    @FXML
    private ImageView p14_a4_quarter;

    @FXML
    private ImageView p14_a4_whole;

    @FXML
    private ImageView p14_b2_half;

    @FXML
    private ImageView p14_b2_quarter;

    @FXML
    private ImageView p14_b2_whole;

    @FXML
    private ImageView p14_b3_half;

    @FXML
    private ImageView p14_b3_quarter;

    @FXML
    private ImageView p14_b3_whole;

    @FXML
    private ImageView p14_b4_half;

    @FXML
    private ImageView p14_b4_quarter;

    @FXML
    private ImageView p14_b4_whole;

    @FXML
    private ImageView p14_c3_half;

    @FXML
    private ImageView p14_c3_quarter;

    @FXML
    private ImageView p14_c3_whole;

    @FXML
    private ImageView p14_c4_half;

    @FXML
    private ImageView p14_c4_quarter;

    @FXML
    private ImageView p14_c4_whole;

    @FXML
    private ImageView p14_c5_half;

    @FXML
    private ImageView p14_c5_quarter;

    @FXML
    private ImageView p14_c5_whole;

    @FXML
    private ImageView p14_d3_half;

    @FXML
    private ImageView p14_d3_quarter;

    @FXML
    private ImageView p14_d3_whole;

    @FXML
    private ImageView p14_d4_half;

    @FXML
    private ImageView p14_d4_quarter;

    @FXML
    private ImageView p14_d4_whole;

    @FXML
    private ImageView p14_d5_half;

    @FXML
    private ImageView p14_d5_quarter;

    @FXML
    private ImageView p14_d5_whole;

    @FXML
    private ImageView p14_e2_half;

    @FXML
    private ImageView p14_e2_quarter;

    @FXML
    private ImageView p14_e2_whole;

    @FXML
    private ImageView p14_e3_half;

    @FXML
    private ImageView p14_e3_quarter;

    @FXML
    private ImageView p14_e3_whole;

    @FXML
    private ImageView p14_e4_half;

    @FXML
    private ImageView p14_e4_quarter;

    @FXML
    private ImageView p14_e4_whole;

    @FXML
    private ImageView p14_e5_half;

    @FXML
    private ImageView p14_e5_quarter;

    @FXML
    private ImageView p14_e5_whole;

    @FXML
    private ImageView p14_f2_half;

    @FXML
    private ImageView p14_f2_quarter;

    @FXML
    private ImageView p14_f2_whole;

    @FXML
    private ImageView p14_f3_half;

    @FXML
    private ImageView p14_f3_quarter;

    @FXML
    private ImageView p14_f3_whole;

    @FXML
    private ImageView p14_f4_half;

    @FXML
    private ImageView p14_f4_quarter;

    @FXML
    private ImageView p14_f4_whole;

    @FXML
    private ImageView p14_f5_half;

    @FXML
    private ImageView p14_f5_quarter;

    @FXML
    private ImageView p14_f5_whole;

    @FXML
    private ImageView p14_g2_half;

    @FXML
    private ImageView p14_g2_quarter;

    @FXML
    private ImageView p14_g2_whole;

    @FXML
    private ImageView p14_g3_half;

    @FXML
    private ImageView p14_g3_quarter;

    @FXML
    private ImageView p14_g3_whole;

    @FXML
    private ImageView p14_g4_half;

    @FXML
    private ImageView p14_g4_quarter;

    @FXML
    private ImageView p14_g4_whole;

    @FXML
    private ImageView p14_g5_half;

    @FXML
    private ImageView p14_g5_quarter;

    @FXML
    private ImageView p14_g5_whole;

    @FXML
    private ImageView p15_a2_half;

    @FXML
    private ImageView p15_a2_quarter;

    @FXML
    private ImageView p15_a2_whole;

    @FXML
    private ImageView p15_a3_half;

    @FXML
    private ImageView p15_a3_quarter;

    @FXML
    private ImageView p15_a3_whole;

    @FXML
    private ImageView p15_a4_half;

    @FXML
    private ImageView p15_a4_quarter;

    @FXML
    private ImageView p15_a4_whole;

    @FXML
    private ImageView p15_b2_half;

    @FXML
    private ImageView p15_b2_quarter;

    @FXML
    private ImageView p15_b2_whole;

    @FXML
    private ImageView p15_b3_half;

    @FXML
    private ImageView p15_b3_quarter;

    @FXML
    private ImageView p15_b3_whole;

    @FXML
    private ImageView p15_b4_half;

    @FXML
    private ImageView p15_b4_quarter;

    @FXML
    private ImageView p15_b4_whole;

    @FXML
    private ImageView p15_c3_half;

    @FXML
    private ImageView p15_c3_quarter;

    @FXML
    private ImageView p15_c3_whole;

    @FXML
    private ImageView p15_c4_half;

    @FXML
    private ImageView p15_c4_quarter;

    @FXML
    private ImageView p15_c4_whole;

    @FXML
    private ImageView p15_c5_half;

    @FXML
    private ImageView p15_c5_quarter;

    @FXML
    private ImageView p15_c5_whole;

    @FXML
    private ImageView p15_d3_half;

    @FXML
    private ImageView p15_d3_quarter;

    @FXML
    private ImageView p15_d3_whole;

    @FXML
    private ImageView p15_d4_half;

    @FXML
    private ImageView p15_d4_quarter;

    @FXML
    private ImageView p15_d4_whole;

    @FXML
    private ImageView p15_d5_half;

    @FXML
    private ImageView p15_d5_quarter;

    @FXML
    private ImageView p15_d5_whole;

    @FXML
    private ImageView p15_e2_half;

    @FXML
    private ImageView p15_e2_quarter;

    @FXML
    private ImageView p15_e2_whole;

    @FXML
    private ImageView p15_e3_half;

    @FXML
    private ImageView p15_e3_quarter;

    @FXML
    private ImageView p15_e3_whole;

    @FXML
    private ImageView p15_e4_half;

    @FXML
    private ImageView p15_e4_quarter;

    @FXML
    private ImageView p15_e4_whole;

    @FXML
    private ImageView p15_e5_half;

    @FXML
    private ImageView p15_e5_quarter;

    @FXML
    private ImageView p15_e5_whole;

    @FXML
    private ImageView p15_f2_half;

    @FXML
    private ImageView p15_f2_quarter;

    @FXML
    private ImageView p15_f2_whole;

    @FXML
    private ImageView p15_f3_half;

    @FXML
    private ImageView p15_f3_quarter;

    @FXML
    private ImageView p15_f3_whole;

    @FXML
    private ImageView p15_f4_half;

    @FXML
    private ImageView p15_f4_quarter;

    @FXML
    private ImageView p15_f4_whole;

    @FXML
    private ImageView p15_f5_half;

    @FXML
    private ImageView p15_f5_quarter;

    @FXML
    private ImageView p15_f5_whole;

    @FXML
    private ImageView p15_g2_half;

    @FXML
    private ImageView p15_g2_quarter;

    @FXML
    private ImageView p15_g2_whole;

    @FXML
    private ImageView p15_g3_half;

    @FXML
    private ImageView p15_g3_quarter;

    @FXML
    private ImageView p15_g3_whole;

    @FXML
    private ImageView p15_g4_half;

    @FXML
    private ImageView p15_g4_quarter;

    @FXML
    private ImageView p15_g4_whole;

    @FXML
    private ImageView p15_g5_half;

    @FXML
    private ImageView p15_g5_quarter;

    @FXML
    private ImageView p15_g5_whole;

    @FXML
    private ImageView p16_a2_half;

    @FXML
    private ImageView p16_a2_quarter;

    @FXML
    private ImageView p16_a2_whole;

    @FXML
    private ImageView p16_a3_half;

    @FXML
    private ImageView p16_a3_quarter;

    @FXML
    private ImageView p16_a3_whole;

    @FXML
    private ImageView p16_a4_half;

    @FXML
    private ImageView p16_a4_quarter;

    @FXML
    private ImageView p16_a4_whole;

    @FXML
    private ImageView p16_b2_half;

    @FXML
    private ImageView p16_b2_quarter;

    @FXML
    private ImageView p16_b2_whole;

    @FXML
    private ImageView p16_b3_half;

    @FXML
    private ImageView p16_b3_quarter;

    @FXML
    private ImageView p16_b3_whole;

    @FXML
    private ImageView p16_b4_half;

    @FXML
    private ImageView p16_b4_quarter;

    @FXML
    private ImageView p16_b4_whole;

    @FXML
    private ImageView p16_c3_half;

    @FXML
    private ImageView p16_c3_quarter;

    @FXML
    private ImageView p16_c3_whole;

    @FXML
    private ImageView p16_c4_half;

    @FXML
    private ImageView p16_c4_quarter;

    @FXML
    private ImageView p16_c4_whole;

    @FXML
    private ImageView p16_c5_half;

    @FXML
    private ImageView p16_c5_quarter;

    @FXML
    private ImageView p16_c5_whole;

    @FXML
    private ImageView p16_d3_half;

    @FXML
    private ImageView p16_d3_quarter;

    @FXML
    private ImageView p16_d3_whole;

    @FXML
    private ImageView p16_d4_whole;

    @FXML
    private ImageView p16_d4_half;

    @FXML
    private ImageView p16_d4_quarter;

    @FXML
    private ImageView p16_d5_half;

    @FXML
    private ImageView p16_d5_quarter;

    @FXML
    private ImageView p16_d5_whole;

    @FXML
    private ImageView p16_e2_half;

    @FXML
    private ImageView p16_e2_quarter;

    @FXML
    private ImageView p16_e2_whole;

    @FXML
    private ImageView p16_e3_half;

    @FXML
    private ImageView p16_e3_quarter;

    @FXML
    private ImageView p16_e3_whole;

    @FXML
    private ImageView p16_e4_half;

    @FXML
    private ImageView p16_e4_quarter;

    @FXML
    private ImageView p16_e4_whole;

    @FXML
    private ImageView p16_e5_half;

    @FXML
    private ImageView p16_e5_quarter;

    @FXML
    private ImageView p16_e5_whole;

    @FXML
    private ImageView p16_f2_half;

    @FXML
    private ImageView p16_f2_quarter;

    @FXML
    private ImageView p16_f2_whole;

    @FXML
    private ImageView p16_f3_half;

    @FXML
    private ImageView p16_f3_quarter;

    @FXML
    private ImageView p16_f3_whole;

    @FXML
    private ImageView p16_f4_half;

    @FXML
    private ImageView p16_f4_quarter;

    @FXML
    private ImageView p16_f4_whole;

    @FXML
    private ImageView p16_f5_half;

    @FXML
    private ImageView p16_f5_quarter;

    @FXML
    private ImageView p16_f5_whole;

    @FXML
    private ImageView p16_g2_half;

    @FXML
    private ImageView p16_g2_quarter;

    @FXML
    private ImageView p16_g2_whole;

    @FXML
    private ImageView p16_g3_half;

    @FXML
    private ImageView p16_g3_quarter;

    @FXML
    private ImageView p16_g3_whole;

    @FXML
    private ImageView p16_g4_half;

    @FXML
    private ImageView p16_g4_quarter;

    @FXML
    private ImageView p16_g4_whole;

    @FXML
    private ImageView p16_g5_half;

    @FXML
    private ImageView p16_g5_quarter;

    @FXML
    private ImageView p16_g5_whole;

    @FXML
    private ImageView p17_a2_half;

    @FXML
    private ImageView p17_a2_quarter;

    @FXML
    private ImageView p17_a2_whole;

    @FXML
    private ImageView p17_a3_half;

    @FXML
    private ImageView p17_a3_quarter;

    @FXML
    private ImageView p17_a3_whole;

    @FXML
    private ImageView p17_a4_half;

    @FXML
    private ImageView p17_a4_quarter;

    @FXML
    private ImageView p17_a4_whole;

    @FXML
    private ImageView p17_b2_half;

    @FXML
    private ImageView p17_b2_quarter;

    @FXML
    private ImageView p17_b2_whole;

    @FXML
    private ImageView p17_b3_half;

    @FXML
    private ImageView p17_b3_quarter;

    @FXML
    private ImageView p17_b3_whole;

    @FXML
    private ImageView p17_b4_half;

    @FXML
    private ImageView p17_b4_quarter;

    @FXML
    private ImageView p17_b4_whole;

    @FXML
    private ImageView p17_c3_half;

    @FXML
    private ImageView p17_c3_quarter;

    @FXML
    private ImageView p17_c3_whole;

    @FXML
    private ImageView p17_c4_half;

    @FXML
    private ImageView p17_c4_quarter;

    @FXML
    private ImageView p17_c4_whole;

    @FXML
    private ImageView p17_c5_half;

    @FXML
    private ImageView p17_c5_quarter;

    @FXML
    private ImageView p17_c5_whole;

    @FXML
    private ImageView p17_d3_half;

    @FXML
    private ImageView p17_d3_quarter;

    @FXML
    private ImageView p17_d3_whole;

    @FXML
    private ImageView p17_d4_half;

    @FXML
    private ImageView p17_d4_quarter;

    @FXML
    private ImageView p17_d4_whole;

    @FXML
    private ImageView p17_d5_half;

    @FXML
    private ImageView p17_d5_quarter;

    @FXML
    private ImageView p17_d5_whole;

    @FXML
    private ImageView p17_e2_half;

    @FXML
    private ImageView p17_e2_quarter;

    @FXML
    private ImageView p17_e2_whole;

    @FXML
    private ImageView p17_e3_half;

    @FXML
    private ImageView p17_e3_quarter;

    @FXML
    private ImageView p17_e3_whole;

    @FXML
    private ImageView p17_e4_half;

    @FXML
    private ImageView p17_e4_quarter;

    @FXML
    private ImageView p17_e4_whole;

    @FXML
    private ImageView p17_e5_half;

    @FXML
    private ImageView p17_e5_quarter;

    @FXML
    private ImageView p17_e5_whole;

    @FXML
    private ImageView p17_f2_half;

    @FXML
    private ImageView p17_f2_quarter;

    @FXML
    private ImageView p17_f2_whole;

    @FXML
    private ImageView p17_f3_half;

    @FXML
    private ImageView p17_f3_quarter;

    @FXML
    private ImageView p17_f3_whole;

    @FXML
    private ImageView p17_f4_half;

    @FXML
    private ImageView p17_f4_quarter;

    @FXML
    private ImageView p17_f4_whole;

    @FXML
    private ImageView p17_f5_half;

    @FXML
    private ImageView p17_f5_quarter;

    @FXML
    private ImageView p17_f5_whole;

    @FXML
    private ImageView p17_g2_half;

    @FXML
    private ImageView p17_g2_quarter;

    @FXML
    private ImageView p17_g2_whole;

    @FXML
    private ImageView p17_g3_half;

    @FXML
    private ImageView p17_g3_quarter;

    @FXML
    private ImageView p17_g3_whole;

    @FXML
    private ImageView p17_g4_half;

    @FXML
    private ImageView p17_g4_quarter;

    @FXML
    private ImageView p17_g4_whole;

    @FXML
    private ImageView p17_g5_half;

    @FXML
    private ImageView p17_g5_quarter;

    @FXML
    private ImageView p17_g5_whole;

    @FXML
    private ImageView p18_a2_half;

    @FXML
    private ImageView p18_a2_quarter;

    @FXML
    private ImageView p18_a2_whole;

    @FXML
    private ImageView p18_a3_half;

    @FXML
    private ImageView p18_a3_quarter;

    @FXML
    private ImageView p18_a3_whole;

    @FXML
    private ImageView p18_a4_half;

    @FXML
    private ImageView p18_a4_quarter;

    @FXML
    private ImageView p18_a4_whole;

    @FXML
    private ImageView p18_b2_half;

    @FXML
    private ImageView p18_b2_quarter;

    @FXML
    private ImageView p18_b2_whole;

    @FXML
    private ImageView p18_b3_half;

    @FXML
    private ImageView p18_b3_quarter;

    @FXML
    private ImageView p18_b3_whole;

    @FXML
    private ImageView p18_b4_half;

    @FXML
    private ImageView p18_b4_quarter;

    @FXML
    private ImageView p18_b4_whole;

    @FXML
    private ImageView p18_c3_half;

    @FXML
    private ImageView p18_c3_quarter;

    @FXML
    private ImageView p18_c3_whole;

    @FXML
    private ImageView p18_c4_half;

    @FXML
    private ImageView p18_c4_quarter;

    @FXML
    private ImageView p18_c4_whole;

    @FXML
    private ImageView p18_c5_half;

    @FXML
    private ImageView p18_c5_quarter;

    @FXML
    private ImageView p18_c5_whole;

    @FXML
    private ImageView p18_d3_half;

    @FXML
    private ImageView p18_d3_quarter;

    @FXML
    private ImageView p18_d3_whole;

    @FXML
    private ImageView p18_d4_half;

    @FXML
    private ImageView p18_d4_quarter;

    @FXML
    private ImageView p18_d4_whole;

    @FXML
    private ImageView p18_d5_half;

    @FXML
    private ImageView p18_d5_quarter;

    @FXML
    private ImageView p18_d5_whole;

    @FXML
    private ImageView p18_e2_half;

    @FXML
    private ImageView p18_e2_quarter;

    @FXML
    private ImageView p18_e2_whole;

    @FXML
    private ImageView p18_e3_half;

    @FXML
    private ImageView p18_e3_quarter;

    @FXML
    private ImageView p18_e3_whole;

    @FXML
    private ImageView p18_e4_half;

    @FXML
    private ImageView p18_e4_quarter;

    @FXML
    private ImageView p18_e4_whole;

    @FXML
    private ImageView p18_e5_half;

    @FXML
    private ImageView p18_e5_quarter;

    @FXML
    private ImageView p18_e5_whole;

    @FXML
    private ImageView p18_f2_half;

    @FXML
    private ImageView p18_f2_quarter;

    @FXML
    private ImageView p18_f2_whole;

    @FXML
    private ImageView p18_f3_half;

    @FXML
    private ImageView p18_f3_quarter;

    @FXML
    private ImageView p18_f3_whole;

    @FXML
    private ImageView p18_f4_half;

    @FXML
    private ImageView p18_f4_quarter;

    @FXML
    private ImageView p18_f4_whole;

    @FXML
    private ImageView p18_f5_half;

    @FXML
    private ImageView p18_f5_quarter;

    @FXML
    private ImageView p18_f5_whole;

    @FXML
    private ImageView p18_g2_half;

    @FXML
    private ImageView p18_g2_quarter;

    @FXML
    private ImageView p18_g2_whole;

    @FXML
    private ImageView p18_g3_half;

    @FXML
    private ImageView p18_g3_quarter;

    @FXML
    private ImageView p18_g3_whole;

    @FXML
    private ImageView p18_g4_half;

    @FXML
    private ImageView p18_g4_quarter;

    @FXML
    private ImageView p18_g4_whole;

    @FXML
    private ImageView p18_g5_half;

    @FXML
    private ImageView p18_g5_quarter;

    @FXML
    private ImageView p18_g5_whole;

    @FXML
    private ImageView p19_a2_half;

    @FXML
    private ImageView p19_a2_quarter;

    @FXML
    private ImageView p19_a2_whole;

    @FXML
    private ImageView p19_a3_half;

    @FXML
    private ImageView p19_a3_quarter;

    @FXML
    private ImageView p19_a3_whole;

    @FXML
    private ImageView p19_a4_half;

    @FXML
    private ImageView p19_a4_quarter;

    @FXML
    private ImageView p19_a4_whole;

    @FXML
    private ImageView p19_b2_half;

    @FXML
    private ImageView p19_b2_quarter;

    @FXML
    private ImageView p19_b2_whole;

    @FXML
    private ImageView p19_b3_half;

    @FXML
    private ImageView p19_b3_quarter;

    @FXML
    private ImageView p19_b3_whole;

    @FXML
    private ImageView p19_b4_half;

    @FXML
    private ImageView p19_b4_quarter;

    @FXML
    private ImageView p19_b4_whole;

    @FXML
    private ImageView p19_c3_half;

    @FXML
    private ImageView p19_c3_quarter;

    @FXML
    private ImageView p19_c3_whole;

    @FXML
    private ImageView p19_c4_half;

    @FXML
    private ImageView p19_c4_quarter;

    @FXML
    private ImageView p19_c4_whole;

    @FXML
    private ImageView p19_c5_half;

    @FXML
    private ImageView p19_c5_quarter;

    @FXML
    private ImageView p19_c5_whole;

    @FXML
    private ImageView p19_d3_half;

    @FXML
    private ImageView p19_d3_quarter;

    @FXML
    private ImageView p19_d3_whole;

    @FXML
    private ImageView p19_d4_half;

    @FXML
    private ImageView p19_d4_quarter;

    @FXML
    private ImageView p19_d4_whole;

    @FXML
    private ImageView p19_d5_half;

    @FXML
    private ImageView p19_d5_quarter;

    @FXML
    private ImageView p19_d5_whole;

    @FXML
    private ImageView p19_e2_half;

    @FXML
    private ImageView p19_e2_quarter;

    @FXML
    private ImageView p19_e2_whole;

    @FXML
    private ImageView p19_e3_half;

    @FXML
    private ImageView p19_e3_quarter;

    @FXML
    private ImageView p19_e3_whole;

    @FXML
    private ImageView p19_e4_half;

    @FXML
    private ImageView p19_e4_quarter;

    @FXML
    private ImageView p19_e4_whole;

    @FXML
    private ImageView p19_e5_half;

    @FXML
    private ImageView p19_e5_quarter;

    @FXML
    private ImageView p19_e5_whole;

    @FXML
    private ImageView p19_f2_half;

    @FXML
    private ImageView p19_f2_quarter;

    @FXML
    private ImageView p19_f2_whole;

    @FXML
    private ImageView p19_f3_half;

    @FXML
    private ImageView p19_f3_quarter;

    @FXML
    private ImageView p19_f3_whole;

    @FXML
    private ImageView p19_f4_half;

    @FXML
    private ImageView p19_f4_quarter;

    @FXML
    private ImageView p19_f4_whole;

    @FXML
    private ImageView p19_f5_half;

    @FXML
    private ImageView p19_f5_quarter;

    @FXML
    private ImageView p19_f5_whole;

    @FXML
    private ImageView p19_g2_half;

    @FXML
    private ImageView p19_g2_quarter;

    @FXML
    private ImageView p19_g2_whole;

    @FXML
    private ImageView p19_g3_half;

    @FXML
    private ImageView p19_g3_quarter;

    @FXML
    private ImageView p19_g3_whole;

    @FXML
    private ImageView p19_g4_half;

    @FXML
    private ImageView p19_g4_quarter;

    @FXML
    private ImageView p19_g4_whole;

    @FXML
    private ImageView p19_g5_half;

    @FXML
    private ImageView p19_g5_quarter;

    @FXML
    private ImageView p19_g5_whole;

    @FXML
    private ImageView p1_a2_half;

    @FXML
    private ImageView p1_a2_quarter;

    @FXML
    private ImageView p1_a2_whole;

    @FXML
    private ImageView p1_a3_half;

    @FXML
    private ImageView p1_a3_quarter;

    @FXML
    private ImageView p1_a3_whole;

    @FXML
    private ImageView p1_a4_half;

    @FXML
    private ImageView p1_a4_quarter;

    @FXML
    private ImageView p1_a4_whole;

    @FXML
    private ImageView p1_b2_half;

    @FXML
    private ImageView p1_b2_quarter;

    @FXML
    private ImageView p1_b2_whole;

    @FXML
    private ImageView p1_b3_half;

    @FXML
    private ImageView p1_b3_quarter;

    @FXML
    private ImageView p1_b3_whole;

    @FXML
    private ImageView p1_b4_half;

    @FXML
    private ImageView p1_b4_quarter;

    @FXML
    private ImageView p1_b4_whole;

    @FXML
    private ImageView p1_c3_half;

    @FXML
    private ImageView p1_c3_quarter;

    @FXML
    private ImageView p1_c3_whole;

    @FXML
    private ImageView p1_c4_half;

    @FXML
    private ImageView p1_c4_quarter;

    @FXML
    private ImageView p1_c4_whole;

    @FXML
    private ImageView p1_c5_half;

    @FXML
    private ImageView p1_c5_quarter;

    @FXML
    private ImageView p1_c5_whole;

    @FXML
    private ImageView p1_d3_half;

    @FXML
    private ImageView p1_d3_quarter;

    @FXML
    private ImageView p1_d3_whole;

    @FXML
    private ImageView p1_d4_half;

    @FXML
    private ImageView p1_d4_quarter;

    @FXML
    private ImageView p1_d4_whole;

    @FXML
    private ImageView p1_d5_half;

    @FXML
    private ImageView p1_d5_quarter;

    @FXML
    private ImageView p1_d5_whole;

    @FXML
    private ImageView p1_e2_half;

    @FXML
    private ImageView p1_e2_quarter;

    @FXML
    private ImageView p1_e2_whole;

    @FXML
    private ImageView p1_e3_half;

    @FXML
    private ImageView p1_e3_quarter;

    @FXML
    private ImageView p1_e3_whole;

    @FXML
    private ImageView p1_e4_half;

    @FXML
    private ImageView p1_e4_quarter;

    @FXML
    private ImageView p1_e4_whole;

    @FXML
    private ImageView p1_e5_half;

    @FXML
    private ImageView p1_e5_quarter;

    @FXML
    private ImageView p1_e5_whole;

    @FXML
    private ImageView p1_f2_half;

    @FXML
    private ImageView p1_f2_quarter;

    @FXML
    private ImageView p1_f2_whole;

    @FXML
    private ImageView p1_f3_half;

    @FXML
    private ImageView p1_f3_quarter;

    @FXML
    private ImageView p1_f3_whole;

    @FXML
    private ImageView p1_f4_half;

    @FXML
    private ImageView p1_f4_quarter;

    @FXML
    private ImageView p1_f4_whole;

    @FXML
    private ImageView p1_f5_half;

    @FXML
    private ImageView p1_f5_quarter;

    @FXML
    private ImageView p1_f5_whole;

    @FXML
    private ImageView p1_g2_half;

    @FXML
    private ImageView p1_g2_quarter;

    @FXML
    private ImageView p1_g2_whole;

    @FXML
    private ImageView p1_g3_half;

    @FXML
    private ImageView p1_g3_quarter;

    @FXML
    private ImageView p1_g3_whole;

    @FXML
    private ImageView p1_g4_half;

    @FXML
    private ImageView p1_g4_quarter;

    @FXML
    private ImageView p1_g4_whole;

    @FXML
    private ImageView p1_g5_half;

    @FXML
    private ImageView p1_g5_quarter;

    @FXML
    private ImageView p1_g5_whole;

    @FXML
    private ImageView p20_a2_half;

    @FXML
    private ImageView p20_a2_quarter;

    @FXML
    private ImageView p20_a2_whole;

    @FXML
    private ImageView p20_a3_half;

    @FXML
    private ImageView p20_a3_quarter;

    @FXML
    private ImageView p20_a3_whole;

    @FXML
    private ImageView p20_a4_half;

    @FXML
    private ImageView p20_a4_quarter;

    @FXML
    private ImageView p20_a4_whole;

    @FXML
    private ImageView p20_b2_half;

    @FXML
    private ImageView p20_b2_quarter;

    @FXML
    private ImageView p20_b2_whole;

    @FXML
    private ImageView p20_b3_half;

    @FXML
    private ImageView p20_b3_quarter;

    @FXML
    private ImageView p20_b3_whole;

    @FXML
    private ImageView p20_b4_half;

    @FXML
    private ImageView p20_b4_quarter;

    @FXML
    private ImageView p20_b4_whole;

    @FXML
    private ImageView p20_c3_half;

    @FXML
    private ImageView p20_c3_quarter;

    @FXML
    private ImageView p20_c3_whole;

    @FXML
    private ImageView p20_c4_half;

    @FXML
    private ImageView p20_c4_quarter;

    @FXML
    private ImageView p20_c4_whole;

    @FXML
    private ImageView p20_c5_half;

    @FXML
    private ImageView p20_c5_quarter;

    @FXML
    private ImageView p20_c5_whole;

    @FXML
    private ImageView p20_d3_half;

    @FXML
    private ImageView p20_d3_quarter;

    @FXML
    private ImageView p20_d3_whole;

    @FXML
    private ImageView p20_d4_half;

    @FXML
    private ImageView p20_d4_quarter;

    @FXML
    private ImageView p20_d4_whole;

    @FXML
    private ImageView p20_d5_half;

    @FXML
    private ImageView p20_d5_quarter;

    @FXML
    private ImageView p20_d5_whole;

    @FXML
    private ImageView p20_e2_half;

    @FXML
    private ImageView p20_e2_quarter;

    @FXML
    private ImageView p20_e2_whole;

    @FXML
    private ImageView p20_e3_half;

    @FXML
    private ImageView p20_e3_quarter;

    @FXML
    private ImageView p20_e3_whole;

    @FXML
    private ImageView p20_e4_half;

    @FXML
    private ImageView p20_e4_quarter;

    @FXML
    private ImageView p20_e4_whole;

    @FXML
    private ImageView p20_e5_half;

    @FXML
    private ImageView p20_e5_quarter;

    @FXML
    private ImageView p20_e5_whole;

    @FXML
    private ImageView p20_f2_half;

    @FXML
    private ImageView p20_f2_quarter;

    @FXML
    private ImageView p20_f2_whole;

    @FXML
    private ImageView p20_f3_half;

    @FXML
    private ImageView p20_f3_quarter;

    @FXML
    private ImageView p20_f3_whole;

    @FXML
    private ImageView p20_f4_half;

    @FXML
    private ImageView p20_f4_quarter;

    @FXML
    private ImageView p20_f4_whole;

    @FXML
    private ImageView p20_f5_half;

    @FXML
    private ImageView p20_f5_quarter;

    @FXML
    private ImageView p20_f5_whole;

    @FXML
    private ImageView p20_g2_half;

    @FXML
    private ImageView p20_g2_quarter;

    @FXML
    private ImageView p20_g2_whole;

    @FXML
    private ImageView p20_g3_half;

    @FXML
    private ImageView p20_g3_quarter;

    @FXML
    private ImageView p20_g3_whole;

    @FXML
    private ImageView p20_g4_half;

    @FXML
    private ImageView p20_g4_quarter;

    @FXML
    private ImageView p20_g4_whole;

    @FXML
    private ImageView p20_g5_half;

    @FXML
    private ImageView p20_g5_quarter;

    @FXML
    private ImageView p20_g5_whole;

    @FXML
    private ImageView p21_a2_half;

    @FXML
    private ImageView p21_a2_quarter;

    @FXML
    private ImageView p21_a2_whole;

    @FXML
    private ImageView p21_a3_half;

    @FXML
    private ImageView p21_a3_quarter;

    @FXML
    private ImageView p21_a3_whole;

    @FXML
    private ImageView p21_a4_half;

    @FXML
    private ImageView p21_a4_quarter;

    @FXML
    private ImageView p21_a4_whole;

    @FXML
    private ImageView p21_b2_half;

    @FXML
    private ImageView p21_b2_quarter;

    @FXML
    private ImageView p21_b2_whole;

    @FXML
    private ImageView p21_b3_half;

    @FXML
    private ImageView p21_b3_quarter;

    @FXML
    private ImageView p21_b3_whole;

    @FXML
    private ImageView p21_b4_half;

    @FXML
    private ImageView p21_b4_quarter;

    @FXML
    private ImageView p21_b4_whole;

    @FXML
    private ImageView p21_c3_half;

    @FXML
    private ImageView p21_c3_quarter;

    @FXML
    private ImageView p21_c3_whole;

    @FXML
    private ImageView p21_c4_half;

    @FXML
    private ImageView p21_c4_quarter;

    @FXML
    private ImageView p21_c4_whole;

    @FXML
    private ImageView p21_c5_half;

    @FXML
    private ImageView p21_c5_quarter;

    @FXML
    private ImageView p21_c5_whole;

    @FXML
    private ImageView p21_d3_half;

    @FXML
    private ImageView p21_d3_quarter;

    @FXML
    private ImageView p21_d3_whole;

    @FXML
    private ImageView p21_d4_half;

    @FXML
    private ImageView p21_d4_quarter;

    @FXML
    private ImageView p21_d4_whole;

    @FXML
    private ImageView p21_d5_half;

    @FXML
    private ImageView p21_d5_quarter;

    @FXML
    private ImageView p21_d5_whole;

    @FXML
    private ImageView p21_e2_half;

    @FXML
    private ImageView p21_e2_quarter;

    @FXML
    private ImageView p21_e2_whole;

    @FXML
    private ImageView p21_e3_half;

    @FXML
    private ImageView p21_e3_quarter;

    @FXML
    private ImageView p21_e3_whole;

    @FXML
    private ImageView p21_e4_half;

    @FXML
    private ImageView p21_e4_quarter;

    @FXML
    private ImageView p21_e4_whole;

    @FXML
    private ImageView p21_e5_half;

    @FXML
    private ImageView p21_e5_quarter;

    @FXML
    private ImageView p21_e5_whole;

    @FXML
    private ImageView p21_f2_half;

    @FXML
    private ImageView p21_f2_quarter;

    @FXML
    private ImageView p21_f2_whole;

    @FXML
    private ImageView p21_f3_half;

    @FXML
    private ImageView p21_f3_quarter;

    @FXML
    private ImageView p21_f3_whole;

    @FXML
    private ImageView p21_f4_half;

    @FXML
    private ImageView p21_f4_quarter;

    @FXML
    private ImageView p21_f4_whole;

    @FXML
    private ImageView p21_f5_half;

    @FXML
    private ImageView p21_f5_quarter;

    @FXML
    private ImageView p21_f5_whole;

    @FXML
    private ImageView p21_g2_half;

    @FXML
    private ImageView p21_g2_quarter;

    @FXML
    private ImageView p21_g2_whole;

    @FXML
    private ImageView p21_g3_half;

    @FXML
    private ImageView p21_g3_quarter;

    @FXML
    private ImageView p21_g3_whole;

    @FXML
    private ImageView p21_g4_half;

    @FXML
    private ImageView p21_g4_quarter;

    @FXML
    private ImageView p21_g4_whole;

    @FXML
    private ImageView p21_g5_half;

    @FXML
    private ImageView p21_g5_quarter;

    @FXML
    private ImageView p21_g5_whole;

    @FXML
    private ImageView p22_a2_half;

    @FXML
    private ImageView p22_a2_quarter;

    @FXML
    private ImageView p22_a2_whole;

    @FXML
    private ImageView p22_a3_half;

    @FXML
    private ImageView p22_a3_quarter;

    @FXML
    private ImageView p22_a3_whole;

    @FXML
    private ImageView p22_a4_half;

    @FXML
    private ImageView p22_a4_quarter;

    @FXML
    private ImageView p22_a4_whole;

    @FXML
    private ImageView p22_b2_half;

    @FXML
    private ImageView p22_b2_quarter;

    @FXML
    private ImageView p22_b2_whole;

    @FXML
    private ImageView p22_b3_half;

    @FXML
    private ImageView p22_b3_quarter;

    @FXML
    private ImageView p22_b3_whole;

    @FXML
    private ImageView p22_b4_half;

    @FXML
    private ImageView p22_b4_quarter;

    @FXML
    private ImageView p22_b4_whole;

    @FXML
    private ImageView p22_c3_half;

    @FXML
    private ImageView p22_c3_quarter;

    @FXML
    private ImageView p22_c3_whole;

    @FXML
    private ImageView p22_c4_half;

    @FXML
    private ImageView p22_c4_quarter;

    @FXML
    private ImageView p22_c4_whole;

    @FXML
    private ImageView p22_c5_half;

    @FXML
    private ImageView p22_c5_quarter;

    @FXML
    private ImageView p22_c5_whole;

    @FXML
    private ImageView p22_d3_half;

    @FXML
    private ImageView p22_d3_quarter;

    @FXML
    private ImageView p22_d3_whole;

    @FXML
    private ImageView p22_d4_half;

    @FXML
    private ImageView p22_d4_quarter;

    @FXML
    private ImageView p22_d4_whole;

    @FXML
    private ImageView p22_d5_half;

    @FXML
    private ImageView p22_d5_quarter;

    @FXML
    private ImageView p22_d5_whole;

    @FXML
    private ImageView p22_e2_half;

    @FXML
    private ImageView p22_e2_quarter;

    @FXML
    private ImageView p22_e2_whole;

    @FXML
    private ImageView p22_e3_half;

    @FXML
    private ImageView p22_e3_quarter;

    @FXML
    private ImageView p22_e3_whole;

    @FXML
    private ImageView p22_e4_half;

    @FXML
    private ImageView p22_e4_quarter;

    @FXML
    private ImageView p22_e4_whole;

    @FXML
    private ImageView p22_e5_half;

    @FXML
    private ImageView p22_e5_quarter;

    @FXML
    private ImageView p22_e5_whole;

    @FXML
    private ImageView p22_f2_half;

    @FXML
    private ImageView p22_f2_quarter;

    @FXML
    private ImageView p22_f2_whole;

    @FXML
    private ImageView p22_f3_half;

    @FXML
    private ImageView p22_f3_quarter;

    @FXML
    private ImageView p22_f3_whole;

    @FXML
    private ImageView p22_f4_half;

    @FXML
    private ImageView p22_f4_quarter;

    @FXML
    private ImageView p22_f4_whole;

    @FXML
    private ImageView p22_f5_half;

    @FXML
    private ImageView p22_f5_quarter;

    @FXML
    private ImageView p22_f5_whole;

    @FXML
    private ImageView p22_g2_half;

    @FXML
    private ImageView p22_g2_quarter;

    @FXML
    private ImageView p22_g2_whole;

    @FXML
    private ImageView p22_g3_half;

    @FXML
    private ImageView p22_g3_quarter;

    @FXML
    private ImageView p22_g3_whole;

    @FXML
    private ImageView p22_g4_half;

    @FXML
    private ImageView p22_g4_quarter;

    @FXML
    private ImageView p22_g4_whole;

    @FXML
    private ImageView p22_g5_half;

    @FXML
    private ImageView p22_g5_quarter;

    @FXML
    private ImageView p22_g5_whole;

    @FXML
    private ImageView p23_a2_half;

    @FXML
    private ImageView p23_a2_quarter;

    @FXML
    private ImageView p23_a2_whole;

    @FXML
    private ImageView p23_a3_half;

    @FXML
    private ImageView p23_a3_quarter;

    @FXML
    private ImageView p23_a3_whole;

    @FXML
    private ImageView p23_a4_half;

    @FXML
    private ImageView p23_a4_quarter;

    @FXML
    private ImageView p23_a4_whole;

    @FXML
    private ImageView p23_b2_half;

    @FXML
    private ImageView p23_b2_quarter;

    @FXML
    private ImageView p23_b2_whole;

    @FXML
    private ImageView p23_b3_half;

    @FXML
    private ImageView p23_b3_quarter;

    @FXML
    private ImageView p23_b3_whole;

    @FXML
    private ImageView p23_b4_half;

    @FXML
    private ImageView p23_b4_quarter;

    @FXML
    private ImageView p23_b4_whole;

    @FXML
    private ImageView p23_c3_half;

    @FXML
    private ImageView p23_c3_quarter;

    @FXML
    private ImageView p23_c3_whole;

    @FXML
    private ImageView p23_c4_half;

    @FXML
    private ImageView p23_c4_quarter;

    @FXML
    private ImageView p23_c4_whole;

    @FXML
    private ImageView p23_c5_half;

    @FXML
    private ImageView p23_c5_quarter;

    @FXML
    private ImageView p23_c5_whole;

    @FXML
    private ImageView p23_d3_half;

    @FXML
    private ImageView p23_d3_quarter;

    @FXML
    private ImageView p23_d3_whole;

    @FXML
    private ImageView p23_d4_half;

    @FXML
    private ImageView p23_d4_quarter;

    @FXML
    private ImageView p23_d4_whole;

    @FXML
    private ImageView p23_d5_half;

    @FXML
    private ImageView p23_d5_quarter;

    @FXML
    private ImageView p23_d5_whole;

    @FXML
    private ImageView p23_e2_half;

    @FXML
    private ImageView p23_e2_quarter;

    @FXML
    private ImageView p23_e2_whole;

    @FXML
    private ImageView p23_e3_half;

    @FXML
    private ImageView p23_e3_quarter;

    @FXML
    private ImageView p23_e3_whole;

    @FXML
    private ImageView p23_e4_half;

    @FXML
    private ImageView p23_e4_quarter;

    @FXML
    private ImageView p23_e4_whole;

    @FXML
    private ImageView p23_e5_half;

    @FXML
    private ImageView p23_e5_quarter;

    @FXML
    private ImageView p23_e5_whole;

    @FXML
    private ImageView p23_f2_half;

    @FXML
    private ImageView p23_f2_quarter;

    @FXML
    private ImageView p23_f2_whole;

    @FXML
    private ImageView p23_f3_half;

    @FXML
    private ImageView p23_f3_quarter;

    @FXML
    private ImageView p23_f3_whole;

    @FXML
    private ImageView p23_f4_half;

    @FXML
    private ImageView p23_f4_quarter;

    @FXML
    private ImageView p23_f4_whole;

    @FXML
    private ImageView p23_f5_half;

    @FXML
    private ImageView p23_f5_quarter;

    @FXML
    private ImageView p23_f5_whole;

    @FXML
    private ImageView p23_g2_half;

    @FXML
    private ImageView p23_g2_quarter;

    @FXML
    private ImageView p23_g2_whole;

    @FXML
    private ImageView p23_g3_half;

    @FXML
    private ImageView p23_g3_quarter;

    @FXML
    private ImageView p23_g3_whole;

    @FXML
    private ImageView p23_g4_half;

    @FXML
    private ImageView p23_g4_quarter;

    @FXML
    private ImageView p23_g4_whole;

    @FXML
    private ImageView p23_g5_half;

    @FXML
    private ImageView p23_g5_quarter;

    @FXML
    private ImageView p23_g5_whole;

    @FXML
    private ImageView p24_a2_half;

    @FXML
    private ImageView p24_a2_quarter;

    @FXML
    private ImageView p24_a2_whole;

    @FXML
    private ImageView p24_a3_half;

    @FXML
    private ImageView p24_a3_quarter;

    @FXML
    private ImageView p24_a3_whole;

    @FXML
    private ImageView p24_a4_half;

    @FXML
    private ImageView p24_a4_quarter;

    @FXML
    private ImageView p24_a4_whole;

    @FXML
    private ImageView p24_b2_half;

    @FXML
    private ImageView p24_b2_quarter;

    @FXML
    private ImageView p24_b2_whole;

    @FXML
    private ImageView p24_b3_half;

    @FXML
    private ImageView p24_b3_quarter;

    @FXML
    private ImageView p24_b3_whole;

    @FXML
    private ImageView p24_b4_half;

    @FXML
    private ImageView p24_b4_quarter;

    @FXML
    private ImageView p24_b4_whole;

    @FXML
    private ImageView p24_c3_half;

    @FXML
    private ImageView p24_c3_quarter;

    @FXML
    private ImageView p24_c3_whole;

    @FXML
    private ImageView p24_c4_half;

    @FXML
    private ImageView p24_c4_quarter;

    @FXML
    private ImageView p24_c4_whole;

    @FXML
    private ImageView p24_c5_half;

    @FXML
    private ImageView p24_c5_quarter;

    @FXML
    private ImageView p24_c5_whole;

    @FXML
    private ImageView p24_d3_half;

    @FXML
    private ImageView p24_d3_quarter;

    @FXML
    private ImageView p24_d3_whole;

    @FXML
    private ImageView p24_d4_half;

    @FXML
    private ImageView p24_d4_quarter;

    @FXML
    private ImageView p24_d4_whole;

    @FXML
    private ImageView p24_d5_half;

    @FXML
    private ImageView p24_d5_quarter;

    @FXML
    private ImageView p24_d5_whole;

    @FXML
    private ImageView p24_e2_half;

    @FXML
    private ImageView p24_e2_quarter;

    @FXML
    private ImageView p24_e2_whole;

    @FXML
    private ImageView p24_e3_half;

    @FXML
    private ImageView p24_e3_quarter;

    @FXML
    private ImageView p24_e3_whole;

    @FXML
    private ImageView p24_e4_half;

    @FXML
    private ImageView p24_e4_quarter;

    @FXML
    private ImageView p24_e4_whole;

    @FXML
    private ImageView p24_e5_half;

    @FXML
    private ImageView p24_e5_quarter;

    @FXML
    private ImageView p24_e5_whole;

    @FXML
    private ImageView p24_f2_half;

    @FXML
    private ImageView p24_f2_quarter;

    @FXML
    private ImageView p24_f2_whole;

    @FXML
    private ImageView p24_f3_half;

    @FXML
    private ImageView p24_f3_quarter;

    @FXML
    private ImageView p24_f3_whole;

    @FXML
    private ImageView p24_f4_half;

    @FXML
    private ImageView p24_f4_quarter;

    @FXML
    private ImageView p24_f4_whole;

    @FXML
    private ImageView p24_f5_half;

    @FXML
    private ImageView p24_f5_quarter;

    @FXML
    private ImageView p24_f5_whole;

    @FXML
    private ImageView p24_g2_half;

    @FXML
    private ImageView p24_g2_quarter;

    @FXML
    private ImageView p24_g2_whole;

    @FXML
    private ImageView p24_g3_half;

    @FXML
    private ImageView p24_g3_quarter;

    @FXML
    private ImageView p24_g3_whole;

    @FXML
    private ImageView p24_g4_half;

    @FXML
    private ImageView p24_g4_quarter;

    @FXML
    private ImageView p24_g4_whole;

    @FXML
    private ImageView p24_g5_half;

    @FXML
    private ImageView p24_g5_quarter;

    @FXML
    private ImageView p24_g5_whole;

    @FXML
    private ImageView p2_a2_half;

    @FXML
    private ImageView p2_a2_quarter;

    @FXML
    private ImageView p2_a2_whole;

    @FXML
    private ImageView p2_a3_half;

    @FXML
    private ImageView p2_a3_quarter;

    @FXML
    private ImageView p2_a3_whole;

    @FXML
    private ImageView p2_a4_half;

    @FXML
    private ImageView p2_a4_quarter;

    @FXML
    private ImageView p2_a4_whole;

    @FXML
    private ImageView p2_b2_half;

    @FXML
    private ImageView p2_b2_quarter;

    @FXML
    private ImageView p2_b2_whole;

    @FXML
    private ImageView p2_b3_half;

    @FXML
    private ImageView p2_b3_quarter;

    @FXML
    private ImageView p2_b3_whole;

    @FXML
    private ImageView p2_b4_half;

    @FXML
    private ImageView p2_b4_quarter;

    @FXML
    private ImageView p2_b4_whole;

    @FXML
    private ImageView p2_c3_half;

    @FXML
    private ImageView p2_c3_quarter;

    @FXML
    private ImageView p2_c3_whole;

    @FXML
    private ImageView p2_c4_half;

    @FXML
    private ImageView p2_c4_quarter;

    @FXML
    private ImageView p2_c4_whole;

    @FXML
    private ImageView p2_c5_half;

    @FXML
    private ImageView p2_c5_quarter;

    @FXML
    private ImageView p2_c5_whole;

    @FXML
    private ImageView p2_d3_half;

    @FXML
    private ImageView p2_d3_quarter;

    @FXML
    private ImageView p2_d3_whole;

    @FXML
    private ImageView p2_d4_half;

    @FXML
    private ImageView p2_d4_quarter;

    @FXML
    private ImageView p2_d4_whole;

    @FXML
    private ImageView p2_d5_half;

    @FXML
    private ImageView p2_d5_quarter;

    @FXML
    private ImageView p2_d5_whole;

    @FXML
    private ImageView p2_e2_half;

    @FXML
    private ImageView p2_e2_quarter;

    @FXML
    private ImageView p2_e2_whole;

    @FXML
    private ImageView p2_e3_half;

    @FXML
    private ImageView p2_e3_quarter;

    @FXML
    private ImageView p2_e3_whole;

    @FXML
    private ImageView p2_e4_half;

    @FXML
    private ImageView p2_e4_quarter;

    @FXML
    private ImageView p2_e4_whole;

    @FXML
    private ImageView p2_e5_half;

    @FXML
    private ImageView p2_e5_quarter;

    @FXML
    private ImageView p2_e5_whole;

    @FXML
    private ImageView p2_f2_half;

    @FXML
    private ImageView p2_f2_quarter;

    @FXML
    private ImageView p2_f2_whole;

    @FXML
    private ImageView p2_f3_half;

    @FXML
    private ImageView p2_f3_quarter;

    @FXML
    private ImageView p2_f3_whole;

    @FXML
    private ImageView p2_f4_half;

    @FXML
    private ImageView p2_f4_quarter;

    @FXML
    private ImageView p2_f4_whole;

    @FXML
    private ImageView p2_f5_half;

    @FXML
    private ImageView p2_f5_quarter;

    @FXML
    private ImageView p2_f5_whole;

    @FXML
    private ImageView p2_g2_half;

    @FXML
    private ImageView p2_g2_quarter;

    @FXML
    private ImageView p2_g2_whole;

    @FXML
    private ImageView p2_g3_half;

    @FXML
    private ImageView p2_g3_quarter;

    @FXML
    private ImageView p2_g3_whole;

    @FXML
    private ImageView p2_g4_half;

    @FXML
    private ImageView p2_g4_quarter;

    @FXML
    private ImageView p2_g4_whole;

    @FXML
    private ImageView p2_g5_half;

    @FXML
    private ImageView p2_g5_quarter;

    @FXML
    private ImageView p2_g5_whole;

    @FXML
    private ImageView p3_a2_half;

    @FXML
    private ImageView p3_a2_quarter;

    @FXML
    private ImageView p3_a2_whole;

    @FXML
    private ImageView p3_a3_half;

    @FXML
    private ImageView p3_a3_quarter;

    @FXML
    private ImageView p3_a3_whole;

    @FXML
    private ImageView p3_a4_half;

    @FXML
    private ImageView p3_a4_quarter;

    @FXML
    private ImageView p3_a4_whole;

    @FXML
    private ImageView p3_b2_half;

    @FXML
    private ImageView p3_b2_quarter;

    @FXML
    private ImageView p3_b2_whole;

    @FXML
    private ImageView p3_b3_half;

    @FXML
    private ImageView p3_b3_quarter;

    @FXML
    private ImageView p3_b3_whole;

    @FXML
    private ImageView p3_b4_half;

    @FXML
    private ImageView p3_b4_quarter;

    @FXML
    private ImageView p3_b4_whole;

    @FXML
    private ImageView p3_c3_half;

    @FXML
    private ImageView p3_c3_quarter;

    @FXML
    private ImageView p3_c3_whole;

    @FXML
    private ImageView p3_c4_half;

    @FXML
    private ImageView p3_c4_quarter;

    @FXML
    private ImageView p3_c4_whole;

    @FXML
    private ImageView p3_c5_half;

    @FXML
    private ImageView p3_c5_quarter;

    @FXML
    private ImageView p3_c5_whole;

    @FXML
    private ImageView p3_d3_half;

    @FXML
    private ImageView p3_d3_quarter;

    @FXML
    private ImageView p3_d3_whole;

    @FXML
    private ImageView p3_d4_half;

    @FXML
    private ImageView p3_d4_quarter;

    @FXML
    private ImageView p3_d4_whole;

    @FXML
    private ImageView p3_d5_half;

    @FXML
    private ImageView p3_d5_quarter;

    @FXML
    private ImageView p3_d5_whole;

    @FXML
    private ImageView p3_e2_half;

    @FXML
    private ImageView p3_e2_quarter;

    @FXML
    private ImageView p3_e2_whole;

    @FXML
    private ImageView p3_e3_half;

    @FXML
    private ImageView p3_e3_quarter;

    @FXML
    private ImageView p3_e3_whole;

    @FXML
    private ImageView p3_e4_whole;

    @FXML
    private ImageView p3_e4_half;

    @FXML
    private ImageView p3_e4_quarter;

    @FXML
    private ImageView p3_e5_half;

    @FXML
    private ImageView p3_e5_quarter;

    @FXML
    private ImageView p3_e5_whole;

    @FXML
    private ImageView p3_f2_half;

    @FXML
    private ImageView p3_f2_quarter;

    @FXML
    private ImageView p3_f2_whole;

    @FXML
    private ImageView p3_f3_half;

    @FXML
    private ImageView p3_f3_quarter;

    @FXML
    private ImageView p3_f3_whole;

    @FXML
    private ImageView p3_f4_half;

    @FXML
    private ImageView p3_f4_quarter;

    @FXML
    private ImageView p3_f4_whole;

    @FXML
    private ImageView p3_f5_half;

    @FXML
    private ImageView p3_f5_quarter;

    @FXML
    private ImageView p3_f5_whole;

    @FXML
    private ImageView p3_g2_whole;

    @FXML
    private ImageView p3_g2_half;

    @FXML
    private ImageView p3_g2_quarter;

    @FXML
    private ImageView p3_g3_half;

    @FXML
    private ImageView p3_g3_quarter;

    @FXML
    private ImageView p3_g3_whole;

    @FXML
    private ImageView p3_g4_half;

    @FXML
    private ImageView p3_g4_quarter;

    @FXML
    private ImageView p3_g4_whole;

    @FXML
    private ImageView p3_g5_half;

    @FXML
    private ImageView p3_g5_quarter;

    @FXML
    private ImageView p3_g5_whole;

    @FXML
    private ImageView p4_a2_half;

    @FXML
    private ImageView p4_a2_quarter;

    @FXML
    private ImageView p4_a2_whole;

    @FXML
    private ImageView p4_a3_half;

    @FXML
    private ImageView p4_a3_quarter;

    @FXML
    private ImageView p4_a3_whole;

    @FXML
    private ImageView p4_a4_half;

    @FXML
    private ImageView p4_a4_quarter;

    @FXML
    private ImageView p4_a4_whole;

    @FXML
    private ImageView p4_b2_half;

    @FXML
    private ImageView p4_b2_quarter;

    @FXML
    private ImageView p4_b2_whole;

    @FXML
    private ImageView p4_b3_half;

    @FXML
    private ImageView p4_b3_quarter;

    @FXML
    private ImageView p4_b3_whole;

    @FXML
    private ImageView p4_b4_half;

    @FXML
    private ImageView p4_b4_quarter;

    @FXML
    private ImageView p4_b4_whole;

    @FXML
    private ImageView p4_c3_half;

    @FXML
    private ImageView p4_c3_quarter;

    @FXML
    private ImageView p4_c3_whole;

    @FXML
    private ImageView p4_c4_half;

    @FXML
    private ImageView p4_c4_quarter;

    @FXML
    private ImageView p4_c4_whole;

    @FXML
    private ImageView p4_c5_half;

    @FXML
    private ImageView p4_c5_quarter;

    @FXML
    private ImageView p4_c5_whole;

    @FXML
    private ImageView p4_d3_half;

    @FXML
    private ImageView p4_d3_quarter;

    @FXML
    private ImageView p4_d3_whole;

    @FXML
    private ImageView p4_d4_half;

    @FXML
    private ImageView p4_d4_quarter;

    @FXML
    private ImageView p4_d4_whole;

    @FXML
    private ImageView p4_d5_half;

    @FXML
    private ImageView p4_d5_quarter;

    @FXML
    private ImageView p4_d5_whole;

    @FXML
    private ImageView p4_e2_half;

    @FXML
    private ImageView p4_e2_quarter;

    @FXML
    private ImageView p4_e2_whole;

    @FXML
    private ImageView p4_e3_half;

    @FXML
    private ImageView p4_e3_quarter;

    @FXML
    private ImageView p4_e3_whole;

    @FXML
    private ImageView p4_e4_half;

    @FXML
    private ImageView p4_e4_quarter;

    @FXML
    private ImageView p4_e4_whole;

    @FXML
    private ImageView p4_e5_half;

    @FXML
    private ImageView p4_e5_quarter;

    @FXML
    private ImageView p4_e5_whole;

    @FXML
    private ImageView p4_f2_half;

    @FXML
    private ImageView p4_f2_quarter;

    @FXML
    private ImageView p4_f2_whole;

    @FXML
    private ImageView p4_f3_half;

    @FXML
    private ImageView p4_f3_quarter;

    @FXML
    private ImageView p4_f3_whole;

    @FXML
    private ImageView p4_f4_half;

    @FXML
    private ImageView p4_f4_quarter;

    @FXML
    private ImageView p4_f4_whole;

    @FXML
    private ImageView p4_f5_half;

    @FXML
    private ImageView p4_f5_quarter;

    @FXML
    private ImageView p4_f5_whole;

    @FXML
    private ImageView p4_g2_half;

    @FXML
    private ImageView p4_g2_quarter;

    @FXML
    private ImageView p4_g2_whole;

    @FXML
    private ImageView p4_g3_half;

    @FXML
    private ImageView p4_g3_quarter;

    @FXML
    private ImageView p4_g3_whole;

    @FXML
    private ImageView p4_g4_whole;

    @FXML
    private ImageView p4_g4_half;

    @FXML
    private ImageView p4_g4_quarter;

    @FXML
    private ImageView p4_g5_half;

    @FXML
    private ImageView p4_g5_quarter;

    @FXML
    private ImageView p4_g5_whole;

    @FXML
    private ImageView p5_a2_half;

    @FXML
    private ImageView p5_a2_quarter;

    @FXML
    private ImageView p5_a2_whole;

    @FXML
    private ImageView p5_a3_half;

    @FXML
    private ImageView p5_a3_quarter;

    @FXML
    private ImageView p5_a3_whole;

    @FXML
    private ImageView p5_a4_half;

    @FXML
    private ImageView p5_a4_quarter;

    @FXML
    private ImageView p5_a4_whole;

    @FXML
    private ImageView p5_b2_half;

    @FXML
    private ImageView p5_b2_quarter;

    @FXML
    private ImageView p5_b2_whole;

    @FXML
    private ImageView p5_b3_half;

    @FXML
    private ImageView p5_b3_quarter;

    @FXML
    private ImageView p5_b3_whole;

    @FXML
    private ImageView p5_b4_half;

    @FXML
    private ImageView p5_b4_quarter;

    @FXML
    private ImageView p5_b4_whole;

    @FXML
    private ImageView p5_c3_half;

    @FXML
    private ImageView p5_c3_quarter;

    @FXML
    private ImageView p5_c3_whole;

    @FXML
    private ImageView p5_c4_half;

    @FXML
    private ImageView p5_c4_quarter;

    @FXML
    private ImageView p5_c4_whole;

    @FXML
    private ImageView p5_c5_half;

    @FXML
    private ImageView p5_c5_quarter;

    @FXML
    private ImageView p5_c5_whole;

    @FXML
    private ImageView p5_d3_half;

    @FXML
    private ImageView p5_d3_quarter;

    @FXML
    private ImageView p5_d3_whole;

    @FXML
    private ImageView p5_d4_half;

    @FXML
    private ImageView p5_d4_quarter;

    @FXML
    private ImageView p5_d4_whole;

    @FXML
    private ImageView p5_d5_half;

    @FXML
    private ImageView p5_d5_quarter;

    @FXML
    private ImageView p5_d5_whole;

    @FXML
    private ImageView p5_e2_half;

    @FXML
    private ImageView p5_e2_quarter;

    @FXML
    private ImageView p5_e2_whole;

    @FXML
    private ImageView p5_e3_half;

    @FXML
    private ImageView p5_e3_quarter;

    @FXML
    private ImageView p5_e3_whole;

    @FXML
    private ImageView p5_e4_half;

    @FXML
    private ImageView p5_e4_quarter;

    @FXML
    private ImageView p5_e4_whole;

    @FXML
    private ImageView p5_e5_half;

    @FXML
    private ImageView p5_e5_quarter;

    @FXML
    private ImageView p5_e5_whole;

    @FXML
    private ImageView p5_f2_half;

    @FXML
    private ImageView p5_f2_quarter;

    @FXML
    private ImageView p5_f2_whole;

    @FXML
    private ImageView p5_f3_half;

    @FXML
    private ImageView p5_f3_quarter;

    @FXML
    private ImageView p5_f3_whole;

    @FXML
    private ImageView p5_f4_half;

    @FXML
    private ImageView p5_f4_quarter;

    @FXML
    private ImageView p5_f4_whole;

    @FXML
    private ImageView p5_f5_half;

    @FXML
    private ImageView p5_f5_quarter;

    @FXML
    private ImageView p5_f5_whole;

    @FXML
    private ImageView p5_g2_half;

    @FXML
    private ImageView p5_g2_quarter;

    @FXML
    private ImageView p5_g2_whole;

    @FXML
    private ImageView p5_g3_half;

    @FXML
    private ImageView p5_g3_quarter;

    @FXML
    private ImageView p5_g3_whole;

    @FXML
    private ImageView p5_g4_half;

    @FXML
    private ImageView p5_g4_quarter;

    @FXML
    private ImageView p5_g4_whole;

    @FXML
    private ImageView p5_g5_half;

    @FXML
    private ImageView p5_g5_quarter;

    @FXML
    private ImageView p5_g5_whole;

    @FXML
    private ImageView p6_a2_half;

    @FXML
    private ImageView p6_a2_quarter;

    @FXML
    private ImageView p6_a2_whole;

    @FXML
    private ImageView p6_a3_half;

    @FXML
    private ImageView p6_a3_quarter;

    @FXML
    private ImageView p6_a3_whole;

    @FXML
    private ImageView p6_a4_half;

    @FXML
    private ImageView p6_a4_quarter;

    @FXML
    private ImageView p6_a4_whole;

    @FXML
    private ImageView p6_b2_half;

    @FXML
    private ImageView p6_b2_quarter;

    @FXML
    private ImageView p6_b2_whole;

    @FXML
    private ImageView p6_b3_half;

    @FXML
    private ImageView p6_b3_quarter;

    @FXML
    private ImageView p6_b3_whole;

    @FXML
    private ImageView p6_b4_half;

    @FXML
    private ImageView p6_b4_quarter;

    @FXML
    private ImageView p6_b4_whole;

    @FXML
    private ImageView p6_c3_half;

    @FXML
    private ImageView p6_c3_quarter;

    @FXML
    private ImageView p6_c3_whole;

    @FXML
    private ImageView p6_c4_half;

    @FXML
    private ImageView p6_c4_quarter;

    @FXML
    private ImageView p6_c4_whole;

    @FXML
    private ImageView p6_c5_half;

    @FXML
    private ImageView p6_c5_quarter;

    @FXML
    private ImageView p6_c5_whole;

    @FXML
    private ImageView p6_d3_half;

    @FXML
    private ImageView p6_d3_quarter;

    @FXML
    private ImageView p6_d3_whole;

    @FXML
    private ImageView p6_d4_half;

    @FXML
    private ImageView p6_d4_quarter;

    @FXML
    private ImageView p6_d4_whole;

    @FXML
    private ImageView p6_d5_half;

    @FXML
    private ImageView p6_d5_quarter;

    @FXML
    private ImageView p6_d5_whole;

    @FXML
    private ImageView p6_e2_half;

    @FXML
    private ImageView p6_e2_quarter;

    @FXML
    private ImageView p6_e2_whole;

    @FXML
    private ImageView p6_e3_half;

    @FXML
    private ImageView p6_e3_quarter;

    @FXML
    private ImageView p6_e3_whole;

    @FXML
    private ImageView p6_e4_half;

    @FXML
    private ImageView p6_e4_quarter;

    @FXML
    private ImageView p6_e4_whole;

    @FXML
    private ImageView p6_e5_half;

    @FXML
    private ImageView p6_e5_quarter;

    @FXML
    private ImageView p6_e5_whole;

    @FXML
    private ImageView p6_f2_half;

    @FXML
    private ImageView p6_f2_quarter;

    @FXML
    private ImageView p6_f2_whole;

    @FXML
    private ImageView p6_f3_half;

    @FXML
    private ImageView p6_f3_quarter;

    @FXML
    private ImageView p6_f3_whole;

    @FXML
    private ImageView p6_f4_half;

    @FXML
    private ImageView p6_f4_quarter;

    @FXML
    private ImageView p6_f4_whole;

    @FXML
    private ImageView p6_f5_half;

    @FXML
    private ImageView p6_f5_quarter;

    @FXML
    private ImageView p6_f5_whole;

    @FXML
    private ImageView p6_g2_half;

    @FXML
    private ImageView p6_g2_quarter;

    @FXML
    private ImageView p6_g2_whole;

    @FXML
    private ImageView p6_g3_half;

    @FXML
    private ImageView p6_g3_quarter;

    @FXML
    private ImageView p6_g3_whole;

    @FXML
    private ImageView p6_g4_half;

    @FXML
    private ImageView p6_g4_quarter;

    @FXML
    private ImageView p6_g4_whole;

    @FXML
    private ImageView p6_g5_half;

    @FXML
    private ImageView p6_g5_quarter;

    @FXML
    private ImageView p6_g5_whole;

    @FXML
    private ImageView p7_a2_half;

    @FXML
    private ImageView p7_a2_quarter;

    @FXML
    private ImageView p7_a2_whole;

    @FXML
    private ImageView p7_a3_half;

    @FXML
    private ImageView p7_a3_quarter;

    @FXML
    private ImageView p7_a3_whole;

    @FXML
    private ImageView p7_a4_half;

    @FXML
    private ImageView p7_a4_quarter;

    @FXML
    private ImageView p7_a4_whole;

    @FXML
    private ImageView p7_b2_half;

    @FXML
    private ImageView p7_b2_quarter;

    @FXML
    private ImageView p7_b2_whole;

    @FXML
    private ImageView p7_b3_half;

    @FXML
    private ImageView p7_b3_quarter;

    @FXML
    private ImageView p7_b3_whole;

    @FXML
    private ImageView p7_b4_half;

    @FXML
    private ImageView p7_b4_quarter;

    @FXML
    private ImageView p7_b4_whole;

    @FXML
    private ImageView p7_c3_half;

    @FXML
    private ImageView p7_c3_quarter;

    @FXML
    private ImageView p7_c3_whole;

    @FXML
    private ImageView p7_c4_half;

    @FXML
    private ImageView p7_c4_quarter;

    @FXML
    private ImageView p7_c4_whole;

    @FXML
    private ImageView p7_c5_half;

    @FXML
    private ImageView p7_c5_quarter;

    @FXML
    private ImageView p7_c5_whole;

    @FXML
    private ImageView p7_d3_half;

    @FXML
    private ImageView p7_d3_quarter;

    @FXML
    private ImageView p7_d3_whole;

    @FXML
    private ImageView p7_d4_half;

    @FXML
    private ImageView p7_d4_quarter;

    @FXML
    private ImageView p7_d4_whole;

    @FXML
    private ImageView p7_d5_half;

    @FXML
    private ImageView p7_d5_quarter;

    @FXML
    private ImageView p7_d5_whole;

    @FXML
    private ImageView p7_e2_half;

    @FXML
    private ImageView p7_e2_quarter;

    @FXML
    private ImageView p7_e2_whole;

    @FXML
    private ImageView p7_e3_half;

    @FXML
    private ImageView p7_e3_quarter;

    @FXML
    private ImageView p7_e3_whole;

    @FXML
    private ImageView p7_e4_half;

    @FXML
    private ImageView p7_e4_quarter;

    @FXML
    private ImageView p7_e4_whole;

    @FXML
    private ImageView p7_e5_half;

    @FXML
    private ImageView p7_e5_quarter;

    @FXML
    private ImageView p7_e5_whole;

    @FXML
    private ImageView p7_f2_half;

    @FXML
    private ImageView p7_f2_quarter;

    @FXML
    private ImageView p7_f2_whole;

    @FXML
    private ImageView p7_f3_half;

    @FXML
    private ImageView p7_f3_quarter;

    @FXML
    private ImageView p7_f3_whole;

    @FXML
    private ImageView p7_f4_half;

    @FXML
    private ImageView p7_f4_quarter;

    @FXML
    private ImageView p7_f4_whole;

    @FXML
    private ImageView p7_f5_half;

    @FXML
    private ImageView p7_f5_quarter;

    @FXML
    private ImageView p7_f5_whole;

    @FXML
    private ImageView p7_g2_half;

    @FXML
    private ImageView p7_g2_quarter;

    @FXML
    private ImageView p7_g2_whole;

    @FXML
    private ImageView p7_g3_half;

    @FXML
    private ImageView p7_g3_quarter;

    @FXML
    private ImageView p7_g3_whole;

    @FXML
    private ImageView p7_g4_half;

    @FXML
    private ImageView p7_g4_quarter;

    @FXML
    private ImageView p7_g4_whole;

    @FXML
    private ImageView p7_g5_half;

    @FXML
    private ImageView p7_g5_quarter;

    @FXML
    private ImageView p7_g5_whole;

    @FXML
    private ImageView p8_a2_half;

    @FXML
    private ImageView p8_a2_quarter;

    @FXML
    private ImageView p8_a2_whole;

    @FXML
    private ImageView p8_a3_half;

    @FXML
    private ImageView p8_a3_quarter;

    @FXML
    private ImageView p8_a3_whole;

    @FXML
    private ImageView p8_a4_half;

    @FXML
    private ImageView p8_a4_quarter;

    @FXML
    private ImageView p8_a4_whole;

    @FXML
    private ImageView p8_b2_half;

    @FXML
    private ImageView p8_b2_quarter;

    @FXML
    private ImageView p8_b2_whole;

    @FXML
    private ImageView p8_b3_half;

    @FXML
    private ImageView p8_b3_quarter;

    @FXML
    private ImageView p8_b3_whole;

    @FXML
    private ImageView p8_b4_half;

    @FXML
    private ImageView p8_b4_quarter;

    @FXML
    private ImageView p8_b4_whole;

    @FXML
    private ImageView p8_c3_half;

    @FXML
    private ImageView p8_c3_quarter;

    @FXML
    private ImageView p8_c3_whole;

    @FXML
    private ImageView p8_c4_half;

    @FXML
    private ImageView p8_c4_quarter;

    @FXML
    private ImageView p8_c4_whole;

    @FXML
    private ImageView p8_c5_half;

    @FXML
    private ImageView p8_c5_quarter;

    @FXML
    private ImageView p8_c5_whole;

    @FXML
    private ImageView p8_d3_half;

    @FXML
    private ImageView p8_d3_quarter;

    @FXML
    private ImageView p8_d3_whole;

    @FXML
    private ImageView p8_d4_half;

    @FXML
    private ImageView p8_d4_quarter;

    @FXML
    private ImageView p8_d4_whole;

    @FXML
    private ImageView p8_d5_half;

    @FXML
    private ImageView p8_d5_quarter;

    @FXML
    private ImageView p8_d5_whole;

    @FXML
    private ImageView p8_e2_half;

    @FXML
    private ImageView p8_e2_quarter;

    @FXML
    private ImageView p8_e2_whole;

    @FXML
    private ImageView p8_e3_half;

    @FXML
    private ImageView p8_e3_quarter;

    @FXML
    private ImageView p8_e3_whole;

    @FXML
    private ImageView p8_e4_half;

    @FXML
    private ImageView p8_e4_quarter;

    @FXML
    private ImageView p8_e4_whole;

    @FXML
    private ImageView p8_e5_half;

    @FXML
    private ImageView p8_e5_quarter;

    @FXML
    private ImageView p8_e5_whole;

    @FXML
    private ImageView p8_f2_half;

    @FXML
    private ImageView p8_f2_quarter;

    @FXML
    private ImageView p8_f2_whole;

    @FXML
    private ImageView p8_f3_half;

    @FXML
    private ImageView p8_f3_quarter;

    @FXML
    private ImageView p8_f3_whole;

    @FXML
    private ImageView p8_f4_half;

    @FXML
    private ImageView p8_f4_quarter;

    @FXML
    private ImageView p8_f4_whole;

    @FXML
    private ImageView p8_f5_half;

    @FXML
    private ImageView p8_f5_quarter;

    @FXML
    private ImageView p8_f5_whole;

    @FXML
    private ImageView p8_g2_half;

    @FXML
    private ImageView p8_g2_quarter;

    @FXML
    private ImageView p8_g2_whole;

    @FXML
    private ImageView p8_g3_half;

    @FXML
    private ImageView p8_g3_quarter;

    @FXML
    private ImageView p8_g3_whole;

    @FXML
    private ImageView p8_g4_half;

    @FXML
    private ImageView p8_g4_quarter;

    @FXML
    private ImageView p8_g4_whole;

    @FXML
    private ImageView p8_g5_half;

    @FXML
    private ImageView p8_g5_quarter;

    @FXML
    private ImageView p8_g5_whole;

    @FXML
    private ImageView p9_a2_half;

    @FXML
    private ImageView p9_a2_quarter;

    @FXML
    private ImageView p9_a2_whole;

    @FXML
    private ImageView p9_a3_half;

    @FXML
    private ImageView p9_a3_quarter;

    @FXML
    private ImageView p9_a3_whole;

    @FXML
    private ImageView p9_a4_half;

    @FXML
    private ImageView p9_a4_quarter;

    @FXML
    private ImageView p9_a4_whole;

    @FXML
    private ImageView p9_b2_half;

    @FXML
    private ImageView p9_b2_quarter;

    @FXML
    private ImageView p9_b2_whole;

    @FXML
    private ImageView p9_b3_half;

    @FXML
    private ImageView p9_b3_quarter;

    @FXML
    private ImageView p9_b3_whole;

    @FXML
    private ImageView p9_b4_half;

    @FXML
    private ImageView p9_b4_quarter;

    @FXML
    private ImageView p9_b4_whole;

    @FXML
    private ImageView p9_c3_half;

    @FXML
    private ImageView p9_c3_quarter;

    @FXML
    private ImageView p9_c3_whole;

    @FXML
    private ImageView p9_c4_half;

    @FXML
    private ImageView p9_c4_quarter;

    @FXML
    private ImageView p9_c4_whole;

    @FXML
    private ImageView p9_c5_half;

    @FXML
    private ImageView p9_c5_quarter;

    @FXML
    private ImageView p9_c5_whole;

    @FXML
    private ImageView p9_d3_half;

    @FXML
    private ImageView p9_d3_quarter;

    @FXML
    private ImageView p9_d3_whole;

    @FXML
    private ImageView p9_d4_half;

    @FXML
    private ImageView p9_d4_quarter;

    @FXML
    private ImageView p9_d4_whole;

    @FXML
    private ImageView p9_d5_half;

    @FXML
    private ImageView p9_d5_quarter;

    @FXML
    private ImageView p9_d5_whole;

    @FXML
    private ImageView p9_e2_half;

    @FXML
    private ImageView p9_e2_quarter;

    @FXML
    private ImageView p9_e2_whole;

    @FXML
    private ImageView p9_e3_half;

    @FXML
    private ImageView p9_e3_quarter;

    @FXML
    private ImageView p9_e3_whole;

    @FXML
    private ImageView p9_e4_half;

    @FXML
    private ImageView p9_e4_quarter;

    @FXML
    private ImageView p9_e4_whole;

    @FXML
    private ImageView p9_e5_half;

    @FXML
    private ImageView p9_e5_quarter;

    @FXML
    private ImageView p9_e5_whole;

    @FXML
    private ImageView p9_f2_half;

    @FXML
    private ImageView p9_f2_quarter;

    @FXML
    private ImageView p9_f2_whole;

    @FXML
    private ImageView p9_f3_half;

    @FXML
    private ImageView p9_f3_quarter;

    @FXML
    private ImageView p9_f3_whole;

    @FXML
    private ImageView p9_f4_half;

    @FXML
    private ImageView p9_f4_quarter;

    @FXML
    private ImageView p9_f4_whole;

    @FXML
    private ImageView p9_f5_half;

    @FXML
    private ImageView p9_f5_quarter;

    @FXML
    private ImageView p9_f5_whole;

    @FXML
    private ImageView p9_g2_half;

    @FXML
    private ImageView p9_g2_quarter;

    @FXML
    private ImageView p9_g2_whole;

    @FXML
    private ImageView p9_g3_half;

    @FXML
    private ImageView p9_g3_quarter;

    @FXML
    private ImageView p9_g3_whole;

    @FXML
    private ImageView p9_g4_half;

    @FXML
    private ImageView p9_g4_quarter;

    @FXML
    private ImageView p9_g4_whole;

    @FXML
    private ImageView p9_g5_half;

    @FXML
    private ImageView p9_g5_quarter;

    @FXML
    private ImageView p9_g5_whole;

    // Dictionary of notes with string identifiers
    Hashtable<String, ImageView> noteSheet = new Hashtable<String, ImageView>();
    // Note types
    String[] noteLengths;
    String[] noteTypes;
    ImageView[] allNotes;


    // Scene switch handling
    @FXML
    public void switchToHome(ActionEvent event) throws IOException {
        homePage.setVisible(true);
        textInput.setVisible(false);
        helpPage.setVisible(false);
    }

    @FXML
    public void switchToTextInput(ActionEvent event) throws IOException {
        homePage.setVisible(false);
        textInput.setVisible(true);
        helpPage.setVisible(false);
    }

    @FXML
    public void switchToHelp(ActionEvent event) throws IOException {
        homePage.setVisible(false);
        textInput.setVisible(false);
        helpPage.setVisible(true);
    }

    // Hyperlink
    @FXML
    public void openLink(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.dogsandbirds.co.uk/how-it-works/"));
    }

    // Generate score from text input
    @FXML
    public void generateScore(ActionEvent event) throws IOException {
        noteTypes = new String[]{"e2", "f2", "g2", "a2", "b2", "c3", "d3", "e3", "f3", "g3", "a3", "b3", "c4", "d4", "e4", "f4", "g4", "a4", "b4", "c5", "d5", "e5", "f5", "g5"};
        noteLengths = new String[]{"quarter", "half", "whole"};
        allNotes = new ImageView[]{p1_e2_quarter, p1_e2_half, p1_e2_whole, p1_f2_quarter, p1_f2_half, p1_f2_whole, p1_g2_quarter, p1_g2_half, p1_g2_whole, p1_a2_quarter, p1_a2_half, p1_a2_whole, p1_b2_quarter, p1_b2_half, p1_b2_whole, p1_c3_quarter, p1_c3_half, p1_c3_whole, p1_d3_quarter, p1_d3_half, p1_d3_whole, p1_e3_quarter, p1_e3_half, p1_e3_whole, p1_f3_quarter, p1_f3_half, p1_f3_whole, p1_g3_quarter, p1_g3_half, p1_g3_whole, p1_a3_quarter, p1_a3_half, p1_a3_whole, p1_b3_quarter, p1_b3_half, p1_b3_whole, p1_c4_quarter, p1_c4_half, p1_c4_whole, p1_d4_quarter, p1_d4_half, p1_d4_whole, p1_e4_quarter, p1_e4_half, p1_e4_whole, p1_f4_quarter, p1_f4_half, p1_f4_whole, p1_g4_quarter, p1_g4_half, p1_g4_whole, p1_a4_quarter, p1_a4_half, p1_a4_whole, p1_b4_quarter, p1_b4_half, p1_b4_whole, p1_c5_quarter, p1_c5_half, p1_c5_whole, p1_d5_quarter, p1_d5_half, p1_d5_whole, p1_e5_quarter, p1_e5_half, p1_e5_whole, p1_f5_quarter, p1_f5_half, p1_f5_whole, p1_g5_quarter, p1_g5_half, p1_g5_whole, p2_e2_quarter, p2_e2_half, p2_e2_whole, p2_f2_quarter, p2_f2_half, p2_f2_whole, p2_g2_quarter, p2_g2_half, p2_g2_whole, p2_a2_quarter, p2_a2_half, p2_a2_whole, p2_b2_quarter, p2_b2_half, p2_b2_whole, p2_c3_quarter, p2_c3_half, p2_c3_whole, p2_d3_quarter, p2_d3_half, p2_d3_whole, p2_e3_quarter, p2_e3_half, p2_e3_whole, p2_f3_quarter, p2_f3_half, p2_f3_whole, p2_g3_quarter, p2_g3_half, p2_g3_whole, p2_a3_quarter, p2_a3_half, p2_a3_whole, p2_b3_quarter, p2_b3_half, p2_b3_whole, p2_c4_quarter, p2_c4_half, p2_c4_whole, p2_d4_quarter, p2_d4_half, p2_d4_whole, p2_e4_quarter, p2_e4_half, p2_e4_whole, p2_f4_quarter, p2_f4_half, p2_f4_whole, p2_g4_quarter, p2_g4_half, p2_g4_whole, p2_a4_quarter, p2_a4_half, p2_a4_whole, p2_b4_quarter, p2_b4_half, p2_b4_whole, p2_c5_quarter, p2_c5_half, p2_c5_whole, p2_d5_quarter, p2_d5_half, p2_d5_whole, p2_e5_quarter, p2_e5_half, p2_e5_whole, p2_f5_quarter, p2_f5_half, p2_f5_whole, p2_g5_quarter, p2_g5_half, p2_g5_whole, p3_e2_quarter, p3_e2_half, p3_e2_whole, p3_f2_quarter, p3_f2_half, p3_f2_whole, p3_g2_quarter, p3_g2_half, p3_g2_whole, p3_a2_quarter, p3_a2_half, p3_a2_whole, p3_b2_quarter, p3_b2_half, p3_b2_whole, p3_c3_quarter, p3_c3_half, p3_c3_whole, p3_d3_quarter, p3_d3_half, p3_d3_whole, p3_e3_quarter, p3_e3_half, p3_e3_whole, p3_f3_quarter, p3_f3_half, p3_f3_whole, p3_g3_quarter, p3_g3_half, p3_g3_whole, p3_a3_quarter, p3_a3_half, p3_a3_whole, p3_b3_quarter, p3_b3_half, p3_b3_whole, p3_c4_quarter, p3_c4_half, p3_c4_whole, p3_d4_quarter, p3_d4_half, p3_d4_whole, p3_e4_quarter, p3_e4_half, p3_e4_whole, p3_f4_quarter, p3_f4_half, p3_f4_whole, p3_g4_quarter, p3_g4_half, p3_g4_whole, p3_a4_quarter, p3_a4_half, p3_a4_whole, p3_b4_quarter, p3_b4_half, p3_b4_whole, p3_c5_quarter, p3_c5_half, p3_c5_whole, p3_d5_quarter, p3_d5_half, p3_d5_whole, p3_e5_quarter, p3_e5_half, p3_e5_whole, p3_f5_quarter, p3_f5_half, p3_f5_whole, p3_g5_quarter, p3_g5_half, p3_g5_whole, p4_e2_quarter, p4_e2_half, p4_e2_whole, p4_f2_quarter, p4_f2_half, p4_f2_whole, p4_g2_quarter, p4_g2_half, p4_g2_whole, p4_a2_quarter, p4_a2_half, p4_a2_whole, p4_b2_quarter, p4_b2_half, p4_b2_whole, p4_c3_quarter, p4_c3_half, p4_c3_whole, p4_d3_quarter, p4_d3_half, p4_d3_whole, p4_e3_quarter, p4_e3_half, p4_e3_whole, p4_f3_quarter, p4_f3_half, p4_f3_whole, p4_g3_quarter, p4_g3_half, p4_g3_whole, p4_a3_quarter, p4_a3_half, p4_a3_whole, p4_b3_quarter, p4_b3_half, p4_b3_whole, p4_c4_quarter, p4_c4_half, p4_c4_whole, p4_d4_quarter, p4_d4_half, p4_d4_whole, p4_e4_quarter, p4_e4_half, p4_e4_whole, p4_f4_quarter, p4_f4_half, p4_f4_whole, p4_g4_quarter, p4_g4_half, p4_g4_whole, p4_a4_quarter, p4_a4_half, p4_a4_whole, p4_b4_quarter, p4_b4_half, p4_b4_whole, p4_c5_quarter, p4_c5_half, p4_c5_whole, p4_d5_quarter, p4_d5_half, p4_d5_whole, p4_e5_quarter, p4_e5_half, p4_e5_whole, p4_f5_quarter, p4_f5_half, p4_f5_whole, p4_g5_quarter, p4_g5_half, p4_g5_whole, p5_e2_quarter, p5_e2_half, p5_e2_whole, p5_f2_quarter, p5_f2_half, p5_f2_whole, p5_g2_quarter, p5_g2_half, p5_g2_whole, p5_a2_quarter, p5_a2_half, p5_a2_whole, p5_b2_quarter, p5_b2_half, p5_b2_whole, p5_c3_quarter, p5_c3_half, p5_c3_whole, p5_d3_quarter, p5_d3_half, p5_d3_whole, p5_e3_quarter, p5_e3_half, p5_e3_whole, p5_f3_quarter, p5_f3_half, p5_f3_whole, p5_g3_quarter, p5_g3_half, p5_g3_whole, p5_a3_quarter, p5_a3_half, p5_a3_whole, p5_b3_quarter, p5_b3_half, p5_b3_whole, p5_c4_quarter, p5_c4_half, p5_c4_whole, p5_d4_quarter, p5_d4_half, p5_d4_whole, p5_e4_quarter, p5_e4_half, p5_e4_whole, p5_f4_quarter, p5_f4_half, p5_f4_whole, p5_g4_quarter, p5_g4_half, p5_g4_whole, p5_a4_quarter, p5_a4_half, p5_a4_whole, p5_b4_quarter, p5_b4_half, p5_b4_whole, p5_c5_quarter, p5_c5_half, p5_c5_whole, p5_d5_quarter, p5_d5_half, p5_d5_whole, p5_e5_quarter, p5_e5_half, p5_e5_whole, p5_f5_quarter, p5_f5_half, p5_f5_whole, p5_g5_quarter, p5_g5_half, p5_g5_whole, p6_e2_quarter, p6_e2_half, p6_e2_whole, p6_f2_quarter, p6_f2_half, p6_f2_whole, p6_g2_quarter, p6_g2_half, p6_g2_whole, p6_a2_quarter, p6_a2_half, p6_a2_whole, p6_b2_quarter, p6_b2_half, p6_b2_whole, p6_c3_quarter, p6_c3_half, p6_c3_whole, p6_d3_quarter, p6_d3_half, p6_d3_whole, p6_e3_quarter, p6_e3_half, p6_e3_whole, p6_f3_quarter, p6_f3_half, p6_f3_whole, p6_g3_quarter, p6_g3_half, p6_g3_whole, p6_a3_quarter, p6_a3_half, p6_a3_whole, p6_b3_quarter, p6_b3_half, p6_b3_whole, p6_c4_quarter, p6_c4_half, p6_c4_whole, p6_d4_quarter, p6_d4_half, p6_d4_whole, p6_e4_quarter, p6_e4_half, p6_e4_whole, p6_f4_quarter, p6_f4_half, p6_f4_whole, p6_g4_quarter, p6_g4_half, p6_g4_whole, p6_a4_quarter, p6_a4_half, p6_a4_whole, p6_b4_quarter, p6_b4_half, p6_b4_whole, p6_c5_quarter, p6_c5_half, p6_c5_whole, p6_d5_quarter, p6_d5_half, p6_d5_whole, p6_e5_quarter, p6_e5_half, p6_e5_whole, p6_f5_quarter, p6_f5_half, p6_f5_whole, p6_g5_quarter, p6_g5_half, p6_g5_whole, p7_e2_quarter, p7_e2_half, p7_e2_whole, p7_f2_quarter, p7_f2_half, p7_f2_whole, p7_g2_quarter, p7_g2_half, p7_g2_whole, p7_a2_quarter, p7_a2_half, p7_a2_whole, p7_b2_quarter, p7_b2_half, p7_b2_whole, p7_c3_quarter, p7_c3_half, p7_c3_whole, p7_d3_quarter, p7_d3_half, p7_d3_whole, p7_e3_quarter, p7_e3_half, p7_e3_whole, p7_f3_quarter, p7_f3_half, p7_f3_whole, p7_g3_quarter, p7_g3_half, p7_g3_whole, p7_a3_quarter, p7_a3_half, p7_a3_whole, p7_b3_quarter, p7_b3_half, p7_b3_whole, p7_c4_quarter, p7_c4_half, p7_c4_whole, p7_d4_quarter, p7_d4_half, p7_d4_whole, p7_e4_quarter, p7_e4_half, p7_e4_whole, p7_f4_quarter, p7_f4_half, p7_f4_whole, p7_g4_quarter, p7_g4_half, p7_g4_whole, p7_a4_quarter, p7_a4_half, p7_a4_whole, p7_b4_quarter, p7_b4_half, p7_b4_whole, p7_c5_quarter, p7_c5_half, p7_c5_whole, p7_d5_quarter, p7_d5_half, p7_d5_whole, p7_e5_quarter, p7_e5_half, p7_e5_whole, p7_f5_quarter, p7_f5_half, p7_f5_whole, p7_g5_quarter, p7_g5_half, p7_g5_whole, p8_e2_quarter, p8_e2_half, p8_e2_whole, p8_f2_quarter, p8_f2_half, p8_f2_whole, p8_g2_quarter, p8_g2_half, p8_g2_whole, p8_a2_quarter, p8_a2_half, p8_a2_whole, p8_b2_quarter, p8_b2_half, p8_b2_whole, p8_c3_quarter, p8_c3_half, p8_c3_whole, p8_d3_quarter, p8_d3_half, p8_d3_whole, p8_e3_quarter, p8_e3_half, p8_e3_whole, p8_f3_quarter, p8_f3_half, p8_f3_whole, p8_g3_quarter, p8_g3_half, p8_g3_whole, p8_a3_quarter, p8_a3_half, p8_a3_whole, p8_b3_quarter, p8_b3_half, p8_b3_whole, p8_c4_quarter, p8_c4_half, p8_c4_whole, p8_d4_quarter, p8_d4_half, p8_d4_whole, p8_e4_quarter, p8_e4_half, p8_e4_whole, p8_f4_quarter, p8_f4_half, p8_f4_whole, p8_g4_quarter, p8_g4_half, p8_g4_whole, p8_a4_quarter, p8_a4_half, p8_a4_whole, p8_b4_quarter, p8_b4_half, p8_b4_whole, p8_c5_quarter, p8_c5_half, p8_c5_whole, p8_d5_quarter, p8_d5_half, p8_d5_whole, p8_e5_quarter, p8_e5_half, p8_e5_whole, p8_f5_quarter, p8_f5_half, p8_f5_whole, p8_g5_quarter, p8_g5_half, p8_g5_whole, p9_e2_quarter, p9_e2_half, p9_e2_whole, p9_f2_quarter, p9_f2_half, p9_f2_whole, p9_g2_quarter, p9_g2_half, p9_g2_whole, p9_a2_quarter, p9_a2_half, p9_a2_whole, p9_b2_quarter, p9_b2_half, p9_b2_whole, p9_c3_quarter, p9_c3_half, p9_c3_whole, p9_d3_quarter, p9_d3_half, p9_d3_whole, p9_e3_quarter, p9_e3_half, p9_e3_whole, p9_f3_quarter, p9_f3_half, p9_f3_whole, p9_g3_quarter, p9_g3_half, p9_g3_whole, p9_a3_quarter, p9_a3_half, p9_a3_whole, p9_b3_quarter, p9_b3_half, p9_b3_whole, p9_c4_quarter, p9_c4_half, p9_c4_whole, p9_d4_quarter, p9_d4_half, p9_d4_whole, p9_e4_quarter, p9_e4_half, p9_e4_whole, p9_f4_quarter, p9_f4_half, p9_f4_whole, p9_g4_quarter, p9_g4_half, p9_g4_whole, p9_a4_quarter, p9_a4_half, p9_a4_whole, p9_b4_quarter, p9_b4_half, p9_b4_whole, p9_c5_quarter, p9_c5_half, p9_c5_whole, p9_d5_quarter, p9_d5_half, p9_d5_whole, p9_e5_quarter, p9_e5_half, p9_e5_whole, p9_f5_quarter, p9_f5_half, p9_f5_whole, p9_g5_quarter, p9_g5_half, p9_g5_whole, p10_e2_quarter, p10_e2_half, p10_e2_whole, p10_f2_quarter, p10_f2_half, p10_f2_whole, p10_g2_quarter, p10_g2_half, p10_g2_whole, p10_a2_quarter, p10_a2_half, p10_a2_whole, p10_b2_quarter, p10_b2_half, p10_b2_whole, p10_c3_quarter, p10_c3_half, p10_c3_whole, p10_d3_quarter, p10_d3_half, p10_d3_whole, p10_e3_quarter, p10_e3_half, p10_e3_whole, p10_f3_quarter, p10_f3_half, p10_f3_whole, p10_g3_quarter, p10_g3_half, p10_g3_whole, p10_a3_quarter, p10_a3_half, p10_a3_whole, p10_b3_quarter, p10_b3_half, p10_b3_whole, p10_c4_quarter, p10_c4_half, p10_c4_whole, p10_d4_quarter, p10_d4_half, p10_d4_whole, p10_e4_quarter, p10_e4_half, p10_e4_whole, p10_f4_quarter, p10_f4_half, p10_f4_whole, p10_g4_quarter, p10_g4_half, p10_g4_whole, p10_a4_quarter, p10_a4_half, p10_a4_whole, p10_b4_quarter, p10_b4_half, p10_b4_whole, p10_c5_quarter, p10_c5_half, p10_c5_whole, p10_d5_quarter, p10_d5_half, p10_d5_whole, p10_e5_quarter, p10_e5_half, p10_e5_whole, p10_f5_quarter, p10_f5_half, p10_f5_whole, p10_g5_quarter, p10_g5_half, p10_g5_whole, p11_e2_quarter, p11_e2_half, p11_e2_whole, p11_f2_quarter, p11_f2_half, p11_f2_whole, p11_g2_quarter, p11_g2_half, p11_g2_whole, p11_a2_quarter, p11_a2_half, p11_a2_whole, p11_b2_quarter, p11_b2_half, p11_b2_whole, p11_c3_quarter, p11_c3_half, p11_c3_whole, p11_d3_quarter, p11_d3_half, p11_d3_whole, p11_e3_quarter, p11_e3_half, p11_e3_whole, p11_f3_quarter, p11_f3_half, p11_f3_whole, p11_g3_quarter, p11_g3_half, p11_g3_whole, p11_a3_quarter, p11_a3_half, p11_a3_whole, p11_b3_quarter, p11_b3_half, p11_b3_whole, p11_c4_quarter, p11_c4_half, p11_c4_whole, p11_d4_quarter, p11_d4_half, p11_d4_whole, p11_e4_quarter, p11_e4_half, p11_e4_whole, p11_f4_quarter, p11_f4_half, p11_f4_whole, p11_g4_quarter, p11_g4_half, p11_g4_whole, p11_a4_quarter, p11_a4_half, p11_a4_whole, p11_b4_quarter, p11_b4_half, p11_b4_whole, p11_c5_quarter, p11_c5_half, p11_c5_whole, p11_d5_quarter, p11_d5_half, p11_d5_whole, p11_e5_quarter, p11_e5_half, p11_e5_whole, p11_f5_quarter, p11_f5_half, p11_f5_whole, p11_g5_quarter, p11_g5_half, p11_g5_whole, p12_e2_quarter, p12_e2_half, p12_e2_whole, p12_f2_quarter, p12_f2_half, p12_f2_whole, p12_g2_quarter, p12_g2_half, p12_g2_whole, p12_a2_quarter, p12_a2_half, p12_a2_whole, p12_b2_quarter, p12_b2_half, p12_b2_whole, p12_c3_quarter, p12_c3_half, p12_c3_whole, p12_d3_quarter, p12_d3_half, p12_d3_whole, p12_e3_quarter, p12_e3_half, p12_e3_whole, p12_f3_quarter, p12_f3_half, p12_f3_whole, p12_g3_quarter, p12_g3_half, p12_g3_whole, p12_a3_quarter, p12_a3_half, p12_a3_whole, p12_b3_quarter, p12_b3_half, p12_b3_whole, p12_c4_quarter, p12_c4_half, p12_c4_whole, p12_d4_quarter, p12_d4_half, p12_d4_whole, p12_e4_quarter, p12_e4_half, p12_e4_whole, p12_f4_quarter, p12_f4_half, p12_f4_whole, p12_g4_quarter, p12_g4_half, p12_g4_whole, p12_a4_quarter, p12_a4_half, p12_a4_whole, p12_b4_quarter, p12_b4_half, p12_b4_whole, p12_c5_quarter, p12_c5_half, p12_c5_whole, p12_d5_quarter, p12_d5_half, p12_d5_whole, p12_e5_quarter, p12_e5_half, p12_e5_whole, p12_f5_quarter, p12_f5_half, p12_f5_whole, p12_g5_quarter, p12_g5_half, p12_g5_whole, p13_e2_quarter, p13_e2_half, p13_e2_whole, p13_f2_quarter, p13_f2_half, p13_f2_whole, p13_g2_quarter, p13_g2_half, p13_g2_whole, p13_a2_quarter, p13_a2_half, p13_a2_whole, p13_b2_quarter, p13_b2_half, p13_b2_whole, p13_c3_quarter, p13_c3_half, p13_c3_whole, p13_d3_quarter, p13_d3_half, p13_d3_whole, p13_e3_quarter, p13_e3_half, p13_e3_whole, p13_f3_quarter, p13_f3_half, p13_f3_whole, p13_g3_quarter, p13_g3_half, p13_g3_whole, p13_a3_quarter, p13_a3_half, p13_a3_whole, p13_b3_quarter, p13_b3_half, p13_b3_whole, p13_c4_quarter, p13_c4_half, p13_c4_whole, p13_d4_quarter, p13_d4_half, p13_d4_whole, p13_e4_quarter, p13_e4_half, p13_e4_whole, p13_f4_quarter, p13_f4_half, p13_f4_whole, p13_g4_quarter, p13_g4_half, p13_g4_whole, p13_a4_quarter, p13_a4_half, p13_a4_whole, p13_b4_quarter, p13_b4_half, p13_b4_whole, p13_c5_quarter, p13_c5_half, p13_c5_whole, p13_d5_quarter, p13_d5_half, p13_d5_whole, p13_e5_quarter, p13_e5_half, p13_e5_whole, p13_f5_quarter, p13_f5_half, p13_f5_whole, p13_g5_quarter, p13_g5_half, p13_g5_whole, p14_e2_quarter, p14_e2_half, p14_e2_whole, p14_f2_quarter, p14_f2_half, p14_f2_whole, p14_g2_quarter, p14_g2_half, p14_g2_whole, p14_a2_quarter, p14_a2_half, p14_a2_whole, p14_b2_quarter, p14_b2_half, p14_b2_whole, p14_c3_quarter, p14_c3_half, p14_c3_whole, p14_d3_quarter, p14_d3_half, p14_d3_whole, p14_e3_quarter, p14_e3_half, p14_e3_whole, p14_f3_quarter, p14_f3_half, p14_f3_whole, p14_g3_quarter, p14_g3_half, p14_g3_whole, p14_a3_quarter, p14_a3_half, p14_a3_whole, p14_b3_quarter, p14_b3_half, p14_b3_whole, p14_c4_quarter, p14_c4_half, p14_c4_whole, p14_d4_quarter, p14_d4_half, p14_d4_whole, p14_e4_quarter, p14_e4_half, p14_e4_whole, p14_f4_quarter, p14_f4_half, p14_f4_whole, p14_g4_quarter, p14_g4_half, p14_g4_whole, p14_a4_quarter, p14_a4_half, p14_a4_whole, p14_b4_quarter, p14_b4_half, p14_b4_whole, p14_c5_quarter, p14_c5_half, p14_c5_whole, p14_d5_quarter, p14_d5_half, p14_d5_whole, p14_e5_quarter, p14_e5_half, p14_e5_whole, p14_f5_quarter, p14_f5_half, p14_f5_whole, p14_g5_quarter, p14_g5_half, p14_g5_whole, p15_e2_quarter, p15_e2_half, p15_e2_whole, p15_f2_quarter, p15_f2_half, p15_f2_whole, p15_g2_quarter, p15_g2_half, p15_g2_whole, p15_a2_quarter, p15_a2_half, p15_a2_whole, p15_b2_quarter, p15_b2_half, p15_b2_whole, p15_c3_quarter, p15_c3_half, p15_c3_whole, p15_d3_quarter, p15_d3_half, p15_d3_whole, p15_e3_quarter, p15_e3_half, p15_e3_whole, p15_f3_quarter, p15_f3_half, p15_f3_whole, p15_g3_quarter, p15_g3_half, p15_g3_whole, p15_a3_quarter, p15_a3_half, p15_a3_whole, p15_b3_quarter, p15_b3_half, p15_b3_whole, p15_c4_quarter, p15_c4_half, p15_c4_whole, p15_d4_quarter, p15_d4_half, p15_d4_whole, p15_e4_quarter, p15_e4_half, p15_e4_whole, p15_f4_quarter, p15_f4_half, p15_f4_whole, p15_g4_quarter, p15_g4_half, p15_g4_whole, p15_a4_quarter, p15_a4_half, p15_a4_whole, p15_b4_quarter, p15_b4_half, p15_b4_whole, p15_c5_quarter, p15_c5_half, p15_c5_whole, p15_d5_quarter, p15_d5_half, p15_d5_whole, p15_e5_quarter, p15_e5_half, p15_e5_whole, p15_f5_quarter, p15_f5_half, p15_f5_whole, p15_g5_quarter, p15_g5_half, p15_g5_whole, p16_e2_quarter, p16_e2_half, p16_e2_whole, p16_f2_quarter, p16_f2_half, p16_f2_whole, p16_g2_quarter, p16_g2_half, p16_g2_whole, p16_a2_quarter, p16_a2_half, p16_a2_whole, p16_b2_quarter, p16_b2_half, p16_b2_whole, p16_c3_quarter, p16_c3_half, p16_c3_whole, p16_d3_quarter, p16_d3_half, p16_d3_whole, p16_e3_quarter, p16_e3_half, p16_e3_whole, p16_f3_quarter, p16_f3_half, p16_f3_whole, p16_g3_quarter, p16_g3_half, p16_g3_whole, p16_a3_quarter, p16_a3_half, p16_a3_whole, p16_b3_quarter, p16_b3_half, p16_b3_whole, p16_c4_quarter, p16_c4_half, p16_c4_whole, p16_d4_quarter, p16_d4_half, p16_d4_whole, p16_e4_quarter, p16_e4_half, p16_e4_whole, p16_f4_quarter, p16_f4_half, p16_f4_whole, p16_g4_quarter, p16_g4_half, p16_g4_whole, p16_a4_quarter, p16_a4_half, p16_a4_whole, p16_b4_quarter, p16_b4_half, p16_b4_whole, p16_c5_quarter, p16_c5_half, p16_c5_whole, p16_d5_quarter, p16_d5_half, p16_d5_whole, p16_e5_quarter, p16_e5_half, p16_e5_whole, p16_f5_quarter, p16_f5_half, p16_f5_whole, p16_g5_quarter, p16_g5_half, p16_g5_whole, p17_e2_quarter, p17_e2_half, p17_e2_whole, p17_f2_quarter, p17_f2_half, p17_f2_whole, p17_g2_quarter, p17_g2_half, p17_g2_whole, p17_a2_quarter, p17_a2_half, p17_a2_whole, p17_b2_quarter, p17_b2_half, p17_b2_whole, p17_c3_quarter, p17_c3_half, p17_c3_whole, p17_d3_quarter, p17_d3_half, p17_d3_whole, p17_e3_quarter, p17_e3_half, p17_e3_whole, p17_f3_quarter, p17_f3_half, p17_f3_whole, p17_g3_quarter, p17_g3_half, p17_g3_whole, p17_a3_quarter, p17_a3_half, p17_a3_whole, p17_b3_quarter, p17_b3_half, p17_b3_whole, p17_c4_quarter, p17_c4_half, p17_c4_whole, p17_d4_quarter, p17_d4_half, p17_d4_whole, p17_e4_quarter, p17_e4_half, p17_e4_whole, p17_f4_quarter, p17_f4_half, p17_f4_whole, p17_g4_quarter, p17_g4_half, p17_g4_whole, p17_a4_quarter, p17_a4_half, p17_a4_whole, p17_b4_quarter, p17_b4_half, p17_b4_whole, p17_c5_quarter, p17_c5_half, p17_c5_whole, p17_d5_quarter, p17_d5_half, p17_d5_whole, p17_e5_quarter, p17_e5_half, p17_e5_whole, p17_f5_quarter, p17_f5_half, p17_f5_whole, p17_g5_quarter, p17_g5_half, p17_g5_whole, p18_e2_quarter, p18_e2_half, p18_e2_whole, p18_f2_quarter, p18_f2_half, p18_f2_whole, p18_g2_quarter, p18_g2_half, p18_g2_whole, p18_a2_quarter, p18_a2_half, p18_a2_whole, p18_b2_quarter, p18_b2_half, p18_b2_whole, p18_c3_quarter, p18_c3_half, p18_c3_whole, p18_d3_quarter, p18_d3_half, p18_d3_whole, p18_e3_quarter, p18_e3_half, p18_e3_whole, p18_f3_quarter, p18_f3_half, p18_f3_whole, p18_g3_quarter, p18_g3_half, p18_g3_whole, p18_a3_quarter, p18_a3_half, p18_a3_whole, p18_b3_quarter, p18_b3_half, p18_b3_whole, p18_c4_quarter, p18_c4_half, p18_c4_whole, p18_d4_quarter, p18_d4_half, p18_d4_whole, p18_e4_quarter, p18_e4_half, p18_e4_whole, p18_f4_quarter, p18_f4_half, p18_f4_whole, p18_g4_quarter, p18_g4_half, p18_g4_whole, p18_a4_quarter, p18_a4_half, p18_a4_whole, p18_b4_quarter, p18_b4_half, p18_b4_whole, p18_c5_quarter, p18_c5_half, p18_c5_whole, p18_d5_quarter, p18_d5_half, p18_d5_whole, p18_e5_quarter, p18_e5_half, p18_e5_whole, p18_f5_quarter, p18_f5_half, p18_f5_whole, p18_g5_quarter, p18_g5_half, p18_g5_whole, p19_e2_quarter, p19_e2_half, p19_e2_whole, p19_f2_quarter, p19_f2_half, p19_f2_whole, p19_g2_quarter, p19_g2_half, p19_g2_whole, p19_a2_quarter, p19_a2_half, p19_a2_whole, p19_b2_quarter, p19_b2_half, p19_b2_whole, p19_c3_quarter, p19_c3_half, p19_c3_whole, p19_d3_quarter, p19_d3_half, p19_d3_whole, p19_e3_quarter, p19_e3_half, p19_e3_whole, p19_f3_quarter, p19_f3_half, p19_f3_whole, p19_g3_quarter, p19_g3_half, p19_g3_whole, p19_a3_quarter, p19_a3_half, p19_a3_whole, p19_b3_quarter, p19_b3_half, p19_b3_whole, p19_c4_quarter, p19_c4_half, p19_c4_whole, p19_d4_quarter, p19_d4_half, p19_d4_whole, p19_e4_quarter, p19_e4_half, p19_e4_whole, p19_f4_quarter, p19_f4_half, p19_f4_whole, p19_g4_quarter, p19_g4_half, p19_g4_whole, p19_a4_quarter, p19_a4_half, p19_a4_whole, p19_b4_quarter, p19_b4_half, p19_b4_whole, p19_c5_quarter, p19_c5_half, p19_c5_whole, p19_d5_quarter, p19_d5_half, p19_d5_whole, p19_e5_quarter, p19_e5_half, p19_e5_whole, p19_f5_quarter, p19_f5_half, p19_f5_whole, p19_g5_quarter, p19_g5_half, p19_g5_whole, p20_e2_quarter, p20_e2_half, p20_e2_whole, p20_f2_quarter, p20_f2_half, p20_f2_whole, p20_g2_quarter, p20_g2_half, p20_g2_whole, p20_a2_quarter, p20_a2_half, p20_a2_whole, p20_b2_quarter, p20_b2_half, p20_b2_whole, p20_c3_quarter, p20_c3_half, p20_c3_whole, p20_d3_quarter, p20_d3_half, p20_d3_whole, p20_e3_quarter, p20_e3_half, p20_e3_whole, p20_f3_quarter, p20_f3_half, p20_f3_whole, p20_g3_quarter, p20_g3_half, p20_g3_whole, p20_a3_quarter, p20_a3_half, p20_a3_whole, p20_b3_quarter, p20_b3_half, p20_b3_whole, p20_c4_quarter, p20_c4_half, p20_c4_whole, p20_d4_quarter, p20_d4_half, p20_d4_whole, p20_e4_quarter, p20_e4_half, p20_e4_whole, p20_f4_quarter, p20_f4_half, p20_f4_whole, p20_g4_quarter, p20_g4_half, p20_g4_whole, p20_a4_quarter, p20_a4_half, p20_a4_whole, p20_b4_quarter, p20_b4_half, p20_b4_whole, p20_c5_quarter, p20_c5_half, p20_c5_whole, p20_d5_quarter, p20_d5_half, p20_d5_whole, p20_e5_quarter, p20_e5_half, p20_e5_whole, p20_f5_quarter, p20_f5_half, p20_f5_whole, p20_g5_quarter, p20_g5_half, p20_g5_whole, p21_e2_quarter, p21_e2_half, p21_e2_whole, p21_f2_quarter, p21_f2_half, p21_f2_whole, p21_g2_quarter, p21_g2_half, p21_g2_whole, p21_a2_quarter, p21_a2_half, p21_a2_whole, p21_b2_quarter, p21_b2_half, p21_b2_whole, p21_c3_quarter, p21_c3_half, p21_c3_whole, p21_d3_quarter, p21_d3_half, p21_d3_whole, p21_e3_quarter, p21_e3_half, p21_e3_whole, p21_f3_quarter, p21_f3_half, p21_f3_whole, p21_g3_quarter, p21_g3_half, p21_g3_whole, p21_a3_quarter, p21_a3_half, p21_a3_whole, p21_b3_quarter, p21_b3_half, p21_b3_whole, p21_c4_quarter, p21_c4_half, p21_c4_whole, p21_d4_quarter, p21_d4_half, p21_d4_whole, p21_e4_quarter, p21_e4_half, p21_e4_whole, p21_f4_quarter, p21_f4_half, p21_f4_whole, p21_g4_quarter, p21_g4_half, p21_g4_whole, p21_a4_quarter, p21_a4_half, p21_a4_whole, p21_b4_quarter, p21_b4_half, p21_b4_whole, p21_c5_quarter, p21_c5_half, p21_c5_whole, p21_d5_quarter, p21_d5_half, p21_d5_whole, p21_e5_quarter, p21_e5_half, p21_e5_whole, p21_f5_quarter, p21_f5_half, p21_f5_whole, p21_g5_quarter, p21_g5_half, p21_g5_whole, p22_e2_quarter, p22_e2_half, p22_e2_whole, p22_f2_quarter, p22_f2_half, p22_f2_whole, p22_g2_quarter, p22_g2_half, p22_g2_whole, p22_a2_quarter, p22_a2_half, p22_a2_whole, p22_b2_quarter, p22_b2_half, p22_b2_whole, p22_c3_quarter, p22_c3_half, p22_c3_whole, p22_d3_quarter, p22_d3_half, p22_d3_whole, p22_e3_quarter, p22_e3_half, p22_e3_whole, p22_f3_quarter, p22_f3_half, p22_f3_whole, p22_g3_quarter, p22_g3_half, p22_g3_whole, p22_a3_quarter, p22_a3_half, p22_a3_whole, p22_b3_quarter, p22_b3_half, p22_b3_whole, p22_c4_quarter, p22_c4_half, p22_c4_whole, p22_d4_quarter, p22_d4_half, p22_d4_whole, p22_e4_quarter, p22_e4_half, p22_e4_whole, p22_f4_quarter, p22_f4_half, p22_f4_whole, p22_g4_quarter, p22_g4_half, p22_g4_whole, p22_a4_quarter, p22_a4_half, p22_a4_whole, p22_b4_quarter, p22_b4_half, p22_b4_whole, p22_c5_quarter, p22_c5_half, p22_c5_whole, p22_d5_quarter, p22_d5_half, p22_d5_whole, p22_e5_quarter, p22_e5_half, p22_e5_whole, p22_f5_quarter, p22_f5_half, p22_f5_whole, p22_g5_quarter, p22_g5_half, p22_g5_whole, p23_e2_quarter, p23_e2_half, p23_e2_whole, p23_f2_quarter, p23_f2_half, p23_f2_whole, p23_g2_quarter, p23_g2_half, p23_g2_whole, p23_a2_quarter, p23_a2_half, p23_a2_whole, p23_b2_quarter, p23_b2_half, p23_b2_whole, p23_c3_quarter, p23_c3_half, p23_c3_whole, p23_d3_quarter, p23_d3_half, p23_d3_whole, p23_e3_quarter, p23_e3_half, p23_e3_whole, p23_f3_quarter, p23_f3_half, p23_f3_whole, p23_g3_quarter, p23_g3_half, p23_g3_whole, p23_a3_quarter, p23_a3_half, p23_a3_whole, p23_b3_quarter, p23_b3_half, p23_b3_whole, p23_c4_quarter, p23_c4_half, p23_c4_whole, p23_d4_quarter, p23_d4_half, p23_d4_whole, p23_e4_quarter, p23_e4_half, p23_e4_whole, p23_f4_quarter, p23_f4_half, p23_f4_whole, p23_g4_quarter, p23_g4_half, p23_g4_whole, p23_a4_quarter, p23_a4_half, p23_a4_whole, p23_b4_quarter, p23_b4_half, p23_b4_whole, p23_c5_quarter, p23_c5_half, p23_c5_whole, p23_d5_quarter, p23_d5_half, p23_d5_whole, p23_e5_quarter, p23_e5_half, p23_e5_whole, p23_f5_quarter, p23_f5_half, p23_f5_whole, p23_g5_quarter, p23_g5_half, p23_g5_whole, p24_e2_quarter, p24_e2_half, p24_e2_whole, p24_f2_quarter, p24_f2_half, p24_f2_whole, p24_g2_quarter, p24_g2_half, p24_g2_whole, p24_a2_quarter, p24_a2_half, p24_a2_whole, p24_b2_quarter, p24_b2_half, p24_b2_whole, p24_c3_quarter, p24_c3_half, p24_c3_whole, p24_d3_quarter, p24_d3_half, p24_d3_whole, p24_e3_quarter, p24_e3_half, p24_e3_whole, p24_f3_quarter, p24_f3_half, p24_f3_whole, p24_g3_quarter, p24_g3_half, p24_g3_whole, p24_a3_quarter, p24_a3_half, p24_a3_whole, p24_b3_quarter, p24_b3_half, p24_b3_whole, p24_c4_quarter, p24_c4_half, p24_c4_whole, p24_d4_quarter, p24_d4_half, p24_d4_whole, p24_e4_quarter, p24_e4_half, p24_e4_whole, p24_f4_quarter, p24_f4_half, p24_f4_whole, p24_g4_quarter, p24_g4_half, p24_g4_whole, p24_a4_quarter, p24_a4_half, p24_a4_whole, p24_b4_quarter, p24_b4_half, p24_b4_whole, p24_c5_quarter, p24_c5_half, p24_c5_whole, p24_d5_quarter, p24_d5_half, p24_d5_whole, p24_e5_quarter, p24_e5_half, p24_e5_whole, p24_f5_quarter, p24_f5_half, p24_f5_whole, p24_g5_quarter, p24_g5_half, p24_g5_whole};

        // Create dictionary of notes with string keys
        int count = 0;
        for (int i = 1; i < 25; i++) {
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 3; k++) {
                    noteSheet.put("p" + i + "_" + noteTypes[j] + "_" + noteLengths[k], allNotes[count]);
                    count += 1;
                }
            }
        }

        // Set all notes to not visible
        for (ImageView note : allNotes) {
            note.setVisible(false);
        }

        // Validate input
        String[] inputNotes = txtFieldNotes.getText().split(" ");
        String regExPattern = "(e2|f2|g2|a2|b2|c3|d3|e3|f3|g3|a3|b3|c4|d4|e4|f4|g4|a4|b4|c5|d5|e5|f5|g5)[qhw]";
        String noteLength = "";
        int position = 1;

        for (int i=0; i < inputNotes.length; i++) {
            if (Objects.equals(inputNotes[i], ".")) {
                position += 1;
            }
            boolean matches = Pattern.matches(regExPattern, inputNotes[i]);
            if (matches) {
                if (inputNotes[i].charAt(2) == 'q') {
                    noteLength = "quarter";
                }
                if (inputNotes[i].charAt(2) == 'h') {
                    noteLength = "half";
                }
                if (inputNotes[i].charAt(2) == 'w') {
                    noteLength = "whole";
                }
                errorText.setText("");
                String note = "p" + (position) + "_" + inputNotes[i].substring(0,2) + "_" + noteLength;
                position += 1;
                noteSheet.get(note).setVisible(true);
            } else {
                errorText.setText("Error with: \"" + inputNotes[i] + "\". Please enter valid notation, see the help tab for more information.");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        homePage.setVisible(true);
        textInput.setVisible(false);
        helpPage.setVisible(false);

        noteTypes = new String[]{"e2", "f2", "g2", "a2", "b2", "c3", "d3", "e3", "f3", "g3", "a3", "b3", "c4", "d4", "e4", "f4", "g4", "a4", "b4", "c5", "d5", "e5", "f5", "g5"};
        noteLengths = new String[]{"quarter", "half", "whole"};
        allNotes = new ImageView[]{p1_e2_quarter, p1_e2_half, p1_e2_whole, p1_f2_quarter, p1_f2_half, p1_f2_whole, p1_g2_quarter, p1_g2_half, p1_g2_whole, p1_a2_quarter, p1_a2_half, p1_a2_whole, p1_b2_quarter, p1_b2_half, p1_b2_whole, p1_c3_quarter, p1_c3_half, p1_c3_whole, p1_d3_quarter, p1_d3_half, p1_d3_whole, p1_e3_quarter, p1_e3_half, p1_e3_whole, p1_f3_quarter, p1_f3_half, p1_f3_whole, p1_g3_quarter, p1_g3_half, p1_g3_whole, p1_a3_quarter, p1_a3_half, p1_a3_whole, p1_b3_quarter, p1_b3_half, p1_b3_whole, p1_c4_quarter, p1_c4_half, p1_c4_whole, p1_d4_quarter, p1_d4_half, p1_d4_whole, p1_e4_quarter, p1_e4_half, p1_e4_whole, p1_f4_quarter, p1_f4_half, p1_f4_whole, p1_g4_quarter, p1_g4_half, p1_g4_whole, p1_a4_quarter, p1_a4_half, p1_a4_whole, p1_b4_quarter, p1_b4_half, p1_b4_whole, p1_c5_quarter, p1_c5_half, p1_c5_whole, p1_d5_quarter, p1_d5_half, p1_d5_whole, p1_e5_quarter, p1_e5_half, p1_e5_whole, p1_f5_quarter, p1_f5_half, p1_f5_whole, p1_g5_quarter, p1_g5_half, p1_g5_whole, p2_e2_quarter, p2_e2_half, p2_e2_whole, p2_f2_quarter, p2_f2_half, p2_f2_whole, p2_g2_quarter, p2_g2_half, p2_g2_whole, p2_a2_quarter, p2_a2_half, p2_a2_whole, p2_b2_quarter, p2_b2_half, p2_b2_whole, p2_c3_quarter, p2_c3_half, p2_c3_whole, p2_d3_quarter, p2_d3_half, p2_d3_whole, p2_e3_quarter, p2_e3_half, p2_e3_whole, p2_f3_quarter, p2_f3_half, p2_f3_whole, p2_g3_quarter, p2_g3_half, p2_g3_whole, p2_a3_quarter, p2_a3_half, p2_a3_whole, p2_b3_quarter, p2_b3_half, p2_b3_whole, p2_c4_quarter, p2_c4_half, p2_c4_whole, p2_d4_quarter, p2_d4_half, p2_d4_whole, p2_e4_quarter, p2_e4_half, p2_e4_whole, p2_f4_quarter, p2_f4_half, p2_f4_whole, p2_g4_quarter, p2_g4_half, p2_g4_whole, p2_a4_quarter, p2_a4_half, p2_a4_whole, p2_b4_quarter, p2_b4_half, p2_b4_whole, p2_c5_quarter, p2_c5_half, p2_c5_whole, p2_d5_quarter, p2_d5_half, p2_d5_whole, p2_e5_quarter, p2_e5_half, p2_e5_whole, p2_f5_quarter, p2_f5_half, p2_f5_whole, p2_g5_quarter, p2_g5_half, p2_g5_whole, p3_e2_quarter, p3_e2_half, p3_e2_whole, p3_f2_quarter, p3_f2_half, p3_f2_whole, p3_g2_quarter, p3_g2_half, p3_g2_whole, p3_a2_quarter, p3_a2_half, p3_a2_whole, p3_b2_quarter, p3_b2_half, p3_b2_whole, p3_c3_quarter, p3_c3_half, p3_c3_whole, p3_d3_quarter, p3_d3_half, p3_d3_whole, p3_e3_quarter, p3_e3_half, p3_e3_whole, p3_f3_quarter, p3_f3_half, p3_f3_whole, p3_g3_quarter, p3_g3_half, p3_g3_whole, p3_a3_quarter, p3_a3_half, p3_a3_whole, p3_b3_quarter, p3_b3_half, p3_b3_whole, p3_c4_quarter, p3_c4_half, p3_c4_whole, p3_d4_quarter, p3_d4_half, p3_d4_whole, p3_e4_quarter, p3_e4_half, p3_e4_whole, p3_f4_quarter, p3_f4_half, p3_f4_whole, p3_g4_quarter, p3_g4_half, p3_g4_whole, p3_a4_quarter, p3_a4_half, p3_a4_whole, p3_b4_quarter, p3_b4_half, p3_b4_whole, p3_c5_quarter, p3_c5_half, p3_c5_whole, p3_d5_quarter, p3_d5_half, p3_d5_whole, p3_e5_quarter, p3_e5_half, p3_e5_whole, p3_f5_quarter, p3_f5_half, p3_f5_whole, p3_g5_quarter, p3_g5_half, p3_g5_whole, p4_e2_quarter, p4_e2_half, p4_e2_whole, p4_f2_quarter, p4_f2_half, p4_f2_whole, p4_g2_quarter, p4_g2_half, p4_g2_whole, p4_a2_quarter, p4_a2_half, p4_a2_whole, p4_b2_quarter, p4_b2_half, p4_b2_whole, p4_c3_quarter, p4_c3_half, p4_c3_whole, p4_d3_quarter, p4_d3_half, p4_d3_whole, p4_e3_quarter, p4_e3_half, p4_e3_whole, p4_f3_quarter, p4_f3_half, p4_f3_whole, p4_g3_quarter, p4_g3_half, p4_g3_whole, p4_a3_quarter, p4_a3_half, p4_a3_whole, p4_b3_quarter, p4_b3_half, p4_b3_whole, p4_c4_quarter, p4_c4_half, p4_c4_whole, p4_d4_quarter, p4_d4_half, p4_d4_whole, p4_e4_quarter, p4_e4_half, p4_e4_whole, p4_f4_quarter, p4_f4_half, p4_f4_whole, p4_g4_quarter, p4_g4_half, p4_g4_whole, p4_a4_quarter, p4_a4_half, p4_a4_whole, p4_b4_quarter, p4_b4_half, p4_b4_whole, p4_c5_quarter, p4_c5_half, p4_c5_whole, p4_d5_quarter, p4_d5_half, p4_d5_whole, p4_e5_quarter, p4_e5_half, p4_e5_whole, p4_f5_quarter, p4_f5_half, p4_f5_whole, p4_g5_quarter, p4_g5_half, p4_g5_whole, p5_e2_quarter, p5_e2_half, p5_e2_whole, p5_f2_quarter, p5_f2_half, p5_f2_whole, p5_g2_quarter, p5_g2_half, p5_g2_whole, p5_a2_quarter, p5_a2_half, p5_a2_whole, p5_b2_quarter, p5_b2_half, p5_b2_whole, p5_c3_quarter, p5_c3_half, p5_c3_whole, p5_d3_quarter, p5_d3_half, p5_d3_whole, p5_e3_quarter, p5_e3_half, p5_e3_whole, p5_f3_quarter, p5_f3_half, p5_f3_whole, p5_g3_quarter, p5_g3_half, p5_g3_whole, p5_a3_quarter, p5_a3_half, p5_a3_whole, p5_b3_quarter, p5_b3_half, p5_b3_whole, p5_c4_quarter, p5_c4_half, p5_c4_whole, p5_d4_quarter, p5_d4_half, p5_d4_whole, p5_e4_quarter, p5_e4_half, p5_e4_whole, p5_f4_quarter, p5_f4_half, p5_f4_whole, p5_g4_quarter, p5_g4_half, p5_g4_whole, p5_a4_quarter, p5_a4_half, p5_a4_whole, p5_b4_quarter, p5_b4_half, p5_b4_whole, p5_c5_quarter, p5_c5_half, p5_c5_whole, p5_d5_quarter, p5_d5_half, p5_d5_whole, p5_e5_quarter, p5_e5_half, p5_e5_whole, p5_f5_quarter, p5_f5_half, p5_f5_whole, p5_g5_quarter, p5_g5_half, p5_g5_whole, p6_e2_quarter, p6_e2_half, p6_e2_whole, p6_f2_quarter, p6_f2_half, p6_f2_whole, p6_g2_quarter, p6_g2_half, p6_g2_whole, p6_a2_quarter, p6_a2_half, p6_a2_whole, p6_b2_quarter, p6_b2_half, p6_b2_whole, p6_c3_quarter, p6_c3_half, p6_c3_whole, p6_d3_quarter, p6_d3_half, p6_d3_whole, p6_e3_quarter, p6_e3_half, p6_e3_whole, p6_f3_quarter, p6_f3_half, p6_f3_whole, p6_g3_quarter, p6_g3_half, p6_g3_whole, p6_a3_quarter, p6_a3_half, p6_a3_whole, p6_b3_quarter, p6_b3_half, p6_b3_whole, p6_c4_quarter, p6_c4_half, p6_c4_whole, p6_d4_quarter, p6_d4_half, p6_d4_whole, p6_e4_quarter, p6_e4_half, p6_e4_whole, p6_f4_quarter, p6_f4_half, p6_f4_whole, p6_g4_quarter, p6_g4_half, p6_g4_whole, p6_a4_quarter, p6_a4_half, p6_a4_whole, p6_b4_quarter, p6_b4_half, p6_b4_whole, p6_c5_quarter, p6_c5_half, p6_c5_whole, p6_d5_quarter, p6_d5_half, p6_d5_whole, p6_e5_quarter, p6_e5_half, p6_e5_whole, p6_f5_quarter, p6_f5_half, p6_f5_whole, p6_g5_quarter, p6_g5_half, p6_g5_whole, p7_e2_quarter, p7_e2_half, p7_e2_whole, p7_f2_quarter, p7_f2_half, p7_f2_whole, p7_g2_quarter, p7_g2_half, p7_g2_whole, p7_a2_quarter, p7_a2_half, p7_a2_whole, p7_b2_quarter, p7_b2_half, p7_b2_whole, p7_c3_quarter, p7_c3_half, p7_c3_whole, p7_d3_quarter, p7_d3_half, p7_d3_whole, p7_e3_quarter, p7_e3_half, p7_e3_whole, p7_f3_quarter, p7_f3_half, p7_f3_whole, p7_g3_quarter, p7_g3_half, p7_g3_whole, p7_a3_quarter, p7_a3_half, p7_a3_whole, p7_b3_quarter, p7_b3_half, p7_b3_whole, p7_c4_quarter, p7_c4_half, p7_c4_whole, p7_d4_quarter, p7_d4_half, p7_d4_whole, p7_e4_quarter, p7_e4_half, p7_e4_whole, p7_f4_quarter, p7_f4_half, p7_f4_whole, p7_g4_quarter, p7_g4_half, p7_g4_whole, p7_a4_quarter, p7_a4_half, p7_a4_whole, p7_b4_quarter, p7_b4_half, p7_b4_whole, p7_c5_quarter, p7_c5_half, p7_c5_whole, p7_d5_quarter, p7_d5_half, p7_d5_whole, p7_e5_quarter, p7_e5_half, p7_e5_whole, p7_f5_quarter, p7_f5_half, p7_f5_whole, p7_g5_quarter, p7_g5_half, p7_g5_whole, p8_e2_quarter, p8_e2_half, p8_e2_whole, p8_f2_quarter, p8_f2_half, p8_f2_whole, p8_g2_quarter, p8_g2_half, p8_g2_whole, p8_a2_quarter, p8_a2_half, p8_a2_whole, p8_b2_quarter, p8_b2_half, p8_b2_whole, p8_c3_quarter, p8_c3_half, p8_c3_whole, p8_d3_quarter, p8_d3_half, p8_d3_whole, p8_e3_quarter, p8_e3_half, p8_e3_whole, p8_f3_quarter, p8_f3_half, p8_f3_whole, p8_g3_quarter, p8_g3_half, p8_g3_whole, p8_a3_quarter, p8_a3_half, p8_a3_whole, p8_b3_quarter, p8_b3_half, p8_b3_whole, p8_c4_quarter, p8_c4_half, p8_c4_whole, p8_d4_quarter, p8_d4_half, p8_d4_whole, p8_e4_quarter, p8_e4_half, p8_e4_whole, p8_f4_quarter, p8_f4_half, p8_f4_whole, p8_g4_quarter, p8_g4_half, p8_g4_whole, p8_a4_quarter, p8_a4_half, p8_a4_whole, p8_b4_quarter, p8_b4_half, p8_b4_whole, p8_c5_quarter, p8_c5_half, p8_c5_whole, p8_d5_quarter, p8_d5_half, p8_d5_whole, p8_e5_quarter, p8_e5_half, p8_e5_whole, p8_f5_quarter, p8_f5_half, p8_f5_whole, p8_g5_quarter, p8_g5_half, p8_g5_whole, p9_e2_quarter, p9_e2_half, p9_e2_whole, p9_f2_quarter, p9_f2_half, p9_f2_whole, p9_g2_quarter, p9_g2_half, p9_g2_whole, p9_a2_quarter, p9_a2_half, p9_a2_whole, p9_b2_quarter, p9_b2_half, p9_b2_whole, p9_c3_quarter, p9_c3_half, p9_c3_whole, p9_d3_quarter, p9_d3_half, p9_d3_whole, p9_e3_quarter, p9_e3_half, p9_e3_whole, p9_f3_quarter, p9_f3_half, p9_f3_whole, p9_g3_quarter, p9_g3_half, p9_g3_whole, p9_a3_quarter, p9_a3_half, p9_a3_whole, p9_b3_quarter, p9_b3_half, p9_b3_whole, p9_c4_quarter, p9_c4_half, p9_c4_whole, p9_d4_quarter, p9_d4_half, p9_d4_whole, p9_e4_quarter, p9_e4_half, p9_e4_whole, p9_f4_quarter, p9_f4_half, p9_f4_whole, p9_g4_quarter, p9_g4_half, p9_g4_whole, p9_a4_quarter, p9_a4_half, p9_a4_whole, p9_b4_quarter, p9_b4_half, p9_b4_whole, p9_c5_quarter, p9_c5_half, p9_c5_whole, p9_d5_quarter, p9_d5_half, p9_d5_whole, p9_e5_quarter, p9_e5_half, p9_e5_whole, p9_f5_quarter, p9_f5_half, p9_f5_whole, p9_g5_quarter, p9_g5_half, p9_g5_whole, p10_e2_quarter, p10_e2_half, p10_e2_whole, p10_f2_quarter, p10_f2_half, p10_f2_whole, p10_g2_quarter, p10_g2_half, p10_g2_whole, p10_a2_quarter, p10_a2_half, p10_a2_whole, p10_b2_quarter, p10_b2_half, p10_b2_whole, p10_c3_quarter, p10_c3_half, p10_c3_whole, p10_d3_quarter, p10_d3_half, p10_d3_whole, p10_e3_quarter, p10_e3_half, p10_e3_whole, p10_f3_quarter, p10_f3_half, p10_f3_whole, p10_g3_quarter, p10_g3_half, p10_g3_whole, p10_a3_quarter, p10_a3_half, p10_a3_whole, p10_b3_quarter, p10_b3_half, p10_b3_whole, p10_c4_quarter, p10_c4_half, p10_c4_whole, p10_d4_quarter, p10_d4_half, p10_d4_whole, p10_e4_quarter, p10_e4_half, p10_e4_whole, p10_f4_quarter, p10_f4_half, p10_f4_whole, p10_g4_quarter, p10_g4_half, p10_g4_whole, p10_a4_quarter, p10_a4_half, p10_a4_whole, p10_b4_quarter, p10_b4_half, p10_b4_whole, p10_c5_quarter, p10_c5_half, p10_c5_whole, p10_d5_quarter, p10_d5_half, p10_d5_whole, p10_e5_quarter, p10_e5_half, p10_e5_whole, p10_f5_quarter, p10_f5_half, p10_f5_whole, p10_g5_quarter, p10_g5_half, p10_g5_whole, p11_e2_quarter, p11_e2_half, p11_e2_whole, p11_f2_quarter, p11_f2_half, p11_f2_whole, p11_g2_quarter, p11_g2_half, p11_g2_whole, p11_a2_quarter, p11_a2_half, p11_a2_whole, p11_b2_quarter, p11_b2_half, p11_b2_whole, p11_c3_quarter, p11_c3_half, p11_c3_whole, p11_d3_quarter, p11_d3_half, p11_d3_whole, p11_e3_quarter, p11_e3_half, p11_e3_whole, p11_f3_quarter, p11_f3_half, p11_f3_whole, p11_g3_quarter, p11_g3_half, p11_g3_whole, p11_a3_quarter, p11_a3_half, p11_a3_whole, p11_b3_quarter, p11_b3_half, p11_b3_whole, p11_c4_quarter, p11_c4_half, p11_c4_whole, p11_d4_quarter, p11_d4_half, p11_d4_whole, p11_e4_quarter, p11_e4_half, p11_e4_whole, p11_f4_quarter, p11_f4_half, p11_f4_whole, p11_g4_quarter, p11_g4_half, p11_g4_whole, p11_a4_quarter, p11_a4_half, p11_a4_whole, p11_b4_quarter, p11_b4_half, p11_b4_whole, p11_c5_quarter, p11_c5_half, p11_c5_whole, p11_d5_quarter, p11_d5_half, p11_d5_whole, p11_e5_quarter, p11_e5_half, p11_e5_whole, p11_f5_quarter, p11_f5_half, p11_f5_whole, p11_g5_quarter, p11_g5_half, p11_g5_whole, p12_e2_quarter, p12_e2_half, p12_e2_whole, p12_f2_quarter, p12_f2_half, p12_f2_whole, p12_g2_quarter, p12_g2_half, p12_g2_whole, p12_a2_quarter, p12_a2_half, p12_a2_whole, p12_b2_quarter, p12_b2_half, p12_b2_whole, p12_c3_quarter, p12_c3_half, p12_c3_whole, p12_d3_quarter, p12_d3_half, p12_d3_whole, p12_e3_quarter, p12_e3_half, p12_e3_whole, p12_f3_quarter, p12_f3_half, p12_f3_whole, p12_g3_quarter, p12_g3_half, p12_g3_whole, p12_a3_quarter, p12_a3_half, p12_a3_whole, p12_b3_quarter, p12_b3_half, p12_b3_whole, p12_c4_quarter, p12_c4_half, p12_c4_whole, p12_d4_quarter, p12_d4_half, p12_d4_whole, p12_e4_quarter, p12_e4_half, p12_e4_whole, p12_f4_quarter, p12_f4_half, p12_f4_whole, p12_g4_quarter, p12_g4_half, p12_g4_whole, p12_a4_quarter, p12_a4_half, p12_a4_whole, p12_b4_quarter, p12_b4_half, p12_b4_whole, p12_c5_quarter, p12_c5_half, p12_c5_whole, p12_d5_quarter, p12_d5_half, p12_d5_whole, p12_e5_quarter, p12_e5_half, p12_e5_whole, p12_f5_quarter, p12_f5_half, p12_f5_whole, p12_g5_quarter, p12_g5_half, p12_g5_whole, p13_e2_quarter, p13_e2_half, p13_e2_whole, p13_f2_quarter, p13_f2_half, p13_f2_whole, p13_g2_quarter, p13_g2_half, p13_g2_whole, p13_a2_quarter, p13_a2_half, p13_a2_whole, p13_b2_quarter, p13_b2_half, p13_b2_whole, p13_c3_quarter, p13_c3_half, p13_c3_whole, p13_d3_quarter, p13_d3_half, p13_d3_whole, p13_e3_quarter, p13_e3_half, p13_e3_whole, p13_f3_quarter, p13_f3_half, p13_f3_whole, p13_g3_quarter, p13_g3_half, p13_g3_whole, p13_a3_quarter, p13_a3_half, p13_a3_whole, p13_b3_quarter, p13_b3_half, p13_b3_whole, p13_c4_quarter, p13_c4_half, p13_c4_whole, p13_d4_quarter, p13_d4_half, p13_d4_whole, p13_e4_quarter, p13_e4_half, p13_e4_whole, p13_f4_quarter, p13_f4_half, p13_f4_whole, p13_g4_quarter, p13_g4_half, p13_g4_whole, p13_a4_quarter, p13_a4_half, p13_a4_whole, p13_b4_quarter, p13_b4_half, p13_b4_whole, p13_c5_quarter, p13_c5_half, p13_c5_whole, p13_d5_quarter, p13_d5_half, p13_d5_whole, p13_e5_quarter, p13_e5_half, p13_e5_whole, p13_f5_quarter, p13_f5_half, p13_f5_whole, p13_g5_quarter, p13_g5_half, p13_g5_whole, p14_e2_quarter, p14_e2_half, p14_e2_whole, p14_f2_quarter, p14_f2_half, p14_f2_whole, p14_g2_quarter, p14_g2_half, p14_g2_whole, p14_a2_quarter, p14_a2_half, p14_a2_whole, p14_b2_quarter, p14_b2_half, p14_b2_whole, p14_c3_quarter, p14_c3_half, p14_c3_whole, p14_d3_quarter, p14_d3_half, p14_d3_whole, p14_e3_quarter, p14_e3_half, p14_e3_whole, p14_f3_quarter, p14_f3_half, p14_f3_whole, p14_g3_quarter, p14_g3_half, p14_g3_whole, p14_a3_quarter, p14_a3_half, p14_a3_whole, p14_b3_quarter, p14_b3_half, p14_b3_whole, p14_c4_quarter, p14_c4_half, p14_c4_whole, p14_d4_quarter, p14_d4_half, p14_d4_whole, p14_e4_quarter, p14_e4_half, p14_e4_whole, p14_f4_quarter, p14_f4_half, p14_f4_whole, p14_g4_quarter, p14_g4_half, p14_g4_whole, p14_a4_quarter, p14_a4_half, p14_a4_whole, p14_b4_quarter, p14_b4_half, p14_b4_whole, p14_c5_quarter, p14_c5_half, p14_c5_whole, p14_d5_quarter, p14_d5_half, p14_d5_whole, p14_e5_quarter, p14_e5_half, p14_e5_whole, p14_f5_quarter, p14_f5_half, p14_f5_whole, p14_g5_quarter, p14_g5_half, p14_g5_whole, p15_e2_quarter, p15_e2_half, p15_e2_whole, p15_f2_quarter, p15_f2_half, p15_f2_whole, p15_g2_quarter, p15_g2_half, p15_g2_whole, p15_a2_quarter, p15_a2_half, p15_a2_whole, p15_b2_quarter, p15_b2_half, p15_b2_whole, p15_c3_quarter, p15_c3_half, p15_c3_whole, p15_d3_quarter, p15_d3_half, p15_d3_whole, p15_e3_quarter, p15_e3_half, p15_e3_whole, p15_f3_quarter, p15_f3_half, p15_f3_whole, p15_g3_quarter, p15_g3_half, p15_g3_whole, p15_a3_quarter, p15_a3_half, p15_a3_whole, p15_b3_quarter, p15_b3_half, p15_b3_whole, p15_c4_quarter, p15_c4_half, p15_c4_whole, p15_d4_quarter, p15_d4_half, p15_d4_whole, p15_e4_quarter, p15_e4_half, p15_e4_whole, p15_f4_quarter, p15_f4_half, p15_f4_whole, p15_g4_quarter, p15_g4_half, p15_g4_whole, p15_a4_quarter, p15_a4_half, p15_a4_whole, p15_b4_quarter, p15_b4_half, p15_b4_whole, p15_c5_quarter, p15_c5_half, p15_c5_whole, p15_d5_quarter, p15_d5_half, p15_d5_whole, p15_e5_quarter, p15_e5_half, p15_e5_whole, p15_f5_quarter, p15_f5_half, p15_f5_whole, p15_g5_quarter, p15_g5_half, p15_g5_whole, p16_e2_quarter, p16_e2_half, p16_e2_whole, p16_f2_quarter, p16_f2_half, p16_f2_whole, p16_g2_quarter, p16_g2_half, p16_g2_whole, p16_a2_quarter, p16_a2_half, p16_a2_whole, p16_b2_quarter, p16_b2_half, p16_b2_whole, p16_c3_quarter, p16_c3_half, p16_c3_whole, p16_d3_quarter, p16_d3_half, p16_d3_whole, p16_e3_quarter, p16_e3_half, p16_e3_whole, p16_f3_quarter, p16_f3_half, p16_f3_whole, p16_g3_quarter, p16_g3_half, p16_g3_whole, p16_a3_quarter, p16_a3_half, p16_a3_whole, p16_b3_quarter, p16_b3_half, p16_b3_whole, p16_c4_quarter, p16_c4_half, p16_c4_whole, p16_d4_quarter, p16_d4_half, p16_d4_whole, p16_e4_quarter, p16_e4_half, p16_e4_whole, p16_f4_quarter, p16_f4_half, p16_f4_whole, p16_g4_quarter, p16_g4_half, p16_g4_whole, p16_a4_quarter, p16_a4_half, p16_a4_whole, p16_b4_quarter, p16_b4_half, p16_b4_whole, p16_c5_quarter, p16_c5_half, p16_c5_whole, p16_d5_quarter, p16_d5_half, p16_d5_whole, p16_e5_quarter, p16_e5_half, p16_e5_whole, p16_f5_quarter, p16_f5_half, p16_f5_whole, p16_g5_quarter, p16_g5_half, p16_g5_whole, p17_e2_quarter, p17_e2_half, p17_e2_whole, p17_f2_quarter, p17_f2_half, p17_f2_whole, p17_g2_quarter, p17_g2_half, p17_g2_whole, p17_a2_quarter, p17_a2_half, p17_a2_whole, p17_b2_quarter, p17_b2_half, p17_b2_whole, p17_c3_quarter, p17_c3_half, p17_c3_whole, p17_d3_quarter, p17_d3_half, p17_d3_whole, p17_e3_quarter, p17_e3_half, p17_e3_whole, p17_f3_quarter, p17_f3_half, p17_f3_whole, p17_g3_quarter, p17_g3_half, p17_g3_whole, p17_a3_quarter, p17_a3_half, p17_a3_whole, p17_b3_quarter, p17_b3_half, p17_b3_whole, p17_c4_quarter, p17_c4_half, p17_c4_whole, p17_d4_quarter, p17_d4_half, p17_d4_whole, p17_e4_quarter, p17_e4_half, p17_e4_whole, p17_f4_quarter, p17_f4_half, p17_f4_whole, p17_g4_quarter, p17_g4_half, p17_g4_whole, p17_a4_quarter, p17_a4_half, p17_a4_whole, p17_b4_quarter, p17_b4_half, p17_b4_whole, p17_c5_quarter, p17_c5_half, p17_c5_whole, p17_d5_quarter, p17_d5_half, p17_d5_whole, p17_e5_quarter, p17_e5_half, p17_e5_whole, p17_f5_quarter, p17_f5_half, p17_f5_whole, p17_g5_quarter, p17_g5_half, p17_g5_whole, p18_e2_quarter, p18_e2_half, p18_e2_whole, p18_f2_quarter, p18_f2_half, p18_f2_whole, p18_g2_quarter, p18_g2_half, p18_g2_whole, p18_a2_quarter, p18_a2_half, p18_a2_whole, p18_b2_quarter, p18_b2_half, p18_b2_whole, p18_c3_quarter, p18_c3_half, p18_c3_whole, p18_d3_quarter, p18_d3_half, p18_d3_whole, p18_e3_quarter, p18_e3_half, p18_e3_whole, p18_f3_quarter, p18_f3_half, p18_f3_whole, p18_g3_quarter, p18_g3_half, p18_g3_whole, p18_a3_quarter, p18_a3_half, p18_a3_whole, p18_b3_quarter, p18_b3_half, p18_b3_whole, p18_c4_quarter, p18_c4_half, p18_c4_whole, p18_d4_quarter, p18_d4_half, p18_d4_whole, p18_e4_quarter, p18_e4_half, p18_e4_whole, p18_f4_quarter, p18_f4_half, p18_f4_whole, p18_g4_quarter, p18_g4_half, p18_g4_whole, p18_a4_quarter, p18_a4_half, p18_a4_whole, p18_b4_quarter, p18_b4_half, p18_b4_whole, p18_c5_quarter, p18_c5_half, p18_c5_whole, p18_d5_quarter, p18_d5_half, p18_d5_whole, p18_e5_quarter, p18_e5_half, p18_e5_whole, p18_f5_quarter, p18_f5_half, p18_f5_whole, p18_g5_quarter, p18_g5_half, p18_g5_whole, p19_e2_quarter, p19_e2_half, p19_e2_whole, p19_f2_quarter, p19_f2_half, p19_f2_whole, p19_g2_quarter, p19_g2_half, p19_g2_whole, p19_a2_quarter, p19_a2_half, p19_a2_whole, p19_b2_quarter, p19_b2_half, p19_b2_whole, p19_c3_quarter, p19_c3_half, p19_c3_whole, p19_d3_quarter, p19_d3_half, p19_d3_whole, p19_e3_quarter, p19_e3_half, p19_e3_whole, p19_f3_quarter, p19_f3_half, p19_f3_whole, p19_g3_quarter, p19_g3_half, p19_g3_whole, p19_a3_quarter, p19_a3_half, p19_a3_whole, p19_b3_quarter, p19_b3_half, p19_b3_whole, p19_c4_quarter, p19_c4_half, p19_c4_whole, p19_d4_quarter, p19_d4_half, p19_d4_whole, p19_e4_quarter, p19_e4_half, p19_e4_whole, p19_f4_quarter, p19_f4_half, p19_f4_whole, p19_g4_quarter, p19_g4_half, p19_g4_whole, p19_a4_quarter, p19_a4_half, p19_a4_whole, p19_b4_quarter, p19_b4_half, p19_b4_whole, p19_c5_quarter, p19_c5_half, p19_c5_whole, p19_d5_quarter, p19_d5_half, p19_d5_whole, p19_e5_quarter, p19_e5_half, p19_e5_whole, p19_f5_quarter, p19_f5_half, p19_f5_whole, p19_g5_quarter, p19_g5_half, p19_g5_whole, p20_e2_quarter, p20_e2_half, p20_e2_whole, p20_f2_quarter, p20_f2_half, p20_f2_whole, p20_g2_quarter, p20_g2_half, p20_g2_whole, p20_a2_quarter, p20_a2_half, p20_a2_whole, p20_b2_quarter, p20_b2_half, p20_b2_whole, p20_c3_quarter, p20_c3_half, p20_c3_whole, p20_d3_quarter, p20_d3_half, p20_d3_whole, p20_e3_quarter, p20_e3_half, p20_e3_whole, p20_f3_quarter, p20_f3_half, p20_f3_whole, p20_g3_quarter, p20_g3_half, p20_g3_whole, p20_a3_quarter, p20_a3_half, p20_a3_whole, p20_b3_quarter, p20_b3_half, p20_b3_whole, p20_c4_quarter, p20_c4_half, p20_c4_whole, p20_d4_quarter, p20_d4_half, p20_d4_whole, p20_e4_quarter, p20_e4_half, p20_e4_whole, p20_f4_quarter, p20_f4_half, p20_f4_whole, p20_g4_quarter, p20_g4_half, p20_g4_whole, p20_a4_quarter, p20_a4_half, p20_a4_whole, p20_b4_quarter, p20_b4_half, p20_b4_whole, p20_c5_quarter, p20_c5_half, p20_c5_whole, p20_d5_quarter, p20_d5_half, p20_d5_whole, p20_e5_quarter, p20_e5_half, p20_e5_whole, p20_f5_quarter, p20_f5_half, p20_f5_whole, p20_g5_quarter, p20_g5_half, p20_g5_whole, p21_e2_quarter, p21_e2_half, p21_e2_whole, p21_f2_quarter, p21_f2_half, p21_f2_whole, p21_g2_quarter, p21_g2_half, p21_g2_whole, p21_a2_quarter, p21_a2_half, p21_a2_whole, p21_b2_quarter, p21_b2_half, p21_b2_whole, p21_c3_quarter, p21_c3_half, p21_c3_whole, p21_d3_quarter, p21_d3_half, p21_d3_whole, p21_e3_quarter, p21_e3_half, p21_e3_whole, p21_f3_quarter, p21_f3_half, p21_f3_whole, p21_g3_quarter, p21_g3_half, p21_g3_whole, p21_a3_quarter, p21_a3_half, p21_a3_whole, p21_b3_quarter, p21_b3_half, p21_b3_whole, p21_c4_quarter, p21_c4_half, p21_c4_whole, p21_d4_quarter, p21_d4_half, p21_d4_whole, p21_e4_quarter, p21_e4_half, p21_e4_whole, p21_f4_quarter, p21_f4_half, p21_f4_whole, p21_g4_quarter, p21_g4_half, p21_g4_whole, p21_a4_quarter, p21_a4_half, p21_a4_whole, p21_b4_quarter, p21_b4_half, p21_b4_whole, p21_c5_quarter, p21_c5_half, p21_c5_whole, p21_d5_quarter, p21_d5_half, p21_d5_whole, p21_e5_quarter, p21_e5_half, p21_e5_whole, p21_f5_quarter, p21_f5_half, p21_f5_whole, p21_g5_quarter, p21_g5_half, p21_g5_whole, p22_e2_quarter, p22_e2_half, p22_e2_whole, p22_f2_quarter, p22_f2_half, p22_f2_whole, p22_g2_quarter, p22_g2_half, p22_g2_whole, p22_a2_quarter, p22_a2_half, p22_a2_whole, p22_b2_quarter, p22_b2_half, p22_b2_whole, p22_c3_quarter, p22_c3_half, p22_c3_whole, p22_d3_quarter, p22_d3_half, p22_d3_whole, p22_e3_quarter, p22_e3_half, p22_e3_whole, p22_f3_quarter, p22_f3_half, p22_f3_whole, p22_g3_quarter, p22_g3_half, p22_g3_whole, p22_a3_quarter, p22_a3_half, p22_a3_whole, p22_b3_quarter, p22_b3_half, p22_b3_whole, p22_c4_quarter, p22_c4_half, p22_c4_whole, p22_d4_quarter, p22_d4_half, p22_d4_whole, p22_e4_quarter, p22_e4_half, p22_e4_whole, p22_f4_quarter, p22_f4_half, p22_f4_whole, p22_g4_quarter, p22_g4_half, p22_g4_whole, p22_a4_quarter, p22_a4_half, p22_a4_whole, p22_b4_quarter, p22_b4_half, p22_b4_whole, p22_c5_quarter, p22_c5_half, p22_c5_whole, p22_d5_quarter, p22_d5_half, p22_d5_whole, p22_e5_quarter, p22_e5_half, p22_e5_whole, p22_f5_quarter, p22_f5_half, p22_f5_whole, p22_g5_quarter, p22_g5_half, p22_g5_whole, p23_e2_quarter, p23_e2_half, p23_e2_whole, p23_f2_quarter, p23_f2_half, p23_f2_whole, p23_g2_quarter, p23_g2_half, p23_g2_whole, p23_a2_quarter, p23_a2_half, p23_a2_whole, p23_b2_quarter, p23_b2_half, p23_b2_whole, p23_c3_quarter, p23_c3_half, p23_c3_whole, p23_d3_quarter, p23_d3_half, p23_d3_whole, p23_e3_quarter, p23_e3_half, p23_e3_whole, p23_f3_quarter, p23_f3_half, p23_f3_whole, p23_g3_quarter, p23_g3_half, p23_g3_whole, p23_a3_quarter, p23_a3_half, p23_a3_whole, p23_b3_quarter, p23_b3_half, p23_b3_whole, p23_c4_quarter, p23_c4_half, p23_c4_whole, p23_d4_quarter, p23_d4_half, p23_d4_whole, p23_e4_quarter, p23_e4_half, p23_e4_whole, p23_f4_quarter, p23_f4_half, p23_f4_whole, p23_g4_quarter, p23_g4_half, p23_g4_whole, p23_a4_quarter, p23_a4_half, p23_a4_whole, p23_b4_quarter, p23_b4_half, p23_b4_whole, p23_c5_quarter, p23_c5_half, p23_c5_whole, p23_d5_quarter, p23_d5_half, p23_d5_whole, p23_e5_quarter, p23_e5_half, p23_e5_whole, p23_f5_quarter, p23_f5_half, p23_f5_whole, p23_g5_quarter, p23_g5_half, p23_g5_whole, p24_e2_quarter, p24_e2_half, p24_e2_whole, p24_f2_quarter, p24_f2_half, p24_f2_whole, p24_g2_quarter, p24_g2_half, p24_g2_whole, p24_a2_quarter, p24_a2_half, p24_a2_whole, p24_b2_quarter, p24_b2_half, p24_b2_whole, p24_c3_quarter, p24_c3_half, p24_c3_whole, p24_d3_quarter, p24_d3_half, p24_d3_whole, p24_e3_quarter, p24_e3_half, p24_e3_whole, p24_f3_quarter, p24_f3_half, p24_f3_whole, p24_g3_quarter, p24_g3_half, p24_g3_whole, p24_a3_quarter, p24_a3_half, p24_a3_whole, p24_b3_quarter, p24_b3_half, p24_b3_whole, p24_c4_quarter, p24_c4_half, p24_c4_whole, p24_d4_quarter, p24_d4_half, p24_d4_whole, p24_e4_quarter, p24_e4_half, p24_e4_whole, p24_f4_quarter, p24_f4_half, p24_f4_whole, p24_g4_quarter, p24_g4_half, p24_g4_whole, p24_a4_quarter, p24_a4_half, p24_a4_whole, p24_b4_quarter, p24_b4_half, p24_b4_whole, p24_c5_quarter, p24_c5_half, p24_c5_whole, p24_d5_quarter, p24_d5_half, p24_d5_whole, p24_e5_quarter, p24_e5_half, p24_e5_whole, p24_f5_quarter, p24_f5_half, p24_f5_whole, p24_g5_quarter, p24_g5_half, p24_g5_whole};
        // Set all notes to not visible
        for (ImageView note : allNotes) {
            note.setVisible(false);
        }
    }
}
