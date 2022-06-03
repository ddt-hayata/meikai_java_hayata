/*
 * int型整数xの絶対値、long型整数xの絶対値、float型xの絶対値、double型xの絶対値を求める、
 * 多重定義されたメソッド群を作成せよ。
 */
package ensyu_7_31;

import java.util.Scanner;

public class ensyu_7_31 {
	/* 
     * 関数名：absolute
     * 説明：int型整数xの絶対値を求めるメソッド
     * パラメータ：整数aを受け取る(int x)
     * 返り値：生成された絶対値
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static int absolute(int a) {
		// 絶対値の変数
		int absoluteValue = 0;
		// 整数aが正の値の場合
		if (a > 0) {
			// 変数に代入
			absoluteValue = a;
		// 整数aが負の値の場合
		} else if (a < 0) {
			// 値を反転して代入
			absoluteValue = -a;
		}
		return absoluteValue;
	}
	/* 
     * 関数名：absolute
     * 説明：long型整数xの絶対値を求めるメソッド
     * パラメータ：整数aを受け取る(long x)
     * 返り値：生成された絶対値
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static long absolute(long a) {
		// 絶対値の変数
		long absoluteValue = 0;
		// 整数aが正の値の場合
		if (a > 0) {
			// 変数に代入
			absoluteValue = a;
		// 整数aが負の値の場合
		} else if (a < 0) {
			// 値を反転して代入
			absoluteValue = -a;
		}
		return absoluteValue;
	}
	/* 
     * 関数名：absolute
     * 説明：float型整数xの絶対値を求めるメソッド
     * パラメータ：整数aを受け取る(float x)
     * 返り値：生成された絶対値
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static float absolute(float a) {
		// 絶対値の変数
		float absoluteValue = 0;
		// 整数aが正の値の場合
		if (a > 0) {
			// 変数に代入
			absoluteValue = a;
		// 整数aが負の値の場合
		} else if (a < 0) {
			// 値を反転して代入
			absoluteValue = -a;
		}
		return absoluteValue;
	}
	/* 
     * 関数名：absolute
     * 説明：long型整数xの絶対値を求めるメソッド
     * パラメータ：整数aを受け取る(long x)
     * 返り値：生成された絶対値
     * 作成者：早田
     * 作成日：2022/6/3
     */
	static double absolute(double a) {
		// 絶対値の変数
		double absoluteValue = 0;
		// 整数aが正の値の場合
		if (a > 0) {
			// 変数に代入
			absoluteValue = a;
		// 整数aが負の値の場合
		} else if (a < 0) {
			// 値を反転して代入
			absoluteValue = -a;
		}
		return absoluteValue;
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("int型の整数x：");
		// 入力値を変数に代入
		int firstNumber = scanner.nextInt();
		// 出力
		System.out.print("long型の整数x：");
		// 入力値を変数に代入
		long secondNumber = scanner.nextLong();
		// 出力
		System.out.print("float型の整数x：");
		// 入力値を変数に代入
		float thirdNumber = scanner.nextFloat();
		// 出力
		System.out.print("double型の整数x：");
		// 入力値を変数に代入
		double fourthNumber = scanner.nextDouble();
		
		// 出力
		System.out.println("int型の整数xの絶対値は" + absolute(firstNumber));
		// 出力
		System.out.println("long型の整数xの絶対値は" + absolute(secondNumber));
		// 出力
		System.out.println("float型の整数xの絶対値は" + absolute(thirdNumber));
		// 出力
		System.out.println("double型の整数xの絶対値は" + absolute(fourthNumber));
	}
}
