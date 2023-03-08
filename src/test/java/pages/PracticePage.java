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





}
