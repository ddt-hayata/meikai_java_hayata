/*
 * List7-7に示したn個の'*'を連続表示するメソッドputCharsを、
 * 内部でList7-8のメソッドputStarsを呼び出すことによって表示を行うように書き換えよ。
 */
package ensyu_7_7;

import java.util.Scanner;

public class ensyu_7_7 {

	// 文字をn個連続表示
	static void putChars(char asterisk, int printNumber) {
		for (int i = 1; i <= printNumber; i++) {
			// 出力
			System.out.print(asterisk);
		}
	}
	
	// putCharsメソッド呼び出し
	static void putStars(int stepsNumber) {
		// メソッドの呼び出し
			putChars('*', stepsNumber);
		}
	
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("左下直角の三角形を表示します。");
		// 出力
		System.out.print("段数は：");
		// 変数に代入
		int number = scanner.nextInt();
		
		// 表示個数ループ
		for (int i = 1; i <= number; i++) {
			putStars(i);
			// 改行文の出力
			System.out.println();
		}
	}
}
