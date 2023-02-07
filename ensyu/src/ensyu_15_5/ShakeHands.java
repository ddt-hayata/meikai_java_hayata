package ensyu_15_5;

public class ShakeHands {
	// コンストラクタ
	ShakeHands() {
		
	}
	
	/* 
	 * 関数名：shakeHandsGame
	 * 説明：じゃんけんの結果を返すを返却するメソッド
	 * パラメータ：じゃんけんの手humanHand, robotsHand)
	 * 返り値：文字列
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public static String shakeHandsGame(int humanHand, int robot1Hand, int robot2Hand) {
		// 勝敗の条件式
		if ((humanHand == 1 && robot1Hand == 2 && robot2Hand == 2) 
				|| (humanHand == 2 && robot1Hand == 3 && robot2Hand == 3) 
				|| (humanHand == 3 && robot1Hand == 1 && robot2Hand == 1)) {
			// 返却
			return "人間の勝ち!";
		} else if ((humanHand == 1 && robot1Hand == 1 && robot2Hand == 2) 
				|| (humanHand == 2 && robot1Hand == 2 && robot2Hand == 3) 
				|| (humanHand == 3 && robot1Hand == 3 && robot2Hand == 1)) {
			// 返却
			return "人間とロボット1の勝ち!";
		} else if  ((robot1Hand == 1 && humanHand == 2 && robot2Hand == 2) 
				|| (robot1Hand == 2 && humanHand == 3 && robot2Hand == 3) 
				|| (robot1Hand == 3 && humanHand == 1 && robot2Hand == 1)) {
			// 返却
			return "ロボット1の勝ち!";
		} else if  ((robot2Hand == 1 && humanHand == 2 && robot1Hand == 1) 
				|| (robot2Hand == 2 && humanHand == 3 && robot1Hand == 2) 
				|| (robot2Hand == 3 && humanHand == 1 && robot1Hand == 3))  {
			// 返却
			return "ロボット1とロボット2の勝ち!";
		} else if  ((robot2Hand == 1 && humanHand == 2 && robot1Hand == 2) 
				|| (robot2Hand == 2 && humanHand == 3 && robot1Hand == 3) 
				|| (robot2Hand == 3 && humanHand == 1 && robot1Hand == 1)) {
			// 返却
			return "ロボット2の勝ち!";
		} else {
			// 返却
			return "あいこです!";
		}
	}
}