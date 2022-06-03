/*
 * 配列aの要素の中で値がxである全要素のインデックスを
 * 先頭から順に格納した配列を返却するメソッドarraySrchIdxを作成せよ。
 */
package ensyu_7_23;

import java.util.Scanner;

public class ensyu_7_23 {
	/* 
     * 関数名：arraySrchIdx
     * 説明：配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッド
     * パラメータ：配列firstArrayを受け取る(int[] a)、整数値を受け取る(x)
     * 返り値：生成された配列(secondArray)
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static int[] arraySrchIdx(int[] a, int x) {
		// 要素数カウント用変数
		int count = 0;
		// カウント用ループ
		for (int i = 0; i < a.length; i++) {
			// 要素と整数が同じ場合カウント用変数をイクリメント
			if (a[i] == x) {
				// カウント用変数をイクリメント
				count++;
			}
		}
		// 返却用の配列
		int[] secondArray = new int[count];
		
		// 返却用配列に要素を代入
		for (int i = 0, j = 0; i < a.length; i++) {
			// 要素と検索する要素が同じ場合
			if (a[i] == x) {
				// 配列に代入
				secondArray[j] = i;
				// イクリメント
				j++;
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
		System.out.print("検索する要素：");
		// 入力値を代入
		int searchNumber = scanner.nextInt();
		
		// 出力
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < arraySrchIdx(firstArray, searchNumber).length; i++) {
			// 出力
			System.out.print(arraySrchIdx(firstArray, searchNumber)[i] + " ");
		}
		// 出力
		System.out.println("}");
	}

}