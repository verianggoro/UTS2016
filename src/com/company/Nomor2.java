package com.company;

public class Nomor2 {
    public static void main(String args[]){
        String kata1 = "INDRAPRASTA";
        String kata2 = "";
        for (int i = kata1.length()-1;i>=0; i-- ){
            kata2+=kata1.substring(i,i+1);
        }for (int i=kata2.length()-1; i>=0; --i){
            System.out.println(kata2.substring(i));
        }
    }
}
