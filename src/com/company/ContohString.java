package com.company;

public class ContohString {
    public static void main(String []args){
        String kata1 = "helo";
        String kata2 = "HELO";
        if(kata1.equalsIgnoreCase(kata2)){
            System.out.println(kata1 + "dan" +kata2+"Sama");
        }else{
            System.out.println(kata1 + "dan"+kata2+"Tidak Sama");
        }
    }
}
