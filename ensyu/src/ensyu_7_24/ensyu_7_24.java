/*
 * 配列aから要素a[idx]を削除した配列を返却するメソッドarrayRmvOfを作成せよ。
 * 削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと。
 */
package ensyu_7_24;

import java.util.Scanner;

public class ensyu_7_24 {
	/* 
     * 関数名：arrayRmvOf
     * 説明：配列aから要素a[idx]を削除した配列を返却するメソッド
     * パラメータ：配列firstArrayを受け取る(int[] a)、削除するインデックスを受け取る(idx)
     * 返り値：生成された配列(secondArray)
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static int[] arrayRmvOf(int[] a, int idx) {
		// 返却用の配列
		int[] secondArray = new int[a.length - 1];
		// 返却用配列に要素を代入
		for (int i = 0; i < a.length - 1; i++) {
			// 削除するインデックスより後ろの場合
			if (i >= idx) {
				// 配列に代入
				secondArray[i] = a[i + 1];
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
		System.out.print("削除するインデックス：");
		// 入力値を代入
		int searchNumber = scanner.nextInt();
		
		// 出力
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < arrayRmvOf(firstArray, searchNumber).length; i++) {
			// 出力
			System.out.print(arrayRmvOf(firstArray, searchNumber)[i] + " ");
		}
		// 出力
		System.out.println("}");
	}

}