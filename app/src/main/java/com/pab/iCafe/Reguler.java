package com.pab.iCafe;

public class Reguler {
    private String namaDrinks;
    String hargaDrinks;
    private int imgDrinks;

    public Reguler(String namaDrinks, String hargaDrinks, int imgDrinks) {
        this.namaDrinks = namaDrinks;
        this.hargaDrinks = hargaDrinks;
        this.imgDrinks = imgDrinks;
    }

    public String getNamaDrinks() {
        return namaDrinks;
    }

    public void setNamaDrinks(String namaDrinks) {
        this.namaDrinks = namaDrinks;
    }

    public String getHargaDrinks() {
        return hargaDrinks;
    }

    public void setHargaDrinks(String hargaDrinks) {
        this.hargaDrinks = hargaDrinks;
    }

    public int getImgDrinks() {
        return imgDrinks;
    }

    public void setImgDrinks(int imgDrinks) {
        this.imgDrinks = imgDrinks;
    }
}
