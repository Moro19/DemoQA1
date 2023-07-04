package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;
import static io.qameta.allure.Allure.step;


public class DemoQA  extends TestBase{

    @Test
    @Tag("remote")
    void fillFormTest()  {
        step("Open form", () -> {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        });

        step("Fill form", () -> {
                    $("#firstName").setValue("Nikolay");
                    $("#lastName").setValue("Milkin");
                    $("#userEmail").setValue("ya@ya.ru");
                    $("#genterWrapper").$(byText("Male")).click();
                    $("#userNumber").setValue("4955642478");
                    $("#dateOfBirthInput").click();
                    $(".react-datepicker__month-select").click();
                    $(byText("January")).click();
                    $(".react-datepicker__year-select").click();
                    $(byText("1989")).click();
                    $(".react-datepicker__day.react-datepicker__day--019").click();
                    $("#subjectsInput").setValue("Maths").pressEnter();
                    $("#subjectsInput").setValue("Computer Science").pressEnter();
                    $("#hobbiesWrapper").$(byText("Sports")).click();
                    $("#uploadPicture").uploadFile(new File("src/test/java/resources/img/panda.jpg"));
                    $("#currentAddress").setValue("Смоленская область, город Смоленск, ул. Раевского, д.6а");
                    $(byText("Select State")).click();
                    $(byText("Rajasthan")).click();
                    $("#city").click();
                    $(byText("Jaiselmer")).click();
                    $("button#submit").click();
                });

        step("Verify result", () -> {
            $(".modal-dialog").should(appear);
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").shouldHave(text("Nikolay"), text("Milkin"), text("ya@ya.ru"), text("4955642478"),
                    text("Смоленская область, город Смоленск, ул. Раевского, д.6а"));
        });
    }
}
