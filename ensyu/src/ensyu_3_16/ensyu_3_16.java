/*
 * 三つの整数値を読み込んで昇順（小さい順）に
 * ソートするプログラムを作成せよ。
 */
package ensyu_3_16;

import java.util.Scanner;

public class ensyu_3_16 {

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

		// もし整数aが整数bより小さい場合は入れ替える。
		if (firstNumber < secondNumber) {

			// 変数に代入
			int number = firstNumber;

			// 変数に代入
			firstNumber = secondNumber;

			// 変数に代入
			secondNumber = number;
		}
		// もし整数bが整数cより小さい場合は入れ替える。
		if (secondNumber < thirdNumber) {

			// 変数に代入
			int number = secondNumber;

			// 変数に代入
			secondNumber = thirdNumber;

			// 変数に代入
			thirdNumber = number;
		}

		// 再度整数aと整数bを比較し、整数aが整数bより小さい場合は入れ替える。
		if (firstNumber < secondNumber) {

			// 変数に代入
			int number = firstNumber;

			// 変数に代入
			firstNumber = secondNumber;

			// 変数に代入
			secondNumber = number;
		}

		// コンソールに出力
		System.out.println();

		// コンソールに出力
		System.out.println("数字を昇順となるように並び替えました。");

		// コンソールに出力
		System.out.println("結果は" + thirdNumber + " < " + secondNumber + " < " + firstNumber + "です。");
			}

}