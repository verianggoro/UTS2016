package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nomor4 {
    public static void main(String args[]) {
        String text;
        try {
            String locFile = "uts2016.txt";
            FileReader baca = new FileReader(locFile);
            BufferedReader bacaBuf = new BufferedReader(baca);
            System.out.println("\t\t\t\t Rincian Belanjaan");
            System.out.println("========================================================================================");
            System.out.println("Nama Barang\t\t\t Jml Barang \t\t Harga Satuan \t\t\t Harga Total");
            int [] tampung = new int[100];
            int sum = 0;
            int x=0;
            while (((text = bacaBuf.readLine()) != null) && (x<4 )) {
                char satuan = text.charAt(13);
                int convertS = Integer.parseInt(String.valueOf(satuan));
                String harga = text.substring(19);
                int convert = Integer.parseInt(harga);
                System.out.print(text);
                tampung[x] = convert * convertS;
                System.out.println("\t\t\t\t\t" + tampung[x]);
                for (int num : tampung) {
                    sum = num + sum;
                }
            }
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Total Bayar = "+sum);
        } catch (FileNotFoundException e) {
            System.err.println("File Tidak Ditemukan");
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
