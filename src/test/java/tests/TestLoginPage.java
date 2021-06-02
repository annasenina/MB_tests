package tests;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import io.qameta.allure.Feature;

import static com.codeborne.selenide.Selenide.open;

@Tag("web")
@Feature("Login tests")
public class TestLoginPage extends TestBase{

    @Test
    @AllureId("1")
    @DisplayName("Можно посмотреть подсказку у поля \"Телефон\" ")
    void openMainPageTest(){
        open("https://multibonus.ru/");


    }

}
