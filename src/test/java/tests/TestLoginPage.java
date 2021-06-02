package tests;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import io.qameta.allure.Feature;

import static com.codeborne.selenide.Selenide.open;

@Tag("web")
@Feature("Login tests")
public class TestLoginPage {

    @Test
    @AllureId("1")
    @DisplayName("Successful login with Google account")
    void openMainPageTest(){
        open("https://multibonus.ru/");
    }

}
