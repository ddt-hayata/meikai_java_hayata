/*
 * 合計だけでなく平均も求めるようにList4-19のプログラムをp書き換えよ。
 * なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 */
package ensyu_4_26;

import java.util.Scanner;

public class ensyu_4_26 {

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
		
		// 変数の宣言
		int count = 0;
		
		// ループ条件
		for (i = 0; i < n; i++ ) {
			// コンソールに出力
			System.out.print("整数：");
			
			// 変数に代入
			int t = scanner.nextInt();
			
			// continue文
			if (t < 0) {
				
				// コンソールに出力
				System.out.println("負の数は加算しません。");
				continue;
			}
			
			// イクリメントする。
			sum += t;
			
			// イクリメントする。
			count++;
			
		}
			
			double average = (double)(sum) / count;
			
			// コンソールに出力
			System.out.println("合計は" + sum + "です。");
			
			// コンソールに出力
			System.out.println("平均は" + average + "です。");
		}

}
