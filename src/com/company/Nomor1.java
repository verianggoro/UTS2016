package com.company;
import java.io.*;
public class Nomor1 {

    public static void main(String[] args) throws IOException {
	BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String [] [] NPM= new String[3][3];
    String [][] nama = new String[3][3];
    String [][] almat = new String[3][3];
        System.out.println("Masukan Data Diri Anda");
        System.out.println("===============================");
        try {for (int x = 0; x < 1; x++) { //untuk mendefinisikan kolom
            for (int y = 0; y < 3; y++) {   //untuk mendefinisikan baris
                System.out.print("No Induk          : ");
                NPM[x][y] = dataIn.readLine();
                System.out.print("Nama              : ");
                nama[x][y] = dataIn.readLine();
                System.out.print("Alamat            : ");
                almat[x][y] = dataIn.readLine();
                System.out.println();
            }
            System.out.println("NIM \t\t\t\t\t\t  Nama \t\t\t\t\t\t Alamat");
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 1; z++) {
                    System.out.print(NPM[x][y] + "\t\t\t\t\t" + nama[x][y] + "\t\t\t\t\t" + almat[x][y]);
                }
                System.out.println();
            }
        }
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}