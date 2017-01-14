package com.sd.yun;

import java.util.Random;

public class YutGame1 extends Player {
	static int horseA= 0;
	static int horseB= 0;
	static int scoreA;
	static int scoreB;
	public void playgame(){
	Player player =new Player();
	ThrowYut1 throwyut= new ThrowYut1();
	String winner = null;
	
		
			
			
			
			
			player.inputName();
			while(winner ==null){
			while((horseA <20||horseB<20)){
			//while((horseA<20||horseB<20)) {
				throwyut.roll();
				throwyut.yutname();


				scoreA=throwyut.getrealresult();
				horseA=horseA+scoreA;
				System.out.println(nameA+" scored:"+" "+horseA);
				System.out.println(throwyut.getyutname());
				
				throwyut.roll();
				throwyut.yutname();
				scoreB=throwyut.getrealresult();
				horseB=horseB+scoreB;

				
				System.out.println(nameB+" scored:"+" "+horseB);
				System.out.println(throwyut.getyutname());
				if (horseA>=20) {
					
					winner= nameA;
					System.out.println(nameA+"is the winner");
					
					break;
				}
				else if (horseB>=20){
					winner=nameB;
					System.out.println(nameB+" is the winner");
					
					break;
				}
				}
			}
			}
			public static void main(String[] args) {
				YutGame1 y= new YutGame1();
				y.playgame();
			}
		}
	
		
	
	


