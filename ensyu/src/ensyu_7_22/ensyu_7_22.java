/*
 * 配列aと同じ配列（要素数が同じで、全ての要素の値が同じ配列）
 * を生成して返すメソッドarrayCloneを作成せよ。
 */
package ensyu_7_22;

import java.util.Scanner;

public class ensyu_7_22 {
	/* 
     * 関数名：arrayClone
     * 説明：配列aと同じ配列を生成して返すメソッドarrayCloneを作成せよ。
     * パラメータ：配列firstArrayを受け取る(int[] a)
     * 返り値：複製された配列(secondArray)
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static int[] arrayClone(int[] a) {
		// 複製用の配列
		int[] secondArray = new int[a.length];
		// 複製用配列に要素を代入
		for (int i = 0; i < a.length; i++) {
			// 要素を代入
			secondArray[i] = a[i];
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
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < arrayClone(firstArray).length; i++) {
			// 出力
			System.out.print(arrayClone(firstArray)[i] + " ");
		}
		// 出力
		System.out.println("}");
	}

}
