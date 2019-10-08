package testFirstPage;


import org.junit.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class TestHref2 extends SetUp{

    @Test

public void testHref2() {

        open("https://5n-dev-web.flyways.ru");
        $(By.partialLinkText("Регистрация")).shouldHave(attribute("href","https://www.nordavia.ru/check/?lang=ru/"));




}

}
