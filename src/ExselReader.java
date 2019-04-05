import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExselReader {
    public static List<Hotel> listLoader() throws IOException {
        Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\hp\\Desktop\\Hotel-Booking.xlsx"));
        List<Hotel> hotelList = new ArrayList<>();

        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            hotelList.add(new Hotel(row.getCell(1).getStringCellValue(),
                    row.getCell(2).getStringCellValue(),
                    row.getCell(3).getStringCellValue(),
                    (int) row.getCell(4).getNumericCellValue()));
        }

        Sheet sheet1 = workbook.getSheetAt(1);
        for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
            Row row = sheet1.getRow(i);
            Room room = new Room((long) row.getCell(0).getNumericCellValue(),
                    row.getCell(1).getNumericCellValue(),
                    row.getCell(2).getStringCellValue());
            hotelList.get((int) row.getCell(3).getNumericCellValue() - 1).addroom(room);

        }
                workbook.close();
                return hotelList;





        }

    }
