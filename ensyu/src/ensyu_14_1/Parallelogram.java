package ensyu_14_1;

// 平行四辺形
public class Parallelogram extends Shape implements Plane2D {
	private int width;
	private int height;
	
	// コンストラクタ
	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 文字列の表現
	public String toString() {
		// 返却
		return "Parallelogram(width：" + width + ", height：" + height + ")";
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
			for (int j = 1; j <= height - i; j++) {
				System.out.print(' ');
			}
			for (int j  = 1; j <= width; j++) {
				System.out.print('#');
			}
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
