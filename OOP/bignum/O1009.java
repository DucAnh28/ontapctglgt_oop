/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bignum;
/**
 Kiem tra chia het
 */
import java.math.*;
import java.util.*;
public class O1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        BigInteger zero = new BigInteger("0");
        while(t-- > 0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            if(a.mod(b).equals(zero) || b.mod(a).equals(zero)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
