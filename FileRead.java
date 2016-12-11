package com.sd.id;

public class FileRead {
	public static void main(String[] args){
		FileReader fr=new FileReader("test.txt");
		int i;
		while((i=fr.read()) !=-1)
			System.out.println((char)i);
		fr.close();
	}
}