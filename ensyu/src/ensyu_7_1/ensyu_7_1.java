/*
 * 受け取ったint型引数の値nが負の数であれば-1を返却し、0であれば0を返却し、
 * 正であれば1を返却するメソッドsign0fを作成せよ。
 */
package ensyu_7_1;

import java.util.Scanner;

public class ensyu_7_1 {
	
	// メソッドの作成
	static int sign0f(int n) {
		// 負の数の場合
		if (n < 0) {
			// 変数に代入
			n = -1;
			// 返却
			return n;
		// 0の場合
		} else if (n == 0) {
			// 変数に代入
			n = 0;
			// 返却
			return n;
		// 正の数の場合
		} else {
			// 変数に代入
			n = 1;
			// 返却
			return n;
		}
	}

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 入力を促す
		System.out.print("整数を入力してください。：");
		int number = scanner.nextInt();
		
		// 結果を出力
		System.out.print(sign0f(number));
	}

}
