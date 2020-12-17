package com.martyx;

public class Pyramid {
    public static void main(String[] args) {

         int riadky= 5;

         //riadky = 5,4,3,2,1
         //medzery = 4,3,2,1
         //hviezdicky = 1,3,5


         int pocetHviezdiciek = 1; //pociatocna hodnota
        for (int i = 1; i <= riadky; i ++){ // posuva riadky

            for (int j = riadky - i; j >= 1; j-- ){ // kresli medzeri
                System.out.print(" ");
            }

            for (int k = 1; k <= pocetHviezdiciek; k++){ // kresli hviezdicky
                System.out.print("*");
            }

            pocetHviezdiciek = pocetHviezdiciek + 2; // pocitadlo pre pocet hviezdiciek
            System.out.println(); //dalsi riadok

        }

    }
}
