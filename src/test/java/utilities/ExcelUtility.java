package utilities;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.index.qual.PolyUpperBound;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtility {

    public  static FileInputStream fi;
    public  static FileOutputStream fo;
    public  static XSSFWorkbook wb;
    public  static XSSFSheet ws;
    public  static XSSFRow row;
    public  static XSSFCell cell;
    public  static CellStyle style;

    public static int getRowCount(String xlfile, String xlsheet) throws IOException {
        fi= new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        int rowCount = ws.getLastRowNum();
        wb.close();
        fi.close();
        return  rowCount;
    }

    public static int getCellCount(String xlfile, String xlsheet, int rowNumber) throws IOException {
        fi= new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        int columnCount= ws.getRow(rowNumber).getLastCellNum();
        wb.close();
        fi.close();
        return  columnCount;
    }

    public  static  String getCellData( String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi=new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        row= ws.getRow(rownum);
        cell=row.getCell(colnum);
        String data ;

        try {
//        data= cell.toString(); // 如果直接用这个有什么问题吗？ 没有问题， 都可以的， 就是提供了两种方式
            DataFormatter formatter = new DataFormatter(); // poi  provided this method
            data= formatter.formatCellValue(cell);
            //returns teh formatted value of a cell as a String regardless of the cell type
        }catch (Exception e){
            data="";
        }
        wb.close();
        fi.close();

        return data;
    }
    public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi=new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
       row= ws.getRow(rownum);
       cell=row.getCell(colnum);
       style=cell.getCellStyle();
       style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
       style.setFillPattern(FillPatternType.SOLID_FOREGROUND); //这句是在干嘛

       cell.setCellStyle(style);

        fo= new FileOutputStream(xlfile);
       wb.write(fo);
        wb.close();
        fi.close();
        fo.close();

    }

    public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi=new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        row= ws.getRow(rownum);
        cell=row.getCell(colnum);
        style=cell.getCellStyle();
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND); //这句是在干嘛

        cell.setCellStyle(style);

        fo= new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();

    }




}
