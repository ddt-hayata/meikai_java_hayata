/*
 * 季節を求めるList4-1（p.95）の月の読み込みにおいて、1～12以外の値が入力された場合は、
 * 再入力させるように修正したプログラムを作成せよ。（do文の中にdo文が入る二重ループとなる。）
 */
package ensyu_4_19;

import java.util.Scanner;

public class ensyu_4_19 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		int retry;      // 変数の宣言
		
		int month;      // 変数の宣言
		
		do {
			
			// コンソールに出力
			System.out.print("季節を求めます。\n何月ですか？：");
			
			do {
				
				// 変数に代入
				month = scanner.nextInt();
				
				// 出力条件
				if (month <= 0 || month > 12) {
					
				// コンソールに出力
				System.out.print("入力値に誤りがあります。\n再度入力してください。：");
				}
				
				// ループ条件
			} while (month <= 0 || month > 12);
			
			if (month >= 3 && month <= 5) {
				
				// コンソールに出力
				System.out.println("それは春です。");
				
			} else if (month >= 6 && month <= 8) {
					
				// コンソールに出力
				System.out.println("それは夏です。");
			
			} else if (month >= 9 && month <= 11) {
				
				// コンソールに出力
				System.out.println("それは秋です。");
			
			} else if (month ==12 || month == 1 || month == 2) {
				
				// コンソールに出力
				System.out.println("それは冬です。");
			
			}
			
			// コンソールに出力
			System.out.print("もう一度？ 1…Yes / 0…No：");
			
			// 変数に代入
			retry = scanner.nextInt();
		}
		
		// 繰り返し条件
		while (retry == 1);
		
	}

}
