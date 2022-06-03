/*
 * 三つの配列の要素が等しければ加算を行ってtrueを返し、
 * 等しくなければ加算を行わなずにfalseを返すメソッドを作成せよ。
 */
package ensyu_7_27;

public class ensyu_7_27 {
	/* 
     * 関数名：addMatrix
     * 説明：三つの配列の要素が等しければ加算を行ってtrueを返し、等しくなければ加算を行わなずにfalseを返すメソッド
     * パラメータ：配列firstArray, secondArray, thirdArrayを受け取る(int[] a, int[] b, int[] c)
     * 返り値：true、false
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// 要素数用変数
		int count = 0;
		// 要素の長さが違う場合
		if (x.length != y.length || x.length != z.length) {
			// 返却
			return false;
		} else if (x[count].length != y[count].length || x[count].length != z[count].length) {
			// イクリメント
			count++;
			// 返却
			return false;
		} else {
			// 計算ループ
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					// 要素を加算して代入
					z[i][j] = x[i][j] + y[i][j];
				}
			}
			// 返却
			return true;
		}
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
		// 配列aの生成
		int[][] firstArray = { {1, 2, 3}, {4, 5, 6} };
		// 配列bの生成
		int[][] secondArray = { {6, 3, 4}, {5, 1, 2} };
		// 配列cの生成
		int[][] thirdArray = new int[2][3];
		
		// メソッドの呼び出し
		addMatrix(firstArray, secondArray, thirdArray);
		
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
		printMatrix(thirdArray);
	}
}
