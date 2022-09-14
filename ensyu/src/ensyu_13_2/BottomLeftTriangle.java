package ensyu_13_2;

// 左下直角二等辺三角形を描画するクラス
public class BottomLeftTriangle extends IsoscelesRightTriangle {
	
	// コンストラクタ
	public BottomLeftTriangle(int height) {
		super(height);
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
		return "BottomLeftTriangle(height：" + getHeight() + ")";
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
		for (int i = 1; i <= getHeight(); i++) {
			for (int j = 1; j <= i ; j++) {
				// 出力
				System.out.print('*');
			}
			// 出力
			System.out.println();
		}
		// 出力
		System.out.println();
	}
}