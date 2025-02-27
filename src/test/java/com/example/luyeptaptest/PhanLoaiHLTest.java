package com.example.luyeptaptest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhanLoaiHLTest {
    PhanLoaiHL phanLoaiHL = new PhanLoaiHL();
    @Test
    public void testHLTuongDuong_10(){
        Assertions.assertEquals("Xuat sac",phanLoaiHL.phanLoai(10.0));
    }
    @Test
    public void testHLTuongDuong_8_5(){
        Assertions.assertEquals("Gioi",phanLoaiHL.phanLoai(8.5));
    }

    @Test
    public void testHLTuongDuong_7(){
        Assertions.assertEquals("Kha",phanLoaiHL.phanLoai(7.0));
    }
    @Test
    public void testHLTuongDuong_5_5(){
        Assertions.assertEquals("Trung binh",phanLoaiHL.phanLoai(5.5));
    }

    @Test
    public void testHLTuongDuong_4(){
        Assertions.assertEquals("Yeu",phanLoaiHL.phanLoai(4.0));
    }
    @Test
    public void testHLBienMin_0(){
        Assertions.assertEquals("Yeu",phanLoaiHL.phanLoai(0.0));
    }
    @Test
    public void testHLBienMax_10(){
        Assertions.assertEquals("Xuat sac",phanLoaiHL.phanLoai(10.0));
    }
    @Test
    public void testHLExp(){
        Assertions.assertThrows(IllegalArgumentException.class,()->phanLoaiHL.phanLoai(-1.0));
    }
    @Test
    public void testHLExp_11(){
        Assertions.assertThrows(IllegalArgumentException.class,()->phanLoaiHL.phanLoai(11.0));
    }
}