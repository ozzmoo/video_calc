//��������� ����� Calculate
public class Calculate {
	//��������� ���������� result ���� double
	public static double result;
	//��������� ����� toCalculate() ���� double
	public static double toCalculate() {
		//������� ��������� window ������ createWindow
	    createWindow window = new createWindow();
	    //��������� ������ arrayOfValues ���� double c 7 ��������
	    double[] arrayOfValues = new double[7];
	    //��������� ������ ������� ����������� �� ������ getArrayOfValues ������ createWindow
	    arrayOfValues = window.getArrayOfValues();
	    //������ ��������� �������� ���������� result
	    result = 1;
	    
		//��������� ���������� videoVol audioVol ���� double
	    double videoVol;
	    double audioVol;
	    
	    //������������ ����� � ����� ����� ������ � ��������� ���������� �������� � ���������
	    audioVol = arrayOfValues[4] * arrayOfValues[5] * arrayOfValues[6] / (8.0 * 1024.0 * 1024.0);
		videoVol = arrayOfValues[0] * arrayOfValues[1] * arrayOfValues[2] / (8.0 * 1024.0 * 1024.0);
		//�������� ����� � ����� ����� �� ���-�� ������/���
		result = audioVol * videoVol * arrayOfValues[3];
		//���������� ��������� ����������
		return result;
	}
	//��������� ����� toFormateResult ���� String
	public static String toFormateResult() {
		//��������� ���������� value ���� double � ������� � ��� ������ ���������� �� ������ toCalculate
		double value = toCalculate();
		//��������� ���������� formatedValue ���� double
		String formatedValue;
		//��������� �������� ������ ��� ��������������
		if (value > 500.0) {
			formatedValue = Double.toString(value / 1024.0) ;
			//���������� ����� removeSymbols ��� �������� ������ ������ ����� �������
			formatedValue = removeSymbols(formatedValue) + " ��";
		}
		else {
			formatedValue = Double.toString(value);
			//���������� ����� removeSymbols ��� �������� ������ ������ ����� �������
			formatedValue = removeSymbols(formatedValue) + " ��";
		}
		//���������� ����������������� ���������
		return formatedValue;
		
	}
	//��������� ����� removeSymbols ���� String, ����������� �� ���� ���������� ���� String
	public static String removeSymbols(String s) {
		//��������� ���������� end ���� int � ���������� � ��� ������� ����� � �����
		int end = s.indexOf(".");
		//�������� �� �������� ������ ��������� ������� � 0 ������� � ���������� end+2
		s = s.substring(0, end+2);
		//���������� ���������� ������
		return s;
	}
	
}
