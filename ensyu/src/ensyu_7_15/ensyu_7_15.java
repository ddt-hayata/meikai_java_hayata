/*
 * 配列aの全要素の合計を求めるメソッドを作成せよ。
 */
package ensyu_7_15;

import java.util.Scanner;

public class ensyu_7_15 {
	/*
	 * 関数名：sum0f
	 * 説明：配列aの全要素の合計を求めるメソッド
	 * パラメータ：配列arrayを受けとる(int[] a)
	 * 返り値：合計用変数(sum)
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int sum0f(int[] a) {
		// 合計用変数
		int sum = 0;
		// 要素数分、変数に加算
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
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
		
		// 出力ループ
		for (int i = 0; i < number; i++) {
			//出力
			System.out.print("array[" + i + "] = ");
			array[i] = scanner.nextInt();
		}
		// メソッドの呼び出し・出力
		System.out.println(sum0f(array));
	}

}
