/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.*;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(in.hasNext()){
            try{
                String tmp = in.next();
                try{
                    int x1 = Integer.parseInt(tmp);
                }catch (NumberFormatException e){
                    long x2 = Long.parseLong(tmp);
                    sum += x2;
                }
            }
            catch (NumberFormatException e){
            }
        }
        System.out.println(sum);
    }
}