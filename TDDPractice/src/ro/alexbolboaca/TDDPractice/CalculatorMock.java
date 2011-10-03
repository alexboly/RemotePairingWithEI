package ro.alexbolboaca.TDDPractice;

public class CalculatorMock implements ICalculator {

	boolean AddCalledWith10And20 = false;
	
	@Override
	public int add(int first, int second) {
		if(first == 10 && second == 20){
			AddCalledWith10And20 = true;
			return 0;
		}
		throw new RuntimeException("Called but with the wrong arguments: " + first + ", " + second);
	}

}
