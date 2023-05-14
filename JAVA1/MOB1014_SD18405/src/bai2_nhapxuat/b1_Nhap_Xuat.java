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
public class b1_Nhap_Xuat {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("====Nhap====");
        System.out.println("Nhap ten NYC:");
        String ten= sc.nextLine();
        System.out.println("===xuat===");
        System.out.println("Ten NYC: "+ ten);
        System.out.println("Nhap tuoi nyc:");
        int tuoi = Integer.parseInt(sc.nextLine());
                
    }
    
}
