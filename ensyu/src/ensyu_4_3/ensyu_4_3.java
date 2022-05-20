/*
 * 右の示すように、二つの整数値を読み込んで、
 * 小さいほうの数以上で大きいほうの数以下の全整数を
 * 小さいほうから順に表示するプログラムを作成せよ。
 */
package ensyu_4_3;

import java.util.Scanner;

public class ensyu_4_3 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("整数Aを入力してください：");
		
		// 変数に代入
		int firstNumber = scanner.nextInt();
		
		// コンソールに出力
		System.out.print("整数Bを入力してください：");
		
		// 変数に代入
		int secondNumber = scanner.nextInt();
		
		if (firstNumber < secondNumber) {
			do {
				
				// コンソールに出力
				System.out.println(firstNumber);
				
				// 変数に加数
				firstNumber++;
			
				// ループ条件
			} while (firstNumber != secondNumber + 1);
			
		} else if (firstNumber > secondNumber) {
			do {
				
				// コンソールに出力
				System.out.println(secondNumber);
				
				// 変数に加数
				secondNumber++;
				
				// ループ条件
			} while (secondNumber != firstNumber + 1);	
		}
		
		// コンソールに出力
		System.out.print("全ての数字が表示されました。");
		
	}

}
