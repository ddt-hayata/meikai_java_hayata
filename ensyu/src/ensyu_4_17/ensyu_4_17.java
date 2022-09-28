/*
 * 読み込んだ整数値すべての約数を表示するList4-11（p.118）を書き換えて、
 * 約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ。
 */
package ensyu_4_17;

import java.util.Scanner;

public class ensyu_4_17 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.print("整数値：");

		// 変数に代入
		int number = scanner.nextInt();

		// 個数カウンター用の変数の宣言
		int count = 0;

		// ループ条件
		for (int i = 1; i <= number; i++)

			// 	入力された整数値が割り切れる場合
			if (number % i == 0) {

				// コンソールに出力
				System.out.println(i);

				//個数カウンターにイクリメント
				count++;

			}

		// コンソールに出力
		System.out.println(number + "の約数の個数は" + count + "です。");

	}

}
