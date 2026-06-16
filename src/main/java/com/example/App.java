package com.example;
import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
public class App 
{
    public static void main(String[] args) throws IOException
    {
        File source = new File("source.txt");
        File destination = new File("destination.txt");

        Files.copy(source, destination);

        System.out.println("File copied successfully");
    }
}
