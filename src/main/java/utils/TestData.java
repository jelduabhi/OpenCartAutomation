package utils;

import java.util.HashMap;
import java.util.Map;

public class TestData {

   static ThreadLocal<Map<String,String>> data=new ThreadLocal<>();

    public static void readTestData(String testCaseNum){
        data.set(ExcelData.readTestDataFromExcel(testCaseNum));
    }

    public static String getData(String key){
        return data.get().get(key);
    }
}
