/*
 * 『正の整数値：』と表示してキーボードから正の整数値を読み込んで、
 * その値を返却するメソッドreadPlusIntを作成せよ。
 * 0や負の値が入力されたら再入力させること。
 */
package ensyu_7_9;

import java.util.Scanner;

public class ensyu_7_9 {
	
	// Scannerクラスのインスタンス化
	static Scanner scanner = new Scanner(System.in);
	
	/*
	 * 関数名：readPlusInt
	 * 説明：キーボードから正の整数値を読み込んでその値を返却するメソッド
	 * パラメータ：なし
	 * 返り値：入力された整数値(number)
	 * 作成者：早田
	 * 作成日：2022/5/27
	 */
	static int readPlusInt() {
		// 変数の宣言
		int number = 0;
		
		do {
		// 出力
		System.out.print("正の整数値：");
		// 変数に代入
		number = scanner.nextInt();
		// ループ条件
		} while (number == 0 || number < 0);
		// 返却
		return number;
		}

	public static void main(String[] args) {
		// メソッドの呼び出し・出力
		System.out.print("戻り値は" + readPlusInt() + "です。");
	}
}
