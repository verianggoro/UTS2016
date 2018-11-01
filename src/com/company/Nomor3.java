package com.company;
import java.io.*;

public class Nomor3 {
    public static void main (String args[]){
        FileOutputStream out;
        PrintStream x;
        try{
            out = new FileOutputStream("uts2016.txt");
            x = new PrintStream(out);
            int satuan[] = {2,3,5,1};
            int harga[] = {40000,30000,10000,90000};
            String barang[] = {"Baju","Celana","Kaoskaki","Sapatu"};
            x.println(barang[0]+"     "+"\t\t\t\t"+satuan[0]+"\t\t\t\t\t"+harga[0]);
            x.println(barang[1]+"   "+"\t\t\t\t"+satuan[1]+"\t\t\t\t\t"+harga[1]);
            x.println(barang[2]+" "+"\t\t\t\t"+satuan[2]+"\t\t\t\t\t"+harga[2]);
            x.println(barang[3]+"   "+"\t\t\t\t"+satuan[3]+"\t\t\t\t\t"+harga[3]);
            x.close();
        }catch (Exception e){
            System.err.println("error");
        }
        System.out.println("Data Berhasil Dibuat");
    }
}
