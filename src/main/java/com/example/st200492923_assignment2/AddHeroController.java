

package com.example.st200492923_assignment2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AddHeroController implements Initializable {


    private FXMLLoader fxmlLoader;
    private Stage stage;
    private Scene scene;
    private Image firstImage;
    public HelloController addHero = new HelloController();
    public Heroes newHero = new Heroes();
    private String hero_Name;
    private String hero_Type;
    private String hero_Role;
    private double attack_Damage;
    private double armor;
    private String[] ability;
    private Image hero_Image;


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Title"
    private Label Title; // Value injected by FXMLLoader

    @FXML // fx:id="abilityLabel"
    private Label abilityLabel; // Value injected by FXMLLoader

    @FXML // fx:id="abilityTextArea"
    private TextArea abilityTextArea; // Value injected by FXMLLoader

    @FXML // fx:id="addheroBtn"
    private Button addheroBtn; // Value injected by FXMLLoader

    @FXML // fx:id="armour"
    private Label armour; // Value injected by FXMLLoader

    @FXML // fx:id="armourInput"
    private TextField armourInput; // Value injected by FXMLLoader

    @FXML // fx:id="attackDamage"
    private Label attackDamage; // Value injected by FXMLLoader

    @FXML // fx:id="browseFileButton"
    private Button browseFileButton; // Value injected by FXMLLoader

    @FXML // fx:id="damageInput"
    private TextField damageInput; // Value injected by FXMLLoader

    @FXML // fx:id="heroNameTxt"
    private TextField heroNameTxt; // Value injected by FXMLLoader

    @FXML // fx:id="heroRole"
    private Label heroRole; // Value injected by FXMLLoader

    @FXML // fx:id="heroRoleInput"
    private TextField heroRoleInput; // Value injected by FXMLLoader

    @FXML // fx:id="heroType"
    private Label heroType; // Value injected by FXMLLoader

    @FXML // fx:id="heroTypeInput"
    private TextField heroTypeInput; // Value injected by FXMLLoader

    @FXML // fx:id="homePageButton"
    private Button homePageButton; // Value injected by FXMLLoader

    @FXML // fx:id="imgView"
    private ImageView imgView; // Value injected by FXMLLoader

    @FXML
    void addHeroOnClick(ActionEvent event) {

        String[] abilities = abilityTextArea.getText().split("\n");

        newHero = new Heroes(heroNameTxt.getText(),heroTypeInput.getText(), heroRoleInput.getText(),Double.parseDouble(damageInput.getText()), Double.parseDouble(armourInput.getText()),abilities,firstImage);
        addHero.addNewHero(newHero);

    }


    @FXML
    void clickToGoHome(ActionEvent event) throws IOException {

        addHero.addNewHero(newHero);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hero-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void loadImgOnClick(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        if(file != null)
        {
            firstImage = new Image(getClass().getResource("/Images/" +file.getName()).toExternalForm());
            imgView.setImage(firstImage);
        }

    }



    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Title != null : "fx:id=\"Title\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert abilityLabel != null : "fx:id=\"abilityLabel\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert abilityTextArea != null : "fx:id=\"abilityTextArea\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert addheroBtn != null : "fx:id=\"addheroBtn\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert armour != null : "fx:id=\"armour\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert armourInput != null : "fx:id=\"armourInput\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert attackDamage != null : "fx:id=\"attackDamage\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert browseFileButton != null : "fx:id=\"browseFileButton\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert damageInput != null : "fx:id=\"damageInput\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert heroNameTxt != null : "fx:id=\"heroNameTxt\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert heroRole != null : "fx:id=\"heroRole\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert heroRoleInput != null : "fx:id=\"heroRoleInput\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert heroType != null : "fx:id=\"heroType\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert heroTypeInput != null : "fx:id=\"heroTypeInput\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert homePageButton != null : "fx:id=\"homePageButton\" was not injected: check your FXML file 'AddHero.fxml'.";
        assert imgView != null : "fx:id=\"imgView\" was not injected: check your FXML file 'AddHero.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
