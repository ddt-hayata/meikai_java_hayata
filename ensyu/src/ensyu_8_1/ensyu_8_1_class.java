/*
 * 名前・身長・体重などをメンバとして持つ《人間クラス》を作成せよ。
 * （フィールドやメソッドなどは自分で自由に設計すること）
 */
package ensyu_8_1;

class Human {
	// 名前
	private String name;
	// 年齢
	private int age;
	// 身長
	private double height;
	// 体重
	private double weight;
	
	// コンストラクタ
	Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	/* 
	 * 関数名：humanInfo
	 * 説明：Humanクラスに渡された情報をを表示するメソッド
	 * パラメータ：名前(String name), 年齢(int age), 身長(int height), 体重(int weight)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/6
	 */
	void humanInfo() {
		// 出力
		System.out.println("\nAさんの情報を表示します。");
		// 出力
		System.out.println("名前：" + name + "さん");
		// 出力
		System.out.println("年齢：" + age + "歳");
		// 出力
		System.out.println("身長：" + height + "cm");
		// 出力
		System.out.println("体重：" + weight + "kg");
	}
}
