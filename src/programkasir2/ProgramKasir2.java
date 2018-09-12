/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkasir2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ProgramKasir2 {
int Pulpen = 001;  
int Pensil = 010;
int Penggaris = 100;
int bukutulis = 111;
   

    public static void main(String[] args) {
        int data[] = new int[5];
        Scanner KeyB = new Scanner(System.in);
        int kode, proses_diulang;
        double harga = 0, diskon, harga_bayar, total_harga_barang,jumlah_barang;
        do {
            kode =  Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kode barang \n1. Pulpen \n2. Pensil \n3. Penggaris \n4. Buku Tulis \nMasukkan Kode : "));
            System.out.println("Masukkan Kode barang \n1. 001 \n2. 010 \n3. 100 \n4. 111 \nMasukkan Kode : " + kode);   
           if(kode == 001){
               harga = 2000;
           }else if(kode == 010){
               harga = 1000;
           }else if(kode == 100){
               harga = 1500;
           }else if(kode == 111){
               harga = 4000;
           }else{
              JOptionPane.showInputDialog("CODE WRONG!!");
              proses_diulang =  Integer.parseInt(JOptionPane.showInputDialog("Apakah proses akan diulang ? \n1. Ya, \n2. Tidak \nMasukkan Pilihan"));
              System.out.println("Code Wrong!!");
              System.out.print("Apakah proses akan diulang ? \n1. Ya, \n2. Tidak \nMasukkan Pilihan :"+ proses_diulang); 
           } 
            jumlah_barang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang :"));
            System.out.println("Jumlah Barang : "+jumlah_barang);   
            total_harga_barang = jumlah_barang * harga;   
            if (total_harga_barang > 100000 ) {
                diskon = 0.10 * total_harga_barang;
            }else if(total_harga_barang > 200000 ){
                diskon = 0.20 * total_harga_barang;   
            }else if(total_harga_barang > 500000){
                diskon = 0.50 * total_harga_barang;   
            }else{
                diskon = 0;
            }
            harga_bayar = total_harga_barang - diskon;
            System.out.println("=======================");
            System.out.println("**PROGRAM KASIR**");
            System.out.println("=======================");
            System.out.println("Total Harga Barang : " + String.format("%1$,.2f", total_harga_barang));
            System.out.println("Diskon             : " + String.format("%1$,.2f",diskon));
            System.out.println("Harga Bayar        : " + String.format("%1$,.2f",harga_bayar));
            System.out.print("Apakah proses akan diulang ? 1. Ya, 2. Tidak : "); 
            proses_diulang = KeyB.nextByte();
          
        } while (proses_diulang == 1);
        System.out.println("Program selesai...");
    }
    
}