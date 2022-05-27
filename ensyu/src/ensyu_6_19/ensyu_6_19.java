/*
 * クラス数・各クラスの人数・全員の点数を読み込んで、
 * 点数の合計と平均点を求めるプログラムを作成せよ。
 * 合計点と平均点は、クラスごとのものと、全体のものとを表示すること。
 */
package ensyu_6_19;

import java.util.Scanner;

public class ensyu_6_19 {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// クラス数の入力
		System.out.print("クラス数：");
		// 入力値を代入
		int classCount = scanner.nextInt();
		// 入力値分の要素を生成
		int[][] Class = new int[classCount][];
		// 改行文
		System.out.println();
		// 総人数
		int allStudent = 0;
		// 人数の入力ループ
		for (int i = 0; i < Class.length; i++) {
			// 人数の入力
			System.out.print((i + 1) + "組の人数：");
			// 入力値を代入
			int memberCount = scanner.nextInt();
			// 入力値分の要素を生成
			Class[i] = new int[memberCount];
			// 総人数に加算
			allStudent += memberCount;
			// 点数の入力ループ
			for (int j = 0; j < Class[i].length; j++) {
				// 点数の入力
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				// 入力値を代入
				int score = scanner.nextInt();
				// 入力値分を要素を生成
				Class[i][j] = score;
			}
			// 改行文
			System.out.println();
		}
		// 出力
		System.out.println("  組 |    合計    平均 ");
		// 出力
		System.out.println("-----+-----------------");
		
		// 合計点数用の配列の宣言
		int [] totalScore = new int[classCount];
		
		// 総合計点数
		int allScore = 0;
		
		// 計算ループ
		for (int i = 0; i < Class.length; i++) {
			for (int j = 0; j < Class[i].length; j++) {
				totalScore[i] += Class[i][j];
			}
			// 総合計変数に加算
			allScore += totalScore[i];
		}
		// 出力ループ
		for (int i = 0; i < Class.length; i++) {
			// 出力
			System.out.print(" " + (i + 1) + "組 |     ");
			// 出力
			System.out.printf("%3d", totalScore[i]);
			// 改行文
			System.out.print("    ");
			// 出力
			System.out.printf("%3.1f", (double)totalScore[i] / Class[i].length);
			// 改行文
			System.out.println();
		}
		// 出力
		System.out.println("-----+-----------------");
		// 出力
		System.out.print("  計 |     " + allScore + "    ");
		// 出力
		System.out.printf("%3.1f", (double)allScore / allStudent);
	}
}
