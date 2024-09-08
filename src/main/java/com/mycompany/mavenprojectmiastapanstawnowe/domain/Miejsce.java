/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmiastapanstawnowe.domain;

/**
 *
 * @author 48514
 */
public abstract class Miejsce {
    private String nazwa;
    private boolean czyOdwiedzone;
    
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyOdwiedzone() {
        return czyOdwiedzone;
    }

    public void setCzyOdwiedzone(boolean czyOdwiedzone) {
        this.czyOdwiedzone = czyOdwiedzone;
    }
    
}
