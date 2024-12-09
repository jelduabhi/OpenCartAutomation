package pom;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.CommonMethods;
import utils.ExtentReporter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends InitElements{

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement filterByDropDown;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    List<WebElement> inventoryPrice;
    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
            public WebElement productBtn;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
            public WebElement cartLnk;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
            public WebElement productLnk;
    @FindBy(id="remove-sauce-labs-backpack")
            public WebElement deleteBtn;

    CommonMethods methods=new CommonMethods();

    public void varifyPriceWithFilter() throws IOException {
       methods.selectValueFromDropDown(filterByDropDown,"Price (low to high)");
       List<String>priceDetails=new ArrayList<>();
       for(WebElement ele:inventoryPrice){
           priceDetails.add(ele.getText());
       }
        ExtentReporter.log(Status.PASS,"Filter Applied");
    }

    public void addProduct(String source){
        methods.waitForElement(2);
        methods.clickElement(productBtn);
        methods.clickElement(cartLnk);
        ExtentReporter.log(Status.PASS,"Product Added");
    }

    public void validateProductIsDeleted(){
        methods.clickElement(deleteBtn);
        if(methods.isElementNotPresent(productLnk)){
            ExtentReporter.log(Status.PASS,"Pass");
        }else{
            ExtentReporter.log(Status.FAIL,"FAIL");
            Assert.fail();
        }
    }
}
