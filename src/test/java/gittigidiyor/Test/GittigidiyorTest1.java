package gittigidiyor.Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GittigidiyorTest1 {
    @Test
    public void sampleTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver2 = new ChromeDriver();

        driver = new ChromeDriver();
        //driver2 = new FirefoxDriver();

        List<String> liste = new ArrayList<String>();
        liste = new LinkedList<String>(liste);

        driver.get("https://www.gittigidiyor.com");

        driver.findElement(By.xpath("//*[@data-cy='header-search-input']")).sendKeys("samsung");
        driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();

        driver.quit();
    }
}
