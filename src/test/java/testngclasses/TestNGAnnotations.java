package testngclasses;

import org.testng.Assert;
import org.testng.annotations.*;
import webdriver.WebDriverManager;

public class TestNGAnnotations extends TestNGMethods {



    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("TestNGAnnotations Test1");
    }

    @Test(groups = {"regression","login"})
    public void test2(){
        System.out.println("TestNGAnnotations test 2");
    }

    @Test(groups = {"regression","login"})
    public void test3(){
        System.out.println("TestNGAnnotations test 3");
    }


    @Test(groups = {"regression","login"})
    public void test4(){
        System.out.println("TestNGAnnotations test 4");
        Assert.fail();
    }

    @Parameters({"URL","BROWSER"})
    @Test(groups = "sample")
    public void launchBrowser(String url,String browser){
        WebDriverManager.initBrowser(browser);
    }

}
