package tests;

import config.AppiumConfig;
import dto.UserDTO;
import org.testng.annotations.Test;
import screen.SearchScreen;
import screen.SplashScreen;

import java.util.Random;

public class RegistrationTests extends AppiumConfig {

    @Test
    public void registrationPositiveTest(){
        int i = new Random().nextInt(1000);
        UserDTO user = UserDTO.builder()
                .name("Bilbo")
                .lastName("Baggins")
                .email("bilbo_baggins_"+i+"@mail.com")
                .password("Qwerty123_!")
                .build();
        new SplashScreen(driver)
                .goToSearchScreen()
                .clickBtnDots()
                .clickBtnRegistration();
    }
}
