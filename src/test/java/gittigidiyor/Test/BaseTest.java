package gittigidiyor.Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    @Before
    public void startTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
    }

    public void sendByDataCy(String dataCy, String value){
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).clear();
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).sendKeys(value);
    }

    public void clickByDataCy(String dataCy){
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).click();
    }
    public void sendById(String id, String value){
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void clickById(String id){
        driver.findElement(By.id(id)).click();
    }


}
