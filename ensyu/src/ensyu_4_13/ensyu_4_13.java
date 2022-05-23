/*
 * 1からnまでの和を求めるList4-10（p.112）をfor文で実現せよ。
 */
package ensyu_4_13;

import java.util.Scanner;

public class ensyu_4_13 {

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.println("1からnまでの和を求めます。");

		// 変数の宣言
		int n;

		// コンソールに出力
		System.out.print("nの値：");

		// 変数に代入
		n = scanner.nextInt();

		// ループ条件
		for (int i = 1, sum = 0; i <= n; sum += i, i++)

			if (i == n) {

				sum += i;

				// コンソールに出力
				System.out.println("1から" + n + "までの和は"  + sum + "です。");

			}

	}

}
