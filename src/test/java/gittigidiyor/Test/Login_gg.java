package gittigidiyor.Test;

import org.junit.Test;
import org.openqa.selenium.By;

public class Login_gg extends BaseTest {
    @Test
    public void ggLoginTest() {

        driver.findElement(By.xpath("//*[@title = 'Giriş Yap']")).click();
        driver.get("https://www.gittigidiyor.com/uye-girisi");

        sendById("L-UserNameField", "mehmet@gmail.com");
        sendById("L-PasswordField", "123456");
        clickById("gg-login-enter");
    }
}
