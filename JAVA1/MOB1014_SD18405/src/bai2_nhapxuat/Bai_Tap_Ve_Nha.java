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
public class Bai_Tap_Ve_Nha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Nhap thong tin tra sua=======");
        
        
        System.out.println("Nhap hang tra sua");
        String ts = sc.nextLine();
        System.out.println("Nhap vi");
        String vi= sc.nextLine();
        System.out.println("Nhap topping");
        String topping = sc.nextLine();
        System.out.println("Nhap gia: ");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so luong: ");
         int sl = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap size: ");
        char size = sc.next().charAt(0);
        
        System.out.println("================Xuat==============");
        System.out.println("Hang ts: " + ts);
        System.out.println("Vi: " + vi);
        System.out.println("Topping: " + topping);
        System.out.println("Gia: " + gia + "VND");
        System.out.println("So luong: " + sl);
        System.out.println("Size(S,M,L): " + size);
        
        
    }
    
}
