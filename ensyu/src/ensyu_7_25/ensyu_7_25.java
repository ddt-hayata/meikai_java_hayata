/*
 * 配列aから要素a[idx]を先頭とするn個の要素を削除した配列を
 * 返却するメソッドarrayRmvOfNを作成せよ。
 * 削除はa[idx]より後ろの全要素をn個前方ににずらすことによって行うこと。
 */
package ensyu_7_25;

import java.util.Scanner;

public class ensyu_7_25 {
	/* 
     * 関数名：arrayRmvOfN
     * 説明：配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッド
     * パラメータ：配列firstArrayを受け取る(int[] a)、削除開始インデックスを受け取る(idx)、削除終了インデックスを受け取る(n)
     * 返り値：生成された配列(secondArray)
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		// 返却用の配列
		int[] secondArray = new int[a.length - (n - idx + 1)];
		// 返却用配列に要素を代入
		for (int i = 0; i < secondArray.length; i++) {
			// 削除するインデックスより後ろの場合
			if (i >= idx && i <= n) {
				// 配列に代入
				secondArray[i] = a[n + i - 1];
			// 削除インデックス以外
			} else {
			// 配列に代入
			secondArray[i] = a[i];
			}
		}
		// 返却
		return secondArray;
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 出力
		System.out.print("要素数：");
		// 入力値を代入
		int number = scanner.nextInt();
		// 配列の宣言
		int[] firstArray = new int[number];
		// 配列aに要素を代入
		for (int i = 0; i < firstArray.length; i++) {
			// 出力
			System.out.print("a[" + i + "]：");
			// 配列に代入
			firstArray[i] = scanner.nextInt();
		}
		// 出力
		System.out.print("配列a = { ");
		// 出力ループ
		for (int i = 0; i < firstArray.length; i++) {
			// 出力
			System.out.print(firstArray[i] + " ");
		}
		// 出力
		System.out.println("}");
		
		// 出力
		System.out.print("削除開始インデックス：");
		// 入力値を代入
		int firstDeletionNumber = scanner.nextInt();
		// 出力
		System.out.print("削除終了インデックス：");
		// 入力値を代入
		int secondDeletionNumber = scanner.nextInt();
		
		// 出力
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < arrayRmvOfN(firstArray, firstDeletionNumber, secondDeletionNumber).length; i++) {
			// 出力
			System.out.print(arrayRmvOfN(firstArray, firstDeletionNumber, secondDeletionNumber)[i] + " ");
		}
		// 出力
		System.out.println("}");
	}

}
