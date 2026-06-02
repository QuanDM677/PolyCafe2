/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.edu.quandm_th0582;

/**
 *
 * @author PC
 */
public class PhuongTien {

    protected String maPhuongTien;
    protected String tenPhuongTien;
    protected int vanTocToiDa;
    protected String loaiNhienLieu;

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public int getVanTocToiDa() {
        return vanTocToiDa;
    }

    public void setVanTocToiDa(int vanTocToiDa) {
        this.vanTocToiDa = vanTocToiDa;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public PhuongTien(String maPhuongTien, String tenPhuongTien, int vanTocToiDa, String loaiNhienLieu) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.vanTocToiDa = vanTocToiDa;
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public PhuongTien() {
        maPhuongTien = "";
        tenPhuongTien = "";
        vanTocToiDa = 0;
        loaiNhienLieu = "";

    }

    public void inThongTin() {
        System.out.println("Ma phuong tien: " + getMaPhuongTien());
        System.out.println("Ten phuong tien: " + getTenPhuongTien());
        System.out.println("Van toc toi da: " + getVanTocToiDa());
        System.out.println("Nhien lieu: " + getLoaiNhienLieu());
    }
}
