package src;

import backEnd.BackEnd;
import src.controller.LoginController;
import src.view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        BackEnd backEnd = new BackEnd();
        LoginController loginController = new LoginController(loginView, backEnd);
    }
}
