/*
 * 文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ。
 */
package ensyu_15_2;

import java.util.Scanner;

public class ensyu_15_2 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner  = new Scanner(System.in);
		// 出力
		System.out.print("文字を入力してください。：");
		// 代入
		String  name = scanner.next();
		// 出力
		System.out.println("入力された文字を文字コードで表示します。");
		for (int i = 0; i < name.length(); i++) {
			// 代入
			char charName = name.charAt(i);
			// int型に変換して代入
			int cord = (int)charName;
			// 出力
			System.out.println(cord);
		}
	}
}
