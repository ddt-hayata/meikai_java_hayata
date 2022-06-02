/*
 * 配列aの要素a[idx]にxを挿入するメソッドaryInsを作成せよ。
 * 挿入に伴ってa[idx]～a[a.length - 2]を一つ後方にずらさなければならない。
 */
package ensyu_7_20;

import java.util.Scanner;

public class ensyu_7_20 {
    /* 
     * 関数名：aryIns
     * 説明：配列aから要素a[idx]をを先頭とするn個の要素を削除するメソッド
     * パラメータ：配列arrayを受けとる(int[] a)、追加するインデックス(idx)、挿入要素(x)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static void aryIns(int[] a, int idx, int x) {
		// 要素を一つずつ後ろにずらすループ
		for (int i = idx, j = 1; i < a.length - 1; i++, j++) {
			// 追加するインデックスより後ろをずらす
			a[a.length - j] = a[a.length - j - 1];
		}
		// 追加要素を代入
		a[idx] = x;
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
		System.out.print("追加するインデックス：");
		// 要素数用変数
		int deletionIndex = scanner.nextInt();
		// 出力
		System.out.print("挿入する要素：");
		// 要素数用変数
		int insertionNumber = scanner.nextInt();
		
		// メソッドの呼び出し
		aryIns(array, deletionIndex, insertionNumber);
		
		//出力
		System.out.println("array[" + deletionIndex + "]の要素を削除しました。");
		for (int i = 0; i < number; i++) {
		//出力
		System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}