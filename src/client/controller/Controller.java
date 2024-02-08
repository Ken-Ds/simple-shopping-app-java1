package client.controller;

import client.model.MainModel;
import client.view.MainView;

public class Controller {

    private MainModel clientModel;
    public MainView clientView;

    public Controller(MainModel model, MainView view){
        clientModel = model;
        clientView = view;
        clientModel.connect.createConnection();
    }
}
