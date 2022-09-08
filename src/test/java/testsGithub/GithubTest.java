package testsGithub;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest extends BaseTest{
    @Test
    void checkPrising() {
        $(byTagAndText("summary","Pricing" )).hover();
        $$(".dropdown-menu li").findBy(exactTextCaseSensitive("Compare plans")).click();
        $("div h1").shouldHave(exactTextCaseSensitive("Get the complete developer platform."));
    }
}
