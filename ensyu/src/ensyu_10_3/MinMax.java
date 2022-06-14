/*
 * 二値/三値/配列の最小値を求めるメソッドや最大値を求めるメソッドを集めたユーティリティクラスMinMaxを作成せよ。
 */
package ensyu_10_3;

public class MinMax {
	
	/* 
	 * 関数名：doubleMin
	 * 説明：二値の最小値を返すメソッド
	 * パラメータ：二値の値(x, y)
	 * 返り値：最小値(min)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public static int doubleMin(int x, int y) {
		// 最小値用の変数に代入
		int min = x;
		// 値が小さい場合
		if (min > y) {
			// 変数に代入
			min = y;
		}
		// 返却
		return min;
	}

	/* 
	 * 関数名：doubleMax
	 * 説明：二値の最大値を返すメソッド
	 * パラメータ：二値の値(x, y)
	 * 返り値：最大値(max)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public static int doubleMax(int x, int y) {
		// 最大値用の変数に代入
		int max = x;
		// 値が大きい場合
		if (max < y) {
			// 変数に代入
			max = y;
		}
		// 返却
		return max;
	}

	/* 
	 * 関数名：tripleMin
	 * 説明：三値の最小値を返すメソッド
	 * パラメータ：三値の値(x, y, z)
	 * 返り値：最小値(min)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public static int tripleMin(int x, int y, int z) {
		// 最小値用の変数に代入
		int min = x;
		// 値が小さい場合
		if (min > y) {
			// 変数に代入
			min = y;
		}
		if (min > z) {
			// 変数に代入
			min = z;
		}
		// 返却
		return min;
	}
	
	/* 
	 * 関数名：tripleMax
	 * 説明：三値の最大値を返すメソッド
	 * パラメータ：三値の値(x, y, z)
	 * 返り値：最大値(max)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public static int tripleMax(int x, int y, int z) {
		// 最大値用の変数に代入
		int max = x;
		// 値が大きい場合
		if (max < y) {
			// 変数に代入
			max = y;
		}
		if (max < z) {
			// 変数に代入
			max = z;
		}
		// 返却
		return max;
	}
	
	/* 
	 * 関数名：arrayMin
	 * 説明：配列の最小値を返すメソッド
	 * パラメータ：配列の値(int[] array)
	 * 返り値：最小値(min)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public static int arrayMin(int[] array) {
		// 最小値用の変数に代入
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			// 値が小さい場合
			if (min > array[i]) {
				// 変数に代入
				min = array[i];
			}
		}
		// 返却
		return min;
	}
	
	/* 
	 * 関数名：arrayMax
	 * 説明：配列の最大値を返すメソッド
	 * パラメータ：配列の値(int[] array)
	 * 返り値：最大値(max)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public static int arrayMax(int[] array) {
		// 最大値用の変数に代入
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			// 値が大きい場合
			if (max < array[i]) {
				// 変数に代入
				max = array[i];
			}
		}
		// 返却
		return max;
	}
}
