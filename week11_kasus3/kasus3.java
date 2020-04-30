/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11_kasus3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus3 {
    public static void main(String[] args) {

        String[] buah = new String[5];

        Scanner scan = new Scanner(System.in);

        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        for( String b : buah ){
            System.out.println(b);
        }

    }

    }

