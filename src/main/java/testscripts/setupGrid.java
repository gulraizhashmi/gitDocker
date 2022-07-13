package testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class setupGrid {
    @BeforeTest
    void startDockerGrid() throws IOException, InterruptedException {
        System.out.println(System.getProperty("user.dir"));

        Runtime.getRuntime().exec("sh "+System.getProperty("user.dir")+"/start_dockerGrid.sh");
        Thread.sleep(15000);
        //System.out.println(Runtime.getRuntime().exec("docker ps"));
        System.out.println(System.getenv("HUB_HOST"));
        System.out.println(System.getenv("HUB_HOST"));

    }
    @AfterTest
    void endDockerGrid() throws IOException, InterruptedException{
        Runtime.getRuntime().exec("sh "+System.getProperty("user.dir")+"/end_dockerGrid.sh");
        Thread.sleep(5000);

    }
}
