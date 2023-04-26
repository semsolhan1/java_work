package com.java.main;

import com.java.view.AppUI;

import static com.java.view.AppUI.inputInteger;

public class Main {

	public static void main(String[] args) {
		
		AppController controller = new AppController();
		
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		
		while(true) {
			AppUI.startScreen();
			int selectNumber = inputInteger();
			controller.chooseSystem(selectNumber);
		}

	}

}










