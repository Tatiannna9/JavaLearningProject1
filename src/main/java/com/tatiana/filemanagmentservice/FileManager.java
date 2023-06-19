package com.tatiana.filemanagmentservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    //createTheFileIdItDoesNotExists (File file.)
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exists, it has to be created");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
            }
        }

    }

    //InformIfTheFileExists (File file.)
    public static void InformIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file exists");
        } else {
            System.out.println("The file is not present");
        }
    }

    //PrintTheFileName (File file).
    public static void PrintTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    //printTheFileAbsolutPath (Filr file).

    public static void printTheAbsolutPath(File file) {
        System.out.println("The file absolut Path:" + file.getAbsolutePath());
    }

    //printIfTheFileIsADirectory (File file).
    public static void printIfTheFileIsADirectory(File inputFile) {
        System.out.println("The file is a directory:" + inputFile.isDirectory());
    }

    //deleteTheFileIfExists(File file).
    public static void deleteTheFileIfExists(File inputfile) {
        if (inputfile.exists()) {
            if (inputfile.delete()) {
                System.out.println("The file was deleted");
            } else {
                System.out.println("The file exists, but was not deleted");
            }
        } else {
            System.out.println("The file does not exists");
        }
    }
}





