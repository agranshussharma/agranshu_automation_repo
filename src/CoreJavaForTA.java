import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class CoreJavaForTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callableClass obj = new callableClass();
		obj.turnOn();
		
		//DATA TYPES
		//integer string double boolean
		int it;
		it=5;
		it=8;
		//System.out.println(it);

		String str = "i am ";
		String str1 = "chaitanaya";
		String str2;
		
		//concatinating two strings
		//System.out.println(str+str1);

		str2="hello all";
		//float or decimal
		//Float vs Double 
		double db = 4.34;


		//switch is ON or OFF
		boolean bl = false;
		//System.out.println(bl);

		//System.out.println("integer " + it);

		//There's an aircraft
		//example aircraftSeats[]
		/*
		 * 0 -> Victor
		 * 1 -> Sheetal
		 * 2 -> Kalyan
		 * 3 -> Soumya
		 * 4 -> Monalisha
		 * 5 -> Sanskurti
		 */
			
		//ARRAYS
		int[] arr = new int[4];
		arr[0]=4;
		arr[1]=3;
		arr[2]=2;
		arr[3]=1;
		
		int[] arr2 = {4,3,2,1};
		//arr2[1]= 100
		//arr2[2]=200 arr[5] n/a
		
		//System.out.println(arr2[0]);
		
		
		

		//LOOP
		//print the number '5' ten times
		//print the number from 1 to 10 in increasing order +1
		
		int[] testArray = {5,4,3};
		testArray[0]=5;
		testArray[1]=4;
		testArray[2]=3;


		//System.out.println(testArray);

		//System.out.println(testArray);
		//ITERATORS
		//include i=1 || i<= examples || String[] example
		for(int i=0; i<testArray.length; i++) {
			//System.out.print(testArray[i]);
		}
		
		//ENHANCER ITERATIONS
		for(int i : arr2) {
			//System.out.println(arr2[i]);
		}

		//CONDITIONAL ITERATIONS 
		//break
		int[] arr3 = {91,49,9,88,72};
		//spot out the even numbers in this array		
				
		for(int i=0; i<arr3.length; i++) {
			if(arr3[i]%2==0) {
			//System.out.println(arr3[i]);
			break;
			}else {
				//System.out.println(arr3[i]);
			}
		}
		
		int[] arrExample = {1,2,3,4,5};
		//System.out.println(arrExample[0]);
		//System.out.println(arrExample[4]);
		for(int i=arrExample.length-1; i>=0; i--) {
			//System.out.println(arrExample[i]);
		}
		
		//ARRAY LIST --> a resizable array
		//ARRAY int[] arrExample = {1,2,3,4,5};
		ArrayList todoList1 = new ArrayList();
		//create object of the class - object.method
		//package >> class >> object >> method
		todoList1.add("get up");
		todoList1.add("take a bath");
		todoList1.add("have breakfast");
		todoList1.add("leave for office");
		todoList1.remove("have breakfast");
		todoList1.remove(1);
		System.out.println(todoList1);
		

		
		

	
		
		
		//Array is a fixed sized data structure and ArrayList is not a fixed sized data structure
		//ITERATING OVER ARRAY LIST
		
		/*for(int i=0; i<todoList.size();i++) {
		    System.out.println(todoList.get(i));

		}*/
		
		//contains
		todoList1.contains("tom");
		
		//convert array to array list
		String[] name = {"a", "b", "c"};
		//List nameArrayList = (List) Arrays.asList(name);
		//using findElements
				

	}
	
	

}
