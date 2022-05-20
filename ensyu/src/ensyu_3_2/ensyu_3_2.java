package ensyu_3_2;

import java.util.Scanner;

public class ensyu_3_2 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソール出力
		System.out.print("整数値A：");
		
		// 変数に代入
		int firstNumber = scanner.nextInt();
		
		// コンソール出力
		System.out.print("整数値B：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		if (firstNumber % secondNumber == 0) {
			// コンソール出力
			System.out.println("BはAの約数です。");

		} else {
			// コンソール出力
			System.out.println("BはAの約数ではありません。");
			
		}
	
	}

}