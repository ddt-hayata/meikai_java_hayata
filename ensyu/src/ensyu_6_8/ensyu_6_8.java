/*
 * double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 * 要素数と全要素の値はキーボードから読み込むこと。
 */
package ensyu_6_8;

import java.util.Scanner;

public class ensyu_6_8 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("要素数：");
		
		// 要素数用の変数
		int number = scanner.nextInt();
		
		// 配列の宣言
		double[] array = new double[number];
		
		// 要素の入力ループ
		for (int i = 0; i < number; i++) {
			
			// コンソールに出力
			System.out.print("array[" + i + "] = ");
			
			// 要素用変数に代入
			array[i] = scanner.nextDouble();
			
		}
		
		// コンソールに出力
		System.out.print("array = { ");
		
		// 配列の出力ループ
		for (int i = 0; i < number; i++ ) {
			
			// コンソールに出力
			System.out.print(array[i] + " ");
			
		}
		
		// コンソールに出力
		System.out.println("}");
		
		// 合計値用の変数
		double sum = 0;
		
		// 要素の合計を求めるループ
		for (double i : array) {
			
			// 変数に加算
			sum += i;
			
		}
		
		// コンソールに出力
		System.out.println("全要素の合計は" + sum + "です。");
		
		// コンソールに出力
		System.out.println("全要素の平均は" + sum / number + "です。");
		
	}

}
