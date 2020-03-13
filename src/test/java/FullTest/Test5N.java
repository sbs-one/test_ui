package FullTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.google.gson.annotations.Until;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Test5N {
    @Before
    public void setConfig() {
        Configuration.holdBrowserOpen = false;
        Configuration.headless = false;
        Configuration.fastSetValue = false;

    }


    @Test
    public void nordAvia() {
        //open("https://5n-dev-web.flyways.ru/");
        open("https://www.nordavia.ru/avia/");

        $(byCssSelector(".search-form__departure")).waitUntil(visible,5000).click();
        sleep(100);
        $(byText("Архангельск")).waitUntil(visible,5000).click();
        $(byCssSelector(".search-form__arrival")).click();
        $(byText("Москва")).should(exist).click();
        $(By.cssSelector(".search-form__departure-date")).click();
        Calendar calendar = new GregorianCalendar();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        sleep(1000);
        $(By.xpath("//button[@class='button button--intent-primary button--size-small button--with-icon button--rounded button--no-text control control--right'] ")).click();
        $(byText(String.valueOf(dayOfMonth))).click();
        $(byCssSelector("button")).click();
        //$(By.cssSelector("div.results__flight-thither > div:nth-of-type(3)")).should(visible).$(byText("Стандарт")).click();
        $(byText("Стандарт")).click();
        $(byText("Продолжить покупку билета")).should(exist).click();
        $(By.cssSelector("[data-test-id='passenger-1-docNumber'")).should(visible).click();
        actions().sendKeys("1234567890").perform();
        $(By.cssSelector("[data-test-id='passenger-1-lastname'")).click();
        actions().sendKeys("Шалагин").perform();
        $(By.cssSelector("[data-test-id='passenger-1-firstname'")).click();
        actions().sendKeys("Степан").perform();
        $(By.cssSelector("[data-test-id='passenger-1-birthdate'")).click();
        sleep(1000);
        actions().sendKeys("24111982").perform();
        $(byText("Муж")).should(exist).click();
        $(By.cssSelector("[data-test-id='contact-email")).click();
        actions().sendKeys("6616896@mail.ru").perform();
        $(By.cssSelector("[data-test-id='contact-phone")).click();
        actions().sendKeys("179112709626").perform();
        $(byClassName("checkbox")).click();

        $(byText("Продолжить покупку билета")).waitUntil(visible, 5000).click();
        sleep(10000);
        $(byText("Перейти к оплате билета")).waitUntil(exist, 5000).click();
        //$(byText("Не надо, мне хватит")).waitUntil(visible, 5000).click();
        $(byText("Продолжить")).should(visible).click();
        //$(byText("Оплатить")).waitUntil(visible,5000);

    }
}
