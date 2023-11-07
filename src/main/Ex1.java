package main;

public class Ex1 {

	public static void main(String[] args) {
		//Calc calc = new Calc(); //미완성 상태이기 때문에 인스턴스 생성 불가 Calc에 오류가 뜸
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.times(10, 5));
		System.out.println(calculator.divide(10, 5));
		
	}

}
//계산기 클래스
class Calculator implements Calc{// 인터페이스 상속받기 //클래스가 클래스를 상속 받을 때는 extends / 인터페이스를 상속 받을 때는 implements

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
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	} 
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}
	
}