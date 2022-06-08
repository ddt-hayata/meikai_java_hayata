/*
 * 演習8-1で作成した《人間クラス》の配列を生成するプログラムを作成せよ。
 * 生成時に要素を初期化するもの、生成後の要素を値に代入するものなど、複数のパターンを作ること。
 */
package ensyu_9_1;

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
	 * 関数名：getName
	 * 説明：名前を返すメソッド
	 * パラメータ：なし
	 * 返り値：名前(name)
	 * 作成者：早田
	 * 作成日：2022/6/7
	 */
	String getName() {
		return name;
	}
	/* 
	 * 関数名：getAge
	 * 説明：年齢を返すメソッド
	 * パラメータ：なし
	 * 返り値：年齢(age)
	 * 作成者：早田
	 * 作成日：2022/6/7
	 */
	int getAge() {
		return age;
	}
	/* 
	 * 関数名：getHeight
	 * 説明：身長を返すメソッド
	 * パラメータ：なし
	 * 返り値：身長(height)
	 * 作成者：早田
	 * 作成日：2022/6/7
	 */
	double getHeight() {
		return height;
	}
	/* 
	 * 関数名：getWeight
	 * 説明：体重を返すメソッド
	 * パラメータ：なし
	 * 返り値：体重(Weight)
	 * 作成者：早田
	 * 作成日：2022/6/7
	 */
	double getWeight() {
		return weight;
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
