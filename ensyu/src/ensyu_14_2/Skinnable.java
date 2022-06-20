package ensyu_14_2;

// 着せかえインターフェイス
public interface Skinnable {
	// 黒
	int BLACK = 0;
	// 赤
	int RED = 1;
	// 緑
	int GREEN = 2;
	// 青
	int BLUE = 3;
	// 豹柄
	int LEOPARD = 4;
	
	/* 
	 * 関数名：changeSkin
	 * 説明：スキンを変更する抽象メソッド
	 * パラメータ：
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	void changeSkin();
}
