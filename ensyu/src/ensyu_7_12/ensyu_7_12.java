/*
 * 整数xを右にnビット回転した値を返すメソッドrRotateと、
 * 左にnビット回転した値を返すメソッドlRotateを作成せよ。
 */
package ensyu_7_12;

import java.util.Scanner;

public class ensyu_7_12 {
	/*
	 * 関数名：printBits
	 * 説明：int型のビット構成を表示するメソッド
	 * パラメータ：入力された整数値(number)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static void printBits(int number) {
		// 出力ループ
		for (int i = 31; i >= 0; i--) {
			// 出力
			System.out.print(((number >>> i & 1) == 1) ? '1' : '0');
		}
		// 改行文出力
		System.out.println();
	}
	/*
	 * 関数名：rRotate
	 * 説明：右にnビット回転させた値を返すメソッド
	 * パラメータ：入力された整数値(number)、入力された回転させるビット数(rotationNumber)
	 * 返り値：右にnビット回転させたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/5/31
	 */
	static int rRotate(int x,int n) {
		// 論理和用変数
		int rightRotateNumber = 0;
		// 回転数分右シフトして代入
		rightRotateNumber = x >>> n;
		// 回転数との差分左へシフト
		x = x << 32 - n;
		// 論理和にて返却用の値を生成し変数に代入
		x = rightRotateNumber | x;
		// 返却
		return x;
	}
	/*
	 * 関数名：lRotate
	 * 説明：左にnビット回転させた値を返すメソッド
	 * パラメータ：入力された整数値(number)、入力された回転させるビット数(rotationNumber)
	 * 返り値：左にnビット回転させたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/5/31
	 */
	static int lRotate(int x,int n) {
		// 論理和用変数
		int leftRotateNumber = 0;
		// 回転数分左シフトして代入
		leftRotateNumber = x << n;
		// 回転数との差分右へシフト
	    x = x >>> 32 - n;
		// 論理和にて返却用の値を生成し変数に代入
	    x = leftRotateNumber | x;
	    // 返却
	    return x;
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("整数x：");
		// 変数に代入
		int number = scanner.nextInt();
		// 出力
		System.out.print("回転させるビット数n：");
		// 変数に代入
		int rotationNumber = scanner.nextInt();
		
		// 出力
		System.out.print("x = ");
		//メソッドの呼び出し
		printBits(number);
		
		// 出力
		System.out.println("xをnビット右回転させます。");
		//メソッドの呼び出し・出力
		printBits(rRotate(number, rotationNumber));
		
		// 出力
		System.out.println("xをnビット左回転させます。");
		//メソッドの呼び出し・出力
		printBits(lRotate(number, rotationNumber));
	}
}
