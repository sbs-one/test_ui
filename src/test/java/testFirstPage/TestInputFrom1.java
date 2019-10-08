package testFirstPage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class TestInputFrom1 extends SetUp {

    @Test
    public void testInput() {
        open("https://5n-dev-web.flyways.ru");
        $(By.cssSelector(".search-form__departure")).click();
        $(byText("Архангельск")).click();

    }

}
