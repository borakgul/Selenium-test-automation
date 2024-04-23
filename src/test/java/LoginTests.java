import Base.BaseTest;
import Pages.HomePage;
import Pages.MainPage;
import Pages.loginPage;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import Pages.RegisterPage;
@Feature("Login Test Senaryoları")
public class LoginTests extends BaseTest {
    //String Giristegozukmesigerekendeger = "Accounts Overview";
    RegisterPage RegisterPage = new RegisterPage();
    loginPage loginPage = new loginPage();
    MainPage mainPage = new MainPage();
    HomePage HomePage = new HomePage();

    @Test(description = "TC001")
    public void TEST1(){

        loginPage.fillusername("TESTTT1")
                  .fillpassword("TEST12")
                  .clicklogin();
// test
        mainPage
                .errorMessageControl(errorMessage2);


    }
    @Test(description = "HATALI GIRIS ")
    public void FailUser(){

        loginPage.fillusername("TEST")
                .fillpassword("TEST")
                .clicklogin();
        mainPage
                .errorMessageControl2(errorMessage2);

    }

    @Test(description = "Boş veri testi")
    public void NoneDataTest(){

        loginPage.fillusername("")
                 .fillpassword("")
                 .clicklogin();
       // Please enter a username and password.
        mainPage.
                errorMessageControl2(errorMessage3);

    }
    @Test(description = "Çok fazla tuş atama testi")
    public void maxChar(){

        loginPage.fillusername("tASDSADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDext")
             .fillpassword("qqAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
             .clicklogin();

        String text3 = driver.findElement(By.cssSelector("[class='error']")).getText();

        System.out.println(text3);
        Assert.assertEquals("An internal error has occurred and has been logged.",text3);


    }
    @Test(description = "Başarılı giriş testi")
    public void Success(){
        loginPage
                .clickrregister();
        RegisterPage
                .fillfirstname("asas")
                .Filllastname("QA TEST")
                .FillAdress("Deneme mah")
                .FillCity("ISTANBUL")
                .FillState("SISLI")
                .FillzipCode("34000")
                .FillPhoneNumber("54345670")
                .FillSSN("123123123")
                .Fillusername("TESTTT")
                .FillPassword("TEST12")
                .FillRptPass("TEST12")
                .RegButton();

        loginPage
                .fillusername("TESTTT")
                .fillpassword("TEST12")
                .clicklogin();
        HomePage
                .PageControl("Accounts Overview");



    }


}