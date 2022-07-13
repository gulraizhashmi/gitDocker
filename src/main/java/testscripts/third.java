package testscripts;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class third {
    @Test
    public void testthree() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.edge();
        URL url= new URL("http://"+System.getenv("HUB_HOST")+":4444/wd/hub");
   //     URL url= new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("http://www.google.com");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.quit();
    }
}
