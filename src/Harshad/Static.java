package harshad;


public class Static {

	static int i = 10;
	  static void method() {
	    System.out.println("Inside Static method");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Accessing Static method
	    Static.method();
	    // Accessing Static Variable
	    System.out.println(Static.i);

	}

}
