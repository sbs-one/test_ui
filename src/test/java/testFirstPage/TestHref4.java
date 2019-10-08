package testFirstPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestHref4 extends SetUp{

    @Test
    public void testHref4(){
        open("https://5n-dev-web.flyways.ru/");
        $(By.partialLinkText("заказы")).shouldHave(attribute("href","https://5n-dev-web.flyways.ru/avia/ticket"));
        

    }

}
