/*
 * 二つの整数値を読み込んで、
 * それらの値の差を表示するプログラムを作成せよ。
 */
package ensyu_3_10;

import java.util.Scanner;

public class ensyu_3_10 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数a：");
		
		// 変数に代入
		int firstNumber = scanner.nextInt();
		
		// コンソールに出力
			System.out.print("整数b：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		// 変数に代入
		int difference = firstNumber - secondNumber;
		
		if (difference > 0) {
			// コンソールに出力
			System.out.print("それらの差は" + difference + "です。");
		
		} else {
			// コンソールに出力
			System.out.print("それらの差は" + -difference + "です。");
		
		}
		
	}

}