/*
 * n段のピラミッドを表示するプログラムを作成せよ。
 */
package ensyu_4_22;

import java.util.Scanner;

public class ensyu_4_22 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("ピラミッドを表示します。");
		
		// コンソールに出力
		System.out.print("段数は:");
		
		// 変数に代入
		int n = scanner.nextInt();
		
		// ループ条件
		for (int i = 1; i <= n; i++) {
			
			// ループ条件
			for (int j = 1; j <= n - i; j++) {
				
				// コンソールに出力
				System.out.print(" ");
				
			}
			
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				
				// コンソールに出力
				System.out.print('*');
					
			}
			
		// コンソールに出力
		System.out.println();
		
		}
		
	}
 
}