/*
 * 正の整数値を0までカウントダウンするList4-4（p.100）をfor文で実現せよ。
 */
package ensyu_4_11;

import java.util.Scanner;

public class ensyu_4_11 {

	public static void main(String[] args) {
		// インスタンス化
		Scanner scanner = new Scanner(System.in);
		// コンソールに出力
		System.out.println("カウントダウンします。");
		// 変数に代入
		int number = scanner.nextInt();
		// ループ条件
		for (int i = number; i >= 0; i--) {
			// コンソールに出力
			System.out.println(i);

		}
	}
}
