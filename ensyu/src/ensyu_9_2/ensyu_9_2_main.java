/*
 * 日付クラス第3版を利用するプログラムを作成せよ。
 * すべてのコンストラクタの働きを確認できるようにすること。
 */
package ensyu_9_2;

import java.util.Scanner;

public class ensyu_9_2_main {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("誕生日を入力してください。");
		// 出力
		System.out.print("年（西暦）：");
		// 変数に代入
		int birthYear = scanner.nextInt();
		// 出力
		System.out.print("月：");
		// 変数に代入
		int birthMonth = scanner.nextInt();
		// 出力
		System.out.print("日：");
		// 変数に代入
		int birthDay = scanner.nextInt();
		
		// インスタンス化
		Day day1 = new Day();
		Day day2 = new Day(birthYear);
		Day day3 = new Day(birthYear, birthMonth);
		Day day4 = new Day(birthYear, birthMonth, birthDay);
		Day[] day = new Day[3];
		
		// 出力
		System.out.println("誕生日を表示します。");
		// 出力
		System.out.println("day1 = " + day1);
		// 出力
		System.out.println("day2 = " + day2);
		// 出力
		System.out.println("day3 = " + day3);
		// 出力
		System.out.println("day4 = " + day4);
		
		// 配列に参照先を代入のループ
		for (int i = 0; i < day.length; i++) {
			// 配列に参照先を代入
			day[i] = new Day();
		}
		// 出力ループ
		for (int i = 0; i < day.length; i++) {
			// 出力
			System.out.println("day[" + i + "] = " + day[i]);
		}
	}

}
