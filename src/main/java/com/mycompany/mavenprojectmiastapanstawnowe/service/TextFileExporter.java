/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectmiastapanstawnowe.service;

import com.mycompany.mavenprojectmiastapanstawnowe.service.Exporter;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miejsce;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miasto;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Kraj;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Kraj;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miasto;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miejsce;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author 48514
 */
public class TextFileExporter implements Exporter{

    @Override
   public void export(List<Miejsce> miajsca, String nazwaPliku) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            for (Miejsce x : miajsca) {
                if (x instanceof Kraj) {
                    Kraj k = (Kraj) x;
                    writer.println("Kraje: "  + " " + k.getNazwa() + " czy to mejsce w UE" + k.isCzyWUE() + " waluta to: " + k.getWaluta() + " czy jest to odwiedzony kraj " + k.isCzyOdwiedzone());
                } else if (x instanceof Miasto) {
                    Miasto m = (Miasto) x;
                    writer.println("Miejsca: " + " " + m.getNazwa() + " czy to stolica " + m.isCzyStolica() + " czy jest odwiedzone "+ m.isCzyOdwiedzone());
                }
            }
            writer.close();
        }
        
    }

   
}
