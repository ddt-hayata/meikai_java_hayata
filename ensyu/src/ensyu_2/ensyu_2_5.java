/*
 * 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 */
package ensyu_2;

import java.util.Scanner;

public class ensyu_2_5 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソール出力
		System.out.println("xとyを加減乗除します。");
		
		// コンソール出力
		System.out.print("xの値：");
		
		// 変数に代入
		double firstNumber = scanner.nextDouble();
		
		// コンソール出力
		System.out.print("yの値：");
		
		// 変数に代入
		double secondNumber = scanner.nextDouble();
		
		// コンソール出力
		System.out.println("合計は" + (firstNumber + secondNumber));
		
		// コンソール出力
		System.out.println("平均は" + ((firstNumber + secondNumber) / 2));
		
	}

}
