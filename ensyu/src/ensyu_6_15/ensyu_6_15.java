/*
 * 曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 * ・出題する曜日は乱数で生成する。
 * ・学習者が望む限り、何度でも繰り返せる。
 * ・同一曜日を連続して出題しない。
 */
package ensyu_6_15;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_15 {

	public static void main(String[] args) {
		// Randomクラスのインスタンス化
		Random random = new Random();
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		// 英語表記の曜日の配列
		String[] weekday = {
				"monday", "tuesday", "wednesday",
				"thursday", "friday", "saturday", "sunday"};
		// 日本語表記の曜日の配列
		String[] weekdayJapan = {
				"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
		// 問題変数
		int questionWeekday = 0;
		// 仮問題変数
		int temporaryQuestion = 0;
		// 問題文の出力
		System.out.println("英語の曜日名を小文字で入力してください。");
		// ラベル
		Outer:
		// 問題出力ループ
		while (true) {
			do {
				// 仮問題変数に乱数を代入
				temporaryQuestion = random.nextInt(7);
			// 繰り返し文
			} while (questionWeekday == temporaryQuestion);
			// 問題変数に代入
			questionWeekday = temporaryQuestion;
			
			// ラベル
			Inner:
			while (true) {
				// 問題文の出力
				System.out.print(weekdayJapan[questionWeekday] + "：");
				// 解答の入力・代入
				String answer = scanner.next();
				// 答え合わせ
				if (weekday[questionWeekday].equals(answer)) {
					// 判定の出力
					System.out.print("正解です。もう一度？ 1…Yes / 0…No：");
					// 繰り返すか？
					int number = scanner.nextInt();
					// 繰り返す場合
					if (number == 1) {
						// 再度問題ループへ
						continue Outer;
					// 繰り返さない場合
					} else {
						// ループ終了
						break Outer;
					}
					
				} else {
					// 判定の出力
					System.out.println("不正解です。もう一度回答してください。");
					// 解答をもう一度
					continue Inner;
				}
				
			}
		}
		// 終了
		System.out.println("終了します。");
	}

}
