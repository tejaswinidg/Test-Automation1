package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class util1 {

    
    private String[][] fetchData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;

        try {
            // Specify the path to your Excel file
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            // Get the number of rows and columns
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = rowCount > 0 && sheet.getRow(0) != null ? sheet.getRow(0).getLastCellNum() : 0;

            // Initialize the 2D array to store the data
            String[][] data = new String[rowCount - 1][colCount]; // Adjusted to account for header row

            // Create a DataFormatter to handle cell formatting
            DataFormatter df = new DataFormatter();

            // Iterate over the rows and columns to populate the data array
            for (int i = 1; i < rowCount; i++) { // Start from 1 to skip header row
                Row row = sheet.getRow(i);

                if (row != null) { // Check if the row is not null
                    for (int j = 0; j < colCount; j++) {
                        Cell cell = row.getCell(j);

                        if (cell != null) { // Check if the cell is not null
                            data[i - 1][j] = df.formatCellValue(cell);
                        } else {
                            data[i - 1][j] = ""; // Handle null cells if needed
                        }
                    }
                } else {
                    // Handle case where the row is null
                    for (int j = 0; j < colCount; j++) {
                        data[i - 1][j] = ""; // Set default value for empty rows
                    }
                }
            }

            // Print the data array for debugging
            for (String[] dataArr : data) {
                System.out.println(Arrays.toString(dataArr));
            }

            return data;

        } finally {
            // Ensure resources are closed
            if (workbook != null) {
                workbook.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }

    @DataProvider(name = "data")
    public Object[][] getData() throws IOException {
        return data();
    }
    public String[][] data() throws IOException {
        return fetchData("C:\\Users\\Tejaswini\\Documents\\Book5.xlsx", "Sheet1");
    }

    // Method for reading data from another Excel file/sheet
//    public String[][] data2() throws IOException {
//        return fetchData("C:\\Users\\Tejaswini\\Documents\\Book6.xlsx", "Sheet2");
//    }
//
//    // Another method for a different sheet in the same file or different file
//    public String[][] data3() throws IOException {
//        return fetchData("C:\\Users\\Tejaswini\\Documents\\Book7.xlsx", "Sheet3");
//    }
}
