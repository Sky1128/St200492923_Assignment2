package com.example.st200492923_assignment2;

import javafx.scene.image.Image;

public class Heroes {

    private String heroName;
    private String heroType;
    private String heroRole;
    private double attackDamage;
    private double armor;
    private String[] abilities;
    private Image heroImage;

    public Heroes(String heroName, String heroType, String heroRole, double attackDamage, double armor, String[] abilities, Image img)
    {
        setHeroName(heroName);
        setHeroType(heroType);
        setHeroRole(heroRole);
        setAttackDamage(attackDamage);
        setArmor(armor);
        setAbilities(abilities);
        heroImage = img;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    public String getHeroRole() {
        return heroRole;
    }

    public void setHeroRole(String heroRole) {
        this.heroRole = heroRole;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public Image getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(Image heroImage) {
        this.heroImage = heroImage;
    }




}
