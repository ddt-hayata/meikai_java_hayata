/*
 * 文字列探索プログラムを書き換えて、
 * 一致する部分が上下で揃うように表示するプログラムを作成せよ。
 */
package ensyu_15_3;

import java.util.Scanner;

public class ensyu_15_3 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 出力
		System.out.print("文字列s1：");
		// 代入
		String s1 = scanner.next();
		// 出力
		System.out.print("文字列s2：");
		// 代入
		String s2 = scanner.next();
		// 一致する最初のインデックス
		int idx = s1.indexOf(s2);
		// 一致する最後のインデックス
		int lastIdx = s1.indexOf(s2.charAt(s2.length() - 1));
		System.out.println(lastIdx);
		// 出力
		System.out.println("s1：" + s1);
		// 出力
		System.out.print("s2：");
		
		for (int i = 0; i < s1.length(); i++) {
			if (i < idx || i > lastIdx) {
				System.out.print(" ");
			} else {
				System.out.print(s1.charAt(i));
			}
		}
	}
}
