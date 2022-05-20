package ensyu_3_4;

import java.util.Scanner;

public class ensyu_3_4 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数a：");
		
		// 変数に代入
		int fristNumber = scanner.nextInt();
		
		// 「コンソールに出力
		System.out.print("整数b：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		// コンソールに出力
		if (fristNumber > secondNumber) {
			System.out.println("aのほうが大きいです。");
		
		// コンソールに出力
		} else if (fristNumber < secondNumber) {
			System.out.println("bのほうが大きいです。");
		
		// コンソールに出力
		} else {
			System.out.println("aとbは同じ値です。");
			
		}
		
	}

}