/*
 * 前問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ。
 */
package ensyu_4_12;

import java.util.Scanner;

public class ensyu_4_12 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.println("カウントダウンします。");

		// 変数に代入
		int number = scanner.nextInt();

		// ループ条件
		for (int i = 0, j = number ; i <= number; i++, j--)

			// コンソールに出力
			System.out.println(i);

	}

}
