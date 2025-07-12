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
public class Bai4 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1001];
        for(int i=0;i<100000;i++){
            int x = in.readInt();
            a[x]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
