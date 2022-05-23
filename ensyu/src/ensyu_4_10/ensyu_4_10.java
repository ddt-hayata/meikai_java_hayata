/*
 * 読み込んだ値が1未満であれば改行文字を出力しないように
 * List4-11（p.114）を書き換えたプログラムを作成せよ。
 */
package ensyu_4_10;

import java.util.Scanner;

public class ensyu_4_10 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.print("何個*を表示しますか：");

		// 変数に代入
		int number = scanner.nextInt();

		// ループ条件
		for (int i = 0; i < number; i++)

			// コンソールに出力
			System.out.print('*');

			if (number < 1) {

				// コンソールに出力
				System.out.print("");

			}

	}

}
