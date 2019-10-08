package testFirstPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


import org.apache.http.impl.BHttpConnectionBase;
import org.junit.Test;

public class TestHref1 extends SetUp{



    @Test

public void testHref1() {

        open("https://5n-dev-web.flyways.ru/");
        $(element(".site-logo")).shouldHave(attribute("href", "https://www.nordavia.ru/"));



}

}
