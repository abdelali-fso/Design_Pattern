package org.example.proxy;

public class FileReaderProxy implements FileReader{
    private ReadFileReader readFileReader;
    private String accessKey;
    public static final String ACCESS_KEY_VALID = "valid_key";

    public FileReaderProxy(String accessKey) {
        this.accessKey = accessKey;
    }

    private  boolean checkAccess(){
        return ACCESS_KEY_VALID.equals(accessKey);
    }
    @Override
    public void readFile(String fileName) {
        if(checkAccess()){
            if(readFileReader == null){
                readFileReader = new ReadFileReader();
            }
            readFileReader.readFile(fileName);
        }else{
            System.out.println("Access denied. Invalid access key.");
        }
    }

}
