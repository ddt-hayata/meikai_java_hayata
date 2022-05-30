/*
 * a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成せよ。
 * 内部で乱数を生成する標準ライブラリを呼び出すこと。
 * なお、bの値がaより小さい場合には、aの値をそのまま返却すること。
 */
package ensyu_7_8;

import java.util.Random;
import java.util.Scanner;

public class ensyu_7_8 {
	
	// 乱数を生成するメソッド
	static int random(int a, int b) {
		// Randomクラスのインスタンス化
		Random random = new Random();
		// 乱数用変数
		int randomNumber = 0;
		// aがb以下の場合乱数を生成
		if (a <= b) {
			// 乱数の生成
			randomNumber = random.nextInt(b - a) + 1;
		// bがa未満の場合
		} else if (a > b) {
			// 変数に代入
			randomNumber = a;
		}
		// 返却
		return randomNumber;
	}

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 入力を促す
		System.out.print("整数a：");
		// 入力値を変数に代入
		int firstNumber = scanner.nextInt();
		// 入力を促す
		System.out.print("整数b：");
		// 入力値を変数に代入
		int secondNumber = scanner.nextInt();
		// メソッドの呼び出し
		System.out.println("戻ってきた値は" + random(firstNumber, secondNumber) + "です。");

	}

}
