package com.example.luyeptaptest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Seleium {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }
    @Test
    public void test_dang_nhap(){
        chromeDriver.get("https://vitimex.com.vn");
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("account")));
        element.sendKeys("phamthu0827@gmail.com");
        WebElement inputPass = chromeDriver.findElement(By.xpath("//*[@id=\"pass\"]"));
        inputPass.sendKeys("0977");
        WebElement btnDN = chromeDriver.findElement(By.xpath("//*[@id=\"signin-btn\"]"));
        btnDN.click();
    }
    @Test
    public void test_dangKi(){
        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
        WebElement inputName = chromeDriver.findElement(By.xpath("//*[@id=\"name\"]"));
        inputName.sendKeys("Pham Thu");
        WebElement inputPhone = chromeDriver.findElement(By.xpath("//*[@id=\"phone\"]"));
        inputPhone.sendKeys("0924516343");
        WebElement inputEmail = chromeDriver.findElement(By.xpath("//*[@id=\"email\"]"));
        inputEmail.sendKeys("phamthu0827@gmail.com");
        WebElement inputPass= chromeDriver.findElement(By.xpath("//*[@id=\"pass-regis\"]"));
        inputPass.sendKeys("0977");
        WebElement inputConf = chromeDriver.findElement(By.xpath("//*[@id=\"pass-confirm\"]"));
        inputConf.sendKeys("0977");
//        WebElement btnDN = chromeDriver.findElement(By.xpath("//*[@id=\"register-btn\"]"));
//        btnDN.click();
    }
}
