
package com.example.st200492923_assignment2;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class HelloController implements Initializable {


    private FXMLLoader fxmlLoader;
    private Stage stage;
    private Scene scene;
    private int currentIndex;
    static final int defaultIndex = 0;
    private ArrayList<Heroes> heroList = new ArrayList<>();


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Title"
    private Label Title; // Value injected by FXMLLoader

    @FXML // fx:id="abilities"
    private Label abilities; // Value injected by FXMLLoader

    @FXML // fx:id="addHeroButton"
    private Button addHeroButton; // Value injected by FXMLLoader

    @FXML // fx:id="armour"
    private Label armour; // Value injected by FXMLLoader

    @FXML // fx:id="armourLabel"
    private Label armourLabel; // Value injected by FXMLLoader

    @FXML // fx:id="attackDamage"
    private Label attackDamage; // Value injected by FXMLLoader

    @FXML // fx:id="damageLabel"
    private Label damageLabel; // Value injected by FXMLLoader

    @FXML // fx:id="editButton"
    private Button editButton; // Value injected by FXMLLoader

    @FXML // fx:id="heroName"
    private Label heroName; // Value injected by FXMLLoader

    @FXML // fx:id="heroRole"
    private Label heroRole; // Value injected by FXMLLoader

    @FXML // fx:id="heroType"
    private Label heroType; // Value injected by FXMLLoader

    @FXML // fx:id="imgView"
    private ImageView imgView; // Value injected by FXMLLoader

    @FXML // fx:id="nextHeroButton"
    private Button nextHeroButton; // Value injected by FXMLLoader

    @FXML // fx:id="roleLabel"
    private Label roleLabel; // Value injected by FXMLLoader

    @FXML // fx:id="listView"
    private ListView listView = new ListView(); // Value injected by FXMLLoader


    @FXML // fx:id="typeLabel"
    private Label typeLabel; // Value injected by FXMLLoader

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Title != null : "fx:id=\"Title\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert abilities != null : "fx:id=\"abilities\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert addHeroButton != null : "fx:id=\"addHeroButton\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert armour != null : "fx:id=\"armour\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert armourLabel != null : "fx:id=\"armourLabel\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert attackDamage != null : "fx:id=\"attackDamage\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert damageLabel != null : "fx:id=\"damageLabel\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert heroName != null : "fx:id=\"heroName\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert heroRole != null : "fx:id=\"heroRole\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert heroType != null : "fx:id=\"heroType\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert imgView != null : "fx:id=\"imgView\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert nextHeroButton != null : "fx:id=\"nextHeroButton\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert roleLabel != null : "fx:id=\"roleLabel\" was not injected: check your FXML file 'hero-view.fxml'.";
        assert typeLabel != null : "fx:id=\"typeLabel\" was not injected: check your FXML file 'hero-view.fxml'.";

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        heroList.add(new Heroes("Pudge", "Strength", "Tank/Support", 70, 0.96, new String[]{"Hook-Pull " +
                "enemy towards pudge while dealing damage", "Rot: Slows enemy and deals damage overtime", "Fleash Heap: Retro active passive ability " +
                "grants pudge magic resistance and extra strength", "Dismember : Disables enemy and deals damage to enemy based on pudges's strength"}
                , new Image(getClass().getResource("/Images/pudge-dota-2.jpg").toExternalForm())));
        heroList.add(new Heroes("Slark", "Agility", "Carry", 70, 0.96, new String[]{"Hook-Pull " +
                "enemy towards pudge while dealing damage", "Rot: Slows enemy and deals damage overtime", "Fleash Heap: Retro active passive ability " +
                "grants pudge magic resistance and extra strength", "Dismember : Disables enemy and deals damage to enemy based on pudges's strength"}
                , new Image(getClass().getResource("/Images/slark.jpg").toExternalForm())));
        heroList.add(new Heroes("Slark", "Strength", "Tank/Support", 55, 2.94, new String[]{"Dark Pact- Apply " +
                "strong dispel to slark and deals great damage to near by enemies", "Pounce: Leaps and grabb a hero , stop him from moving away from slark",
                "Essence Shift: Slark steals the life essence of enemy heroes with his attacks, and permanently steals agility if hero dies near by slark",
                "Shadow Dance :Hides slark into a dark cloud making him immune from physical damage and grants him great regenaration for a preiod"}
                , new Image(getClass().getResource("/Images/pudge-dota-2.jpg").toExternalForm())));
        heroList.add(new Heroes("Pudge", "Strength", "Tank/Support", 70, 0.96, new String[]{"Hook-Pull " +
                "enemy towards pudge while dealing damage", "Rot: Slows enemy and deals damage overtime", "Fleash Heap: Retro active passive ability " +
                "grants pudge magic resistance and extra strength", "Dismember : Disables enemy and deals damage to enemy based on pudges's strength"}
                , new Image(getClass().getResource("/Images/pudge-dota-2.jpg").toExternalForm())));
        heroList.add(new Heroes("Pudge", "Strength", "Tank/Support", 70, 0.96, new String[]{"Hook-Pull " +
                "enemy towards pudge while dealing damage", "Rot: Slows enemy and deals damage overtime", "Fleash Heap: Retro active passive ability " +
                "grants pudge magic resistance and extra strength", "Dismember : Disables enemy and deals damage to enemy based on pudges's strength"}
                , new Image(getClass().getResource("/Images/pudge-dota-2.jpg").toExternalForm())));

        armourLabel.setText(String.valueOf(heroList.get(defaultIndex).getArmor()));
        typeLabel.setText(heroList.get(defaultIndex).getHeroType());
        roleLabel.setText(heroList.get(defaultIndex).getHeroRole());
        heroName.setText(heroList.get(defaultIndex).getHeroName());
        damageLabel.setText(String.valueOf(heroList.get(defaultIndex).getAttackDamage()));
        imgView.setImage(heroList.get(defaultIndex).getHeroImage());

        for (int i = 0; i < heroList.get(0).getAbilities().length; i++) {
            listView.getItems().add(heroList.get(0).getAbilities()[i]);


        }

    }

    public void addNewHero(Heroes addHero)
    {
        heroList.add(addHero);
    }

    @FXML
    void addHeroOnClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddHero.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void editOnClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EditDetails.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void nextHeroOnClick(ActionEvent event) {
        listView.getItems().clear();
        if (currentIndex < heroList.size()) {

            armourLabel.setText(String.valueOf(heroList.get(currentIndex).getArmor()));
            typeLabel.setText(heroList.get(currentIndex).getHeroType());
            roleLabel.setText(heroList.get(currentIndex).getHeroRole());
            heroName.setText(heroList.get(currentIndex).getHeroName());
            damageLabel.setText(String.valueOf(heroList.get(currentIndex).getAttackDamage()));
            imgView.setImage(heroList.get(currentIndex).getHeroImage());
            for (int i = 0; i < heroList.get(currentIndex).getAbilities().length; i++) {
                listView.getItems().add(heroList.get(currentIndex).getAbilities()[i]);
            }


            currentIndex += 1;
        } else {
            currentIndex = 0;

        }
    }



}


