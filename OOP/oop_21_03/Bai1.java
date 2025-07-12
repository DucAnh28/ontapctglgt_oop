/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_21_03;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
