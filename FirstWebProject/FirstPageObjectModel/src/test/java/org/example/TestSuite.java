package org.example;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestSuite extends BaseTest{
    HomePage homepage = new HomePage();
    RegisterPage register = new RegisterPage();
    ProductSearch product = new ProductSearch();
    Currency currency = new Currency();
    AddToCart element = new AddToCart();
    NewOnlineStore leaveComment = new NewOnlineStore();


    @Test
    public void user_should_be_able_to_register_successfully() throws InterruptedException, IOException {
        homepage.clickRegister();
        register.fillRegistrationForm();
        register.registrationSuccessfull();


    }
    @Test
    public void user_should_be_able_to_Search_Prodct_successfully() throws InterruptedException {
        product.productName("nike");
        product.productVerify();

    }
    @Test
    public void user_should_be_able_to_Change_Currency() {
        currency.changeCurrency();
        currency.verifyCurrencyChange();

    }
    @Test
    public void verify_addCartButton_present_in_all_product() throws InterruptedException {
        element.addCartCheck();

    }
    @Test
    public void verify_Add_Comment () throws InterruptedException {
        leaveComment.enterComment("James test","online store is officially up and running. Stock up for the holiday season");
        leaveComment.commentSuccess();
        leaveComment.verifyAddedComment();

    }
    }


