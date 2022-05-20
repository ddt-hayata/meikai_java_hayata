package ensyu_2;

import java.util.Scanner;

public class ensyu_2_6 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソール出力
		System.out.println("三角形の面積を求めます。");
		
		// コンソール出力
		System.out.print("底辺：");
		
		// 変数に代入
		double x = scanner.nextDouble();
		
		// コンソール出力
		System.out.print("高さ：");
		
		// 変数に代入
		double y = scanner.nextDouble();

		// コンソール出力
		System.out.println("面積は" + ((x * y) / 2));
		
	}

}
