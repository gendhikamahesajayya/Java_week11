/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11_kasus2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus2 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        int [] angka = new int[6];
        for( int i = 0; i < angka.length; i++ ){
            System.out.print("Masukkan Array ke-" + i + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("Data yang di input ke elemen array");
         for(int b : angka){
            System.out.println("Nilai akhir index" + b );
        }
    }
}
