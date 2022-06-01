/*
 * 二つの整数値を読み込んで降順（大きい順）に
 * ソートするプログラムを作成せよ。
 */
package ensyu_3_15;

import java.util.Scanner;

public class ensyu_3_15 {

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
		
		if (firstNumber > secondNumber) {
			
			// コンソールに出力
			System.out.println(firstNumber);
			
			// コンソールに出力
			System.out.println(secondNumber);
		} else {
			
			// コンソールに出力
			System.out.println(secondNumber);
			
			// コンソールに出力
			System.out.println(firstNumber);
		} 
		
		// コンソールに出力
		System.out.println("降順(大きい順)にソートしました。");
		
	}

}
