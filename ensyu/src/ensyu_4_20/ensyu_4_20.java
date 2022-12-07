/*
 * n段の正方形を表示するプログラムを作成せよ。
 */
package ensyu_4_20;

import java.util.Scanner;

public class ensyu_4_20 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("n段の正方形を表示します。");
		
		// コンソールに出力
		System.out.print("段数は:");
		
		// 変数に代入
		int n = scanner.nextInt();
		
		// ループ条件
		for (int i = 1; i <= n; i++) {
			
			// ループ条件
			for (int j = 1; j <= n; j++) {
				
				// コンソールに出力
				System.out.print('*');
				
			}
			// コンソールに出力
			System.out.println();
			
		}

	}
 
}
