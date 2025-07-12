/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.*;
import java.math.*;
import java.util.*;
public class Bai4{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        BigInteger tong = new BigInteger("0");
        BigInteger tich = new BigInteger("1");
        TreeSet<BigInteger> set = new TreeSet<>(); 
        // Tap hop, giup loc ra cac so khac nhau tu nho den lon
        while(in.hasNextBigInteger()){
            set.add(in.nextBigInteger());
        }
        for(BigInteger x : set){
            tong.add(x);
            tich.multiply(x);
        }
        System.out.println(tong);
        System.out.println(tich);
        in.close();
    }
}
