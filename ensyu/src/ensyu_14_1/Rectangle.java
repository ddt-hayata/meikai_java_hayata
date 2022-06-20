package ensyu_14_1;

//長方形を描画するクラス
public class Rectangle extends Shape implements Plane2D {
	private int width;
	private int height;
	
	// コンストラクタ
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/* 
	 * 関数名：toString
	 * 説明：図形情報の表示をする文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値：文字列
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public String toString() {
		// 返却
		return "Rectangle(width：" + width + ", height：" + height + ")";
	}
	
	/* 
	 * 関数名：draw
	 * 説明：図形を描画するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				// 出力
				System.out.print('*');
			}
			// 改行文の出力
			System.out.println();
		}
	}
	
	/* 
	 * 関数名：draw
	 * 説明：面積を求めるメソッド
	 * パラメータ：なし
	 * 返り値：面積(width * height)
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public int getArea() {
		// 返却
		return width * height;
	}
}
