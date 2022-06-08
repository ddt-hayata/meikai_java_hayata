/*
 * 開始日と終了日とから構成される《期間》を表すクラスperiodを作成せよ。
 * コンストラクタやメソッドは自由に定義すること。
 */
package ensyu_9_5;

public class ensyu_9_5main {

	public static void main(String[] args) {
		// インスタンス化
		Day from = new Day(2022, 4, 1);
		// インスタンス化
		Day to = new Day(2023, 3, 31);
		// インスタンス化
		period myJob = new period("〇〇案件", "要件定義・基本設計", 10, from, to);
		
		// 出力
		System.out.println("案件情報を表示します。");
		// 出力
		System.out.println("案件名：" + myJob.getProjectName());
		// 出力
		System.out.println("内容：" + myJob.getContent());
		// 出力
		System.out.println("人数：" + myJob.getProjectPersons() + "名");
		// 出力
		System.out.println("開始日：" + myJob.getFrom().toString());
		// 出力
		System.out.println("終了日：" + myJob.getTo().toString());
	}
}
