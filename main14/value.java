package main14;

import java.util.Scanner;

public class value extends namaBangun {
Scanner input = new Scanner(System.in);
    @Override
    void persegi(){
       // int sisi = 5;
        System.out.println("======= Persegi ========");
        System.out.print("Maukkan nilai sisi : ");
        int sisi = input.nextInt();
        System.out.println("Keliling persegi adalah "+sisi*4);
        System.out.println();
    }
    @Override
    void persegiPanjang(){
        //int panjang = 5;
        //int lebar = 2;
        System.out.println("======= Persegi Panjang ========");
        System.out.print("Maukkan nilai panjang : ");
        int panjang = input.nextInt();
        System.out.print("Maukkan nilai lebar : ");
        int lebar = input.nextInt();
        System.out.println("Keliling persegi adalah "+2*(panjang+lebar));
        System.out.println();
    }
    @Override
    void segitiga(){
       // int sisi1 = 7;
       System.out.println("======= Segitiga ========");
       System.out.print("Maukkan nilai sisi : ");
        int sisi1 = input.nextInt();
        System.out.println("Keliling persegi adalah "+3*sisi1);
        System.out.println();
    }
}
