package server.controller;

import server.model.MainModel;
import server.view.MainView;

public class Controller {
    private MainModel adminModel;
    private MainView adminView;

    public Controller(MainModel model, MainView view){
        adminModel = model;
        adminView = view;
        adminModel.server.startServer();
    }
}
