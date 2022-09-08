/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author מנהל
 */
public class TableHandlers {
     public static boolean verifyTableCellText(WebElement table,
                                     int searchColumn,
                                     String searchText, 
                                     int returnColumnText, 
                                     String expectedText) throws Exception{
      String cellValue=getTableCellTextByXpath(table,searchColumn,searchText,returnColumnText);
      return cellValue.equals(expectedText);
    }
    public static String getTableCellTextByXpath(WebElement table,
                                      int searchColumn,
                                      String searchText, 
                                      int returnColumnText) throws Exception {
        String xpath=String.format("//table[@id=\"customers\"]//tr[td[text()='%s']]//td[%s]",
                searchText,
                returnColumnText);
    return table.findElement(By.xpath(xpath)).getAttribute("innerHTML");
}
}
