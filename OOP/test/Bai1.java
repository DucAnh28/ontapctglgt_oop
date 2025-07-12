/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.*;
import java.math.*;
import java.util.*;
public class Bai1{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        BigInteger tong = new BigInteger("0");
        BigInteger tich = new BigInteger("1");
        while(in.hasNextBigInteger()){
            BigInteger tmp = in.nextBigInteger();
            tong = tong.add(tmp);
            tich = tich.multiply(tmp);
        }
        System.out.println(tong);
        System.out.println(tich);
        in.close();
    }
}