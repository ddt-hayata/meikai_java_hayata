/*
 * List4-16は左下側が直角三角形を表示するプログラムであった。
 * 直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 */
package ensyu_4_21;

import java.util.Scanner;

public class ensyu_4_21_3 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("右上直角の三角形を表示します。");
		
		// コンソールに出力
		System.out.print("段数は:");
		
		// 変数に代入
		int n = scanner.nextInt();
		
		// ループ条件
		for (int i = 1; i <= n; i++) {
			
			// ループ条件
			for (int j = 1; j < i; j++) {
				
				// コンソールに出力
				System.out.print(" ");
				
			}
			
			for (int j = i; j <= n; j++) {
				
				// コンソールに出力
				System.out.print('*');
					
			}
			
		// コンソールに出力
		System.out.println();
		
		}
		
	}

}
 