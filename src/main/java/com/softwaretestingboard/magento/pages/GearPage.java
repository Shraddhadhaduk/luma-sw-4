package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
     By clickOnOverNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
     By verifyTextOverNightDuffle = By.xpath("//span[@class='base']");
     By changeQuality = By.xpath("//input[@id='qty']");

     By clickOnAddCart = By.xpath("//button[@id='product-addtocart-button']");

     By verifyTextForAddingInCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
     By clickOnDuffelShoppingLink = By.xpath("//a[normalize-space()='shopping cart']");
     By verifyProductDuffel = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
     By verifyQuality = By.xpath("//input[@title='Qty']");

     By verifyProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");

     By changeQuality5 = By.xpath("(//input[@class='input-text qty'])[1]");

     By clickOnUpdateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

     By verifyProductPrice1 = By.xpath("//span[@class='cart-price']//span)[2]");

     public void clickOnDuffle(){
         clickOnElement(clickOnOverNightDuffle);
     }

     public String verifyTextDuffle(){
         return getTextFromElement(verifyTextOverNightDuffle);
     }

     public void changeQty3(){
         sendTextToElement(changeQuality, "3");
     }

     public void clickAddToCart(){
         clickOnElement(clickOnAddCart);
     }

     public String verifyAddOverNightDuffle(){
        return getTextFromElement(verifyTextForAddingInCart);
     }
      public void clickOnLink(){
         clickOnElement(clickOnDuffelShoppingLink);
      }

      public String verifyProductNameDuffle(){
         return getTextFromElement(verifyProductDuffel);
      }

      public String verifyQty(){
         return getTextFromElement(verifyQuality);
      }

      public String verifyProductPrice$135(){
         return getTextFromElement(verifyProductPrice);
      }

      public void changeQty5(){
         sendTextToElement(changeQuality5, "5");
      }

      public void clickOnUpdate(){
         clickOnElement(clickOnUpdateShoppingCart);
      }

      public String verifyPrice$225(){
         return getTextFromElement(verifyProductPrice1);
      }

}
