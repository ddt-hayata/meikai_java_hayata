package ensyu_15_5;

import java.util.Scanner;
// 人間プレーヤクラス
public class HumanPlayer extends Player {
	// Scannerクラスのインスタンス化
	Scanner scanner = new Scanner(System.in);
	
	private int handNumber;
	
	// コンストラクタ
	HumanPlayer() {
		// 出力
		System.out.println("ジャンケンをします！");
		// 出力
		System.out.print("手を決めてください。（1…グー / 2…チョキ / 3…パー）：");
		// 人間の手を代入
		int humanHandNumber = scanner.nextInt();
		this.handNumber = humanHandNumber;
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
		return "人間の手は：";
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
			// 返却
		} else {
			return "パー";
		}
	}
}
