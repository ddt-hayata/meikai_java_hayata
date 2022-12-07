/*
 * 演習4-6
 * 読み込んだ値が1未満であれば改行文字を出力しないように
 * List4-7およびList4-8を書きかえたプログラムをそれぞれ作成せよ。
 */
package ensyu_4_6;

import java.util.Scanner;

public class ensyu_4_6_1 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		// コンソールに出力
		System.out.print("何個*を表示しますか？：");
		// 変数に代入
		int number = scanner.nextInt();
		// 変数の初期化
		int i = 0;
		// ループ条件
		if (number > 0) {
			while (i < number) {
				// コンソールに出力
				System.out.print('*');
				// 変数に加数
				i++;
			}
			// 改行文の出力
			System.out.println();
		}
	}
}