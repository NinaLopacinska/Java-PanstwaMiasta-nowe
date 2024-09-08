Utwórz program, który pozwoli użytkownikowi na wprowadzanie odwiedzonych i 
planowanych do odwiedzenia miejsc. 
Jako miejsce możemy zdefiniować kraj lub miasto. 
Wymagania dot. aplikacji 
• Aplikacja konsoli, powinna składać się z 2 projektów MAVEN (odseparowana logika 
od modelu dziedziny). 
• Program powinien kompilować się i uruchamiać. 
• Program musi być zabezpieczony przed wszelkimi błędami i posiadać odpowiednie
komunikaty dla użytkownika. 
• Program powinien być napisany zgodnie z zasadami tworzenia czystego kodu. 
Zaimplementuj menu dla użytkownika, które umożliwi: 
1. Dodanie nowego miejsca do odwiedzenia
2. Wyświetlenie listy odwiedzonych miejsc
3. Wygenerowanie raportu 
4. Zapis do pliku 
5. Zakończenie programu 
AD 1. Dodanie nowego miejsca do odwiedzenia: 
1. Wybór czy miejsce jest krajem czy miastem
Dla kraju należy podać: 
• NAZWĘ KRAJU (maksymalnie 120 znaków) 
• CZY JEST W UNII EUROPEJSKIEJ (prawda / fałsz) 
• OBOWIĄZUJĄCĄ WALUTĘ (maksymalnie 3 znaki)
• CZY ODWIEDZONE (prawda / fałsz)
Dla miasta należy podać: 
• NAZWĘ MIASTA (maksymalnie 120 znaków) 
• KRAJ W KTÓRYM ZNAJDUJE SIĘ MIASTO (maksymalnie 120 znaków)
• CZY JEST STOLICĄ (prawda / fałsz)
• CZY ODWIEDZONE (prawda / fałsz)
Jeżeli klient próbuje dodać miasto lub kraj, który jest już na liści, wyświetl komunikat z 
ostrzeżeniem. Miejsca na liście muszą być unikatowe.
AD 2. Program powinien wyświetlić na ekranie listę w postaci: 
numer porządkowy. nazwa miejsca, czy w UE, waluta, czy odwiedzony – dla kraju
numer porządkowy. nazwa miejsca, kraj czy stolica, czy odwiedzony – dla miasta
! Do zróżnicowania sposobu wyświetlania nie używaj bloku warunkowego! Powinna być 
tylko jedna kolekcja miejsc.
AD 3. Program powinien umożliwić generowanie raportów pokazujących informacje zbiorcze. 
Użyj obiektu Stream
• Ilość odwiedzonych i planowanych do odwiedzenia krajów. 
• Ilość odwiedzonych i planowanych do odwiedzenia miast. 
• Ilość odwiedzonych i planowanych do odwiedzenia stolic. 
AD 4. Program powinien umożliwić eksport listy miejsc do pliku tekstowego (dowolny 
sposób zapisu i format)
• Po zapisie pliku wyświetl odpowiedni komunikat dla użytkownika. 
• Zapis powinien zostać zrealizowany z wykorzystaniem odpowiedniego interfejsu. 
(OPCJONALNIE) Zapis pliku powinien odbywać się w sposób, który nie będzie blokował 
interfejsu użytkownika (zastosowanie wielowątkowości).
AD 5. Po wykonaniu każdej operacji powinien wyświetlić się menu do czasu, aż użytkownik 
nie wybierze opcji zakończ
Utwórz odpowiednią strukturę klas. Pamiętaj o enkapsulacji pól. 
Zaimplementuj logikę zgodnie z wyższym opisem. 
Pamiętaj o poprawnym zaprojektowaniu klas tak, aby zgodnie z zasadą segregacji 
interfejsów charakteryzowały się metodami ściśle powiązanymi poprzez obszar swojej 
funkcjonalności. 
Dostęp do implementacji metod powinien być możliwy poprzez odpowiednio zdefiniowane 
interfejsy i klasy abstrakcyjne.
