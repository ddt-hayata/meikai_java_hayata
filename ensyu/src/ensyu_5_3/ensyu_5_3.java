/*
 * 論理型の変数にtrueやfalseを代入して、その値を出力するプログラムを作成せよ。
 */
package ensyu_5_3;

import java.util.Scanner;

public class ensyu_5_3 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("x：");
		
		// 入力値の代入
		int x = scanner.nextInt();
		
		// コンソールに出力
		System.out.print("y：");
		
		// 入力値の代入
		int y = scanner.nextInt();
		
		// 変数に代入
		boolean a = x < y;
		
		// 変数に代入
		boolean b = x > y;
		
		// コンソールに出力
		System.out.println(a);
		
		// コンソールに出力
		System.out.println(b);
	}

}
 