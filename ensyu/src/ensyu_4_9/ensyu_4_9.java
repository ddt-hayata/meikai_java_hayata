/*
 * 正の整数値を読み込んで、1からnまでの積を求めるプログラムを作成せよ。
 * int型の場合、13以上の計算が正常にできない。long型にすると9223372036854775807の計算結果までできる。
 */
package ensyu_4_9;

import java.util.Scanner;

public class ensyu_4_9 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.println("1からnまでの積を求めます。");

		// 変数の宣言
		long number;

		do {

			// コンソールに出力
			System.out.print("正の整数：");

			// 変数に代入
			number = scanner.nextInt();

		} while (number < 1);

		long productNumber = 1;
		long i = 1;

		while (i <= number) {

			productNumber *= i;

			i++;
		}

		// コンソールに出力
		System.out.println("1から" + number + "までの積は" + productNumber + "です。");

	}

}
