package FullTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Test2 {
    @Before
    public void setConfig() {
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        Configuration.fastSetValue = false;
    }


    @Test
    public void nordAvia() {
        open("https://5n-dev-web.flyways.ru/");
        //open("https://5n-prod-web.flyways.ru/");

        $(byCssSelector(".search-form__departure")).click();
        $(byText("Архангельск")).should(exist).click();
        $(byCssSelector(".search-form__arrival")).click();
        $(byText("Москва")).should(exist).click();
        $(By.cssSelector(".search-form__departure-date")).click();
        $(byText(String.valueOf(new Date().getDate()+1))).click();
        $(byCssSelector("button")).click();
        $(By.cssSelector("div.results__flight-thither > div:nth-of-type(3)")).should(visible).$(byText("Стандарт")).click();
        $(byText("Продолжить покупку билета")).should(exist).click();
        $(By.cssSelector("[data-test-id='passenger-1-docNumber'")).click();
        actions().sendKeys("1234567890").perform();
        $(By.cssSelector("[data-test-id='passenger-1-lastname'")).click();
        actions().sendKeys("Шалагин").perform();
        $(By.cssSelector("[data-test-id='passenger-1-firstname'")).click();
        actions().sendKeys("Степан").perform();
        $(By.cssSelector("[data-test-id='passenger-1-birthdate'")).click();
        actions().sendKeys("24111982").perform();
        $(byText("Муж")).should(exist).click();
        $(By.cssSelector("[data-test-id='contact-email")).click();
        actions().sendKeys("6616896@mail.ru").perform();
        $(By.cssSelector("[data-test-id='contact-phone")).click();
        actions().sendKeys("179112709626").perform();
        $(byClassName("checkbox")).click();
        $(byText("Продолжить покупку билета")).should(visible).click();
        $(byText("Перейти к оплате билета")).waitUntil(visible, 5000).click();
        $(byText("Не надо, мне хватит")).waitUntil(visible, 5000).click();
        $(byText("Продолжить")).waitUntil(visible, 5000).click();
        //$(byText("Оплатить")).waitUntil(visible,5000);

    }
}
