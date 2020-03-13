package FullTest;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestWZ {
    @Before
    public void setConfig() {
        Configuration.holdBrowserOpen = true;
        Configuration.headless = true;
        Configuration.fastSetValue = false;

    }


    @Test
    public void nordAvia() {
        //open("https://5n-dev-web.flyways.ru/");
        open("https://wz-prod-web.flyways.ru/");

        $(byCssSelector(".search-form__departure")).waitUntil(visible,5000).click();
        sleep(100);
        $(byText("Москва")).waitUntil(visible,5000).click();
        $(byCssSelector(".search-form__arrival")).click();
        $(byText("Сочи")).should(exist).click();
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
