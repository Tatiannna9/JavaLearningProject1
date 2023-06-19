package com.tatiana.filemanagmentservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {
        File demoFile = new File("src/main/java/com/tatiana/filemanagmentservice/test.txt");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.InformIfTheFileExists(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.PrintTheFileName(demoFile);
        FileManager.printTheAbsolutPath(demoFile);
//        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReaderManager.readDataFromTextFile(demoFile);
        InputFileReaderManager.readDataFromTheTextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReaderManager.readDataFromTheTextFileUsingBufferedReader(demoFile);

        String contentForTheFile = "New content for the bosses\n another line";

        OutputFileWriterManager.writeDataIntoFile(demoFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Empty");


    }
}
