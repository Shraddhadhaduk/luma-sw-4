package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By tops = By.xpath("//a[@id='ui-id-9']");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu = By.cssSelector("li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)");
    By bottomMenu = By.cssSelector("#ui-id-18 span");
    By pants = By.cssSelector("#ui-id-23 span");

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverToWomen(){
        mouseHoverToElement(womenMenu);
    }

    public void mouserHoverToTops(){
        mouseHoverToElement(tops);
    }

    public void clickOnJackets(){
        clickOnElement(jackets);
    }
    public void mouseHoverToMen(){
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverToBottom(){
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPants(){
        clickOnElement(pants);
    }

    public void hoverOnGear(){
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags(){
        clickOnElement(bags);
    }
}
