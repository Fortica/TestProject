import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/larisa/Documents/INTELLIJ/WebDriver/bin/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://qa-mesto.praktikum-services.ru/");
        driver.findElements(By.id("email"));

        Thread.sleep(3000L);
        driver.quit();
    }

}