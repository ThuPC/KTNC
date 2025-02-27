package com.example.luyeptaptest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DTBTest {
    DTB dtb = new DTB();
    @Test
    void testBienMax_10(){
        Assertions.assertEquals(10,dtb.diemTB(10.0,10.0,10.0));
    }
    @Test
    void testBienMin_0(){
        Assertions.assertEquals(0.0,dtb.diemTB(0.0,0.0,0.0));
    }
    @Test
    public void testDTBTuongDuong(){
        Assertions.assertEquals(5.0,dtb.diemTB(7.5,1.0,6.5));
    }
    @Test
    void testExp1(){
        Assertions.assertThrows(IllegalArgumentException.class,()->dtb.diemTB(-1.0,9.5,6.0));
    }
    @Test
    void testExp2(){
        Assertions.assertThrows(IllegalArgumentException.class,()->dtb.diemTB(15.0,9.5,6.0));
    }
}