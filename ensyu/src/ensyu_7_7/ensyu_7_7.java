/*
 * List7-7に示したn個の'*'を連続表示するメソッドputCharsを、
 * 内部でList7-8のメソッドputStarsを呼び出すことによって表示を行うように書き換えよ。
 */
package ensyu_7_7;

import java.util.Scanner;

public class ensyu_7_7 {
	/*
	 * 関数名：putChars
	 * 説明：n個の'*'を連続表示するメソッド
	 * パラメータ：putStarsメソッドから受け取った文字列 '*' 及び入力された整数値(number)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/5/27
	 */
	static void putChars(char asterisk, int printNumber) {
		for (int i = 1; i <= printNumber; i++) {
			// 出力
			System.out.print(asterisk);
		}
	}
	/*
	 * 関数名：putStars
	 * 説明：putCharsメソッドへ文字列と入力値を渡すメソッド
	 * パラメータ：入力された整数値(number)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/5/27
	 */
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
			// メソッドの呼び出し
			putStars(i);
			// 改行文の出力
			System.out.println();
		}
	}
}
