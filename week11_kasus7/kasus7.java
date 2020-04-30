/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11_kasus7;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus7 {
    public static void main(String[]args)throws Exception{
    String[]kode = new String[20];
    String[]nama = new String[20];
    String[]alamat = new String[20];
    Scanner karakter = new Scanner(System.in);
        System.out.println("Masukkan jumlah data :");
        String data = karakter.nextLine();
        int fulldata = Integer.valueOf(data).intValue();
        for(int i = 0; i < fulldata; i++){
            System.out.println("data ke-" + (i+1) + "=");
            System.out.println("Kode pelanggan");
            String kd = karakter.nextLine();
            kode[i]=kd;
            System.out.println("Nama pelanggan");
            String nm = karakter.nextLine();
            nama[i]=nm;
            System.out.println("Alamat pelanggan");
            String al = karakter.nextLine();
            alamat[i]=al;
        }
        System.out.println("DATA PELANGGAN PT SENTOAS JAYA");
        System.out.println("JL. Sagu No.27A Kebagusan Jakarta Selatan");
        System.out.println("==========================================================");
        System.out.println("NO  Kode Pelanggan    Nama Pelanggan     Alamat Pelanggan");
        System.out.println("==========================================================");
        for(int i = 0; i < fulldata; i++){
            System.out.println((i+1)+"               "+kode[i]+"            "+nama[i]+"            "+alamat[i]);
        }
        System.out.println("===========================================================");
        System.out.println("Mau Input data Lagi : ");
    }
}
