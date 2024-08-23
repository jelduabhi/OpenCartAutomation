package testngclasses;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotations2 extends TestNGMethods{


    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("TestAnnotations2 Test1");
    }

    @Test(groups = {"regression","product"})
    public void test2(){
        System.out.println("TestAnnotations2 test 2");
    }

    @Test(groups = {"regression","product"})
    public void test3(){
        System.out.println("TestAnnotations2 test 3");
    }

    @Test(groups = {"regression","product"})
    public void test4(){
        System.out.println("TestAnnotations2 test 4");
        Assert.fail();
    }

}
