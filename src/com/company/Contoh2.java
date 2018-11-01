package com.company;
import java.io.*;
public class Contoh2 {
    public static void main(String args[]){
        BufferedReader data= new BufferedReader(new InputStreamReader(System.in));
        int x = 5;
        String npm[][] = new String [1][x];
        String nama [] [] = new String[1][x];
        System.out.println("Masukan Nama dan NPM");
        System.out.println("=============================");
        try {
            for (int i = 0; i < 1; i++) {
                for (int y = 0; y < x; y++) {
                    System.out.print("NPM             : ");
                    npm[i][y] = data.readLine();
                    System.out.print("Nama            : ");
                    nama[i][y] = data.readLine();
                }
                System.out.println("NPM \t\t Nama");
                for (int y =0; y < x; y++){
                    for (int k = 0; k < 1; k++){
                        System.out.print(npm[i][y] + "  " + nama[i][y]);
                    }
                    System.out.println();
                }
            }

        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
