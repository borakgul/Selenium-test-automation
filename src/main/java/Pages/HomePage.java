package Pages;

import Base.BaseTest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage extends BaseTest {

    By objTitle = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");// login olunca orada yazan overview'i alır
    By lblUsername = By.cssSelector("[id='rightPanel'] h1");


@Step("sayfa kontrolu saglanır {title}")
    public HomePage PageControl(String title) {
        String text = driver.findElement(objTitle).getText();

        Assert.assertEquals(title, text);
        return this;
    }

    public HomePage usernamecontrol(String Title) {
        String text = driver.findElement(lblUsername).getText();
        Assert.assertEquals(Title, text);

        return this;
    }
}
