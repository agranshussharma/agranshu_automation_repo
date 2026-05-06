import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class CoreJavaForTA3 {
	
	//Class 	  >> Object 			 >> Method
	//Luxury Cars >> BMW, Audi, Mercedes >> accelerate, break, speed up, speed down, opening sun roof
	
	/*object instantiation
		LuxuryCars bmw = new LuxuryCars();
		LuxuryCars audi = new LuxuryCars();

	  calling methods
		bmw.brakes
		bmw.accelrate
		audi.openSunRoof
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoreJavaForTA3 obj = new CoreJavaForTA3();
				
		//obj.openSunRoof();
		//obj.getDataVoid();
		
		String str = obj.getDataString();
		//System.out.println(str);
		
		callableClass obj1 = new callableClass();
		System.out.println(obj1.getStringData());

		
	}
	
	//ACCESS MODIFIERS IN JAVA
	/*
	 * Understanding relevance of "public, private,
	 * protected and default" access modifiers
	 * PUBLIC => Members are accessible from any other class, including from outside the package.
	 * This is the most permissive access modifier.
	 * PROTECTED => Members are accessible within the class and by subclasses, even if they are in a different package.
	 * This is slightly less restrictive than the default level of accessibility. 
	 * PRIVATE => Members are only accessible within the class in which they are declared. This is the most restrictive access modifier.
	 * It is typically used for sensitive data.
	 * DEFAULT => Members are only accessible within the same package.
	 * This is the default access modifier when no access modifier is explicitly specified.
	 */
	
	public void getDataVoid() {
		//method declaration and definition
		int a=5, b=7;
		System.out.println("line 1");
		System.out.println(b-a);
		System.out.println(a+b);		
	}
	public void openSunRoof() {
		//1. Click on the button
		//2. Set the speed
		//3. Wait for the roof to open
		System.out.println("and the sunroof is now open");
	}
	public String getDataString() {
		return "return string";
	}

}
