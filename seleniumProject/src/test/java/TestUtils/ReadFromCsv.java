/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestUtils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author מנהל
 */
public class ReadFromCsv {
    public static List<String[]> getCsvValues(String path) throws FileNotFoundException, CsvException, IOException{
      CSVReader reader = new CSVReader(new FileReader(path));
     return reader.readAll();
      //r.forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
