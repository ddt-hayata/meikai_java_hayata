/*
 * int型の1次元配列とint型の2次元配列（行によって列数が異なる可能性がある）
 * の全要素値を表示する、多重定義されたメソッド群を作成せよ。
 * まお、1次元配列の表示では、各要素の間には1も自分のスペースを空けること。
 * また、2次元配列の表示では、各列の数値の先頭が揃うように、最低限のスペースを空けること。
 */
package ensyu_7_33;

import java.util.Scanner;

public class ensyu_7_33 {
	/* 
     * 関数名：printArray
     * 説明：int型の1次元配列の全要素値を表示するメソッド
     * パラメータ：配列aを受け取る(int[] a)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printArray(int[] a) {
		// 出力
		System.out.println("配列aを表示します。");
		// 出力のループ
		for (int i = 0; i < a.length; i++) {
			// 出力
			System.out.print(a[i] +  " ");
		}
		// 出力
		System.out.println();
	}
	/* 
     * 関数名：printArray
     * 説明：int型の2次元配列の全要素値を表示するメソッド
     * パラメータ：2次元配列aを受け取る(int[][] a)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printArray(int[][] a) {
		// 出力
		System.out.println("配列bを表示します。");
		// 出力のループ
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// 出力
				System.out.printf("%-6d",a[i][j]);
			}
			// 改行文の出力
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 配列の作成
		int[] firstArray = { 12, 536, -8, 7 };
		
		// 配列の作成
		int[][] secondArray = { {32, -1, 32, 45, 67}, {535, 99999, 2}, {2, 5, -123, 9} }; 
		
		// メソッドの呼び出し
		printArray(firstArray);
		// メソッドの呼び出し
		printArray(secondArray);
	}
}
