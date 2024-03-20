package org.example.proxy;

public class Main {
    public static void main(String[] args) {
        String fileName = "clean_code.txt";


        FileReader fileReaderProxyValid = new FileReaderProxy("valid_key");
        fileReaderProxyValid.readFile(fileName);


        FileReader fileReaderProxyInvalid = new FileReaderProxy("invalid_key");
        fileReaderProxyInvalid.readFile(fileName);
    }

}
