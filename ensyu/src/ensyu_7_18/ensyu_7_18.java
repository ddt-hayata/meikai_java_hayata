/*
 * 配列aから要素a[idx]を削除するメソッドaryRmvを作成せよ。
 * 削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと。
 * なお、移動されずにあまってしまう末尾要素a[a.length - 1]の値は変更しなくてよい。
 */
package ensyu_7_18;

import java.util.Scanner;

public class ensyu_7_18 {
    /* 
     * 関数名：aryRmv
     * 説明：配列aから要素a[idx]を削除するメソッド
     * パラメータ：配列arrayを受けとる(int[] a)、削除するインデックス(idx)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/1
     */
	static void aryRmv(int[] a, int idx) {
		// 削除ループ
		for (int i = idx; i < a.length - 1; i++) {
		// 後ろのインデックスの値を代入
		a[i] = a[i + 1];
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
		System.out.print("削除するインデックス：");
		// 要素数用変数
		int deletionIndex = scanner.nextInt();
		
		// メソッドの呼び出し
		aryRmv(array, deletionIndex);
		
		//出力
		System.out.println("array[" + deletionIndex + "]の要素を削除しました。");
		for (int i = 0; i < number; i++) {
		//出力
		System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}
