package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
/*
        driver.findElement(By.id("user-name")).sendKeys("toto");
        driver.findElement(By.id("password")).sendKeys("passwordemerde");
        driver.findElement(By.id("login-button")).click();
*/
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //String error = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        // System.out.println(error);
        //Assert.assertTrue(error.contains("Username and password do not match"));
        //Assert.assertNull(driver.findElement(By.cssSelector("data test error")));

        //manque les wait

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Bernadette");
        driver.findElement(By.id("last-name")).sendKeys("Danslasauce");
        driver.findElement(By.id("postal-code")).sendKeys("90210");

        driver.findElement(By.id("continue")).click();




    }
}
