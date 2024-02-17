package server.controller;

import common.ParseXMLFile;

import server.model.MainModel;

import server.view.MainView;



public class Controller {
    private MainModel adminModel;
    private MainView adminView;
    private ParseXMLFile parseXMLFile;

    public Controller(MainModel model, MainView view) {
        adminModel = model;
        adminView = view;
        parseXMLFile = new ParseXMLFile();
        adminModel.server.startServer();
    }
}
