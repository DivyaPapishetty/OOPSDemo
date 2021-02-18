

	final class FinalClass {
		  public void display() {
		    System.out.println("This is a final method.");
		  }
		}

		// try to extend the final class
		class FinalClassDemo extends FinalClass {
		  public  void display() {
		    System.out.println("The final method is overridden.");
		  }

		  public static void main(String[] args) {
		    FinalClassDemo obj = new FinalClassDemo();
		    obj.display();
		  }
		}
	// cannot extend final class
		
		//no inheritance
		//access methods