package com.example.luyeptaptest;

public class PhanLoaiHL {
    public String phanLoai(Double diem){
        if (diem<0||diem>10) {
            throw new IllegalArgumentException("Diem phai > 0 va < 10");
        }
        if (diem >= 9){
            return "Xuat sac";
        } else if (diem >= 8) {
            return "Gioi";
        } else if (diem >= 6) {
            return "Kha";
        } else if (diem >= 5) {
            return "Trung binh";
        } else{
            return "Yeu";
        }
    }

}
