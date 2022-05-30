/*
 * 1からnまでの全整数の和を求めて返却するメソッドを作成せよ。
 */
package ensyu_7_4;

import java.util.Scanner;

public class ensyu_7_4 {
	
	// メソッドの作成
	static int sumUp(int n) {
		// 合計用の変数
		int sum = n;
		// 計算ループ
		while (n-- > 0) {
			sum += n;
		}
		// 返却
		return sum;
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("1から整数aまでの全整数の和を求めます。");
		// 出力
		System.out.print("整数a：");
		// 変数に代入
		int number = scanner.nextInt();
		
		// 結果の出力
		System.out.print("1から" + number + "までの全整数の和は" + sumUp(number) + "です。");
	}

}
