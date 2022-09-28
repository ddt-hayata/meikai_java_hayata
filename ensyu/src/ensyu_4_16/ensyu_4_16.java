/*
 * 読み込んだ個数だけ*を表示するList4-11（p.114）を書きかえて、
 * 5個表示するごとに改行するプログラムを作成せよ。
 */
package ensyu_4_16;

import java.util.Scanner;

public class ensyu_4_16 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.print("何個*を表示しますか：");

		// 変数に代入
		int number = scanner.nextInt();

		// 変数の宣言
		int i;

		// ループ条件
		for (i = 1; i <= number; i++) {

			// コンソールに出力
			System.out.print('*');

			// 改行を入れる条件
			if (i % 5 == 0) {
				System.out.println();
			}
		}

		// コンソールに出力
			System.out.println();

	}

}
