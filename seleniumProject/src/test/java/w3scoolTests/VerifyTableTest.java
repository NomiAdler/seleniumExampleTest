/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package w3scoolTests;

import PageObject.TablePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author מנהל
 */
public class VerifyTableTest {
    static WebDriver driver;
    public VerifyTableTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {}
     public class NewEmptyJUnitTest {
     }

  @Test
  public void firsttest() throws Exception {
      TablePage tablePage=new TablePage(driver);
      boolean match=tablePage.verifyCastomersTableCellText(1,"Alfreds Futterkiste",3,"Germany");
      Assertions.assertTrue(match,"the expected text doesn't found for the search text");
  }
}
     
  
  

