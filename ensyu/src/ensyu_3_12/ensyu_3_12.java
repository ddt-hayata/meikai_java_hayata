/*
 * キーボードから読み込んだ三つの整数値の
 * 最小値を求めて表示するプログラムを作成せよ。
 */
package ensyu_3_12;

import java.util.Scanner;

public class ensyu_3_12 {

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
		
		// 変数に代入
		int min = firstNumber;
		
		if (secondNumber < min) {
			// 変数に代入
			min = secondNumber;
		
		}
		
		if (thirdNumber < min) {
			// 変数に代入
			min = thirdNumber;
		
		}
		
		// コンソールに出力
		System.out.print("最小値は" + min + "です。");
		
	}

}