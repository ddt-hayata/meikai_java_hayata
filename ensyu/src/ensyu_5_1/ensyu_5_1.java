/*
 * 10進整数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
 */
package ensyu_5_1;

import java.util.Scanner;

public class ensyu_5_1 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数：");
		
		// 変数の宣言
		int number = scanner.nextInt();;
		
		System.out.println("8進数では" + Integer.toOctalString (number) + "です。");
		System.out.println("16進数では" + Integer.toHexString (number) + "です。");
	}

}
 