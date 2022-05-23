/*
 * 正の整数値を読み込み、それが素数でsるかどうかを判定するプログラムを作成せよ。
 */
package ensyu_4_24;

import java.util.Scanner;

public class ensyu_4_24 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("整数を素数か判定します。");
		
		// コンソールに出力
		System.out.print("整数n:");
		
		// 変数に代入
		int n = scanner.nextInt();
		
		// ループ条件
		for (int i = 2; i < n ; i++ ) {
			
			if (n % i != 0) {
				
				// コンソールに出力
				System.out.print(n + "は素数です。");
				
				break;
				
			} else {
			
				// コンソールに出力
				System.out.print(n + "は素数ではありません。");
				
				break;
				
			}
		
		}
		
	}

}
