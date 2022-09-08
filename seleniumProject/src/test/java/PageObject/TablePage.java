/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PageObject;

import TestUtils.TableHandlers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author מנהל
 */
public class TablePage {
    WebElement customersTable;
    public TablePage(WebDriver driver){
          customersTable = driver.findElement(By.id("customers"));
    }
   public boolean verifyCastomersTableCellText(int searchColumn,
                                     String searchText, 
                                     int returnColumnText, 
                                     String expectedText) throws Exception{
   return TableHandlers.verifyTableCellText(customersTable,searchColumn,searchText,returnColumnText,expectedText);
   }
    
}
