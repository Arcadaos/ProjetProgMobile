package com.example.sharetovers;

import java.io.Serializable;

public class Plat implements Serializable {

    private String nomPlat;
    private String detailsPlat;
    private String imageUrl;
    private String categorie[];




    public Plat(String nomPlat, String detailsPlat, String imageUrl,String categorie[]) {
        this.nomPlat = nomPlat;
        this.detailsPlat = detailsPlat;
        this.imageUrl = imageUrl;
        this.categorie = categorie;
    }

    public Plat() {
    }

        public String getNomPlat() {
        return nomPlat;
    }

        public void setNomPlat (String nomPlat) {
        this.nomPlat = nomPlat;
    }

        public String getDetailsPlat() {
        return detailsPlat;
    }

        public void setDetailsPlat(String detailsPlat) {
        this.detailsPlat = detailsPlat;
    }

        public String getImageUrl() {
        return imageUrl;
    }

        public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

        public String[] getCategorie() {
        return categorie;
    }

        public void setCategorie(String Categories) {
        this.categorie = categorie;
    }
    }