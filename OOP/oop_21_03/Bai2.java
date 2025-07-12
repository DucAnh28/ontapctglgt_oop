/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_21_03;

/**
 * @author ADMIN
 */

import java.util.*;
import java.io.*;

public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long kq = 0;
        while (in.hasNext()) {
            try {
                int x = Integer.parseInt(in.next());
                kq += x;
            } catch (NumberFormatException e) {
                //
            }
        }
        System.out.println(kq);
    }
}
