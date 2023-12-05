package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //1.1 Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.hoverOnGear();
        //1.2 Click on Bags
        Thread.sleep(2000);
        homePage.clickOnBags();
        //1.3 Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnDuffle();
        //1.4 Verify the text ‘Overnight Duffle’
        Thread.sleep(2000);
        String expectedText = "Overnight Duffle";
        String actualText = gearPage.verifyTextDuffle();
        Assert.assertEquals(actualText, expectedText);
        //1.5 Change Qty 3
        gearPage.changeQty3();
        //1.6 Click on ‘Add to Cart’ Button
        gearPage.clickAddToCart();
        //1.7 Verify the text
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = gearPage.verifyAddOverNightDuffle();
        Assert.assertEquals(actualText1, expectedText1);
        //1.8 Click on ‘shopping cart’ Link into message
        gearPage.clickOnLink();
        //1.9 Verify the product name ‘Cronus Yoga Pant’
        Thread.sleep(2000);
        String expectedText2 = "Cronus Yoga Pant";
        String actualText2 = gearPage.verifyProductNameDuffle();
        Assert.assertEquals(actualText2, expectedText2);
        //1.10 Verify the Qty is ‘3’
        String expectedText3 = "3";
        String actualText3 = gearPage.verifyQty();
        Assert.assertEquals(actualText3, expectedText3);
        //1.11 Verify the product price ‘$135.00’
        String expectedText4 = "$135.00";
        String actualText4 = gearPage.verifyProductPrice$135();
        Assert.assertEquals(actualText4, expectedText4);
        //1.12 Change Qty to ‘5’
        gearPage.changeQty5();
        //1.13 Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdate();
        //1.14 Verify the product price ‘$225.00’
        String expectedText6 = "$225.00";
        String actualText6 = gearPage.verifyPrice$225();
        Assert.assertEquals(actualText6, expectedText6);


    }
}
