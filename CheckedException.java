package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		//unchecked or run time exception
		int a[] = new int[3]; //0,1,2 
		
		/*
		 * try { System.out.println(a[5]); }catch(Exception e){
		 * System.out.println(e.toString()); }
		 */
		
		
		  //FileReader file = new
		 // FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\scribers.txt");
		  InputStreamReader obj=new InputStreamReader(System.in);
		  
		  BufferedReader fileinput = new BufferedReader(obj);
		  
		  fileinput.readLine(); //checked exception
		 		

	}

}
