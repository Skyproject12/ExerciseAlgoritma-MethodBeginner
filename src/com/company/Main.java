package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String  data [] = new String [100];
        int k,i;
	Scanner scan= new Scanner (System.in);
        System.out.println("=====program analisis=======");
        System.out.println("masukkan jumlah data ");
        k= scan.nextInt() ;

        for( i=1 ; i<= k ; i++){
            System.out.println("masukkan nilai ke " +i);
        data[i]=scan.next();}
        System.out.println ("  ========  isi data  ==========  ");
for (i=1;i<=k; i++){
    System.out.println(i+ data[i]);
}
    }
}
