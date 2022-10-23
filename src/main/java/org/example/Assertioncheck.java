package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertioncheck {

    @Test
    public void AssertionFailure() {
        SoftAssert softAssertion = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohoshi.haque\\Downloads\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://duckduckgo.com/");

        String actualTitle = "DuckDuckGo — Privacy, simplified";

        String expectedTitle = driver.getTitle();
        String expectedText1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]")).getText();

        /* Soft Assert */
        softAssertion.assertEquals(expectedTitle, actualTitle, "Incorrect page title");
        softAssertion.assertEquals("Privacy Protection For Any Device", expectedText1);
    }

    @Test
    public void print() {
        System.out.println("Soft Assertion is displayed");
    }

}