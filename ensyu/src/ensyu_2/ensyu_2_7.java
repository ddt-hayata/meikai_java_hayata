/*
 * 以下に示すプログラムを作成せよ。
 * ・1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
 * ・1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
 * ・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 */
package ensyu_2;

import java.util.Random;

public class ensyu_2_7 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		int fristNumber  = random.nextInt(9) + 1;        // 変数に代入
		int secondNumber = random.nextInt(9) - 9;        // 変数に代入
		int thirdNumber  = random.nextInt(90) + 10;      // 変数に代入
		
		// コンソールに出力
		System.out.println("生成された正の1桁の整数値は" + fristNumber + "です。");
		
		// コンソールに出力
		System.out.println("生成された負の1桁の整数値は" + secondNumber + "です。");
		
		// コンソールに出力
		System.out.println("生成された正の2桁の整数値は" + thirdNumber + "です。");

	}

}
