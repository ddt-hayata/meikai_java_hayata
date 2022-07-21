/*
 * 前問のプログラムを書き換えて、式を表示するプログラムを作成せよ。
 */
package ensyu_4_14;

import java.util.Scanner;

public class ensyu_4_14 {

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
		int sum = 0;       // 変数の宣言
		// ループ条件
		for (int i = 1; i <= n; i++) {
			if (i <= n - 1) {
				// コンソールに出力
				System.out.print(i + " " + "+" + " ");
			} else if (i == n){
				// コンソールに出力
				System.out.print(i + " ");
			}
			// インクリメントする
			sum += i;
		}
		// コンソールに出力
		System.out.println(" " + "=" + " " + sum);
	}
}
