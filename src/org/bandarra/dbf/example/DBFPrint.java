package org.bandarra.dbf.example;

import java.io.IOException;
import java.util.Arrays;
import org.bandarra.dbf.file.*;
/**
 *
 * @author andre.bandarra
 */
public class DBFPrint {  
    private static char[] ble = new char[255];        
    
    public DBFPrint(){
        Arrays.fill(ble, ' ');                
    }    
    
    private String fill(String s, int tam){        
        return s + new String(Arrays.copyOf(ble, tam - s.length()));
        
    }
    
    public void run(String fileName) throws IOException{
        DBFFile file = new DBFFile(fileName);
        for (DBFField field: file.getMetaData().getFields().values()){
            int size = Math.max(field.getName().length(), field.getLength());
            System.out.print(fill(field.getName(), size)+"|");            
        }
        System.out.println();
        for (int i=0; i<file.getMetaData().getNumberOfRecords(); i++){
            for (DBFField field: file.getMetaData().getFields().values()){
                int size = Math.max(field.getName().length(), field.getLength());                
                System.out.print(fill(new String(file.getData(field.getName(), i)),size)+"|");                                     
            }            
            System.out.println();            
        }

        file.close();                      
    }
    public static void main(String[] args) throws Exception{
        DBFPrint print = new DBFPrint();
        print.run(args[0]);
    }
}
