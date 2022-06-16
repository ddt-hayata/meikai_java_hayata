package ensyu_13_1;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	// コンストラクタ
	Rectangle(int width, int height) {
		this.width = width;
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
		return "Rectangle(width：" + width + ", height：" + height + ")";
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
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				// 出力
				System.out.print('*');
			}
			// 出力
			System.out.println();
		}
	}
}
