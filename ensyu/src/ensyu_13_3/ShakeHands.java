package ensyu_13_3;

public class ShakeHands {
	// コンストラクタ
	ShakeHands() {
		
	}
	
	/* 
	 * 関数名：shakeHandsGame
	 * 説明：じゃんけんの結果を返すを返却するメソッド
	 * パラメータ：じゃんけんの手humanHand, robotsHand)
	 * 返り値：じゃんけんの結果(0…あいこ, 1…人間の勝ち, 2…ロボットの勝ち)
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public static String shakeHandsGame(int humanHand, int robotsHand) {
		// 勝敗の条件式
		if ((humanHand == 1 && robotsHand == 2) || (humanHand == 2 && robotsHand == 3) || (humanHand == 3 && robotsHand == 1)) {
			// 返却
			return "人間の勝ち!";
		} else if ((humanHand == 1 && robotsHand == 3) || (humanHand == 2 && robotsHand == 1) || (humanHand == 3 && robotsHand == 2)) {
			// 返却
			return "ロボットの勝ち!";
		} else {
			// 返却
			return "あいこです!";
		}
	}
}