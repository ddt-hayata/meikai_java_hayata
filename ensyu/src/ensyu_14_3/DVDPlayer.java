package ensyu_14_3;

// DVDプレーヤクラス
public class DVDPlayer implements ExPlayer {
	
	/* 
	 * 関数名：play
	 * 説明：再生用のメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void play() {
		// 出力
		System.out.println("■DVD再生開始！");
	}
	
	/* 
	 * 関数名：stop
	 * 説明：停止用のメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void stop() {
		// 出力
		System.out.println("■DVD再生終了！");
	}
	
	/* 
	 * 関数名：slow
	 * 説明：スロー再生用のメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void slow() {
		// 出力
		System.out.println("■DVDスロー再生開始！");
	}
}
