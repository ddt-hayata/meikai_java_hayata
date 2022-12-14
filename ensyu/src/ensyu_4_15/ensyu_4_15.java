/*
 * 身長と標準体重の対応表を表示するプログラムを作成せよ。
 * 表示する身長の範囲（開始値/終了値/増分）は、整数値として読み込むこと。
 * ※標準体重は（身長-100）* 0.9によって求められる。
 */
package ensyu_4_15;

import java.util.Scanner;

public class ensyu_4_15 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.println("身長と標準体重の対応表を表示します。");

		int firstHeight;      // 変数の宣言
		int secondHeight;     // 変数の宣言
		int incremental;       // 変数の宣言

		do {
			// コンソールに出力
			System.out.print("何㎝から：");

			// 変数に代入
			firstHeight = scanner.nextInt();

			// ループ条件
		} while (firstHeight <= 0);

		do {
			// コンソールに出力
			System.out.print("何㎝まで：");

			// 変数に代入
			secondHeight = scanner.nextInt();

			// ループ条件
		} while (secondHeight <= 0);

		do {
			// コンソールに出力
			System.out.print("何㎝ごと：");

			// 変数に代入
			incremental = scanner.nextInt();

			// ループ条件
		} while (incremental <= 0);

		int height;         // 変数の宣言
		double weight;      // 変数の宣言

		// コンソールに出力
		System.out.println("身長 " + "標準体重");

		// ループ条件
		for (height = firstHeight; height <= secondHeight; height += incremental) {

			// 標準体重を求める
			weight = (height - 100) * 0.9;

			// コンソールに出力
			System.out.println(height + "  " + weight);

		}

	}

}
