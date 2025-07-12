/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_21_03;

/**
 *
 * @author ADMIN
 */
import java.util.*;
import java.io.*;
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int a[] = new int[1001];
        while(in.hasNextInt()){
            int x = in.nextInt();
            a[x]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
