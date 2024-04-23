package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BaseTest {

    By txtfirstname = By.id("customer.firstName");
    By txtlastname = By.id("customer.lastName");
    By txtadress = By.id("customer.address.street");
    By txtcity = By.id("customer.address.city");
    By txtstate = By.id("customer.address.state");
    By txtzipcode = By.id("customer.address.zipCode");
    By txtPhonenumber = By.id("customer.phoneNumber");
    By txtSSN = By.id("customer.ssn");
    By txtUsername = By.id("customer.username");
    By txtPassword = By.id("customer.password");
    By txtConfPass = By.id("repeatedPassword");

    By AlreadyUsersExist = By.id("customer.username.errors");

    By RegisterButton = By.xpath(" //*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public RegisterPage fillfirstname(String text) {
        driver.findElement(txtfirstname).sendKeys(text);
        return this;

    }

    public RegisterPage Filllastname(String text) {
        driver.findElement(txtlastname).sendKeys(text);
        return this;
    }

    public RegisterPage FillAdress(String text) {
        driver.findElement(txtadress).sendKeys(text);
        return this;
    }

    public RegisterPage FillCity(String text) {
        driver.findElement(txtcity).sendKeys(text);
        return this;
    }

    public RegisterPage FillState(String text) {
        driver.findElement(txtstate).sendKeys(text);
        return this;
    }

    public RegisterPage FillzipCode(String text) {
        driver.findElement(txtzipcode).sendKeys(text);
        return this;

    }

    public RegisterPage FillPhoneNumber(String text) {
        driver.findElement(txtPhonenumber).sendKeys(text);
        return this;

    }
    public RegisterPage FillSSN(String text) {
        driver.findElement(txtSSN).sendKeys(text);
        return this;
    }
    public RegisterPage Fillusername(String text) {
        driver.findElement(txtUsername).sendKeys(text);
        return this;
    }

    public RegisterPage FillPassword(String text) {
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    public RegisterPage FillRptPass(String text) {
        driver.findElement(txtConfPass).sendKeys(text);
        return this;

    }

    public RegisterPage RegButton() {
        driver.findElement(RegisterButton).click();
        return this;
    }
    public RegisterPage usernameErrorMesage() {

      boolean status =  driver.findElement(AlreadyUsersExist).isDisplayed();
        Assert.assertEquals(true,status);
        return this;
    }

}



