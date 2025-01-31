package Demo1;

public class DemoTestB1 {
	public class VariableExample {
	    // Instance variable
	    int instanceVar = 10;

	    // Static variable (shared by all objects)
	    static int staticVar = 20;

	    public void showVariables() {
	        // Local variable
	        int localVar = 5;
		    //code cleared you can check and updet me team

	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	    }

	    public static void main(String[] args) {
	        // Creating an object to access instance variables
	        VariableExample obj = new VariableExample();
	        obj.showVariables();
	    }
	}
	
	

}
