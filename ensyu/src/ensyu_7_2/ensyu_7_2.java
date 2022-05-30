/*
 * 三つのint型引数a, b, cの最小値を求めるメソッドminを作成せよ。
 * int min(int a, int b, int c)
 */
package ensyu_7_2;

import java.util.Scanner;

public class ensyu_7_2 {
	
	// メソッドの作成
	static int min(int a, int b, int c) {
		// 1つめの整数を代入
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}
	
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 入力を促す
		System.out.print("整数a：");
		// 変数に代入
		int firstNumber = scanner.nextInt();
		// 入力を促す
		System.out.print("整数b：");
		// 変数に代入
		int secondNumber = scanner.nextInt();
		// 入力を促す
		System.out.print("整数c：");
		// 変数に代入
		int thirdNumber = scanner.nextInt();
		
		// 結果の出力
		System.out.print("最小値は" + min(firstNumber, secondNumber, thirdNumber) + "です。");
	}
}
