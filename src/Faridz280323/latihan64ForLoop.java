/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faridz280323;
import java.util.Scanner;
/**
 *
 * @author Slime1
 */
public class latihan64ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int nilai = input.nextInt();
        System.out.println("masukkan pangkat : ");
        int pkt = input.nextInt();

        int h = 1;

        for (int i = 1; i < pkt;i++){
        h = h * nilai;
        }
        System.out.println(nilai+ " ^ " + pkt + " = " +h);
         }
}
