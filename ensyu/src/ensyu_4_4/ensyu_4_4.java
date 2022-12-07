/*
 * List4-4のwhile文終了時にxの値が-1になることを
 * 確認するプログラムを作成せよ。
 */
package ensyu_4_4;

import java.util.Scanner;

public class ensyu_4_4 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("カウントダウンします。");
		
		// 変数の宣言
		int number;
		
		do {
			// コンソールに出力
			System.out.print("正の整数値：");
			
			// 変数に代入
			number = scanner.nextInt();
			
			// ループ条件
		} while (number <= 0);
		
		// ループ条件
		while (number >= 0) {
		
			// コンソールに出力
			System.out.println(number);
			
			// 変数を減数
			number--;
			
		}
		
		// コンソールに出力
		System.out.println("while文終了時の値は" + number + "です。");
		
	}

}