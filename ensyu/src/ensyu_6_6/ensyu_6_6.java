/*
 * テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。
 * 人数と点数は、キーボードから読み込むこと。
 */
package ensyu_6_6;

import java.util.Scanner;

public class ensyu_6_6 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// 人数用の変数の用意
		final int count = 5;
		
		// 点数用配列の用意
		int[] point = new int[count];
		
		// コンソールに出力
		System.out.println(count + "人の点数を入力せよ。");
		
		// 合計点数用変数
		int sum = 0;
		
		// 合計点数を求めるループ
		for (int i = 0; i < count; i++) {
			
			// コンソールに出力
			System.out.print((i + 1) + "番の点数：");
			
			// 入力値の代入
			point[i] = scanner.nextInt();
			
			sum += point[i];
			
		}
		
		// コンソールに出力
		System.out.println("合計は" + sum + "点です。");
		
		// コンソールに出力
		System.out.println("平均は" + (double)sum / count + "点です。");
		
		
		// 最高点用の変数
		int max = point[0];
		
		// 最低点用の変数
		int min = point[0];
		
		// 最高点を求めるループ
		for (int i = 1; i < point.length; i++) {
		
			// 最高点を走査する制御文
			if (point[i] > max) {
				
				// 最高点を代入
				max = point[i];
				
			} else if (point[i] < min){
				
				// 最低点を代入
				min = point[i];
			}
			
		}
		
		// コンソールに出力
		System.out.println("最高点は" + max + "点です。");
		
		// コンソールに出力
		System.out.println("最低点は" + min + "点です。");
		
	}

}
 