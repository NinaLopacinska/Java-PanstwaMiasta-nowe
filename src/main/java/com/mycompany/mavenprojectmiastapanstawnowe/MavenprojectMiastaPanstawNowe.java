package com.mycompany.mavenprojectmiastapanstawnowe;

import com.mycompany.mavenprojectmiastapanstawnowe.baza.BazaMiejsc;
import com.mycompany.mavenprojectmiastapanstawnowe.service.TextFileExporter;
import com.mycompany.mavenprojectmiastapanstawnowe.service.RaportGenerator;
import com.mycompany.mavenprojectmiastapanstawnowe.service.Exporter;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miejsce;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Miasto;
import com.mycompany.mavenprojectmiastapanstawnowe.domain.Kraj;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author 48514
 */
public class MavenprojectMiastaPanstawNowe {

    public static void main(String[] args) {
        BazaMiejsc bazaMiejsc = new BazaMiejsc();

        System.out.println("Witaj w biurze podrozy!");
        Scanner scanner = new Scanner(System.in);
        boolean wantExit = false;
        RaportGenerator raportGenerator = new RaportGenerator();
        Exporter exporter = new TextFileExporter();
        //Exporter exporter = new TextFileExporter();
        while (!wantExit) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Dodaj nowe miejsce");
            System.out.println("2. Wyświetl odwiedzone miejsca");
            System.out.println("3. Generuj raport");
            System.out.println("4. Zapisz do pliku");
            System.out.println("5. Opuść biuro podróży");

            if (scanner.hasNextInt()) {
                int optionNumber = scanner.nextInt();
                scanner.nextLine();

                switch (optionNumber) {

                    case 1:
                        System.out.println("wybierz 1 jesli chcesz dodac kraj, wybierz 2 jesli miasto.");
                        int nrOpcji = scanner.nextInt();
                        scanner.nextLine();
                        if (nrOpcji == 1) {
                            boolean poprawna1 = false;
                            String nazwaKraju;
                            do {
                                System.out.println("Podaj nazwe kraju: ");
                                nazwaKraju = scanner.nextLine();
                                if (nazwaKraju.equals("") || nazwaKraju.length() > 120) {
                                    System.out.println("Bledna wartosc.");
                                } else {
                                    poprawna1 = true;
                                }
                            } while (!poprawna1);

                            boolean poprawna2 = false;
                            boolean czyWUE = false;
                            String odp;
                            do {
                                System.out.println("Podaj czy ten kraj znajduje w UE? (Tak lub Nie): ");
                                odp = scanner.nextLine();
                                if (odp.equals("Tak")) {
                                    czyWUE = true;
                                    poprawna2 = true;

                                } else if (odp.equals("Nie")) {
                                    czyWUE = false;
                                    poprawna2 = true;
                                } else {
                                    System.out.println("Odzpowiedz Tak lub Nie.");
                                }
                            } while (!poprawna2);

                            boolean poprawna4 = false;
                            String waluta;
                            do {
                                System.out.println("Podaj jaka obowiazuje waluta w tym kraju: ");
                                waluta = scanner.nextLine();
                                if (waluta.length() != 3) {
                                    System.out.println("Bledna wartosc.");
                                } else {
                                    poprawna4 = true;
                                }
                            } while (!poprawna4);

                            boolean poprawna5 = false;
                            boolean CzyOdwiedzonyKraj = false;
                            String odpK;

                            do {
                                System.out.println("Podaj czy ten kraj zostal przez Ciebie odwiedzony? (Tak lub Nie): ");
                                odpK = scanner.nextLine();
                                if (odpK.equals("Tak")) {
                                    CzyOdwiedzonyKraj = true;
                                    poprawna5 = true;

                                } else if (odpK.equals("Nie")) {
                                    CzyOdwiedzonyKraj = false;
                                    poprawna5 = true;
                                } else {
                                    System.out.println("Odzpowiedz Tak lub Nie.");
                                }
                            } while (!poprawna5);

                            Kraj kraj = new Kraj();
                            kraj.setNazwa(nazwaKraju);
                            kraj.setCzyWUE(czyWUE);
                            kraj.setWaluta(waluta);
                            kraj.setCzyOdwiedzone(CzyOdwiedzonyKraj);

                            bazaMiejsc.getMiejsca().add(kraj);
                        } else if (nrOpcji == 2) {
                            boolean poprawna6 = false;
                            String nazwaMiasta;
                            do {
                                System.out.println("Podaj nazwe miasta: ");
                                nazwaMiasta = scanner.nextLine();
                                if (nazwaMiasta.equals("") || nazwaMiasta.length() > 120) {
                                    System.out.println("Bledna wartosc.");
                                } else {
                                    poprawna6 = true;
                                }
                            } while (!poprawna6);

                            boolean poprawna7 = false;
                            String wJakimKraju;
                            do {
                                System.out.println("Podaj w jakim kraju lezy to miasto: ");
                                wJakimKraju = scanner.nextLine();
                                if (wJakimKraju.equals("") || wJakimKraju.length() > 120) {
                                    System.out.println("Bledna wartosc.");
                                } else {
                                    poprawna7 = true;
                                }
                            } while (!poprawna7);

                            boolean poprawna8 = false;
                            boolean czyStolica = false;
                            String odp;
                            do {
                                System.out.println("Podaj czy to miasto jest stolica? (Tak lub Nie): ");
                                odp = scanner.nextLine();
                                if (odp.equals("Tak")) {
                                    czyStolica = true;
                                    poprawna8 = true;

                                } else if (odp.equals("Nie")) {
                                    czyStolica = false;
                                    poprawna8 = true;
                                } else {
                                    System.out.println("Odzpowiedz Tak lub Nie.");
                                }
                            } while (!poprawna8);

                            boolean poprawna10 = false;
                            boolean CzyOdwiedzoneMiasto = false;
                            String odpK;
                            do {
                                System.out.println("Podaj czy to miasto zostalo przez Ciebie odwiedzone? (Tak lub Nie): ");
                                odpK = scanner.nextLine();
                                if (odpK.equals("Tak")) {
                                    CzyOdwiedzoneMiasto = true;
                                    poprawna10 = true;

                                } else if (odpK.equals("Nie")) {
                                    CzyOdwiedzoneMiasto = false;
                                    poprawna10 = true;
                                } else {
                                    System.out.println("Odzpowiedz Tak lub Nie.");
                                }
                            } while (!poprawna10);

                            Miasto miasto = new Miasto();
                            miasto.setNazwa(nazwaMiasta);
                            miasto.setKrajGdzieLezy(wJakimKraju);
                            miasto.setCzyStolica(czyStolica);
                            miasto.setCzyOdwiedzone(CzyOdwiedzoneMiasto);

                            bazaMiejsc.getMiejsca().add(miasto);
                        }
                        break;

                    case 2:
                        System.out.println("Lista miejsc:");
                        int nrPorzadkowy = 1;
                        for (Miejsce x : bazaMiejsc.getMiejsca()) {
                            if (x instanceof Kraj) {
                                Kraj k = (Kraj) x;

                                System.out.println("Kraje: " + nrPorzadkowy + " " + k.getNazwa() + " czy to mejsce w UE" + k.isCzyWUE() + " waluta to: " + k.getWaluta() + " czy jest to odwiedzony kraj " + k.isCzyOdwiedzone());
                            }else if (x instanceof Miasto)
                            {Miasto m = (Miasto) x;
                                System.out.println("Miejsca: " + nrPorzadkowy + " " + m.getNazwa() + " czy to stolica " + m.isCzyStolica() + " czy jest odwiedzone "+ m.isCzyOdwiedzone());}
                            nrPorzadkowy++;
                        }
                        break;

                    case 3:
                        raportGenerator.generujRaport(bazaMiejsc);
                        break;

                    case 4:
                        System.out.println("Podaj nazwę pliku do zapisu: ");
                        String nazwaPliku = scanner.nextLine();
                        try {
                            exporter.export(bazaMiejsc.getMiejsca(), nazwaPliku);
                            System.out.println("Lista miejsc została zapisana do pliku: " + nazwaPliku+ ".txt");
                        } catch (Exception e) {
                            System.err.println("Błąd podczas zapisu pliku: " + e.getMessage());
                        }
                        break;

                    case 5:
                        System.out.println("Do zobaczenia!");
                        wantExit = true;
                        break;

                    default:
                        System.out.println("Wybierz poprawną opcję z menu.");
                }
            } else {
                System.out.println("Wybierz opcje z menu.");
                scanner.next(); // odczytanie niewłaściwej wartości
            }
        }
    }
}
