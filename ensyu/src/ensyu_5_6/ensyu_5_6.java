/*
 * List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 * List5-10のように、int型の変数を0から1000までイクリメントした値を求める様子を、
 * 横に並べて表示するプログラムを作成せよ。
 */
package ensyu_5_6;

public class ensyu_5_6 {

	public static void main(String[] args) {
		
		// コンソールに出力
		System.out.println("  float        int   ");
		
		// コンソールに出力
		System.out.println("---------------------");
		
		// 変数に代入
		float sum = 0.0F;
		
		// 変数に代入
		float sum_1 = 0.0F;
		
		// ループ条件
		for (float x = 0.0F, i = 0; x <= 1.0F && i <= 1000; x += 0.001F, i++) {
			
			// int型変数をfloat型に変換代入
			float y = (float)i / 1000;
			
			// コンソールに出力
			System.out.printf("%8.7f   %8.7f\n", x, y);
			
			// xを加算
			sum += x;
			
			// ｙを加算
			sum_1 += y;

		}
	}

}
