package testFirstPage;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestInputFrom2 extends SetUp {

    @Test
    public void testInput() {
        open("https://5n-dev-web.flyways.ru");
        $(By.cssSelector(".search-form__departure")).click();
        $(byText("Астрахань")).click();

    }

}
