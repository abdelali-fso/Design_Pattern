package org.example.proxy;

public class ReadFileReader implements FileReader{
    @Override
    public void readFile(String fileName) {
        System.out.println("Reading file : "+fileName);
    }
}
