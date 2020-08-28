package PageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class menuPage
{
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a ")
    public WebElement btn_Computers;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
    public WebElement link_Desktops;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
    public WebElement link_Notebooks;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a")
    public WebElement link_Software;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    public WebElement btn_Electronics;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a")
    public WebElement link_CameraPhoto;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]")
    public WebElement link_openCameraItem;

    @FindBy(id = "add-to-cart-button-14")
    public WebElement btn_addToCart;

    @FindBy(linkText = "Cell phones ")
    public WebElement link_CellPhones;

    @FindBy(linkText = "Others ")
    public WebElement link_Others;

    @FindBy(linkText = "Apparel ")
    public WebElement btn_Apparel;

    @FindBy(linkText = "Shoes ")
    public WebElement link_Shoes;

    @FindBy(linkText = "Clothing ")
    public WebElement link_Clothing;

    @FindBy(linkText = "Accessories ")
    public WebElement link_Accessories;

    @FindBy(linkText = "Digital downloads ")
    public WebElement btn_DigitalDownloads;

    @FindBy(linkText = "Books ")
    public WebElement btn_Books;

    @FindBy(linkText = "Jewelry ")
    public WebElement btn_Jewelry;

    @FindBy(linkText = "Gift Cards ")
    public WebElement btn_GiftCards;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    public WebElement bar_btn_shoppingCart;

    @FindBy(className = "cart-label")
    public WebElement btn_shoppingCart;

    @FindBy(className = "cart-qty")
    public WebElement txt_qtyCart;

}
