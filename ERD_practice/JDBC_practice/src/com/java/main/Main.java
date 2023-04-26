package com.java.main;

import com.java.view.AppUI;

import static com.java.view.AppUI.inputInteger;

public class Main {

	public static void main(String[] args) {
		
		AppController controller = new AppController();
		
		while(true) {
			AppUI.startScreen();
			int selectNumber = inputInteger();
			controller.chooseSystem(selectNumber);
		}

	}

}










