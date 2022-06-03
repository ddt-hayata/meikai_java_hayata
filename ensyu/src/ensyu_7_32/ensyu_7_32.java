/*
 * List7-12(p.241)のメソッドprintBitsは、int型の整数値の内部のビットを表示するものであった。
 * 他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ。
 */
package ensyu_7_32;

import java.util.Scanner;

public class ensyu_7_32 {
	/* 
     * 関数名：printBits
     * 説明：byte型の整数値の内部のビットを表示するメソッド
     * パラメータ：整数aを受け取る(byte x)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printBits(byte x) {
		for (int i = 31; i >= 0; i--) {
			// 出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 改行文の出力
		System.out.println("");
	}
	/* 
     * 関数名：printBits
     * 説明：short型の整数値の内部のビットを表示するメソッド
     * パラメータ：整数aを受け取る(short x)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printBits(short x) {
		for (int i = 31; i >= 0; i--) {
			// 出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 改行文の出力
		System.out.println("");
	}
	/* 
     * 関数名：printBits
     * 説明：long型の整数値の内部のビットを表示するメソッド
     * パラメータ：整数aを受け取る(long x)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printBits(long x) {
		for (int i = 31; i >= 0; i--) {
			// 出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');;
		}
		// 改行文の出力
		System.out.println("");
	}
	/* 
     * 関数名：printBits
     * 説明：int型の整数値の内部のビットを表示するメソッド
     * パラメータ：整数aを受け取る(int x)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			// 出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 改行文の出力
		System.out.println("");
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("byte型整数を入力してください。");
		// 出力
		System.out.print("x：");
		// 変数に代入
		byte firstNumber = scanner.nextByte();
		// 出力
		System.out.println("short型整数を入力してください。");
		// 出力
		System.out.print("x：");
		// 変数に代入
		short secondNumber = scanner.nextShort();
		// 出力
		System.out.println("int型整数を入力してください。");
		// 出力
		System.out.print("x：");
		// 変数に代入
		int thirdNumber = scanner.nextInt();
		// 出力
		System.out.println("long型整数を入力してください。");
		// 出力
		System.out.print("x：");
		// 変数に代入
		long fourthNumber = scanner.nextLong();
		
		// 出力
		System.out.print("byte型  x = ");
		printBits(firstNumber);
		// 出力
		System.out.print("short型 x = ");
		printBits(secondNumber);
		// 出力
		System.out.print("int型   x = ");
		printBits(thirdNumber);
		// 出力
		System.out.print("long型  x = ");
		printBits(fourthNumber);
	}
}
