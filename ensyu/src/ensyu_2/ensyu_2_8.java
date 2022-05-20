package ensyu_2;

import java.util.Random;
import java.util.Scanner;

public class ensyu_2_8 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		// コンソールに出力
		System.out.print("整数値：");
		
		// 変数に代入
		int firstNumberumber = scanner.nextInt();
		
		// 変数に代入
		int secondNumbernumber = random.nextInt(11) - 5;
		
		// コンソールに出力
		System.out.println(firstNumberumber - secondNumbernumber);

	}

}
