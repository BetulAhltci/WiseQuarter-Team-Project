package test.Berkan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC03 {


        @Test
        public void tc03(){


    //3. Home page - Images in Arrivals should navigate

    HomePage homePage=new HomePage();

    //2) Enter the URL “http://practice.automationtesting.in/” - “http://practice.automationtesting.in/” URL'sini girin.
    Driver.getDriver().get(ConfigReader.getProperty("practiceUrl"));
    ReusableMethods.bekle(3);

    //3) Click on Shop Menu - Mağaza menüsüne tıklayın
    homePage.shop.click();
    Driver.getDriver().navigate().back();
    Driver.getDriver().navigate().forward();

    //4) Now click on Home menu button - Şimdi Ana Sayfa Menü düğmesine tıklayın
    homePage.homeButonu.click();
    Driver.getDriver().navigate().back();
    Driver.getDriver().navigate().forward();

    //5) Test whether the Home page has Three Arrivals only - Ana sayfanın yalnızca üç varış sahibi olup olmadığını test edin


    //6) The Home page must contains only three Arrivals - Ana sayfa yalnızca üç geliş içermelidir
    int threeArrivalsElementleri= Driver.getDriver().findElements(By.xpath("//div[@class='woocommerce']")).size();
    int expected = 3;
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(threeArrivalsElementleri,expected);

    //7) Now click the image in the Arrivals - Şimdi gelenlerdeki resmi tıklayın

    //8) Test whether it is navigating to next page where the user can add that book into his basket.
    // - Kullanıcının bu kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.

    //9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
    // - Görüntü tıklanabilir olmalı ve kullanıcının bu kitabı sepetine ekleyebileceği bir sonraki sayfaya geçmelidir


        }
}
