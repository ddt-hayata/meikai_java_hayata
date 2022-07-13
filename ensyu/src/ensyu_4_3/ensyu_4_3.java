/*
 * 右の示すように、二つの整数値を読み込んで、
 * 小さいほうの数以上で大きいほうの数以下の全整数を
 * 小さいほうから順に表示するプログラムを作成せよ。
 */
package ensyu_4_3;

import java.util.Scanner;

public class ensyu_4_3 {

	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.print("整数Aを入力してください：");

		// 変数に代入
		int firstNumber = scanner.nextInt();

		// コンソールに出力
		System.out.print("整数Bを入力してください：");

		// 変数に代入
		int secondNumber = scanner.nextInt();

		// 仮でmaxとminに代入
		int max = firstNumber;
		int min = secondNumber;
		// 大小を確認し、正しくなければ入れ替える
		if (max < min) {
			// 変数に代入
			int n = max;
			// 変数に代入
			max = min;
			// 変数に代入
			min = n;
		}
		// 出力のループ文
		for (int i = min; i <= max; i++) {
			// コンソールに出力
			System.out.println(i);
		}

		// 入力値が異なる場合表示
		if (firstNumber != secondNumber) {
			// コンソールに出力
			System.out.print("全ての数字が表示されました。");
		} else {
			// コンソールに出力
			System.out.print("値が等しいです。");
		}
	}

}
