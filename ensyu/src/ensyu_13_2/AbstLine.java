package ensyu_13_2;

// 直線を描画する抽象クラス
public abstract class AbstLine extends Shape {
	private int length;
	
	// コンストラクタ
	public AbstLine(int length) {
		setLength(length);
	}
	
	/* 
	 * 関数名：getLength
	 * 説明：長さを取得するメソッド
	 * パラメータ：なし
	 * 返り値：長さ(length)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public int getLength() {
		// 返却
		return length;
	}
	
	/* 
	 * 関数名：setLength
	 * 説明：長さを設定するメソッド
	 * パラメータ：長さ(length)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public void setLength(int length) {
		this.length = length;
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
		return "AbstLine(length:" + length + ")";
	}
}