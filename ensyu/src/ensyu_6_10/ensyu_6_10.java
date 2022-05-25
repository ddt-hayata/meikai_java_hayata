/*
 * 連続する要素が同じ値をもつことのないように演習6-9のプログラムを改良したプログラムを作成せよ。
 * たちえば{1, 3, 5, 5, 3, 2}とならないようにすること。
 */
package ensyu_6_10;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_10 {

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
			
			// 1つ目の要素に乱数を代入
			if (i == 0) {
				
				// 配列に乱数の要素を代入
				array[i] = random.nextInt(10) + 1;
				
			// 2つ目以降の要素に乱数を代入
			} else if (i > 0) {
				
				do {
					
					// 配列に乱数の要素を代入
					array[i] = random.nextInt(10) + 1;
					
				// 1つ前の要素と同じ場合はやり直し
				} while (array[i] == array[i - 1]);
				
			}
			
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
