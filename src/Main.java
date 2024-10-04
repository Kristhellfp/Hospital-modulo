package src;

import backEnd.BackEnd;
import src.controller.LoginController;
import src.view.LoginView;
import src.view.SalaView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        BackEnd backEnd = new BackEnd();
        SalaView salaView = new SalaView();
        LoginController loginController = new LoginController(loginView, backEnd);
    }
}
