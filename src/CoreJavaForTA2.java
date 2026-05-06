import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class CoreJavaForTA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop implementation
		for(int i=10; i>=1; i--) {
			//System.out.println(i);
			
		}
		for(int i=1; i<=10; i++) {
			//==System.out.println(i);	
		}


		
		//while loop implementation
		int b = 0;
		while (b < 5) {
		  //System.out.println(b);
		  b++;
		}
		
		//for loop implementation for array
		int[] testAbc = {10,4,3};
		//System.out.print(testAbc[2]);
		//0-Ankita
		//1-Soumya
		//2-Kalyan
		
		//0 - 10 
		//1 - 4
		//2 - 3
		testAbc[0]=10;
		//print vs println
		for(int i=0; i<testAbc.length; i++) {
			//System.out.print(testAbc[i]+" ");

			//System.out.println(testAbc[i]);
		}
		
		
		//split string and indexing
		//string is an object
		String str = "https://login.salesforce.com/";
		//split string to array
		String[] arrStr = str.split("login.");
		System.out.println("first part -> "+arrStr[0]);
		System.out.println("second part -> "+arrStr[1]);
		
		//getCurrentURL()
		//String str = //https://login.salesforce.com/
		//charAt implementation
		String testStr = "auto";
		for(int i=0; i<testStr.length(); i++) {
			//System.out.print(testStr.charAt(i) + "  ");
		}

		
	}

}
