package com.easy.engineering;
import java.io.*;

public class FileWriterDemo {

	
	public static void main(String[] args) {
		File fout=new File("E:\\springmvc\\avinash.txt");
		FileWriter fw=null;
		try{
			fw=new FileWriter(fout);
			String s="bangalore is beautiful city";
			fw.write(s);
			fw.flush();
			fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}

}
