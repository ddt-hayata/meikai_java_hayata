/*
 * 整数xのposビット目（最下位から0, 1, 2, …）を、1にした値を返すメソッドset、
 * 0にした値を返すメソッドreset、反転した値を返すメソッドinverseを作成せよ。
 */
package ensyu_7_13;

import java.util.Scanner;

public class ensyu_7_13 {
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
	 * 関数名：set
	 * 説明：整数xのposビット目を、1にした値を返すメソッド
	 * パラメータ：整数値x(number)、置き換えのビット数pos(bitNumber)
	 * 返り値：posビット左を1に置き換えたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int set(int x, int pos) {
		// 左シフト用変数
		int leftshiftNumber = 0;
		// pos分1を左スライドした数値の代入
		leftshiftNumber = 1 << pos - 1;
		// 論理和にて返り値の生成
		x = x | leftshiftNumber;
		// 返却
		return x;
	}
	/*
	 * 関数名：reset
	 * 説明：整数xのposビット目を、0にした値を返すメソッド
	 * パラメータ：整数値x(number)、置き換えのビット数pos(bitNumber)
	 * 返り値：posビット左を0に置き換えたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int reset(int x, int pos) {
		// 左シフト用変数
		int leftshiftNumber = 0;
		// pos分1を左スライドした数値の代入
		leftshiftNumber = 1 << pos - 1;
		// 反転
		leftshiftNumber = ~leftshiftNumber;
		// 論理和にて返り値の生成
		x = x & leftshiftNumber;
		// 返却
		return x;
	}
	/*
	 * 関数名：inverse
	 * 説明：整数xのposビット目を、反転させた値を返すメソッド
	 * パラメータ：整数値(number)、反転させるビット数(bitNumber)
	 * 返り値：posビット左を反転させたビット構成前の値
	 * 作成者：早田
	 * 作成日：2022/6/1
	 */
	static int inverse(int x, int pos) {
		// 反転用変数
		int reverseNumber = 0;
		// 反転した値をもとの位置に戻す
		reverseNumber = 1 << pos;
		// 排他的論理和にて返り値の生成
		x = x ^ reverseNumber;
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
		System.out.print("1に置き換えるビット数(pos)：");
		// 変数に代入
		int bitNumber = scanner.nextInt();
		
		// 出力
		System.out.print("x = ");
		//メソッドの呼び出し
		printBits(number);
		
		// 出力
		System.out.print("posビット目を1に置き換え = ");
		//メソッドの呼び出し
		printBits(set(number, bitNumber));
		// 出力
		System.out.print("posビット目を0に置き換え = ");
		//メソッドの呼び出し
		printBits(reset(number, bitNumber));
		// 出力
		System.out.print("posビット目を反転        = ");
		//メソッドの呼び出し
		printBits(inverse(number, bitNumber));
	}
}
