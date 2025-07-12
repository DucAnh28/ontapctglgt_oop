/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepnhanvien;

import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i=1; i<=n; i++){
            NhanVien a = new NhanVien(i, in.nextLine(), in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(NhanVien nv : ds){
            System.out.println(nv);
        }
    }
}

