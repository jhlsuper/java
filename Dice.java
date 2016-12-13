package com.sd.yun;
import java.util.Random;

public class Dice {
	int result;
	public int roll(){
		

		result =(int)(Math.random()*6)+1;
		return this.result;

	}
	public void setResult(int result){
		this.result=result;
	}
	public int getResult(){
		return this.result;
	}
	
}