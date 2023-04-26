package com.java.main;

import com.java.ui.AppUi;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.java.ui.AppUi.inputInteger;

public class Main {

    public static void main(String[] args) {

        AppController controller = new AppController();

        while (true) {
            AppUi.startScreen();
            int selectNumber = inputInteger();
            controller.chooseSystem(selectNumber);

        }
    }
}
