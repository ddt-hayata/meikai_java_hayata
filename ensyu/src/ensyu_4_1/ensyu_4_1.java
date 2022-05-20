package ensyu_4_1;

import java.util.Scanner;

public class ensyu_4_1 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// 変数の宣言
		int retry;
		
		do {
			
			// コンソールに出力
			System.out.print("正負を判定します。\n好きな整数を入力してください：");
			
			// 変数に代入
			int number = scanner.nextInt();
			
			if (number > 0) {
				
				// コンソールに出力
				System.out.println(number + "は正の数です。");
			
			} else {
				
				// コンソールに出力
				System.out.println(number + "は負の数です。");
				
			}
			
			// コンソールに出力
			System.out.print("もう一度？ 1…Yes / 0…No：");
			
			// 変数に代入
			retry = scanner.nextInt();
			
		} while (retry == 1);
		
		// コンソールに出力
		System.out.print("判定を終了します。");
		
	}

}
