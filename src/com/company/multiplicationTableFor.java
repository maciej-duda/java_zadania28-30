package com.company;

public class multiplicationTableFor {

    public static void main(String[] args) {

        int row = 10;
        int column = 10;
        String output = "";

        int[][] table = new int[++row][++column];

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = i * j;
                if (j != table[i].length - 1) {
                    if (i * j < 10) {
                        output += table[i][j] + "  ";
                    }
                    else {
                        output += table[i][j] + " ";
                    }
                }
                else {
                    output += table[i][j] + "\n";
                }
            }
        }

        System.out.println(output);
    }
}
