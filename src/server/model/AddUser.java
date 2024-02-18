package server.model;

import common.Account;
import common.ParseXMLFile;

public class AddUser {

    public void addAccount(String username, String password){
        ParseXMLFile parseXMLFile = new ParseXMLFile();
        parseXMLFile.addAccount(username, password);

    }
}
