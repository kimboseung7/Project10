package main;

public class Quiz1 {

	public static void main(String[] args) {
		Calc calc = new Calculator();
		
		if (calc instanceof Calculator) {

			Calculator calculator = (Calculator) calc; //형변환한 calc를 변수 calculator에 넣어줌

			calculator.showInfo(); //calc에 저장되어있던 showInfo가 나옴
		}

	}

}
