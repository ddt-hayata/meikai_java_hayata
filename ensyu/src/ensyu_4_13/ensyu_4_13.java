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
		// コンソールに出力
		System.out.print("nの値：");
		// 変数の宣言
		int n;
		// 変数に代入
		n = scanner.nextInt();
		// 合計用の変数
		int sum = 0;
		// ループ条件
		for (int i = n; i > 0; i--) {
				sum += i;
		}
		// コンソールに出力
		System.out.println("1から" + n + "までの和は"  + sum + "です。");
	}
}