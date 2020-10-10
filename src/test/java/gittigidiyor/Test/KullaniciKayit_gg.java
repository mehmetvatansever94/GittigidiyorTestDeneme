package gittigidiyor.Test;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;

public class KullaniciKayit_gg extends BaseTest{

    @Test
            public void kayitol(){
        driver.get("https://www.gittigidiyor.com/kayit-ol");

        driver.findElement(By.xpath(".//input[@name='name']")).sendKeys("asdasd");
        driver.findElement(By.xpath(".//input[@name='surname']")).sendKeys("asdasd");
        driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("asdasd@hotmail.com");
        driver.findElement(By.xpath(".//input[@name='passwd']")).sendKeys("asdas1dasd");
        driver.findElement(By.xpath(".//input[@name='gsmData']")).sendKeys("5554443322");
        driver.findElements(By.className("checkmark"));
        clickById("SubmitForm");

    }

}
