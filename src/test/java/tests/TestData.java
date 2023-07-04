package tests;


import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.AutomationPracticeFormPage;

import java.io.File;
import java.util.Locale;

public class TestData extends TestBase{
    //AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();
    Faker faker = new Faker(new Locale("it"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String address = faker.address().streetAddress();
    String phone = faker.phoneNumber().phoneNumber();
    String birthDateYear = faker.number().numberBetween(1900, 2022) + "";
    String birthDateMonth = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    String birthDateDay = String.valueOf(faker.number().numberBetween(1, 28));
    String gender = faker.options().option("Male", "Female", "Other");
    String subject = faker.options().option("Chemistry", "Computer Science", "Commerce",
            "Economics", "Social Studies", "Civics", "English", "Arts", "History", "Maths", "Phisics", "Biology", "Hindi");
    String hobby = faker.options().option("Sports", "Reading", "Music");
    String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    String city = setCityData(state);
           // String pictureName = "panda.jpg";
    File picture = new File("src/test/java/resources/img/panda.jpg");

    public String setCityData(String state) {
        String city = new String();
        switch (state) {
            case "NCR":
                city = faker.options().option("Delhi", "Gurgaon", "Noida");
                break;
            case "Uttar Pradesh":
                city = faker.options().option("Agra", "Lucknow", "Merrut");
                break;
            case "Haryana":
                city = faker.options().option("Karnal", "Panipat");
                break;
            case "Rajasthan":
                city = faker.options().option("Jaipur", "Jaiselmer");
                break;
            default:
        }
        return city;
    }


}