/*
 * 6人の2科目（国語・数学）の点数を読み込んで、
 * 科目ごとの平均点、学生ごとの平均点を求めるプログラムを作成せよ。
 */
package ensyu_6_17;

public class ensyu_6_17 {

	public static void main(String[] args) {
		// 配列の作成
		int[][] score = {
				{10, 20}, {30, 40}, {50, 60}, {70, 80}, {90, 100}, {50, 50}
				};
		
		// 表示ループ
		for (int i = 0; i < 6; i++) {
			// 出力
			System.out.print("学生" + (i + 1) + "  :");
			for (int j = 0; j < 2; j++) {
				// 出力
				System.out.printf("%4d", score[i][j]);
			}
			System.out.println();
		}
		// 国語・数学の合計点
		int japaneseSum = 0;
		// 数学の合計点
		int mathSum = 0;
		
		// 科目ごとの計算ループ
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				
				if (j == 0) {
					// 国語の点数を加算
					japaneseSum += score[i][j];
				} else{
					mathSum += score[i][j];
				}
			}
		}
		// 出力
		System.out.print("国語の平均は：");
		// 出力
		System.out.printf("%3.1f", (double)japaneseSum / 6);
		// 出力
		System.out.println("点です。");
		// 出力
		System.out.print("数学の平均は：");
		// 出力
		System.out.printf("%3.1f", (double)mathSum / 6);
		// 出力
		System.out.println("点です。");
		
		// 学生ごとの合計点
		int [] studentScore = new int[6];
		
		// 学生ごとの計算ループ
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				// 学生ごとに点数を加算
				studentScore[i] += score[i][j];
			}
		}
		// 学生ごとの平均点出力ループ
		for (int i = 0; i < 6; i++) {
			// 出力
			System.out.print("学生" + (i + 1) + "の平均点は : ");
			// 出力
			System.out.printf("%3.1f", (double)studentScore[i] / 2);
			// 出力
			System.out.println("点です。");
		}
	}
}
