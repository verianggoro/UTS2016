package com.company;
import java.util.Scanner;

public class ContohNo4 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int [] tampung = new int[10];
        int sum = 0;
        System.out.println("Masukan 10 Nilai : ");
        for (int i = 0; i< 10; i++){
            tampung[i] = In.nextInt();
        }for (int num :tampung){
            sum = sum+num;
        }
        System.out.println("Maka Jumlahnya adalah " +sum);
    }
}
