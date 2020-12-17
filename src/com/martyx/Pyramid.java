package com.martyx;

public class Pyramid {
    public static void main(String[] args) {

         int riadky= 10;
         int pocetHviezdiciek = 1;



        for (int i = 1; i <= riadky; i ++){ // posuva riadky

            for (int j = riadky - i; j >= 1; j-- ){ // kresli medzeri
                System.out.print(" ");
            }

            for (int a = 1; a <= pocetHviezdiciek; a++){ // kresli hviezdicky
                System.out.print("*");
            }

            pocetHviezdiciek = pocetHviezdiciek + 2; // pocitadlo pre pocet hviezdiciek
            System.out.println(); //dalsi riadok

        }

    }
}
