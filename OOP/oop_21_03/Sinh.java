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
public class Sinh {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("DATA.IN"));
        Random r = new Random();
        for(int i=0;i<100000;i++){
            int x = r.nextInt(1000);
            out.writeInt(x);
        }
        out.close();
    }
}
