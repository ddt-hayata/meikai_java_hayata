/*
 * 要素型がint型である配列を作り、全要素を1～10の乱数で埋めつくす（1以上10以下の値を代入）
 * プログラムを作成せよ。要素数はキーボードから読み込むこと。
 */
package ensyu_6_9;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_9 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンス化
		Random random = new Random();
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("要素数：");
		
		// 要素数用の変数
		
		int number = scanner.nextInt();
		
		// 配列の宣言
		int[] array = new int[number];
		
		// 要素の代入ループ
		for (int i = 0; i < number; i++) {
			
			// 配列に乱数の要素を代入
			array[i] = random.nextInt(10) + 1;
		}
		
		// 出力ループ
		for (int i = 0; i < number; i++) {
			
			System.out.println("array [" + i +  "] = " + array[i]);
		}
		
		// コンソールに出力
		System.out.print("配列arrayの全要素の値\n{ ");
		
		// 出力ループ
		for (int i = 0; i < number; i++) {
			
			System.out.print(array[i] + " ");
			
		}
		
		// コンソールに出力
		System.out.println("}");

	}

}
