package ensyu_3_1;

import java.util.Scanner;

public class ensyu_3_1 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数値：");
		
		// 変数に代入
		int number = scanner.nextInt();
		
		if (number > 0) {
			
			// コンソールに出力
			System.out.println("その絶対値は" + number + "です。");
		
		} else {
			// コンソールに出力
			System.out.println("その絶対値は" + -number + "です。");

		}
			
	}

}