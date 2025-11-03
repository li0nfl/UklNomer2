/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.latihanuklno2;

/**
 *
 * @author li0nfl
 */
import java.util.Scanner;

public class LatihanUklNo2 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int bilangan1;
        System.out.print("Masukkan Bilangan: ");
        bilangan1 = inputan.nextInt();

        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan Ganjil");

        }
    }
}
