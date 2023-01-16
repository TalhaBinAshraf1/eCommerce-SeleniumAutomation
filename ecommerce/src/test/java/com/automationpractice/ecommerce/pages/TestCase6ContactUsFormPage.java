package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase6ContactUsFormPage extends BasePage{
    public TestCase6ContactUsFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="li:nth-of-type(8) > a")
    public WebElement contactusButton;
    public WebElement getContactusButton(){
        return contactusButton;
    }

    @FindBy(css=".contact-form > .text-center.title")
    public WebElement getInTouchText;
    public WebElement getGetInTouchText(){
        return getInTouchText;
    }

    @FindBy(css="input[name='name']")
    public WebElement nameInputField;
    public WebElement getNameInputField(){
        return nameInputField;
    }

    @FindBy(css="input[name='email']")
    public WebElement emailInputField;
    public WebElement getEmailInputField(){
        return emailInputField;
    }

    @FindBy(css="input[name='subject']")
    public WebElement subjectInputField;
    public WebElement getSubjectInputField(){
        return subjectInputField;
    }

    @FindBy(css="textarea#message")
    public WebElement messageInputField;
    public WebElement getMessageInputField(){
        return messageInputField;
    }

    @FindBy(css="[name='upload_file']")
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton(){
        return chooseFileButton;
    }

    @FindBy(css="input[name='submit']")
    public WebElement submitbutton;
    public WebElement getSubmitbutton(){
        return submitbutton;
    }

    @FindBy(css=".alert.alert-success.status")
    public WebElement sucessMessageText;
    public WebElement getSucessMessageText(){
        return sucessMessageText;
    }

    @FindBy(css="div#form-section > .btn.btn-success")
    public WebElement homeButton;
    public WebElement getHomeButton(){
        return homeButton;
    }

}
