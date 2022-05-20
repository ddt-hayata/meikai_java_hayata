/*
 *正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ。
 */
package ensyu_4_8;

import java.util.Scanner;

public class ensyu_4_8 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("桁数を表示します。");
		
		// 変数の宣言
		int number;
		
		do {
			
			// コンソールに出力
			System.out.print("正の整数：");
			
			// 変数に代入
			number = scanner.nextInt();
			
		} while (number < 0);
		
		int i = 0;
		
		while (number > 0) {
			
			number /= 10;
			
			i++;
		}
		
		// コンソールに出力
		System.out.println("桁数は" + i + "です。");
		
	}

}
