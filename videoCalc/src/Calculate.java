
public class Calculate {
	public static int result;
	public static void main(String[] args) {
		

	}
	
	public static void toCalculate() {
		
	    createWindow window = new createWindow();
	    int[] arrayOfValues = new int[7];
	    arrayOfValues = window.getArrayOfValues();
	    result = 1;
	    
	    for( int i = 0; i < arrayOfValues.length; i++) {
	    	result *= arrayOfValues[i];
	    }
		System.out.print(result);
	}
	
}
