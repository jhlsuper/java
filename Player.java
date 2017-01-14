package com.sd.yun;

import java.util.Random;
import java.util.Scanner;

public class Player extends ThrowYut1 {
	static String nameA;
	static String nameB;
	static int horseA;
	static int horseB;
	static String currentName;
	
	static Scanner scanner =new Scanner(System.in);

	
		
	
	public void inputName() {
		System.out.println("if you score 20 first you are the winner");
		scanner =new Scanner(System.in);
		System.out.println("input playerA's name");
		nameA= scanner.nextLine();
		System.out.println("input playerB's name");
		nameB= scanner.nextLine();
		System.out.println("ok");
		System.out.println("PlayerA's name is:"+nameA+"  "+"PlayerB's name is:"+nameB);
	}
	
	public static void main(String[] args) {
		Player p  = new Player();
		p.inputName();
		

	}
	
	

}