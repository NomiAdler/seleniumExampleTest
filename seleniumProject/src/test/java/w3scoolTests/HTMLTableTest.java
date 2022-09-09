/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package w3scoolTests;

import PageObject.TablePage;
import TestUtils.ReadFromCsv;
import java.io.File;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author מנהל
 */
public class HTMLTableTest {
    static WebDriver driver;
    public HTMLTableTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
      driver  = new ChromeDriver();
      driver.get("https://www.w3schools.com/html/html_tables.asp");
    }
    
    @AfterAll
    public static void tearDownClass() {
         driver.quit();
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  @Test
  public void verifyCastomersTableCellValues() throws Exception {
      TablePage tablePage=new TablePage(driver);
      List<String[]> expectedValues=
      ReadFromCsv.getCsvValues(getResorceFile());
       for (int row=1;row<expectedValues.size();row++){ 
           String name = expectedValues.get(row)[0];
           for(int column=1;column<expectedValues.get(row).length;column++){
           boolean match=tablePage.verifyCastomersTableCellText(
                   0,name,column+1,expectedValues.get(row)[column]);
           System.out.println(name+"|"+expectedValues.get(row)[column]+"|"+row+"|"+column+"|"+match);
           Assertions.assertTrue(match,"the expected text doesn't found for the search text");
           }   
       }  
  }

    private String getResorceFile() {
        String folderLocation=new File("").getAbsolutePath();
        String filePath=folderLocation+"\\src\\test\\java\\testResorce\\ElementToSearch.csv";
        return filePath;
    }
}
     
  
  

