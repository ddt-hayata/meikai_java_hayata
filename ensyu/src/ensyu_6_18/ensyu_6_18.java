/*
 * 行数・各行の列数・各要素の値をキーボードから読み込むように
 * List6-18を書き換えたプログラムを作成せよ。
 */
package ensyu_6_18;
import java.util.Scanner;
public class ensyu_6_18 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("行数：");
		// 入力値を代入
		int lineNumber = scanner.nextInt();
		// 配列の宣言
		int[][] c;
		// 要素数を宣言
		c = new int[lineNumber][];
		
		// 列数の入力ループ
		for (int i = 0; i < c.length; i++) {
			// 出力
			System.out.print("c[" + i + "]の列数：");
			// 入力値を代入
			int columnNumber = scanner.nextInt();
			// c[0]内部の要素数を宣言
			c[i] = new int[columnNumber];
		}
		
		// 入力ループ(要素数で管理)
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				// 要素の入力を促す
				System.out.print("c[" + i + "][" + j + "] = ");
				c[i][j] = scanner.nextInt();
			}
		}
		
		
		
		// 出力ループ(要素数で管理)
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
	}
}
