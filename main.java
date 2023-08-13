package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double totalKm=0, ucret=0.1, totalUcret=0;
	int yas, yolculukTipi;

        Scanner input = new Scanner(System.in);

        System.out.println("Yapılan km yi giriniz:");
        totalKm = input.nextDouble();

        System.out.println("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.println("Yolculuk tipi giriniz, tek yön için 1, gidiş-dönüş için 2 giriniz:");
        yolculukTipi = input.nextInt();

        if (totalKm<0 || yas <0 || yolculukTipi!=1 && yolculukTipi!=2){
            System.out.println("yanlış değer girdiniz programı yeniden çalıştırın");
        }else {
            if (yas<=12){
                totalUcret = (totalKm*ucret)*0.5;
                if (yolculukTipi==2){
                    totalUcret = (totalUcret*0.8)*2;
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }else {
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }

            }else if (yas>12 && yas < 24){
                totalUcret = (totalKm*ucret)*0.9;
                if (yolculukTipi==2){
                    totalUcret = (totalUcret*0.8)*2;
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }else {
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }

            }else if (yas > 65){
                totalUcret = (totalKm*ucret)*0.7;
                if (yolculukTipi==2){
                    totalUcret = (totalUcret*0.8)*2;
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }else {
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }
            }else {
                totalUcret = totalKm*ucret;
                if (yolculukTipi==2){
                    totalUcret = (totalUcret*0.8)*2;
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }else {
                    System.out.println("bilet ücretiniz=" + totalUcret);
                }
            }
        }
    }
}
