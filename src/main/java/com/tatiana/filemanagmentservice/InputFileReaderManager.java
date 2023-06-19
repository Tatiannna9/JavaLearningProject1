package com.tatiana.filemanagmentservice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileReaderManager {

    public static void readDataFromTextFile (File file){
        try {
            System.out.println(Files.readString(Path.of(file.getPath())));
        } catch (IOException exceptionObject) {
            System.out.println("The is an exception: " + exceptionObject.getMessage());
        }

    }

    public static void readDataFromTheTextFileUsingFileReader(File file){
        try {
            FileReader fileReader = new FileReader(file);

            int charIntValue = 0;
            while ((charIntValue = fileReader.read()) != -1){
                System.out.print((char) charIntValue);
            }
        } catch (IOException exception) {
            System.out.println("There is an exception:" + exception.getMessage());
        }
    }

    public static void readDataFromTheTextFileUsingBufferedReader(File inputFile){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("The file was not found:" + e.getMessage());
        }


    }

}
