/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bignum;
/**
 Tính tổng các số nguyên lớn
 */
import java.math.*;
import java.util.*;
public class O1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
