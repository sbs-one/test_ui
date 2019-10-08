package testFirstPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.attribute;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestHref3 extends SetUp{

    @Test
    public void testHref3() {

        open("https://5n-dev-web.flyways.ru");
        $(By.partialLinkText("Поддержка")).shouldHave(attribute("href", "https://www.nordavia.ru/about/feedback/"));
    }


}
