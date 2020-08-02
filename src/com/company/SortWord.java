package com.company;
import java.util.Arrays;

public class SortWord {
    public static void main(String[] args) {
        String sentence = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć";
        String[] tab1 = sentence.split(" ");
        String firstWords = tab1[0]+ " " +tab1[1];
        String lastWords = tab1[tab1.length-2] + " " + tab1[tab1.length-1];
        String firstAndLast = firstWords + " " + lastWords;

        System.out.println("Pierwsze, drugie, przedostatnie i ostatnie słowo to:");
        System.out.println(firstAndLast);
        System.out.println("");

        String restOfWords2 = "";

        for (int i = 2; i < tab1.length-2; i++) {
         String restOfWords = tab1[i] + " ";
            restOfWords2 += restOfWords;
        }

        String[] middleWordsArray = restOfWords2.split(" ");
        System.out.println("Srodek zdania to wyrazy: " + restOfWords2);
        System.out.println("Wyrazy w kolejności alfabetycznej: ");

        Arrays.sort(middleWordsArray);
        for(int i = 0;i<middleWordsArray.length;i++) {
            System.out.println(middleWordsArray[i]);
        }
    }
}
