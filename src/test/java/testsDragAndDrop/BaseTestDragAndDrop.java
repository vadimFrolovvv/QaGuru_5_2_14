package testsDragAndDrop;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTestDragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "-10x0";
    }

    @BeforeEach
    void beforeEach() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }
}
