/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmiastapanstawnowe.service;

import com.mycompany.mavenprojectmiastapanstawnowe.baza.BazaMiejsc;
import com.mycompany.mavenprojectmiastapanstawnowe.service.IRaport;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miejsce;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miasto;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Kraj;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Kraj;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miasto;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miejsce;

/**
 *
 * @author 48514
 */
public class RaportGenerator implements IRaport{

    @Override
    public void generujRaport(BazaMiejsc bazaMiejsc) {
        long liczbaOdwiedzonychKrajow = bazaMiejsc.getMiejsca().stream()
                                .filter(m -> m instanceof Kraj)
                                .filter(Miejsce::isCzyOdwiedzone)
                                .count();

                        long liczbaOdwiedzonychMiast = bazaMiejsc.getMiejsca().stream()
                                .filter(m -> m instanceof Miasto)
                                .filter(Miejsce::isCzyOdwiedzone)
                                .count();

                        long liczbaOdwiedzonychStolic = bazaMiejsc.getMiejsca().stream()
                                .filter(m -> m instanceof Miasto)
                                .filter(m -> ((Miasto) m).isCzyStolica())
                                .filter(Miejsce::isCzyOdwiedzone)
                                .count();

                        System.out.println("Raport:");
                        System.out.println("Liczba odwiedzonych krajow: " + liczbaOdwiedzonychKrajow);
                        System.out.println("Liczba odwiedzonych miast: " + liczbaOdwiedzonychMiast);
                        System.out.println("Liczba odwiedzonych stolic: " + liczbaOdwiedzonychStolic);
    }
    
    
}
