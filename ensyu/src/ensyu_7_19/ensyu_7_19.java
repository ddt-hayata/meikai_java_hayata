/*
 * 配列aから要素a[idx]をを先頭とするn個の要素を削除するメソッドaryRmvNを作成せよ。
 * 削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと。
 * なお、移動されずにあまってしまう要素の値は変更しなくてよい。
 */
package ensyu_7_19;

import java.util.Scanner;

public class ensyu_7_19 {
    /* 
     * 関数名：aryRmvN
     * 説明：配列aから要素a[idx]をを先頭とするn個の要素を削除するメソッド
     * パラメータ：配列arrayを受けとる(int[] a)、削除開始インデックス(idx)、削除個数(n)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static void aryRmvN(int[] a, int idx, int n) {
		// 削除ループ
		for (int i = idx; i < a.length - 1; i++) {
			// インデックスが要素の長さを超える場合ループを抜ける
			if ((i + n) == a.length) {
				break;
			} else {
			// 後ろのインデックスの値を代入
			a[i] = a[i + n];
			}
		}
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
		// 出力
		System.out.print("削除を開始するインデックス：");
		// 要素数用変数
		int deletionIndex = scanner.nextInt();
		// 出力
		System.out.print("削除する個数：");
		// 要素数用変数
		int deletionNumber = scanner.nextInt();
		
		// メソッドの呼び出し
		aryRmvN(array, deletionIndex, deletionNumber);
		
		//出力
		System.out.println("array[" + deletionIndex + "]の要素を削除しました。");
		for (int i = 0; i < number; i++) {
		//出力
		System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}
