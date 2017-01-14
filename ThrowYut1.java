package com.sd.yun;


public class ThrowYut1 extends Dice{
	public int realresult;
	public String yutname = null;
	public int roll(){
		setResult((int)(Math.random()*5)+1);
		yutname();
		return getResult();
	}
	public void yutname(){
		if(getResult()==1){
			yutname="do";
			realresult=1;

		}else if(getResult()==2){
			yutname="gae";
			realresult=2;
		}else if(getResult()==3){
			yutname="gurl";
			realresult=3;

		}else if(getResult()==4){
			yutname="yut";
			realresult=4;

		}else if(getResult()==5){
			yutname="mo";
			realresult=4;
		}else if(getResult()==6){
			yutname="backdo";
			realresult=-1;

		}
		
	}
	public String getyutname(){
		return this.yutname;
		
		
	}
	public int getrealresult(){
		return this.realresult;
	
		
	}
	public static void main(String[] args) {
		ThrowYut1 t =new ThrowYut1();
		t.roll();
		t.yutname();
		System.out.println(t.getrealresult());
		
	}

	
}