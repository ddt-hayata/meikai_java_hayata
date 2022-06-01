/*
 * 整数xのposビット目を最下位として連続するn個のビットを、1にした値を返すメソッドsetN、
 * 0にした値を返すメソッドresetN、反転した値を返すメソッドinverseNを作成せよ。
 */
package ensyu_7_14;

import java.util.Scanner;

public class ensyu_7_14 {
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
	 * 関数名：setN
	 * 説明：整数xのposビット目を最下位として連続するn個のビットを、1にした値を返すメソッド
	 * パラメータ：整数値x(number)、最下位ビット数pos(bitNumber)、連続ビット数(continuousBits)
	 * 返り値：posビットから左にn個を1に置き換えたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int setN(int x, int pos, int n) {
		// n連続分の1を代入する変数
		int continuousBits = 1;
		// n連続分の1を生成
		for (int i = 1; i < n; i++) {
			// 1との論理和用変数
			int or = 1;
			// 左に1シフト
			continuousBits = continuousBits << 1;
			// 論理和にて値を生成
			continuousBits = continuousBits | or;
		}
		// 左シフト用変数
		int leftshiftNumber = x;
		// pos分1を左スライドした数値の代入
		continuousBits = continuousBits << pos - 1;
		// 論理和にて返り値の生成
		x = continuousBits | leftshiftNumber;
		// 返却
		return x;
	}
	/*
	 * 関数名：resetN
	 * 説明：整数xのposビット目を最下位として連続するn個のビットを、0にした値を返すメソッド
	 * パラメータ：整数値x(number)、最下位ビット数pos(bitNumber)、連続ビット数(continuousBits)
	 * 返り値：posビットから左にn個を0に置き換えたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int resetN(int x, int pos, int n) {
		// n連続分の1を代入する変数
		int continuousBits = 1;
		// n連続分の1を生成
		for (int i = 1; i < n; i++) {
			// 1との論理和用変数
			int or = 1;
			// 左に1シフト
			continuousBits = continuousBits << 1;
			// 論理和にて値を生成
			continuousBits = continuousBits | or;
		}
		// 左シフト用変数
		int leftshiftNumber = x;
		// pos分1を左スライドした数値の代入
		continuousBits = continuousBits << pos - 1;
		// 反転
		continuousBits = ~continuousBits;
		// 論理和にて返り値の生成
		x = continuousBits & leftshiftNumber;
		// 返却
		return x;
	}
	/*
	 * 関数名：inverseN
	 * 説明：整数xのposビット目を最下位として連続するn個のビットを、反転させた値を返すメソッド
	 * パラメータ：整数値x(number)、最下位ビット数pos(bitNumber)、連続ビット数(continuousBits)
	 * 返り値：posビットから左にn個を反転させたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int inverseN(int x, int pos, int n) {
		// n連続分の1を代入する変数
		int continuousBits = 1;
		// n連続分の1を生成
		for (int i = 1; i < n; i++) {
			// 1との論理和用変数
			int or = 1;
			// 左に1シフト
			continuousBits = continuousBits << 1;
			// 論理和にて値を生成
			continuousBits = continuousBits | or;
		}
		// 左シフト用変数
		int reverseNumber = x;
		// pos分1を左スライドした数値の代入
		continuousBits = continuousBits << pos - 1;
		// 論理和にて返り値の生成
		x = continuousBits ^reverseNumber;
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
		System.out.print("1に置き換えるビット数pos：");
		// 変数に代入
		int bitNumber = scanner.nextInt();
		// 出力
		System.out.print("連続するビット数n：");
		// 変数に代入
		int continuousNumber = scanner.nextInt();
		// 出力
		System.out.print("x = ");
		//メソッドの呼び出し
		printBits(number);
		
		// 出力
		System.out.print("posビット目から左n個を1に置き換え = ");
		//メソッドの呼び出し
		printBits(setN(number, bitNumber, continuousNumber));
		// 出力
		System.out.print("posビット目から左n個を0に置き換え = ");
		//メソッドの呼び出し
		printBits(resetN(number, bitNumber, continuousNumber));
		// 出力
		System.out.print("posビット目から左n個を反転        = ");
		//メソッドの呼び出し
		printBits(inverseN(number, bitNumber, continuousNumber));
	}
}
