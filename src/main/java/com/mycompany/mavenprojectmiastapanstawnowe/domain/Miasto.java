/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmiastapanstawnowe.domain;

/**
 *
 * @author 48514
 */
public class Miasto extends Miejsce {

    private String krajGdzieLezy;
    private boolean czyStolica;

    public String getKrajGdzieLezy() {
        return krajGdzieLezy;
    }

    public void setKrajGdzieLezy(String krajGdzieLezy) {
        this.krajGdzieLezy = krajGdzieLezy;
    }

    public boolean isCzyStolica() {
        return czyStolica;
    }

    public void setCzyStolica(boolean czyStolica) {
        this.czyStolica = czyStolica;
    }

}
