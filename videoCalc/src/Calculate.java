
public class Calculate {
	public static double result;
	public static void main(String[] args) {
		

	}
	
	public static double toCalculate() {
		
	    createWindow window = new createWindow();
	    double[] arrayOfValues = new double[7];
	    arrayOfValues = window.getArrayOfValues();
	    result = 1;
	    
		
	    double videoVol;
	    double audioVol;
	    
	    audioVol = arrayOfValues[4] * arrayOfValues[5] * arrayOfValues[6] / (8.0 * 1024.0 * 1024.0);
		videoVol = arrayOfValues[0] * arrayOfValues[1] * arrayOfValues[2] / (8.0 * 1024.0 * 1024.0);
		result = audioVol * videoVol * arrayOfValues[3];
		return result;
	}
	
	public static String toFormateResult() {
		double value = toCalculate();
		String formatedValue;
		if (value > 500.0) {
			formatedValue = Double.toString(value / 1024.0) ;
			formatedValue = removeSymbols(formatedValue) + " ус";
		}
		else {
			formatedValue = Double.toString(value);
			formatedValue = removeSymbols(formatedValue) + " ьс";
		}
		return formatedValue;
		
	}
	
	public static String removeSymbols(String s) {
		int end = s.indexOf(".");
		s = s.substring(0, end+2);
		return s;
	}
	
}
