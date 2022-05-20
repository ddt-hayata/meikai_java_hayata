package ensyu_3_17;

import java.util.Random;

public class ensyu_3_17 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		// 変数に代入
		int number = random.nextInt(3);
		
		if (number == 0) {
			
			// コンソールに出力
			System.out.print("グー");
		
		} else if (number == 1) {
			
			// コンソールに出力
			System.out.print("チョキ");
		
		} else
			// コンソールに出力
			System.out.print("パー");

	}

}
