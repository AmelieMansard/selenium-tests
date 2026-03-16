package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException {

        // On déclare le driver et on crée un ChromeDriver
        WebDriver driver = new ChromeDriver();

        // On ouvre Google
        driver.get("https://www.google.fr");

        // On maximise la fenêtre
        driver.manage().window().maximize();

        //on attends un max de dix secondes que les éléments chargent
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("L2AGLb"))).click();
        // on écris "twitch" dans la barre de recherche
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#APjFqb"))).sendKeys("devenir riche sur twitch");
        // puis on clique sur le bouton "rechercher"
        wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();

    }
}

