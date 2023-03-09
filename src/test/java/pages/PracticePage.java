package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticePage {

    public PracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@class='ns-jb617-e-18 button-common open-button']")
    public WebElement cookies;



    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passowrdKutusu;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement basariliGiris;

    @FindBy(xpath = "//ul[@class='woocommerce-error']")
    public  WebElement basarisizGirisText;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerButonu;


    @FindBy(id = "menu-item-40")
    public static WebElement shop;

    @FindBy(xpath = "//a[text()='Home']")
    public static WebElement home;

    @FindBy(xpath = "//p[text()='Out of stock']")
    public static WebElement stoktaYok;

    @FindBy(xpath = "(//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image'])[1]")
    public static WebElement stokdaOlmyanElement;

    @FindBy(xpath = "(//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image'])[3]")
    public static WebElement stokdaOlanElement;

    @FindBy(xpath = "//a[text()='Add to basket']")
    public static WebElement sepeteEkle;

    @FindBy(xpath = "//a[@title='View your shopping cart']")
    public static WebElement sepetMenu;

    @FindBy(id = "coupon_code")
    public static WebElement cuponcod;

    @FindBy(xpath = "//input[@value='Apply Coupon']")
    public static WebElement cuponUygula;




}
