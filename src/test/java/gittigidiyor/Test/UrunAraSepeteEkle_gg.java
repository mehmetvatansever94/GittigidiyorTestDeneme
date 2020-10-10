package gittigidiyor.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrunAraSepeteEkle_gg extends BaseTest {
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
