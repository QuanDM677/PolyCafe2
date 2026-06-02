/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.edu.quandm_th0582;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PhuongTienService {

    private final ArrayList<PhuongTien> ListPhuongTien = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void nhap() {
        int i;
        int soTT = 1;
        System.out.println("Nhap danh sach phuong tien");
        do {
            System.out.println("Nhap phuong tien thu " + soTT);
            System.out.print("Nhap ma phuong tien: ");
            String maPhuongTien = scan.nextLine();
            System.out.print("Nhap ten phuong tien: ");
            String tenPhuongTien = scan.nextLine();
            System.out.print("Nhap van toc toi da: ");
            int vanTocToiDa = scan.nextInt();
            if (vanTocToiDa < 0) {
                do {
                    System.out.println("Van toc phai > 0 xin mooi nhap lai");
                    System.out.print("Nhap van toc toi da: ");
                    vanTocToiDa = scan.nextInt();
                } while (vanTocToiDa < 0);
            }
            scan.nextLine();
            System.out.print("Nhap nhien lieu: ");
            String loaiNhienLieu = scan.nextLine();
            PhuongTien PT = new PhuongTien(maPhuongTien, tenPhuongTien, vanTocToiDa, loaiNhienLieu);
            ListPhuongTien.add(PT);
            System.out.print("Ban co nhap them thong tin phuong tien 1.Co,0.Thoat: ");
            i = scan.nextInt();
            soTT++;
            scan.nextLine();
            System.out.println();
        } while (i == 1);
        System.out.println();
    }

    public void xuat() {
        int soTT = 1;
        System.out.println("Xuat danh sach phuong tien");
        for (PhuongTien phuongTien : ListPhuongTien) {
            System.out.println("Phuong tien thu " + soTT);
            phuongTien.inThongTin();
            System.out.println();
            soTT++;
        }
        System.out.println();
    }

    public void vanTTD() {
        System.out.println("Xuat danh sach phuong tien tren van toc toi da");
        System.out.print("Nhap van toc toi thieu: ");
        int toiThieu = scan.nextInt();
        boolean found = false;
        for (PhuongTien phuongTien : ListPhuongTien) {
            if (phuongTien.getVanTocToiDa() > toiThieu) {
                phuongTien.inThongTin();
                found = true;
            }
            System.out.println();
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien trong khoang luong nay.");
        }
        System.out.println();
    }

    public void inXeDap() {
        XeDap sd = new XeDap();
        sd.inThongTinXeDap();
        System.out.println();
    }
}
