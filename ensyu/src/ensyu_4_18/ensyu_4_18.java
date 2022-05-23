/*
 * 1からnまでの整数値の2乗値を表示するプログラムを作成せよ。
 */
package ensyu_4_18;

import java.util.Scanner;

public class ensyu_4_18 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.println("1からnまでの和を求めます。");

		// コンソールに出力
		System.out.print("nの値：");

		// 変数に代入
		int n = scanner.nextInt();

		// ループ条件
		for (int i = 1; i <= n; i++) {

			// 二乗用の変数の宣言
			int squareNumber = i * i;

			// コンソールに出力
			System.out.println(i + "の2乗は" + squareNumber);

			}

	}

}
