package ensyu_3_14;

import java.util.Scanner;

public class ensyu_3_14 {

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
		
		int min;         // 変数の宣言
		int max;         // 変数の宣言
		
		if (firstNumber < secondNumber) {
			min = firstNumber;       // 変数に代入
			max = secondNumber;      // 変数に代入
		} else {
			min = secondNumber;      // 変数に代入
			max = firstNumber;       // 変数に代入
		}

		// コンソールに出力
		System.out.println("整数a:" + firstNumber);
		
		// コンソールに出力
		System.out.println("整数b:" + secondNumber);
		
		if (min == max) {
			// コンソールに出力
			System.out.println("二つの値は同じです。");
		}
		
	}

}