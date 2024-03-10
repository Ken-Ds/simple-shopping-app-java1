package server.controller;

import common.ParseXMLFile;

import server.controller.buttons.adminview.*;
import server.model.MainModel;

import server.view.AdminView;




public class Controller {
    private MainModel adminModel;
    private AdminView adminView;
    private ParseXMLFile parseXMLFile;

    public Controller(MainModel model, AdminView view) {
        adminModel = model;
        adminView = view;
        adminView.setExitButton(new ExitButtonHandler(adminView));
        adminView.setViewProductButton(new ViewProductHandler(adminView));
        adminView.setViewUserButton(new ViewUsersHandler(adminView));
        adminView.setAddProductButton(new AddProductHandler(adminView));
        adminView.setEditProductButton(new EditProductHandler(adminView));
        adminView.setDeleteProductButton(new DeleteProductHandler(adminView));
        adminView.setVisible(true);

        parseXMLFile = new ParseXMLFile();
        adminModel.server.startServer();

    }


}
