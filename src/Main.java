package src;

import javax.swing.*;

import src.controller.LoginController;
import src.view.LoginView;

public class Main extends JFrame {
    public static void main(String[] args) {

        LoginView view = new LoginView();

        LoginController loginController = new LoginController();

    }
}
