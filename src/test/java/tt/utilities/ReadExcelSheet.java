package tt.utilities;
//We are initializing Hashmap
//whatever we are putting first column is key 
//whatever we are putting in 2nd column thats value
//i used apachi poi to connect my framework
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static Map<String, Map<String, String>> setMapData() throws IOException {

		String path = "C:/Users/RASEL/workspace/SundayGrootProject/src/test/resource/Datasheets/EbayTestData.xlsx";

		FileInputStream fis = new FileInputStream(path);//read the excel file

		Workbook workbook = new XSSFWorkbook(fis);//storing it into workbook 

		Sheet sheet = workbook.getSheetAt(0);

		int lastRow = sheet.getLastRowNum();
//line 16,28 initializing hasmap
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();

		Map<String, String> dataMap = new HashMap<String, String>();

		// Looping over entire row
		for (int i = 0; i <= lastRow; i++) {

			Row row = sheet.getRow(i);

			// 1st Cell as Value
			Cell valueCell = row.getCell(1);

			// 0th Cell as Key
			Cell keyCell = row.getCell(0);

			String value = valueCell.getStringCellValue().trim();
			String key = keyCell.getStringCellValue().trim();

			// Putting key & value in dataMap
			dataMap.put(key, value);

			// Putting dataMap to excelFileMap
			excelFileMap.put("DataSheet", dataMap);
		}

		// Returning excelFileMap
		return excelFileMap;

	}

	// Method to retrieve value also getting the data from excel
	public static String getMapData(String key) throws IOException {

		Map<String, String> m = setMapData().get("DataSheet");
		String value = m.get(key);

		return value;

	}
}
