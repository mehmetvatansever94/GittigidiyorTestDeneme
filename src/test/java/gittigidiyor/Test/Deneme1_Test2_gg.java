package gittigidiyor.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme1_Test2_gg extends BaseTest {
    WebDriver driver;

    @Test
    public void sampleTest(){
        sendByDataCy("header-search-input", "Televizyon");

        clickByDataCy("search-find-button");
    }
    @Test
    public void tvSec(){
        driver.findElement(By.id("//*[@id ='item-info-block-609354365']")).click();
    }
    @Test
    public void sepeteEkle(){
        driver.findElement(By.xpath("//*[@title ='Sepete Ekle']")).click();
    }



}
