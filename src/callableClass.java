
public class callableClass {
	
	public String getStringData() {
		return "return string from another class";
	}
	
	boolean isOn;

	  // method to turn on the light
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }
	

}
