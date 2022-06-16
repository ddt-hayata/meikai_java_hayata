package ensyu_13_2;

// 水平な直線を描画するクラス
public class HorzLine extends AbstLine {
	// コンストラクタ
	public HorzLine(int length) {
		super(length);
	}
	
	/* 
	 * 関数名：toString
	 * 説明：図形情報の表示をする文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値：文字列
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public String toString() {
		// 返却
		return "HorzLine(length:" + getLength() + ")";
	}
	/* 
	 * 関数名：draw
	 * 説明：図形情報の表示と図形を描画するメソッド
	 * パラメータ：なし
	 * 返り値：文字列
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			// 出力
			System.out.print('-');
		}
		// 出力
		System.out.println();
	}
}
