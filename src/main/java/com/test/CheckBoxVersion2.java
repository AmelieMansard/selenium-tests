package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxVersion2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //on récupère toutes les checkbox de la page
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));

        WebElement firstCheckbox = checkboxes.get(0);

// on récupère l'état de la checkbox dans un booléen
        boolean estCochee = firstCheckbox.isSelected();

        if (estCochee == true) {
            // elle est déjà cochée, on ne fait rien
            System.out.println("La première checkbox est déjà cochée");
        } else {
            // elle n'est pas cochée, on la coche
            firstCheckbox.click();
            System.out.println("On vient de cocher la première checkbox");
        }
    }
}
