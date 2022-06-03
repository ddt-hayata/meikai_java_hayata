/*
 * 2次元配列aと同じ配列（要素数が同じで、すべての要素の値が同じ配列）
 * を生成して返却するメソッドarayCline2を作成せよ。
 */
package ensyu_7_29;

import java.util.Scanner;

public class ensyu_7_29 {
	/* 
     * 関数名：arayCline2
     * 説明：2次元配列aと同じ配列を生成して返却するメソッド
     * パラメータ：配列arrayを受け取る(int[] x)
     * 返り値：生成された配列(cloneArray)
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static int[][] arayCline2(int[][] x) {
		// 合計値を格納する配列
		int[][] cloneArray = new int[x.length][x[0].length];
		// 二つの配列の和を求める
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				// 和を求めて代入
				cloneArray[i][j] = x[i][j];
			}
		}
		// 返却
		return cloneArray;
	}
	/* 
     * 関数名：printMatrix
     * 説明：配列を出力するメソッド
     * パラメータ：配列を受け取る(int[] m)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printMatrix(int[][] m) {
		// 出力ループ
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// 出力
				System.out.print(m[i][j] + " ");
			}
			// 出力
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 出力
		System.out.print("要素数(1次)：");
		// 入力とを代入
		int firstElement = scanner.nextInt();
		// 出力
		System.out.print("要素数(2次)：");
		// 入力とを代入
		int secondElement = scanner.nextInt();
		
		// 配列の生成
		int[][] array = new int[firstElement][secondElement];
		
		// 要素の代入ループ
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// 出力
				System.out.print("a[" + i + "][" + j + "] = ");
				// 要素を代入
				array[i][j] = scanner.nextInt();
			}
		}
		// 出力
		System.out.println("行列a：");
		// メソッドの呼び出し
		printMatrix(array);
		// 出力
		System.out.println("クローンされた行列b：");
		// メソッドの呼び出し
		printMatrix(arayCline2(array));
	}

}