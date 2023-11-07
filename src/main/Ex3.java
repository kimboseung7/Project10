package main;

public class Ex3 {

	public static void main(String[] args) {
		Calc calc = new Calculator();
		
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));
	}

}

class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if (num2 <= 0) {
			return Calc.ERROR; // 음수면 오류코드
		} else {
			return num1 * num2;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if (num1 < num2) {
			return Calc.ERROR;
		} else {
			return num1 / num2;
		}

	}
}