/*
 * 3人で行うジャンケンプログラムを作成せよ。
 * プレーヤ3人のうち、コンピュータを2人として、人間を1人とすること。
 * また、演習13-3で作成した、プレーヤクラスを利用すること。
 */
package ensyu_15_5;

public class ensyu_15_5 {

	public static void main(String[] args) {
		// インスタンス化
		HumanPlayer human = new HumanPlayer();
		// インスタンス化
		RobotsPlayer robot1 = new RobotsPlayer();
		// インスタンス化
		RobotsPlayer robot2 = new RobotsPlayer();
		
		// メソッド呼び出し
		human.print();
		// メソッド呼び出し
		robot1.print();
		// メソッド呼び出し
		robot2.print();
		
		// 出力
		System.out.println("勝敗は・・・");
		// 出力
		System.out.println(ShakeHands.shakeHandsGame(human.getHandNumber(), robot1.getHandNumber(), robot2.getHandNumber()));
	}
}
