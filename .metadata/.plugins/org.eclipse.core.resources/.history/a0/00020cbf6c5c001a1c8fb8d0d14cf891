package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_Read_txt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		final String dir = System.getProperty("user.dir");
		FileReader fr = new FileReader(dir + "\\Config.txt");
        BufferedReader br = new BufferedReader(fr);
        String s="";
        s=br.readLine();
        System.out.println(s);
        
        
        for(int i = 1; i<=Integer.parseInt(s) ; i++)
        {
        	System.out.println("Phan tu i " + i);
        	// dung code tao recipe o day
        }
	}

}
