package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchScreen extends BaseScreen{
    public SearchScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/title' and @text='Registration']")
    MobileElement btnRegistration;
    @FindBy(xpath = "//*[@text='Login']")
    MobileElement btnLogin;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    MobileElement btnDots;

    public SearchScreen clickBtnDots() {
        click(btnDots);
        return this;
    }

    public RegistrationScreen clickBtnRegistration() {
        click(btnRegistration);
        return new RegistrationScreen(driver);
    }
}
