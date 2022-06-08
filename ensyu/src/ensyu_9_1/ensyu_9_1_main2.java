/*
 * 演習8-1で作成した《人間クラス》の配列を生成するプログラムを作成せよ。
 * 生成時に要素を初期化するもの、生成後の要素を値に代入するものなど、複数のパターンを作ること。
 */
package ensyu_9_1;

public class ensyu_9_1_main2 {

	public static void main(String[] args) {
		// 配列の宣言
		Human[] human;
		// 配列にインスタンスの参照を代入
		human = new Human[] {
			new Human("佐藤", 30, 170, 70),
			new Human("鈴木", 40, 175, 80),
			new Human("田中", 25, 155, 40),
			new Human("中村", 45, 160, 50), };
		              
		// 出力ループ
		for (int i = 0; i < human.length; i++) {
			// 出力
			System.out.println(i + 1 + "人目");
			// 出力
			System.out.println( human[i].getName() + "さん "
								+ human[i].getAge() + "歳 "
								+ human[i].getHeight() + "cm "
								+ human[i].getWeight() + "kg");
			// 出力
			System.out.println("");
		}
	}
}
