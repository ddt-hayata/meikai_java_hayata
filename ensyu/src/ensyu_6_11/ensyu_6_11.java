/*
 * 異なる要素が同じ値をもつことのないように演習6-9のプログラムを改良したプログラムを作成せよ。
 * たちえば{1, 3, 5, 6, 1, 2}とならないようにすること。
 */
package ensyu_6_11;
import java.util.Random;
import java.util.Scanner;
public class ensyu_6_11 {
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
		
		// 2つ目以降の配列の要素を一時的に格納する変数
		int x = 0;
		
		// 配列への代入ループ
		for (int i = 0; i < number; i++) {
			// 最初の配列に値を代入
			if (i == 0) {
				// 要素を追加
				array[i] = random.nextInt(10) + 1;
			// 2つ目以降の配列に値を代入
			} else {
				// ラベルをつける
				Outer:
				while (true) {
					// 配列代入用の値を一時的に変数に代入
					x = random.nextInt(10) + 1;
					// 配列内にある要素の値を順に調べる
					for (int j = 0; j < i; j++) {
					// 配列内の値と同じ場合while文に戻る
						if (array[j] == x) {
							continue Outer;
						}
					}
					// 配列に代入
					array[i] = x;
					break;
				}
			}
		}
		// 出力ループ
		for (int i = 0; i < number; i++) {
			// コンソールに出力
			System.out.println("array [" + i +  "] = " + array[i]);
		}
		// コンソールに出力
		System.out.print("配列arrayの全要素の値\n{ ");
		// 出力ループ
		for (int i = 0; i < number; i++) {
			// コンソールに出力
			System.out.print(array[i] + " ");
		}
		// コンソールに出力
		System.out.println("}");
	}
}
		