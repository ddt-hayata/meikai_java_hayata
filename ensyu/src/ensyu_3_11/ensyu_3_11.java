
package ensyu_3_11;

import java.util.Scanner;

public class ensyu_3_11 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数a：");
		
		// 変数に代入
		int firstNumber = scanner.nextInt();
		
		// コンソールに出力
			System.out.print("整数b：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		// 変数に代入
		int difference = firstNumber - secondNumber;
		
		// 符号を反転させる
		if (difference < 0) {
			difference = -difference;
		
		}
		
		if (difference <= 10) {
			
			// コンソールに出力
			System.out.print("それらの差は10以下です");
		
		} else {
			// コンソールに出力
			System.out.print("それらの差は11以上です");
		
		}
		
	}

}