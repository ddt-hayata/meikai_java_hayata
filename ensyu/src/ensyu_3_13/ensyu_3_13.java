package ensyu_3_13;

import java.util.Scanner;

public class ensyu_3_13 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数a：");
		
		// 変数に代入
		int firstNumber = scanner.nextInt();
		
		// コンソールに出力
			System.out.print("整数b：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		// コンソールに出力
		System.out.print("整数c：");
				
		// 変数に代入
		int thirdNumber = scanner.nextInt();
		
		if (secondNumber < firstNumber && firstNumber < thirdNumber) {
			// コンソールに出力
			System.out.print("中央値は" + firstNumber + "です。");
		
		} else if (thirdNumber < firstNumber && firstNumber < secondNumber) {
			// コンソールに出力
			System.out.print("中央値は" + firstNumber + "です。");
		
		} else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
			// コンソールに出力
			System.out.print("中央値は" + secondNumber + "です。");
		
		} else if (thirdNumber < secondNumber && secondNumber < firstNumber) {
			// コンソールに出力
			System.out.print("中央値は" + secondNumber + "です。");
		
		} else if (firstNumber < thirdNumber && thirdNumber < secondNumber) {
			// コンソールに出力
			System.out.print("中央値は" + thirdNumber + "です。");
		
		} else if (secondNumber < thirdNumber && thirdNumber < firstNumber) {
			// コンソールに出力
			System.out.print("中央値は" + thirdNumber + "です。");
		
		} else {
			// コンソールに出力
			System.out.print("中央値がありません。");
		
		}
		
	}

}