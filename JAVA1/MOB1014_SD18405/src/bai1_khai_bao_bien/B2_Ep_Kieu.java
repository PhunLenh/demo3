/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_khai_bao_bien;

/**
 *
 * @author duyye
 */
public class B2_Ep_Kieu {
    public static void main(String[] args) {
        //phan 1: ep kieu giua cac so
        // ep kieu ngam dinh
        int a = 10;
        double b = a;
        System.out.println("b= "+b);
        // ep kieu tuong minh
        double c =7.4;
        int d= (int)c;
        System.out.println("d= "+d);
        
        // phan 2: ep kieu tu string ve so
       String num1 = "4";
       String num2 = "6";
       String sum = num1 + num2;//cong chuoi
       System.out.println("sum= " + sum);
       
       int n1= Integer.parseInt(num1);
       int n2= Integer.parseInt(num2);
       int tong = n1 + n2;
       System.out.println("tong=" + tong);
       // ép kiểu từ string về double
       double so1= Double.parseDouble(num1);
       double so2= Double.parseDouble(num2);
       double result= so1+so2;
        System.out.println("result "+ result);
               
       
       /* lơp bao- wrapper
       đối với mỗi kiểu dữ liệu nguyên thuỷ,
       => 1 lớp bao tương ứng
       int => Integer
       double => double
       float => Float
       char => character5
       */
           
        
    }
    
}
