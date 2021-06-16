package cn;

import java.io.File;
import java.io.IOException;

public class JavaIODemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("d:\\hello");
		if(file.exists()) {
			file.delete();
		}else {
			System.out.println(file.createNewFile());
		}
	}

}
