package com.company;

public class ContohMulti {
    public static void main(String args[]){
        String [] [] namaBuah= { {"apel","Anggur","Alpukat"},{"Melon","Mangga","Manggis"},{"Jeruk","Nanas","Pisang"}};

        for (int baris= 0; baris < namaBuah.length; baris++){
            for (int kolom=0; kolom < namaBuah.length; kolom++){
                System.out.print(namaBuah[baris][kolom]+"\t");
            }
            System.out.println();
        }
    }
}
