/*
 * 読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 * 表示は*と+を交互に行うこと。
 */
package ensyu_4_7;

import java.util.Scanner;

public class ensyu_4_7 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.print("*と+を交互に合計何個を表示しますか？：");

		// 変数に代入
		int number = scanner.nextInt();

		// 変数の初期化
		int i = 1;

		// ループ条件
		while (i <= number) {

			// コンソールに出力
			System.out.print('*');

			// 変数に加数
			i++;
			// 入力値が奇数の場合に出力を回避するための制御文
			if (i <= number) {
				//コンソールに出力
				System.out.print('+');

				// 変数にインクリメント
				i++;
			}
		}

		// コンソールに出力
		System.out.println();

	}

}

