/*
 * ロボット型ペットクラスRobotPet(p.407)を拡張した、着せかえ可能なロボット型ペットクラスを作成せよ。
 * インターフェースSkinnableを実装すること。
 */
package ensyu_14_2;

public class ensyu_14_2 {

	public static void main(String[] args) {
		RobotPet robotPet = new RobotPet("ロボットいぬ", "ロボットいぬの飼い主");
		
		// メソッドの呼び出し
		robotPet.introduce();
			// メソッドの呼び出し
		robotPet.changeSkin();
		// 改行文の出力
		System.out.println();
	}
}
