package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
   By cronusYogaPantSize32 = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
   By clickOnSize32 = By.xpath("(//div[@class='swatch-option text'])[1]");

   By cronusYogaPantColourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");

   By addToCart = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
   By clickOnAddToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

   By verifyMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

   By clickShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
   By verifyTextShoppingCart =  By.xpath("//span[@class='base']");
   By verifyCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

   By verifySize = By.xpath("//dd[contains(text(),'32')]");

   By verifyColour = By.xpath("//dd[contains(text(),'Black')]");

   public void hoverOnPent(){
      mouseHoverToElement(cronusYogaPantSize32);
   }

   public void clickOnPant(){
      clickOnElement(clickOnSize32);
   }

   public void hoverBlackColour(){
      mouseHoverToElementAndClick(cronusYogaPantColourBlack);
   }

   public void addToCartButton(){
      clickOnElement(clickOnAddToCart);
   }

   public void clickOnShoppingCartButton(){
      clickOnElement(addToCart);
   }

   public String getVerifyMessage(){
      return getTextFromElement(verifyMessage);
   }

   public void shoppingCartLink(){
      clickOnElement(clickShoppingCartLink);
   }

   public String getTextShoppingCart(){
      return getTextFromElement(verifyTextShoppingCart);
   }

   public String getTextCronusYogaPant(){
      return getTextFromElement(verifyCronusYogaPant);
   }

   public String getTextProductSize(){
      return getTextFromElement(verifySize);
   }

   public String getTextProductColour(){
      return getTextFromElement(verifyColour);
   }

}
