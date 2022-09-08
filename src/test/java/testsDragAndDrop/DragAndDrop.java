package testsDragAndDrop;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop extends BaseTestDragAndDrop{
    @Test
    public void dragAndDrop(){
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(Condition.exactTextCaseSensitive("B"));
    }

    @Test
    public void actionsDragAndDrop() {
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-a").shouldHave(Condition.exactTextCaseSensitive("B"));
    }
}
