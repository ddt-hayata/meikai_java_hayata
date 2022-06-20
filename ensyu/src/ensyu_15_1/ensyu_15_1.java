/*
 * 文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ。
 */
package ensyu_15_1;

import java.util.Scanner;

public class ensyu_15_1 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner  = new Scanner(System.in);
		// 出力
		System.out.print("名前を入力してください。：");
		// 代入
		String  name = scanner.next();
		// 出力
		System.out.println("名前を逆順に表示します。");
		for (int i = name.length() - 1; i >= 0; i--) {
			// 出力
			System.out.print(name.charAt(i));
		}
	}
}
