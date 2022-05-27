/*
 * 配列の要素の並びをシャッフルする（ランダムな順とあなるようにかき交ぜる）プログラムを作成せよ。
 */
package ensyu_6_12;
import java.util.Random;
import java.util.Scanner;
public class ensyu_6_12 {
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
		// 並べ替え用配列の宣言
		int[] shuffleArray = new int[number];
	    // 代入ループ
		for (int i = 0; i < number; i++) {
			// 要素を代入
			array[i] = random.nextInt(number);
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
	    // 改行
		System.out.println();
		
		// シャッフル用配列の宣言
		int[] storingArray = new int[number];
		// シャッフル用乱数を格納する変数
		int randomNumber = 0;
		
		// 並べ替えループ
		for (int i = 0; i < number; i++) {
			
			// 最初の配列に値を代入
			if (i == 0) {
				storingArray[i] = random.nextInt(number);
			//2つ目以降の配列に値を代入
			} else {
				Outer:
				// ループ文
					while (true) {
						// 並べ替え用乱数を代入
						randomNumber = random.nextInt(number);
						// シャッフル用配列にランダムにインデント用の値を代入
						for (int j = 0; j < i; j++) {
							// 生成されたインデント用の値が配列内の値と同じ場合やり直し
							if (storingArray[j] == randomNumber) {
								continue Outer;
							}
					}
					// シャッフル用配列にインデント用の値を代入
					storingArray[i] = randomNumber;
					break;
				}
			}
		}
		// 
		for (int i = 0; i < number; i++) {
			// シャッフル用配列にインデント用の値を用いてarray配列内の要素を移動する
			shuffleArray[i] = array[storingArray[i]];
		}
		// コンソールに出力
		System.out.print("配列shuffleArrayの全要素の値\n{ ");
		
		// 出力ループ
		for (int i = 0; i < number; i++) {
			// コンソールに出力
			System.out.print(shuffleArray[i] + " ");
		}
		// コンソールに出力
		System.out.println("}");
	}
}