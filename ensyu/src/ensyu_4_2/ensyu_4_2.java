package ensyu_4_2;

import java.util.Random;
import java.util.Scanner;

public class ensyu_4_2 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		// コンソールに出力
		System.out.println("数宛ゲームを開始します！\n0～99の数を当ててください。");
		
		// 変数に代入
		int randomNumber = random.nextInt(100);
		
		// 変数に代入
		int playerNumber;
		
		do {
			
			// コンソールに出力
			System.out.println("好きな数を入力してください。");
			
			// 変数に代入
			playerNumber = scanner.nextInt();
			
			if (playerNumber < randomNumber) {
				
				// コンソールに出力
				System.out.println("もっと大きい数です。");
				
			} else if (playerNumber > randomNumber) {
				
				// コンソールに出力
				System.out.println("もっと小さい数です。");
				
			}
			
		} while (playerNumber != randomNumber);
		
		// コンソールに出力
		System.out.println("正解です！");
		
	}

}
