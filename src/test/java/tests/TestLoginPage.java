package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import io.qameta.allure.Feature;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static com.codeborne.selenide.Selectors.byText;

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

    @Test
    @AllureId("2968")
    @DisplayName("При клике \"Забыли пароль\" открывается страница восстановления пароля\n ")
    void canClickForgetPasswordButtonTest(){
        step ("Открываем главную страницу", ()-> open("https://multibonus.ru/"));

        step ("Нажимаем на кнопку \"Забыли пароль?\"", ()-> $(byText("Забыли пароль?")).click());

        step ("Проверяем адрес страницы" );
    }

}
