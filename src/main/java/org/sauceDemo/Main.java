package org.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //setar ChromeDriver
        WebDriver browser = new ChromeDriver();

        //abrir site
        browser.navigate().to("https://www.saucedemo.com/");
        browser.manage().window().maximize();

        //seletores a serem utilizados para login
        WebElement nameField =  browser.findElement(By.id("user-name"));
        WebElement passwordField = browser.findElement(By.id("password"));
        WebElement loginButton = browser.findElement(By.id("login-button"));

        //passos login
        nameField.sendKeys("standard_user");
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        passwordField.sendKeys("secret_sauce");
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        loginButton.click();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);


        //seletores a serem utilizados para add produto a carrinho de compras
        WebElement produtoParaComprar = browser.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        WebElement linkCarrinhoCompras = browser.findElement(By.className("shopping_cart_link"));


        //passos para adicionar ao carrinho
        produtoParaComprar.click();
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        linkCarrinhoCompras.click();
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //seletor e passo do Checkout
        WebElement btnCheckOut = browser.findElement(By.id("checkout"));
        btnCheckOut.click();
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //seletores e passos para realizar identificação da compra
        WebElement firstName = browser.findElement(By.id("first-name"));
        WebElement lastName = browser.findElement(By.id("last-name"));
        WebElement btnZip = browser.findElement(By.id("postal-code"));
        WebElement btnContinue = browser.findElement(By.id("continue"));

        firstName.sendKeys("Gisele");
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        lastName.sendKeys("Silva");
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        btnZip.sendKeys("90020008");
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        btnContinue.click();
        browser.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //seletor e finalização
        WebElement btnFinish = browser.findElement(By.id("finish"));

        btnFinish.click();

    }
}