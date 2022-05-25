/*
 * List6-5を書き換えて、縦向きの棒グラフで表示するプログラムを作成せよ。
 * 最下段には、インデックスを10で割った剰余を表示すること。
 */
package ensyu_6_4;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_4 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンス化
		Random random = new Random();
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("要素数：");
		
		// 要素数の読み込み
		int number = scanner.nextInt();
		
		// 配列の生成
		int[] array = new int[number];
		
		// ループ
		for (int i = 0; i < number; i++) {
			
			// 乱数（1～10）要素に追加
			array[i] = 1 + random.nextInt(10);
		}
		
		// 乱数用変数
		int randomNumber = 10;
		
		// 要素の数だけループ
		for (int i = 0; i <= 9; i++) {
			
			// randomNumberをディクリメント
			randomNumber--;
			
			// 出力ループ
			for (int j = 0; j < number; j++) {
				
				if (array[j] >= randomNumber) {
					
					// コンソールに出力
					System.out.print('*' + " ");
					
				// スペースの出力
				} else {
					
					// コンソールに出力
					System.out.print("  ");
				
				}
				
			}
			// 改行文の出力
			System.out.println();
			
		}
		
		// 出力用ループ
		for (int i = 0; i < number; i++) {
			
			// 改行文の出力
			System.out.print("-");
			
			// スペース出力用制御文
			if (i < number - 1) {
				
				// スペースの出力
				System.out.print(" ");
			}
			
		}
		
		// 改行文の出力
		System.out.println();
		
		// 出力用ループ
		for (int i = 0; i < number; i++) {
			
			// 改行文の出力
			System.out.print(i % 10);
			
			// スペース出力用制御文
			if (i < number - 1) {
				
				// スペースの出力
				System.out.print(" ");
				
			}
			
		}
		
	}
	
}