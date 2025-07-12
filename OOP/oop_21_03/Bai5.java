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
public class Bai5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();
        int a[] = new int[1001];
        for(int x : ds){
            a[x]++;
        }
        for(int i=2;i<1000;i++){
            if(a[i] > 0 && ngto(i)){
                System.out.println(i + " " + a[i]);
            }
        }
    }
    public static boolean ngto(int n){
        if(n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
