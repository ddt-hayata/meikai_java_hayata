/*
 * 名前・身長・体重などをメンバとして持つ《人間クラス》を作成せよ。
 * （フィールドやメソッドなどは自分で自由に設計すること）
 */
package ensyu_8_1;

import java.util.Scanner;

public class ensyu_8_1_main {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("Aさんの情報を入力してください。");
		// 出力
		System.out.print("名前：");
		// 変数に代入
		String name = scanner.next();
		// 出力
		System.out.print("年齢：");
		// 変数に代入
		int age = scanner.nextInt();
		// 出力
		System.out.print("身長：");
		// 変数に代入
		double height = scanner.nextDouble();
		// 出力
		System.out.print("体重：");
		// 変数に代入
		double weight = scanner.nextDouble();
		// Humanクラスのインスタンス化
		Human firstHuman = new Human(name, age, height, weight);
		// インスタンスメソッドの呼び出し
		firstHuman.humanInfo();
	}

}
