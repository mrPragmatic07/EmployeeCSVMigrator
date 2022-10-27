package org.sparta.sonic.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static EmployeeArrayParser connectToFile(String filename, int fileLength){

        //String[] strArray = new String[fileLength];

        EmployeeArrayParser employeeArrayParser = new EmployeeArrayParser();

        String line;
        try (FileReader fileReader = new FileReader(System.getProperty("user.dir") + filename)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //int i=0;
            bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null) {
                //strArray[i++] = line;
                employeeArrayParser.addEmployeesToArrayLists(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return strArray;
        return employeeArrayParser;
    }
}
