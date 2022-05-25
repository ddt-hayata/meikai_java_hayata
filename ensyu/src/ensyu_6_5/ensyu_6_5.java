/*
 * 配列の要素数と、個々の要素数の値を読み込んで、各要素の値を表示するプログラムを作成せよ。
 * 表示形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って{ }で囲んだ形式とすること。
 */
package ensyu_6_5;

import java.util.Random;
import java.util.Scanner;

public class ensyu_6_5 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンス化
		Random random = new Random();
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("要素数：");
		
		// 要素数の読み込み
		int number = scanner.nextInt();
		
		// 入力値をもとに配列を初期化
		int[] array = new int[number];
		
		// 要素入力用ループ
		for (int i = 0; i < number; i++) {
			
			// コンソールに出力
			System.out.print("array[" + i + "] = ");
			
			// 入力値の代入
			array[i] = scanner.nextInt();
			
		}
		
		// コンソールに出力
		System.out.print("array = {");
		
		// 出力用ループ
		for (int i = 0; i < number; i++) {
			
			// コンソールに出力
			System.out.print(array[i]);
			
			// 出力用制御文
			if (i < number - 1) {
			
				// コンソールに出力
				System.out.print(", ");
			}
			
		}
		
		// コンソールに出力
		System.out.print("}");
		
	}
	
}