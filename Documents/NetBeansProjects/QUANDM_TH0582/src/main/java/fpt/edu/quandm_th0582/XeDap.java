/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.edu.quandm_th0582;

/**
 *
 * @author PC
 */
public class XeDap extends PhuongTien {

    private boolean coGioi;

    public boolean isCoGioi() {
        return coGioi;
    }

    public void setCoGioi(boolean coGioi) {
        this.coGioi = coGioi;
    }

    public XeDap() {
        super("","",0,"");
        coGioi = true;
    }

    public XeDap(String maPhuongTien, String tenPhuongTien, int vanTocToiDa, String loaiNhienLieu, boolean coGioi) {
        super(maPhuongTien, tenPhuongTien, vanTocToiDa, loaiNhienLieu);
        this.coGioi = coGioi;
    }
    public void inThongTinXeDap() {
        System.out.println("Phuong tien xe dap");
        super.inThongTin();
        System.out.println("Co phai xe co gioi ko: " + isCoGioi());
        System.out.println();
    }
}
