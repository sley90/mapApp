package com.android.cour.menfpapp.model;

/**
 * Created by Sley on 3/11/2018.
 */

public class Ecole {
    private String location;
    private String nom,phone,commune;

    public Ecole(String loc,String nom,String phone,String address){
        this.location = location;
        this.nom = nom;
        this.phone = phone;
        this.commune = commune;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location= location;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String address) {
        this.commune = commune;
    }


    public static String getScriptEcole() {
        return "CREATE TABLE Ecole (" + "localisation PRIMARY KEY TEXT NOT NULL," +
                "nom TEXT NOT NULL," +
                "telephone TEXT NOT NULL,"+
                "commune TEXT NOT NULL"+")";
    }

    public String toString() {
        return location  ;
    }
}
