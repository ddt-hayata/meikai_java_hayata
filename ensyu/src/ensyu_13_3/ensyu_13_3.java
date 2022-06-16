/*
 * ジャンケンの《プレーヤー》を表す抽象クラスを定義せよ。
 * そのクラスから、以下のクラスを派生すること。
 * ・人間プレーヤクラス（出す手をキーボードから読み込む）
 * ・コンピュータープレーヤクラス（出す手を乱数で生成する。）
 */
package ensyu_13_3;

public class ensyu_13_3 {

	public static void main(String[] args) {
		// インスタンス化
		HumanPlayer human = new HumanPlayer();
		// インスタンス化
		RobotsPlayer robots = new RobotsPlayer();
		
		// インスタンス化
		human.print();
		// インスタンス化
		robots.print();
		
		// 出力
		System.out.println("勝敗は・・・");
		// 出力
		System.out.println(ShakeHands.shakeHandsGame(human.getHandNumber(), robots.getHandNumber()));
	}
}
