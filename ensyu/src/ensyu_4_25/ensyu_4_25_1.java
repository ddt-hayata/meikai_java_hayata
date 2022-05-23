/*
 * 合計だけでなく平均も求めるようにList4-17（p.126）およびList4-18（p.127）のプログラムを書き換えよ。
 */
package ensyu_4_25;

import java.util.Scanner;

public class ensyu_4_25_1 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数を加算します。\n何個加算しますか：");
		
		// 変数に代入
		int n = scanner.nextInt();
		
		// 変数の初期化
		int sum = 0;
		
		// 変数の宣言
		int i;
		
		// ループ条件
		for (i = 0; i < n; i++ ) {
			
			// コンソールに出力
			System.out.print("整数（0で終了）：");
			
			// 変数に代入
			int t = scanner.nextInt();
			
			// break文
			if (t == 0) {
				break;
			}
			
			// イクリメントする。
			sum += t;
		}
		
		double average = (double)(sum) / i;
		
		// コンソールに出力
		System.out.println("合計は" + sum + "です。");
		
		// コンソールに出力
		System.out.println("平均は" + average + "です。");
	}

}
