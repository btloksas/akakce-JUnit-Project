package akakce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateAn_akakce_Account {

    WebDriver driver;

    public void mahserin4Atlisi(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void akakceTest() throws InterruptedException {
        mahserin4Atlisi();
        driver.get ("https://www.akakce.com");
        WebElement hesapAc= driver.findElement(By.xpath("(//a[@href=\"/akakcem/giris/?m=1&s=1\"])[1]"));
        hesapAc.click();

        WebElement Ad=driver.findElement(By.id("rnufn"));
        Ad.sendKeys("Betul");
        WebElement soyAd=driver.findElement(By.id("rnufs"));
        soyAd.sendKeys("Oksas");

        WebElement Email=driver.findElement(By.xpath("//input[@id=\"rnufe1\"]"));
        Email.sendKeys("btl.ky45@gmail.com");

        WebElement mailTekrar=driver.findElement(By.xpath("//input[@id=\"rnufe2\"]"));
        mailTekrar.sendKeys("btl.ky45@gmail.com");


        WebElement password=driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
        password.sendKeys("Btl1496.");

        WebElement passwordTekrar=driver.findElement(By.xpath("(//input[@type=\"password\"])[3]"));
        passwordTekrar.sendKeys("Btl1496.");

        WebElement gender=driver.findElement(By.cssSelector("span[class=\"radio_v8\"] input[id=\"rngf\"]"));
        gender.click();

        WebElement sehirSec=driver.findElement(By.id("locpr"));
        Select sehir=new Select(sehirSec);
        sehir.selectByValue("48");

        Thread.sleep(3000);

        WebElement ilceSec=driver.findElement(By.id("locds"));
        Select ılce=new Select(ilceSec);
        ılce.selectByValue("654");


        WebElement dogumTarihi=driver.findElement(By.id("bd"));
        Select dogum=new Select(dogumTarihi);
        dogum.selectByValue("19");


        WebElement dogumAy=driver.findElement(By.id("bm"));
        Select ay=new Select(dogumAy);
        ay.selectByValue("10");


        WebElement dogumYil=driver.findElement(By.id("by"));
        Select yıl=new Select(dogumYil);
        yıl.selectByValue("1991");

        WebElement sözlesmeKabul=driver.findElement(By.id("rnufpca"));
        sözlesmeKabul.click();

        WebElement submit=driver.findElement(By.id("rfb"));
        submit.click();




    }
}
