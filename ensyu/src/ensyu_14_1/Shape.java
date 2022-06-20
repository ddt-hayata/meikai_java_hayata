package ensyu_14_1;

// 図形クラス（抽象クラス）
public abstract class Shape {
	/* 
	 * 関数名：toString
	 * 説明：図形情報の表示をする文字列を返却する抽象メソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public abstract String toString();
	
	/* 
	 * 関数名：draw
	 * 説明：図形を描画するための抽象メソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public abstract void draw();
	
	/* 
	 * 関数名：print
	 * 説明：図形情報の表示と図形を描画する抽象メソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void print() {
		// 出力
		System.out.println(toString());
		// メソッドの呼び出し
		draw();
	}
}