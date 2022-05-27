/*
 * 配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ。
 * なお、二つの配列の要素数は同一であると仮定してよい。
 */
package ensyu_6_13;

import java.util.Scanner;

public class ensyu_6_13 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		// コンソールに出力
		System.out.print("要素数：");
		// 要素数用の変数
		int number = scanner.nextInt();
		// 配列の宣言
		int[] array = new int[number];
		// 並べ替え用配列の宣言
		int[] b = new int[number];
		
		// 出力ループ
		for (int i = 0; i < number; i++) {
			// コンソールに出力
			System.out.print("array [" + i +  "] = ");
			// 要素を代入
			array[i] = scanner.nextInt();
		}
		
		// 配列aの全要素を配列bにコピー
		for (int i = 0, j = number - 1; i < number; i++, j--) {
			// 要素を一つずつ移動
			b[j] = array[i];
		}
		// コンソールに出力
		System.out.println("aの全要素をbにコピーしました。");
		
		// 出力ループ
		for (int i = 0; i < number; i++) {
			// コンソールに出力
			System.out.println("b [" + i +  "] = " + b[i]);
		}
	}

}
