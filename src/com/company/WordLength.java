package com.company;

import java.util.Arrays;

public class WordLength {
    public static void main(String[] args) {
        String sentence = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć";
        String[] tab1 = sentence.split(" ");

        for(String s:tab1) {
            System.out.println("Długość wyrazu '" + s + "'" + " wynosi: " + s.length() + " znaków.");
        }

        System.out.println("");
        System.out.println("Wyrazy on najkrótszego do nadłuższego: ");

        Arrays.sort(tab1, (s1, s2) -> s1.length() - s2.length());
        Arrays.asList(tab1).forEach(System.out::println);

    }
}
