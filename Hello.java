package com.sd.ch8;
public class Hello{
	private String name;
	public Hello(String name){
		this.name=name;
	}
	public void sayHello() {
		System.out.print("Hello"+name);

	}
	public static void main(String[] args) {
		Hello[] h = new Hello[4];
		h[0] =new Hello("jh1");
		h[1] =new Hello("jh2");
		h[2] =new Hello("jh3");
		h[3] =new Hello("jh4");
		for(Hello a:h){
			a.sayHello();
		}
	}
}