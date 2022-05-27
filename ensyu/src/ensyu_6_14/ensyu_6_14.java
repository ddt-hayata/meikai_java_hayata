/*
 * 月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 * ・出題する月の値は乱数で生成する。
 * ・学習者が望む限り、何度でも繰り返せる。
 * ・同一月を連続して出題しない。
 */
package ensyu_6_14;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_14 {

	public static void main(String[] args) {
		// Randomクラスのインスタンス化
		Random random = new Random();
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		// 各月の英語名の配列を作成
		String[] month = {
				"January", "February", "March", "April", "May", "June", 
				"July", "August", "September","October", "November", "December"};
		// コンソールに出力
		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");
		
		// 出題問題用変数
		int monthNumber = 0;
		
		// 出題問題のと調整用変数
		int adjustmentNumber = 0;
		
		// 問題の出力ループ
		Outer:
		while (true) {
			do {
				// 問題用の値を生成
				adjustmentNumber = random.nextInt(12);
			// 調整用問題の数値と同じ場合、再度乱数を生成
			} while (monthNumber == adjustmentNumber);
			
			// 問題Noを代入
			monthNumber = adjustmentNumber;
			Inner:
			while (true) {
				// 問題の出力
				System.out.print((monthNumber + 1) + "月 : ");
				// 解答の読込
				String answerMonth = scanner.next();
				// 答え合わせ
				if (answerMonth.equals(month[monthNumber])) {
					// 判定の出力
					System.out.print("正解です。もう一度？ 1…Yes / 0…No：");
					// 継続の読込
					int number = scanner.nextInt();
					// 制御文
					if (number == 0) {
						// ループ終了
						break Outer;
					} else {
						//問題ループへ再度入る
						continue Outer;
					} 
				} else {
					// 判定の出力
					System.out.println("違います。");
					// 同じ問題をもう一度出力
					continue Inner;
				}
			}
		}
		// 判定の出力
		System.out.println("終了します。");
	}
}
