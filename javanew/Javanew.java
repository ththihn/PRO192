/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javanew;

import javax.imageio.ImageIO;
import java.util.Scanner;
/**
 *
 * @author FPTSHOP
 */
public class Javanew {

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("input your first name");
          String name = sc.nextLine();
          System.out.println("input ur last name");
          String firstname = sc.nextLine();
        System.out.println("ur name " + (name));
        System.out.println("ur firstname " + (firstname));
        System.out.println("ur full name is "+ (name + firstname ));
    }
}

