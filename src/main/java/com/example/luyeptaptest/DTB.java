package com.example.luyeptaptest;

public class DTB {
    public Double diemTB(Double a, Double b, Double c) {
        if (a < 0.0 || b < 0.0 || c < 0.0) {
            throw new IllegalArgumentException("Diem > 0");
        }else {
            double dtb = (a + b + c) / 3;
            if (dtb > 10.0){
                throw new IllegalArgumentException("sai r");
            }
            return dtb;
        }
    }
}
