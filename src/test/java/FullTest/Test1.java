package FullTest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test1 {
    @Before
    public void setConfig() {
        Configuration.holdBrowserOpen = true;
    }


    @Test
    public void nordAvia() {
        open("https://5n-dev-web.flyways.ru/");
        $(byCssSelector(".search-form__departure")).$(byCssSelector(".search-form-airport-suggest input")).setValue("Архангельск");
        $(byCssSelector(".search-form__arrival")).$(byCssSelector(".search-form-airport-suggest input")).setValue("Москва");
        $(byCssSelector(".search-form__departure-date")).click();
        $(byText("31")).click();
        $(byText("Найти")).click();
        $(By.cssSelector("к:nth-of-type(3")).$(byText("Лайт")).click();
        $(byText("Продолжить покупку билета")).click();
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div[3]/div/div[1]/input")).setValue("1111111111");
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div[4]/div/div/input")).setValue("Шалагин");
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div[5]/div/div/input")).setValue("Степан");
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div[6]/div/input")).setValue("24.11.1982");
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/form/div/div[7]/div/button[2]/div")).click();
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[3]/form/div/div[1]/div/div[1]/div/input")).setValue("6616896@mail.ru");
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[3]/form/div/div[2]/div/input")).setValue("179112709626");
        $(byClassName("checkbox")).click();
        $(byText("Продолжить покупку билета")).click();
        $(byText("Перейти к оплате билета"));
        $(byText("Продолжить")).shouldBe(visible).click();
        $(By.xpath("//*[@id=\"cardccnumber\"]")).setValue("5100 0000 0000 0008");
        $(By.xpath("//*[@id=\"cc_year\"]")).setValue("20");
        $(By.xpath("//*[@id=\"cardcccode\"]")).setValue("222");
        $(By.xpath("//*[@id=\"ccholder\"]")).setValue("stepan stepan");




















    }
}
