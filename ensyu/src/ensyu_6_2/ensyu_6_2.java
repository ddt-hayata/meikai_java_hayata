/*
 * 要素型がint型で要素数が5の配列の要素に対して、
 * 先頭から順に5, 4, 3, 2, 1を代入して表示するプログラムを作成せよ。
 */
package ensyu_6_2;

public class ensyu_6_2 {

	public static void main(String[] args) {
		
		// 配列の宣言
		int[] array = new int[5];
		
		// ループ
		for (int i = 0; i < array.length; i++) {
		
			// 要素に代入
			array[i] = array.length - i;
		
		}
		
		// ループ
		for (int i = 0; i < array.length; i++) {
		
			// コンソールに出力
			System.out.println("array[" + i + "] = " + array[i]);
		
		}
		
	}

}
