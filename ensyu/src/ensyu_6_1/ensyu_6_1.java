/*
 * 要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 */
package ensyu_6_1;

public class ensyu_6_1 {

	public static void main(String[] args) {
		
		// 要素数用の変数
		int length = 5;
		
		// 配列の宣言
		double[] array = new double[length];
		
		// 出力のループ
		for (int i = 0; i < length; i++) {
		
		// コンソールに出力
		System.out.println("array[" + i + "] = " + array[i]);
		
		}
		
	}

}
