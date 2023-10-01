/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java2;
import java.util.Scanner;
/**
 *
 * @author FPTSHOP
 */
public class Java2 {
    public static void main(String[] args) {
        System.out.println("Nhap 2 so a va b:");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("ket qua cua a+b la: " + (a + b));
        System.out.println("ket qua cua a-b la: "+ (a - b));
        System.out.println("ket qua cua a*b la " + (a * b));
        System.out.println("ket qua cua a/b la " + (a / b));
    }
}

