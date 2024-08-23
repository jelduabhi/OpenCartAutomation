package utils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class TestData {

    static FileInputStream file;
    static Map<Integer, String> keys = new HashMap<>();
    static Map<Integer, String> values = new HashMap<>();
    static Map<String, String> dataComb = new HashMap<>();

    public static void readTestData(String testCaseNum) {
        try {
            file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData\\TestData.xlsx");
            Workbook wb = WorkbookFactory.create(file);
            Sheet sh = wb.getSheet("Sheet1");
            for (Row row : sh) {
                Cell firstCell = row.getCell(0);
                String cellValue = firstCell.getStringCellValue();
                if (cellValue.equals("TestCaseNumber")) {
                    for (Cell cell : row) {
                        keys.put(cell.getColumnIndex(), cell.getStringCellValue());
                    }
                } else if (cellValue.equals(testCaseNum)) {
                    for (Cell cell : row) {
                        values.put(cell.getColumnIndex(), cell.getStringCellValue());
                    }
                }
            }
            for (int i : values.keySet()) {
                if(values.get(i)!="")
                dataComb.put(keys.get(i), values.get(i));
            }
            System.out.println(dataComb);
        } catch (Exception e) {
            System.out.println("Unable to read the data " + e.getMessage());
        }
    }

    public static String getData(String key) {
        return dataComb.get(key);
    }
}