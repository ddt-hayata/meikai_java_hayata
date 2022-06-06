/*
 * 以下に示すプログラムを作成せよ。（実数値の乱数の生成にはnextDouble()を使うこと）。
 * ・0.0以上1.0未満の実数値をランダムに生成して表示。
 * ・0.0以上10.0未満の実数値をランダムに生成して表示。
 * ・-1.0以上1.0未満の実数値をランダムに生成して表示。
 */
package ensyu_2;

import java.util.Random;

public class ensyu_2_9 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		// 変数に代入
		double firstNumbernumber = rand.nextDouble();
		
		// 変数に代入
		double secondNumber = random.nextDouble() * 10;
		
		// 変数に代入
		double thirdNumber = random.nextDouble() *  2 - 1;
		
		// コンソール出力
		System.out.println("生成された実数値は" + firstNumbernumber + "です。");
		
		// コンソール出力
		System.out.println("生成された実数値は" + secondNumber + "です。");
		
		// コンソール出力
		System.out.println("生成された実数値は" + thirdNumber + "です。");

	}

}
