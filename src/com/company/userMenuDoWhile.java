package com.company;

import java.util.Scanner;

public class userMenuDoWhile {
    public static void main(String[] args) {

        int exitChoice = 1;

    do {
        System.out.println("");
        System.out.println("Jeśli chcesz zakończyć podaj wartość 0");
        System.out.println("");
        System.out.println("Dla kursu Euro - wybierz 1");
        System.out.println("Dla pogody na wieczór - wybierz 2");
        System.out.println("Dla motywacyjnego cytatu - wybierz 3");
        System.out.println("");
        Scanner s = new Scanner(System.in);
        String userChoice = s.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("");
                    System.out.println("Jeżeli chcesz kupić 1€ musisz zapłacić: 4.20 zł");
                    System.out.println("Jeżeli chcesz sprzedać 1€ otrzymasz: 4.13 zł");
                break;
                case "2":
                    System.out.println("");
                    System.out.println("Dziś wieczorem będzie dosyć ciepło (23°C) - jednakże nieco wietrznie, jeżeli wybierasz się na spacer możesz rozważyć wzięcie bluzy");
                break;
                case "3":
                    System.out.println("");
                    System.out.println("Motywacja na dziś:");
                    System.out.println("Bądź wdzięczny za to, co masz, a będziesz miał tego więcej. Jeśli koncentrujesz się na tym, czego nie masz, nigdy nie będziesz miał wystarczająco dużo.");
                break;
                case "0":
                    System.out.println("");
                    System.out.println("Do widzenia!");
                    exitChoice = 0;
                break;
                default:
                    System.out.println("Wybrałeś nieprawidłową opcję!");
            }
       }
    while (exitChoice > 0);
    }
}



