package A67.Lab.Exception;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-18-03
 */
public class MyException {
    public static void main(String[] args) {
        try{
            writeToFile();
        }catch (IOException e){
            System.out.println("IO Exception in main");
        } catch (Exception e){
            System.out.println("Exception in main");
        }
    }

    private static void writeToFile() throws Exception {
        try {
            FileWriter w = new FileWriter(("testFile.txt"));
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            //re-declare the exception, rule-2
            throw new FileNotFoundException();
        }catch (IOException e){
            System.out.println("IO exception");
        }finally {
            System.out.println("Finally");
        }

    }
}
