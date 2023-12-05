package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //1.1 Mouse Hover on Men Menu
        homePage.mouseHoverToMen();
        //1.2 Mouse Hover on Bottoms
        homePage.mouseHoverToBottom();
        //1.3 Click on Pants
        homePage.clickOnPants();
        //1.4 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.hoverOnPent();
        menPage.clickOnPant();
        //1.5 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPage.hoverBlackColour();
        //1.6 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPage.addToCartButton();
        menPage.clickOnShoppingCartButton();
        //1.7 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Thread.sleep(2000);
        String expectedVerifyMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualVerifyMessage = menPage.getVerifyMessage();
        Assert.assertEquals(actualVerifyMessage, expectedVerifyMessage);
        //1.8 Click on ‘shopping cart’ Link into message
        Thread.sleep(2000);
        menPage.shoppingCartLink();
        //1.9 Verify the text ‘Shopping Cart.’
        Thread.sleep(2000);
        menPage.getVerifyMessage();
        String expectedText = "Shopping Cart.";
        String actualText = menPage.getVerifyMessage();
        Assert.assertEquals(actualText, expectedText);
        //1.10 Verify the product name ‘Cronus Yoga Pant’
        Thread.sleep(2000);
        String expectedText1 = "Cronus Yoga Pant";
        String actualText1 = menPage.getTextCronusYogaPant();
        Assert.assertEquals(actualText1, expectedText1);
        //1.11 Verify the product size ‘32’
        Thread.sleep(2000);
        String expectedText2 = "32";
        String actualText2 = menPage.getTextProductSize();
        Assert.assertEquals(actualText2, expectedText2);
        //1.12 Verify the product colour ‘Black’
        Thread.sleep(2000);
        String expectedText3 = "Black";
        String actualText3 = menPage.getTextProductColour();
        Assert.assertEquals(actualText3, expectedText3);


    }
}
