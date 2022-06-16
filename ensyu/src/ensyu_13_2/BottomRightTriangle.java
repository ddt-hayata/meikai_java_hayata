package ensyu_13_2;

// 右下直角二等辺三角形を描画するクラス
public class BottomRightTriangle extends IsoscelesRightTriangle {
	
	// コンストラクタ
	public BottomRightTriangle(int height) {
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
		return "BottomRightTriangle(height：" + getHeight() + ")";
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
			for (int j = 1; j <= getHeight() ; j++) {
				if (j <= getHeight() - i) {
					// 出力
					System.out.print(" ");
				} else {
					// 出力
					System.out.print('*');
				}
			}
			// 出力
			System.out.println();
		}
	}
}
