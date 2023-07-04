package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
public class TestBase {


    @BeforeAll
    static void beforeAll() {


        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        //Configuration.browserSize = "1366x768";
        Configuration.browser = "Firefox";
        Configuration.holdBrowserOpen = true;
    }
}


