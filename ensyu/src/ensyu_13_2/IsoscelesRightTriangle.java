package ensyu_13_2;

// 直角二等辺三角形を描画する描画クラス
public abstract class IsoscelesRightTriangle extends Shape {
	private int height;
	
	// コンストラクタ
	public IsoscelesRightTriangle(int height) {
		setHeight(height);
	}
	
	/* 
	 * 関数名：getHeight
	 * 説明：高さを取得するメソッド
	 * パラメータ：なし
	 * 返り値：高さ(height)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public int getHeight() {
		// 返却
		return height;
	}
	
	/* 
	 * 関数名：setHeight
	 * 説明：高さを取得するメソッド
	 * パラメータ：なし
	 * 返り値：高さ(height)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/16
	 */
	public void setHeight(int height) {
		this.height = height;
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
		return "IsoscelesRightTriangle(height：" + height + ")";
	}
}