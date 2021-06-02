package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import io.qameta.allure.Feature;
import static io.qameta.allure.Allure.step;

import static com.codeborne.selenide.Selenide.open;

@Tag("web")
@Feature("Login tests")
public class TestLoginPage extends TestBase{

    @Test
    @AllureId("2965")
    @DisplayName("Можно посмотреть подсказку у поля \"Телефон\" ")
    void canWatchPasswordPhoneTest(){

        step ("Открываем главную страницу", ()-> open("https://multibonus.ru/"));


    }

    @Test
    @AllureId("2966")
    @DisplayName("Можно посмотреть подсказку у поля \"Пароль\" ")
    void canWatchPasswordTooltipTest(){

        step ("Открываем главную страницу", ()-> open("https://multibonus.ru/"));


    }

}
