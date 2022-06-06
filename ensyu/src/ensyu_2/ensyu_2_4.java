/*
 * キーボードから読み込んだ整数値に10を加えた値と
 * 10を減じた値を出力するプログラムを作成せよ。
 */
package ensyu_2;

import java.util.Scanner;

public class ensyu_2_4 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソール出力
		System.out.print("整数値:");
		
		// 変数に代入
		int Number = scanner.nextInt();
		
		// コンソール出力
		System.out.println("10を加えた値は" + (Number + 10) + "です。");
		
		// コンソール出力
		System.out.println("10を減じた値は" + (Number - 10) + "です。");
	}

}
