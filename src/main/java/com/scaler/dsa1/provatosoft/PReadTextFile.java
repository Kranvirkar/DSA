package com.scaler.dsa1.provatosoft;

/*
Write a java program to read text file in java and display its content.

*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PReadTextFile {
    public static void main(String[] args) throws IOException {

    try (BufferedReader bufferedReader=new BufferedReader(new FileReader("file.txt"))){
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
