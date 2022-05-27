/*
 * 4行3列の行列と3行4列の行列の積を求めるプログラムを作成せよ。
 * 各要素の値はキーボードから読み込むこと。
 */
package ensyu_6_16;
import java.util.Scanner;

public class ensyu_6_16 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 1つめの配列の宣言
		int[][] firstArray = new int[4][3];
		// 配列に入力値を代入
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				// 要素ごとに入力を指示
				System.out.print("firstArray[" + i + "][" + j + "]：");
				firstArray[i][j] = scanner.nextInt();
			}
		}
		// 配列名の出力
		System.out.println("配列（firstArray）");
		// 配列内の要素の出力
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				// 要素ごとに入力を指示
				System.out.printf("%3d", firstArray[i][j]);
			}
			System.out.println();
		}
		// 2つめの配列の宣言
		int[][] secondArray = new int[3][4];
		// 配列に入力値を代入
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				// 要素ごとに入力を指示
				System.out.print("secondArray[" + i + "][" + j + "]：");
				secondArray[i][j] = scanner.nextInt();
			}
		}
		// 配列名の出力
		System.out.println("配列（secondArray）");
		// 配列内の要素の出力
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				// 要素ごとに入力を指示
				System.out.printf("%3d", secondArray[i][j]);
			}
			System.out.println();
		}
		// 計算後の数値を入れる配列
		int[][] productArray = new int[4][4];
		// 計算ループ
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// 計算後の値を代入
				productArray[i][j] = firstArray[i][j] * secondArray[i][j];
				
			}
		}
		// 配列名の出力
		System.out.println("配列（productArray）");
		// 配列内の要素の出力
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// 要素ごとに入力を指示
				System.out.printf("%3d", productArray[i][j]);
			}
			System.out.println();
		}
	}
}
