/*
 * 引数monthで指定された月の季節を表示するメソッドprintSeasonを表示せよ。
 * monthが3, 4, 5であれば『春』、6, 7, 8であれば『夏』、9, 10, 11であれば『秋』、12, 1, 2であれば『冬』と表示し、
 * それ以外の値であれば何も表示しないこと。
 */
package ensyu_7_6;

import java.util.Scanner;

public class ensyu_7_6 {
	/*
	 * 関数名：printSeason
	 * 説明：引数monthで指定された月の季節を表示するメソッド
	 * パラメータ：入力された整数値(month)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/5/27
	 */
	static void printSeason(int month) {
		// 入力値をもとに季節を表示
		if (3 <= month && month <= 5) {
			// 春を表示
			System.out.println("春");
		} else if (6 <= month && month <= 8) {
			// 夏を表示
			System.out.println("夏");
		} else if (9 <= month && month <= 11) {
			// 秋を表示
			System.out.println("秋");
		} else if (month == 12 || month == 1 || month == 2) {
			// 冬を表示
			System.out.println("冬");
		}
	}
	
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 入力を促す
		System.out.print("季節を調べたい月を入力してください。：");
		// 入力値を変数に代入
		int month = scanner.nextInt();
		// メソッドの呼び出し
		printSeason(month);
	}
}
