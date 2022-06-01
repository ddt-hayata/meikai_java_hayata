/*
 * 探索するキーと同じ値の要素が複数個存在する場合、
 * 最も末尾側に位置する要素を見つけるメソッドlinearSearchRを作成せよ。
 */
package ensyu_7_17;

import java.util.Scanner;

public class ensyu_7_17 {
	/*
	 * 関数名：linearSearchR
	 * 説明：探索するキーと同じ値の要素が複数個存在する場合、
	 *       最も末尾側に位置する要素を見つけるメソッド
	 * パラメータ：配列arrayを受けとる(int[] a)、整数keyを受け取る(key)
	 * 返り値：返却用インデックス(index)
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int linearSearchR(int[] a, int key) {
		// 最終インデックス用変数
		int index = -1;
		// 配列内の検索ループ
		for (int i = 0; i < a.length; i++) {
			// 値が同じ場合
			if (a[i] == key) {
				// 変数に代入
				index = i;
			}
		}
		// 変数内が0以上の場合
		if (index >= 0) {
			// 返却
			return index;
		// 変数内が0未満の場合
		} else{
			// 返却
			return -1;
		}
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("要素数：");
		// 変数に代入
		int number = scanner.nextInt();
		// 配列の宣言
		int[] array = new int[number];
		
		// 配列に要素を追加するループ
		for (int i = 0; i < number; i++) {
			// 出力
			System.out.print("x[" + i + "]：");
			// 配列に要素を追加
			array[i] = scanner.nextInt();
		}
		// 出力
		System.out.print("探す値：");
		// 変数に代入
		int key = scanner.nextInt();
		
		// メソッドの呼び出し
		int index = linearSearchR(array, key);
		
		//出力の制御分
		if (index == -1) {
			// 出力
			System.out.println("その値の要素は存在しません。");
		} else {
			// 出力
			System.out.println("その値はx[" + index + "]にあります。");
		}
	}
}

