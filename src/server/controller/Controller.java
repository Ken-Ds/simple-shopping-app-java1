package server.controller;

import common.ParseXMLFile;

import server.model.MainModel;

import server.view.AddProduct;
import server.view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

    private void btnAddProductActionPerformed(ActionEvent evt){
        adminView.addProduct.setBackActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminView.addProduct.dispose();
            }
        });
    }
}
