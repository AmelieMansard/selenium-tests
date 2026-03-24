package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //on récupère toutes les checkbox de la page
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));

        //0 = premiere checkbox, 1 = deuxième
        WebElement firstCheckbox = checkboxes.get(0);
        //WebElement secondCheckbox = checkboxes.get(1);

        // s'assurer qu'elle est cochée

        if (!firstCheckbox.isSelected()) {
            firstCheckbox.click();
            System.out.println("On vient de cocher la première checkbox");
        }


    }

}
