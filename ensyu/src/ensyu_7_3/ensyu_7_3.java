/*
 * 三つのint型引数a, b, cの中央値を求めるメソッドmedianを作成せよ。
 * int median(int a, int b, int c)
 */
package ensyu_7_3;

import java.util.Scanner;

public class ensyu_7_3 {
	
	// メソッドの作成
	static int median(int a, int b, int c) {
		// 中央値を求める制御文
		if (a >= b) {
			if (b >= c) {
				// 返却
				return b;
			} else {
				// 返却
				return c;
			}
		} else if (a > c) {
			// 返却
			return a;
		} else if (b > c) {
			// 返却
			return c;
		} else {
			// 返却
			return b;
		}
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
		System.out.print("中央値は" + median(firstNumber, secondNumber, thirdNumber) + "です。");
	}
}
