package server.model;


import common.ParseXMLFile;

public class ManageProducts {
    public void addProduct(String name, String price, String description){
        ParseXMLFile parseXMLFile = new ParseXMLFile();
        parseXMLFile.addXMLProduct(name,price,description);
    }
}
