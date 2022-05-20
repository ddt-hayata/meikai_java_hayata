/*
 * 演習4-5
 * List4-5（p.102）のx--が--xとなっていたら、
 * どのような出力が得られるか検討せよ。
 * プログラムを作成して実行結果を確認すること。
 */

package ensyu_4_5;

import java.util.Scanner;

public class ensyu_4_5 {

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
			System.out.println(--number);
			
		}
		
	}

}
