package com.example.student.bai5;

public class BanSach {
    private double tongDoanhThu;
    private int tongKhachHang;
    private int tongKhachVip;

    public BanSach(double tongDoanhThu, int tongKhachHang, int tongKhachVip) {
        this.tongDoanhThu = tongDoanhThu;
        this.tongKhachHang = tongKhachHang;
        this.tongKhachVip = tongKhachVip;
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public int getTongKhachHang() {
        return tongKhachHang;
    }

    public void setTongKhachHang(int tongKhachHang) {
        this.tongKhachHang = tongKhachHang;
    }

    public int getTongKhachVip() {
        return tongKhachVip;
    }

    public void setTongKhachVip(int tongKhachVip) {
        this.tongKhachVip = tongKhachVip;
    }

    public double tinhTien(int soLuongSach, boolean isVip) {
        if (isVip) {
            return  20000*soLuongSach - (20000*soLuongSach*0.1);
        } else {
            return 20000*soLuongSach;
        }
    }
}
