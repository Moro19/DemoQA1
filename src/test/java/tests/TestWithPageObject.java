package tests;
import org.junit.jupiter.api.Test;
import pages.AutomationPracticeFormPage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class TestWithPageObject extends TestBase{


    AutomationPracticeFormPage automationPracticeFormPage=new AutomationPracticeFormPage();

        @Test
        public void fillOutForm() {
            String
                    nameFirst = "Nikolay";
            String nameLast = "Milkin";
            String email = "hello@world.com";
            String gender = "Male";
            String phone = "4955642478";
            String subject1 = "Maths";
            String subject2 = "Arts";
            String hobby = "Sports";
            File picture = new File("src/test/java/resources/img/panda.jpg");
            String currentAddress = "Смоленская область, город Смоленск, ул. Раевского, д.6а";
            String birthDateYear = "1989";
            String birthDateMonth = "October";
            String birthDateDay = "20";
            String state = "Haryana";
            String city = "Panipat";

            automationPracticeFormPage
                    .openPage()
                    .setUserFirstNameInput(nameFirst)
                    .setUserLastNameInput(nameLast)
                    .setUserEmailInput(email)
                    .setUserPhoneInput(phone)
                    .setUserGenderSection(gender)
                    .setUserBOD(birthDateDay, birthDateMonth, birthDateYear)
                    .setSubjects(subject1, subject2)
                    .setHobbies(hobby)
                    .setImage(picture)
                    .setCurrentAddressInput(currentAddress)
                    .setState(state)
                    .setCity(city)
                    .clickSubmitButton()
                    .verifyTableValues("Student Name", nameFirst + " " + nameLast)
                    .verifyTableValues("Student Email", email)
                    .verifyTableValues("Gender", gender)
                    .verifyTableValues("Mobile", phone)
                    .verifyTableValues("Date of Birth", birthDateDay + " " + birthDateMonth + "," + birthDateYear)
                    .verifyTableValues("Hobbies", hobby)
                    .verifyTableValues("Picture", "panda.jpg")
                    .verifyTableValues("Address", currentAddress)
                    .verifyTableValues("State and City", state + " " + city)
                    .verifyTableValues("Subjects", subject1 + ", " + subject2);



        }


}

