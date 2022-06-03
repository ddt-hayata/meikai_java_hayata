/*
 * 行列xとyの和を格納した2次元配列を返すメソッドを作成せよ。
 * （行数および列数が同一の配列をxとyに受け取ることを前提としてよい）
 */
package ensyu_7_28;

public class ensyu_7_28 {
	/* 
     * 関数名：addMatrix
     * 説明：行列xとyの和を格納した2次元配列を返すメソッド
     * パラメータ：配列firstArray, secondArrayを受け取る(int[] x, int[] y)
     * 返り値：生成された配列(sumArray)
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static int[][] addMatrix(int[][] x, int[][] y) {
		// 合計値を格納する配列
		int[][] sumArray = new int[x.length][x[0].length];
		// 二つの配列の和を求める
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				// 和を求めて代入
				sumArray[i][j] = x[i][j] + y[i][j];
			}
		}
		// 返却
		return sumArray;
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
		// 配列の生成
		int[][] firstArray = { {1, 2, 3}, {4, 5, 6} };
		// 配列の生成
		int[][] secondArray = { {6, 3, 4}, {5, 1, 2} };
		
		// 出力
		System.out.println("行列a：");
		// メソッドの呼び出し
		printMatrix(firstArray);
		// 出力
		System.out.println("行列b：");
		// メソッドの呼び出し
		printMatrix(secondArray);
		// 出力
		System.out.println("行列c：");
		// メソッドの呼び出し
		printMatrix(addMatrix(firstArray, secondArray));
	}

}
