/*
 * 正の整数値を読み込んで、それが10の倍数であれば『その値は10の倍数です。』と表示し、
 * そうでなければ『その値は10の倍数ではありません。』と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 */
package ensyu_3_6;

import java.util.Scanner;

public class ensyu_3_6 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数値：");
		
		// 変数に代入
		int number = scanner.nextInt();
		
		if (number > 0) {
			if (number % 10 == 0) {
				// コンソールに出力
				System.out.println("その値は10の倍数です。");
			
			} else {
				// コンソールに出力
				System.out.println("その値は10の倍数ではありません。");
				
			}
			
		} else {
			// コンソールに出力
			System.out.println("正でない値が入力されました。");
			
		}
		
	}

}