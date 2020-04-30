/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11_kasus8;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus8 {
    public static void main(String[]args)throws Exception{
    String[]nim = new String[20];
    String[]nama = new String[20];
    String[]jurusan = new String[20];
    String[]alamat = new String[20];
    Scanner karakter = new Scanner(System.in);
        System.out.println("Biodata Mahasiswa");
        System.out.println("========================INPUTAN=================");
        System.out.println("Masukkan banyak data :");
        String data = karakter.nextLine();
        int fulldata = Integer.valueOf(data).intValue();
        for(int i = 0; i < fulldata; i++){
            System.out.println("data ke-" + (i+1) + "=");
            System.out.println("Masukkan Nim = ");
            String kd = karakter.nextLine();
            nim[i]=kd;
            System.out.println("Masukkan Nama = ");
            String nm = karakter.nextLine();
            nama[i]=nm;
            System.out.println("Masukkan Jurusan = ");
            String jr = karakter.nextLine();
            jurusan[i]=jr;
            System.out.println("Alamat pelanggan");
            String al = karakter.nextLine();
            alamat[i]=al;
        }
        System.out.println("DATA PELANGGAN PT SENTOAS JAYA");
        System.out.println("JL. Sagu No.27A Kebagusan Jakarta Selatan");
        System.out.println("==========================================================");
        System.out.println("NO  Nim    Nama Mahasiswa         Jurusan           Alamat");
        System.out.println("==========================================================");
        for(int i = 0; i < fulldata; i++){
            System.out.println((i+1)+"               "+nim[i]+"            "+nama[i]+"            "+ jurusan[i] +"          "+alamat[i]);
        }
        System.out.println("===========================================================");
    }
}
