/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utspbo20mei2024;

import java.util.Scanner;

/**
 *
 * @author A-23
 */
public class UTSPBO {
    public static void main(String [] args) {
       Scanner scanner = new Scanner(System.in);
        // Pembatas
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
       System.out.println("UTS 20 Mei 2024 oleh Achmad Zaki Naufal - 23201244");
       System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
       
       // Input Nama
       System.out.println("Silahkan inputkan nama anda");
       String nama = scanner.nextLine();
       System.out.println("Pilih jenis kelamin");
       System.out.println("1.Laki-laki");
       System.out.println("2.Perempuan");
       int jk = scanner.nextInt();
       scanner.nextLine(); // Membuang newline
       
       if (jk == 1) {
           System.out.println("Selamat Datang Mas " + nama);
       }else {
           System.out.println("Selamat Datang Mbak " + nama);
       }
       
       System.out.println("Kalkulator");
       while(true) {
       int angka1, angka2; 
       char operator;
       // Input Data Dari Pengguna
       System.out.println("Masukkan angka pertama:");
       angka1 = scanner.nextInt();
       System.out.println("Masukkan operator (+, -, *, /:");
       operator = scanner.next().charAt(0);
       System.out.println("Masukkan angka kedua");
       angka2 = scanner.nextInt();
       
       // Menghitung hasil
       int hasil;
       switch(operator){
           case '+':
               hasil = angka1 + angka2;
               break;
           case '-':
               hasil = angka1 - angka2;
               break;
           case '*':
               hasil = angka1 * angka2;
               break;
           case '/':
               if(angka2 == 0){
                   System.out.println("Pembagian dengan 0 tidak diizinkan!");
                   return;
               }
               hasil = angka1 / angka2;
               break;
           default:
               System.out.println("Operator tidak valid!");
               return;
               
           
       }
       
       // Menampilkan hasil
       System.out.println("Hasil: " + hasil);
       
       // Menampilkan pengguna apakah ingin melanjutkan
       System.out.println("Apakah Anda ingin melanjutkan? (y/n_");
       char lanjut = scanner.next(). charAt(0);
       if(lanjut != 'y'){
           System.out.println("Thank you for using the calculator, Goodbye!");
           break; // Keluar dari loop
       }
       scanner.nextLine(); // Membuang newline
       }
       }
    
    
}
