/*
 * 二つのint型整数a, bの最小値、三つのint型整数a, b, cの最小値、
 * 配列aの要素の最小値を求める、多重定義されたメソド群を作成せよ。
 */
package ensyu_7_30;

import java.util.Scanner;

public class ensyu_7_30 {
	/* 
     * 関数名：min
     * 説明：二つのint型整数a, bの最小値を求めるメソッド
     * パラメータ：整数a, bを受け取る(int a, int b)
     * 返り値：最小値
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static int min(int a, int b) {
		// 最小値の返却
		return a < b ? a : b;
	}
	/* 
     * 関数名：min
     * 説明：三つのint型整数a, b, cの最小値を求めるメソッド
     * パラメータ：整数a, b, cを受け取る(int a, int b, int c)
     * 返り値：最小値(minimum)
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static int min(int a, int b, int c) {
		// 最小値変数
		int minimum = a;
		// bの値が小さいの場合
		if (minimum > b) {
			// 変数に代入
			minimum = b;
		}
		// ｃの値が小さいの場合
		if (minimum > c) {
			// 変数に代入
			minimum = c;
		}
		// 返却
		return minimum;
	}
	/* 
     * 関数名：min
     * 説明：配列aの要素の最小値を求めるメソッド
     * パラメータ：配列aを受け取る(int[] a)
     * 返り値：最小値(minimum)
     * 作成者：早田
     * 作成日：2022/6/3
     */ 
	static int min(int[] a) {
		// 最小値変数
		int minimum = a[0];
		// 配列aの最小値を求める
		for (int i = 0; i < a.length; i++) {
			// 値が小さい場合代入
			if (minimum > a[i])
				// 変数に代入
			minimum = a[i];
		}
		// 返却
		return minimum;
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("整数a：");
		// 入力値を変数に代入
		int firstNumber = scanner.nextInt();
		// 出力
		System.out.print("整数b：");
		// 入力値を変数に代入
		int secondNumber = scanner.nextInt();
		// 出力
		System.out.print("整数c：");
		// 入力値を変数に代入
		int thirdNumber = scanner.nextInt();
		
		// 出力
		System.out.print("配列aの要素数：");
		// 配列の要素数
		int elementCount = scanner.nextInt();
		// 配列の宣言
		int[] array = new int[elementCount];
		// 出力ループ
		for (int i = 0; i < array.length; i++) {
			// 出力
			System.out.print("a[" + i + "] = ");
			// 入力値を配列に代入
			array[i] = scanner.nextInt();
		}
		// 出力
		System.out.println("x, yの最大値は" + min(firstNumber, secondNumber));
		// 出力
		System.out.println("x, y, zの最大値は" + min(firstNumber, secondNumber, thirdNumber));
		// 出力
		System.out.println("x, yの最大値は" + min(array));
	}
}
