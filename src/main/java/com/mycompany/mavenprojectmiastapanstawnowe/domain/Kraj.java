/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmiastapanstawnowe.domain;

/**
 *
 * @author 48514
 */
public class Kraj extends Miejsce {

    private boolean czyWUE;
    private String waluta;

    public boolean isCzyWUE() {
        return czyWUE;
    }

    public void setCzyWUE(boolean czyWUE) {
        this.czyWUE = czyWUE;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

}
