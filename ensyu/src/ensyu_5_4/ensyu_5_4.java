/*
 * 三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 平均は実数として表示すること。
 */
package ensyu_5_4;

import java.util.Scanner;

public class ensyu_5_4 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.println("整数値xとyの平均値を求めます。");
		
		// コンソールに出力
		System.out.print("x：");
		
		// 入力値の代入
		int x = scanner.nextInt();
		
		// コンソールに出力
		System.out.print("y：");
		
		// 入力値の代入
		int y = scanner.nextInt();
		
		System.out.print("z：");
		
		// 入力値の代入
		int z = scanner.nextInt();
		
		// 変数に代入
		int sum = x + y + z;
		
		// 変数に代入
		double average = sum / 3.0;
		
		// コンソールに出力
		System.out.println("三つの数値の合計は" + sum + "です。");
		
		// コンソールに出力
		System.out.println("三つの数値の平均は" + average + "です。");
	}

}
 