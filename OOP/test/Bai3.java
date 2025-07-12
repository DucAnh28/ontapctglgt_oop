/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        int a[] = new int[10001], b[] = new int[10001];
        for(int x : ds1){
            if(ngto(x)) a[x]++;
        }
        for(int x : ds2){
            if(ngto(x)) b[x]++;
        }
        for(int i=1;i<10000;i++){
            if(a[i] > 0 && b[i] > 0){
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
        in1.close(); in2.close();
    }
    public static boolean ngto(int n){
        if(n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
