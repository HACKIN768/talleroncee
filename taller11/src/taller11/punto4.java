package taller11;

public class punto4 {
	public class Factorial {
	    public int num = 10;

	    int getFactorial() {
	        int factorial = 1;
	        for(int i = num; i > 0; i--){
	            factorial *= i;
	        }
	        return factorial;
	    }

	    public String toString() {
	        String factorialStr = "Factorial: " + num + "! = ";
	        int factorial = 1;
	        for(int i = 1; i <= num; i++) {
	            factorial *= i;
	            factorialStr += i;
	            if(i != num) {
	                factorialStr += " * ";
	            }
	        }
	        factorialStr += " = " + factorial;
	        return factorialStr;
	    }

	    public void main(String[] args) {
	        Factorial f = new Factorial();
	        System.out.println(f);
	    }
	}

}
