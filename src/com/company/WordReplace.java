package com.company;

public class WordReplace {
    public static void main(String[] args) {
        String sentence = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";

        System.out.println("Oryginalny tekst to:\n" + sentence);
        System.out.println("");
        System.out.println("Twój tekst z podmienionym 'wyścig' na 'nowa' wygląda następująco: \n" + sentence.replace("wyścig", "nowa"));
        System.out.println();
    }
}
