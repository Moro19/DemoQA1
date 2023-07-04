package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.AutomationPracticeFormPage;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class GenerationDataWithFaker extends TestBase {


    TestData data = new TestData();
    AutomationPracticeFormPage automationPracticeFormPage=new AutomationPracticeFormPage();



    @Test
   public void fillFormTest() {


        automationPracticeFormPage
                .openPage()
                .setUserFirstNameInput(data.firstName)
                .setUserLastNameInput(data.lastName)
                .setUserEmailInput(data.userEmail)
                .setUserPhoneInput(data.phone)
                .setUserGenderSection(data.gender)
                .setUserBOD(data.birthDateDay, data.birthDateMonth, data.birthDateYear)
                .setSubjects(data.subject)
                .setHobbies(data.hobby)
                .setImage(data.picture)
                .setCurrentAddressInput(data.address)
                .setState(data.state)
                .setCity(data.city)
                .clickSubmitButton();

    }






                /*.verifyTableValues("Student Name", nameFirst + " " + nameLast)
                .verifyTableValues("Student Email", email)
                .verifyTableValues("Gender", gender)
                .verifyTableValues("Mobile", phone)
                .verifyTableValues("Date of Birth", birthDateDay + " " + birthDateMonth + "," + birthDateYear)
                .verifyTableValues("Hobbies", hobby)
                .verifyTableValues("Picture", pictureName)
                .verifyTableValues("Address", currentAddress)
                .verifyTableValues("State and City", state + " " + city)
                .verifyTableValues("Subjects", subject1 + ", " + subject2);*/


    }





    