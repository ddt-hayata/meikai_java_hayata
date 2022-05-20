package ensyu_3_8;

import java.util.Scanner;

public class ensyu_3_8 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("点数を評価します。\n何点ですか?：");
		
		// 変数に代入
		int score = scanner.nextInt();
		
		if (score <= 59) {
			// コンソールに出力
			System.out.println("不可");
		
		} else if (score >= 60 && score <= 69) {
			// コンソールに出力
			System.out.println("可");

		} else if (score >= 70 && score <= 79) {
			// コンソールに出力
			System.out.println("良");
		
		} else if (score >= 80) {
			// コンソールに出力
			System.out.println("優良");
			
		}
		
	}

}