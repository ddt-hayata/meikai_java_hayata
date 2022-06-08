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
			for (int i = firstNumber; i <= secondNumber; i++) {
				// コンソールに出力
				System.out.println(i);
			}
		} else {
			for (int j = secondNumber; j <= firstNumber; j++) {
				// コンソールに出力
				System.out.println(j);
			}
		}
		// 入力値が異なる場合表示
		if (firstNumber != secondNumber) {
			// コンソールに出力
			System.out.print("全ての数字が表示されました。");
		} else {
			// コンソールに出力
			System.out.print("値が等しいです。");
		}
	}

}
