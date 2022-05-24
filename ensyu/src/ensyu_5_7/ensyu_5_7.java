/*
 * 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ。
 */
package ensyu_5_7;

public class ensyu_5_7 {

	public static void main(String[] args) {
		
		// 変数に代入
		float sum = 0.0F;
		
		// ループ条件
		for (float i = 0; i <= 1000; i++) {
			
			// int型変数をfloat型に変換代入
			float x = (float)i / 1000;
			
			// 二乗値を代入
			float y = x * x;
			
			// コンソールに出力
			System.out.printf("%4.3f     %7.6f\n", x, y);
			
			// xを加算
			sum += x;
			
		}
	}

}
