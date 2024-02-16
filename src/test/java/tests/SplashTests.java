package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screen.SplashScreen;

public class SplashTests extends AppiumConfig {

    @Test
    public void validateVersion(){
        Assert.assertTrue(new SplashScreen(driver).validateVersionApp());
    }
}
