package server.model;

import common.Account;
import common.ParseXMLFile;

public class CheckIfUser {

    public boolean authenticate(Account account) {
        String username = account.getUsername();
        String password = account.getPassword();
        ParseXMLFile parseXMLFile = new ParseXMLFile();
        return parseXMLFile.checkAccount(username, password);
    }
}