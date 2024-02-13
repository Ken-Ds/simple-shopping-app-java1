package server.model;


import common.ParseXMLFile;

public class MangeProducts {
    public void addProduct(String name, String price, String description){
        ParseXMLFile parseXMLFile = new ParseXMLFile();
        parseXMLFile.addXMLProduct(name,price,description);
    }
}
