/*
 * 探索するキー値と同じ値の要素が複数個存在する場合、
 * 最も末尾側に位置する要素を見つけるプログラムを作成せよ。
 */
package ensyu_6_7;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_7 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンス化
		Random random = new Random();
		
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 要素数の変数
		final int number = 12;
		
		// 配列の宣言
		int[] array = new int[number];
		
		// 配列代入のループ
		for (int j = 0; j < number; j++) {
			
			// 乱数を配列に代入
			array[j] = random.nextInt(10);
		}
		
		// コンソールに出力
		System.out.print("配列aの全要素の値\n{ ");
		
		// 配列出力用ループ
		for (int j = 0; j < number; j++) {
			
			// コンソールに出力
			System.out.print(array[j] + " ");
			
		}
		
		// コンソールに出力
		System.out.println("}");
		
		// コンソールに出力
		System.out.print("探す値：");
		
		// 入力値を代入
		int keyPoint = scanner.nextInt();
		
		// ループ用変数の宣言
		int i;
		
		// 一致する最終要素のインデントを格納する変数
		int x = 0;
		
		// 探索用ループ
		for (i = 0; i < number; i++) {
			
			// 探索用制御文
			if (array[i] == keyPoint) {
				
				// 一致した要素を変数に代入
				x = i;
				
			}
		}
		
		// 探索結果表示用制御文
		if (x < number) {
			
			// コンソールに出力
			System.out.println("それはa[" + x + "]にあります。");
			
		} else {
			
			// コンソールに出力
			System.out.println("それはありません。");
		}

	}

}
