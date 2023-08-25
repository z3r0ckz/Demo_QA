package tests;

import Base.BaseTest;
import Logger.MyLogger;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {
    @Test
    public void test(){
        MyLogger.info("Step 1 - Main page of DemoQA");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isPageOpen(PageLocator_MainPage,"demoQA"),"The DemoQA Page is not Open");
    }
}
