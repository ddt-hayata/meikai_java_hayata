/*
 * List4-3（p.98）の数当てゲームのプレーヤが入力できる回数に制限を設けたプログラムを作成せよ。
 * 制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。
 */
package ensyu_4_27;

import java.util.Random;
import java.util.Scanner;

public class ensyu_4_27 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		// 変数に代入
		int randomNumber = random.nextInt(100);
		
		// コンソールに出力
		System.out.println("数当てゲーム開始!!\n0～99の数を当ててください。");
		
		// 変数の宣言
		int playerNumber;
		
		// 残り回数
		int limit = 5;
		
		int count = 0;
		
		// コンソールに出力
		System.out.println("入力できる回数は" + limit + "回までです。\nいくつかな？");
		
		for (int i = 1; i <= limit + 1; i++ ) {
			
			// 回数制限管理
			if (limit == count) {
				
				// コンソールに出力
				System.out.println("\n回数制限に達しました");
				System.out.println("正解は" + randomNumber + "です。");
				break;
				
			}
			
			// 変数に代入
			playerNumber = scanner.nextInt();
			
			// 入力回数にイクリメント
			count++;
			
			if (playerNumber > randomNumber) {
					
				// コンソールに出力
				System.out.println("もっと小さい数だよ。");
					
			} else if (playerNumber < randomNumber){
				
				// コンソールに出力
				System.out.println("もっと大きい数だよ。");
				
			} else {
				
				// コンソールに出力
				System.out.println("正解です。");
				
				break;
			}
			
		}
		
		// コンソールに出力
		System.out.println("数当てゲームを終了します。");
		
	}

}
