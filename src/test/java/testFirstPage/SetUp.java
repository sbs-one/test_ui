package testFirstPage;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public abstract class SetUp {

    @Before
    public final void setUpBrowser() {
        Configuration.headless = true;
    }
}
