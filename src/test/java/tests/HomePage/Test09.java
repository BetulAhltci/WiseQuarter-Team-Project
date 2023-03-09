package tests.HomePage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.PracticePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Test09 {

    @Test
    public void Test09() {

        // 1) Open the browser
        //     tarayıcıyı aç
        // 2) Enter the URL “http://practice.automationtesting.in/”
        //     "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("practiceUrl"));

        // 3) Click on Shop Menu
        //     Mağaza Menüsüne tıklayın
        PracticePage pages = new PracticePage();
        PracticePage.shop.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();


        // 4) Now click on Home menu button
        //     Şimdi Ana menü düğmesine tıklayın
        PracticePage.home.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

        // 5) Test whether the Home page has Three Arrivals only
        //     Ana sayfada yalnızca Üç Varış olup olmadığını test edinn
        List<WebElement> element = Driver.driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));
        int size = element.size();
        Assert.assertEquals(size, 3);

        // 6) The Home page must contains only three Arrivals
        //     Ana sayfa yalnızca üç Varış içermelidir
        // 7) Now click the image in the Arrivals
        //     Şimdi Gelenler'deki resme tıklayın
        PracticePage.stokdaOlmyanElement.click();

        // 8) Test whether it is navigating to next page where the user can add that book into his basket.
        //     Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.
        Assert.assertTrue(PracticePage.stoktaYok.isDisplayed());
        Driver.getDriver().navigate().back();

        // 9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
        //     Resim tıklanabilir olmalı ve kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gitmelidir.
        PracticePage.stokdaOlanElement.isEnabled();

        // 10) Click on the Add To Basket button which adds that book to your basket
        //     O kitabı sepetinize ekleyen Sepete Ekle düğmesine tıklayın
        PracticePage.sepeteEkle.click();

        // 11) User can view that Book in the Menu item with price.
        //     Kullanıcı o Kitabı Menü öğesinde fiyatla görüntüleyebilir.
        PracticePage.sepetMenu.isDisplayed();

        // 12) Now click on Item link which navigates to proceed to check out page.
        //     Şimdi, ödeme sayfasına ilerlemek için gezinen Öğe bağlantısına tıklayın.
        // 13) User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
        //     Kullanıcı, kitabı sepete ekledikten sonra, ödeme sayfasına yönlendiren menü öğesindeki Öğe bağlantısına tıklayabilir.
        PracticePage.sepetMenu
                .click();

        // 14) Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
        //      Toplamda 50rps indirim kazanmak için Kupon kodunu "krishnasakinala" olarak girin.
        PracticePage.cuponcod.sendKeys("krishnasakinala");

        // 15) User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price
        //     Kullanıcı, toplam fiyat üzerinden 50rps indirim sağlayan kupon metin kutusuna "krishnasakinala" yazarak kupon uygulayabilir
        PracticePage.cuponUygula.click();


    }
}


