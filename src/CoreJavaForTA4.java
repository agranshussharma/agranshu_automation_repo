import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

class CoreJavaForTA4 {
	  
	  // stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;

	  // method to turn on the light
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  // method to turn off the light
	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
	

	  public static void main(String[] args) {

	    // create objects led and halogen
		  CoreJavaForTA4 led = new CoreJavaForTA4();
		  CoreJavaForTA4 halogen = new CoreJavaForTA4();

	    // turn on the light by
	    // calling method turnOn()
	    led.turnOn();

	    // turn off the light by
	    // calling method turnOff()
	    halogen.turnOff();
	  }
	}