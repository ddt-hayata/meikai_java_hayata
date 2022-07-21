/*
 * 正の整数値を読み込んで、1からnまでの積を求めるプログラムを作成せよ。
 */
package ensyu_4_9;

import java.util.Scanner;

public class ensyu_4_9 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("1からnまでの積を求めます。");
		
		// 変数の宣言
		int number;
		
		do {
			
			// コンソールに出力
			System.out.print("正の整数：");
			
			// 変数に代入
			number = scanner.nextInt();
			
		} while (number < 0);
		
		int productNumber = 1;
		int i = 1;
		
		while (i <= number) {
			
			productNumber *= i;
			
			i++;
		}
		
		// コンソールに出力
		System.out.println("1から" + number + "までの積は" + productNumber + "です。");
		
	}

}
