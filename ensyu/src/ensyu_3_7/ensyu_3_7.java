/*
 * 正の整数値を読み込んで、それを3で割った値に応じて
 * 『その値を3で割り切れます。』『その値を3で割った余りは1です。』
 * 『その値を3で割った余りは2です。』のいずれかを表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正でない値が入力されました。』表示すること。
 */
package ensyu_3_7;

import java.util.Scanner;

public class ensyu_3_7 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数値：");
		
		// 変数に代入
		int number = scanner.nextInt();
		
		if (number > 0) {
			if (number % 3 == 0) {
				// コンソールに出力
				System.out.println("その値は3で割り切れます。");
			
			} else if (number % 3 == 1) {
				// コンソールに出力
				System.out.println("その値を3で割ったあまりは1です。");
			
			} else {
				// コンソールに出力
				System.out.println("その値を3で割ったあまりは2です。");
			
			}
			
		} else {
			// コンソールに出力
			System.out.println("正でない値が入力されました。");
			
		}
		
	}

}