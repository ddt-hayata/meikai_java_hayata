/*
 * List7-11を拡張して、以下の4つの問題を出題するプログラムを作成せよ。
 * x + y + z、x + y - z、x - y + z、x - y - z、
 */
package ensyu_7_10;

import java.util.Random;
import java.util.Scanner;

public class ensyu_7_10 {
	// Scannerクラスのインスタンス化
	static Scanner scanner = new Scanner(System.in);
	
	// メソッドの作成
	static boolean confirmRetry() {
		// 変数の宣言
		int cont ;
		do {
			// 出力
			System.out.print("正解です！\nもう一度？〈Yes…1 / No…0〉:");
			// 入力値を代入
			cont = scanner.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}
	public static void main(String[] args) {
		// Randomクラスのインスタンス化
		Random random = new Random();
		// 出力
		System.out.println("暗算力トレーニング！！");
		do {
			// 乱数を変数に代入
			int firstNumber = random.nextInt(900) + 100;
			// 乱数を変数に代入
			int secondNumber = random.nextInt(900) + 100;
			// 乱数を変数に代入
			int thirdNumber = random.nextInt(900) + 100;
			while (true) {
				// 問題用乱数の生成
				int randomQuestion = random.nextInt(4);
				// 解答用変数
				int answer = 0;
				// 乱数と問題を選択
				if (randomQuestion == 0) {
					// 出力
					System.out.print(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = ");
					// 入力値を代入
					answer = scanner.nextInt();
					// 判定
					if (answer == firstNumber + secondNumber + thirdNumber) {
						break;
					}
				} else if (randomQuestion == 1) {
					// 出力
					System.out.print(firstNumber + " + " + secondNumber + " - " + thirdNumber + " = ");
					// 入力値を代入
					answer = scanner.nextInt();
					// 判定
					if (answer == firstNumber + secondNumber - thirdNumber) {
						break;
					}
				} else if (randomQuestion == 2) {
					// 出力
					System.out.print(firstNumber + " - " + secondNumber + " + " + thirdNumber + " = ");
					// 入力値を代入
					answer = scanner.nextInt();
					// 判定
					if (answer == firstNumber - secondNumber + thirdNumber) {
						break;
					}
				} else if (randomQuestion == 3) {
					// 出力
					System.out.print(firstNumber + " - " + secondNumber + " - " + thirdNumber + " = ");
					// 入力値を代入
					answer = scanner.nextInt();
					// 判定
					if (answer == firstNumber - secondNumber - thirdNumber) {
						break;
					}
				}
				System.out.println("違いますよ！！");
			}
		} while (confirmRetry());
	}
}
