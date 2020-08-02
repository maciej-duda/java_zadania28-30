package com.company;

public class letterCount {
    public static void main(String[] args) {

        String sentence = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";
        char w = 'w';
        char o = 'o';
        int counterW = 0;
        int counterO = 0;

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == w) {
                counterW++;
            }
            if (sentence.charAt(i) == o) {
                counterO++;
            }
        }
        System.out.println("Litera 'w' występuje w zdaniu " + counterW + " razy.");
        System.out.println("Litera 'o' występuje w zdaniu " + counterO + " razy.");
    }
}
