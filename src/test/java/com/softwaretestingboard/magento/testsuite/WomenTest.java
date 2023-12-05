package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //1.1 Mouse Hover on Women Menu
        homePage.mouseHoverToWomen();
        //1.2 Mouse Hover on Tops
        homePage.mouserHoverToTops();
        //1.3 Click on Jackets
        homePage.clickOnJackets();
        //1.4 Select Sort By filter “Product Name”
        womenPage.selectByProductName();
        //1.5 Verify the products name display in alphabetical order
        List<WebElement> element1 = driver.findElements(By.xpath("//strong[@class = 'product name product-item-name']"));
        String expectedText = "12 Items";
        String actualText = driver.findElement(By.xpath("(//div[@class='toolbar toolbar-products']//p[@id='toolbar-amount'])[1]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
     @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
         //2.1 Mouse Hover on Women Menu
         homePage.mouseHoverToWomen();
         //2.2 Mouse Hover on Tops
         homePage.mouserHoverToTops();
         //2.3 Click on Jackets
         homePage.clickOnJackets();
         //2.4 Select Sort By filter “Price”
         Thread.sleep(2000);
         womenPage.selectByPriceName();
         //2.5 Verify the products price display in Low to High
         womenPage.selectProductNameFilter("Price");
         //2.5 Verify the products price display in Low to High
         Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());

     }



}
