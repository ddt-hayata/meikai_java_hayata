package ensyu_13_3;

// プレーヤーの抽象クラス
public abstract class Player {
	/* 
	 * 関数名：toString
	 * 説明：プレーヤー情報の表示をする文字列を返却する抽象メソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public abstract String toString();
	
	/* 
	 * 関数名：shakeHands
	 * 説明：じゃんけんの手を表示する抽象メソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public abstract String shakeHands();
	
	/* 
	 * 関数名：print
	 * 説明：プレーヤー情報の表示とじゃんけんの手を表示するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public void print() {
		// 出力
		System.out.println(toString());
		// 出力
		System.out.println(shakeHands());
	}
}