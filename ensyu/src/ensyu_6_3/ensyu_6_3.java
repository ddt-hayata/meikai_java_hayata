/*
  * 要素型がdouble型で要素数が5の配列の要素に対して、
 * 先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するプログラムを作成せよ。
 */
package ensyu_6_3;

public class ensyu_6_3 {

	public static void main(String[] args) {
		
		// 配列の宣言
		double[] array = new double[5];
		
		// ループ
		for (int i = 0; i < array.length; i++) {
		
			// 要素に代入
			array[i] = (i + 1) * 1.1;
		
		}
		
		// ループ
		for (int i = 0; i < array.length; i++) {
		
			// コンソールに出力
			System.out.print("a[" + i + "] = ");
			
			// コンソールに出力
			System.out.printf("%2.1f\n", array[i]);
		
		}
		
	}

}
