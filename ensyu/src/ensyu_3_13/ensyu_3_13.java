/*
 * キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 * ※たとえば2,3,1の中央値は2で、1,2,1の中央値は1で、3,3,3の中央値は3である。
 */
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

		// 中央値変数
		int median = 0;

		// 中央値を求める制御文
		if (firstNumber >= secondNumber) {
			if (secondNumber >= thirdNumber) {
				// 変数に代入
				median = secondNumber;
			} else if (firstNumber <= thirdNumber) {
				// 変数に代入
				median = firstNumber;
			} else {
				// 変数に代入
				median = thirdNumber;
			}
		} else if (firstNumber > thirdNumber) {
			// 変数に代入
			median = firstNumber;
		} else if (secondNumber > thirdNumber) {
			// 変数に代入
			median = thirdNumber;
		} else {
			// 変数に代入
			median = secondNumber;
		}
		System.out.print("中央値は" + median + "です。");
	}

}