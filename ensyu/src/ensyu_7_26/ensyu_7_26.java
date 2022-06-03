/*
 * 配列aから要素a[idx]にxを挿入した配列を返すメソッドarrayInaOfを作成せよ。
 * 挿入に伴ってa[idx]以降の全要素を一つ後方ににずらすこと。
 */
package ensyu_7_26;

import java.util.Scanner;

public class ensyu_7_26 {
	/* 
     * 関数名：arrayRmvOfN
     * 説明：配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッド
     * パラメータ：配列firstArrayを受け取る(int[] a)、挿入インデックスを受け取る(idx)、挿入する値(x)
     * 返り値：生成された配列(secondArray)
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static int[] arrayInaOf(int[] a, int idx, int x) {
		// 返却用の配列
		int[] secondArray = new int[a.length + 1];
		// 返却用配列に要素を代入
		for (int i = 0; i < secondArray.length; i++) {
			// 挿入インデックスの場合
			if (i == idx) {
				// 配列に代入
				secondArray[i] = x;
			// 挿入インデックスより後ろ
			} else if (i > idx) {
				// 配列に代入
				secondArray[i] = a[i - 1];
			// 挿入インデックスより前
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
		System.out.print("挿入インデックス：");
		// 入力値を代入
		int insertionIndexNumber = scanner.nextInt();
		// 出力
		System.out.print("挿入する値：");
		// 入力値を代入
		int insertionNumber = scanner.nextInt();
		
		// 出力
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < arrayInaOf(firstArray, insertionIndexNumber, insertionNumber).length; i++) {
			// 出力
			System.out.print(arrayInaOf(firstArray, insertionIndexNumber, insertionNumber)[i] + " ");
		}
		// 出力
		System.out.println("}");
	}

}