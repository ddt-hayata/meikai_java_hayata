/*
 * 二つの時数値を読み込んで、
 * 大きいほうの値を表示するプログラムを作成せよ。
 */
package ensyu_3_9;

import java.util.Scanner;

public class ensyu_3_9 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("実数a：");
		
		// 変数に代入
		double firstNumber = scanner.nextDouble();
		
		// コンソールに出力
			System.out.print("実数b：");
		
		// 変数に代入
		double secondNumber = scanner.nextDouble();
		
		// 変数に代入
		double max = firstNumber > secondNumber ? firstNumber : secondNumber;
		
		// コンソールに出力
		System.out.print("大きい方の数値は" + max + "です。");
		
	}

}