/*
 * float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 */
package ensyu_5_2;

import java.util.Scanner;

public class ensyu_5_2 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("x：");
		
		// 入力値の代入
		float x = scanner.nextFloat();
		
		// コンソールに出力
		System.out.print("y：");
		
		// 入力値の代入
		double y = scanner.nextDouble();
		
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}

}
 