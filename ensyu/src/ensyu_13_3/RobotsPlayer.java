package ensyu_13_3;

import java.util.Random;
// ロボットプレーヤクラス
public class RobotsPlayer extends Player {
	// Randomクラスのインスタンス化
	Random random = new Random();
	
	private int handNumber;
	
	// コンストラクタ
	RobotsPlayer() {
		// ロボットの手を代入
		int robotsHandNumber = random.nextInt(3) + 1;
		this.handNumber = robotsHandNumber;
	}
	
	/* 
	 * 関数名：toString
	 * 説明：プレーヤー情報の表示をする文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public int getHandNumber() {
		// 返却
		return handNumber;
	}
	
	/* 
	 * 関数名：toString
	 * 説明：プレーヤー情報の表示をする文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public String toString() {
		// 返却
		return "ロボットプレーヤーです。";
	}
	
	/* 
	 * 関数名：shakeHands
	 * 説明：じゃんけんの手を表示するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public String shakeHands() {
		if (handNumber == 1) {
			// 返却
			return "グー";
		} else if (handNumber == 2) {
			// 返却
			return "チョキ";
		} else {
			// 返却
			return "パー";
		}
	}
}
