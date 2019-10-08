package testFirstPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.Test;

public class TestTitle extends SetUp{

      @Test

    public void checkTitle() {

        open("https://5n-dev-web.flyways.ru/");
        $("title").shouldHave(attribute("text", "Нордавиа"));

    }


}
