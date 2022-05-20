package ensyu_3_3;

import java.util.Scanner;

public class ensyu_3_3 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数値：");
		
		// 変数に代入
		int number = scanner.nextInt();
		
		// コンソールに出力
		if (number > 0) {
			System.out.println("その値は正です。");
		
		// コンソールに出力
		} else if (number < 0) {
			System.out.println("その値は負です。");
		
		// コンソールに出力
		} else if (number == 0) {
			System.out.println("その値は０です。");
		
		}
		
	}

}