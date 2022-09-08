package testsGithub;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "-10x0";
        Configuration.headless = true;
    }

    @BeforeEach
    void beforeEach() {
        open("https://github.com/");
    }
}
