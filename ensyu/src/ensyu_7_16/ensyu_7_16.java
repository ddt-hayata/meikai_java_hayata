/*
 * 配列aの要素の最小値を求めるメソッドを作成せよ。
 */
package ensyu_7_16;

import java.util.Scanner;

public class ensyu_7_16 {
	/*
	 * 関数名：min0f
	 * 説明：配列aの要素の最小値を求めるメソッド
	 * パラメータ：配列arrayを受けとる(int[] a)
	 * 返り値：最小値用変数(minimum)
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int min0f(int[] a) {
		// 合計用変数
		int minimum = a[0];
		// 要素数分、最小値を確認
		for (int i = 1; i < a.length; i++) {
			// 最小値を代入
			if (minimum > a[i]) {
				minimum = a[i];
			}
		}
		return minimum;
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 出力
		System.out.print("要素数：");
		// 要素数用変数
		int number = scanner.nextInt();
		// 配列の宣言
		int[] array = new int[number];
		
		// 出力・代入ループ
		for (int i = 0; i < number; i++) {
			//出力
			System.out.print("array[" + i + "] = ");
			array[i] = scanner.nextInt();
		}
		// メソッドの呼び出し・出力
		System.out.println(min0f(array));
	}

}
