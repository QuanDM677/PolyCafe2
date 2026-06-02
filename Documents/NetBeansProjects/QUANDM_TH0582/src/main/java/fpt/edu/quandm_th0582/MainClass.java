/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.edu.quandm_th0582;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MainClass {

    public static void main(String[] args) {
        PhuongTienService pTS = new PhuongTienService();
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("1. Nhap thong tin phuong tien");
            System.out.println("2. Hien thi danh sach phuong tien");
            System.out.println("3. Tim kiem phuong tien theo van toc toi da");
            System.out.println("4. Thoat");
            System.out.println("5. Phuong tien xe dap");
            System.out.println("+----------------------------------------------------------+");
            System.out.print("Moi ban chon chuc nang: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    pTS.nhap();
                    break;
                case 2:
                    pTS.xuat();
                    break;
                case 3:
                    pTS.vanTTD();
                    break;
                case 4:
                    System.out.println("Thoat");
                    break;
                case 5:
                    pTS.inXeDap();
                    break;
                default:
                    System.out.println("Ko co chuc nang nay xin moi chon lai");
            }

        } while (choice != 4);
    }
}
