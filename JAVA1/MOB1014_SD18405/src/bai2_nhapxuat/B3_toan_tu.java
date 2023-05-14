/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_nhapxuat;

import java.util.Scanner;

/**
 *
 * @author duyye
 */
public class B3_toan_tu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("===nhap xuat thong tin dien thoai");
        System.out.println("ma dien thoai");
        String dt = sc.nextLine();
        System.out.println("ten");
        String ten = sc.nextLine();
        System.out.println("gia");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap dung luong dien thoai: ");
        //int dungLuong = sc.nextInt();
        int dungLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap trang thai may (true/false): ");
        boolean trangThai= Boolean.parseBoolean(sc.nextLine());

        System.out.println("====xuat===");
        System.out.println("ma dien thoai:"+  dt);
        System.out.println("ten:"+ ten);
        System.out.println("gia:"+ gia);
         System.out.println("Dung Luong: " + dungLuong);
        //String tt = (trangThai == true) ? "May moi" : "May cu~!";
        //trangThai == true
        System.out.println("Trang thai: " + (trangThai ? "May moi" : "May cu"));
        //trangThai == false
        System.out.println("Trang thai: " + (!trangThai ? "May cu" : "May moi"));
            
        
        
    }
    
}
