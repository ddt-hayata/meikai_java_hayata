/*
 * List10-3に示した連番クラスIdに、最後に与えた識別番号を返すメソッドを返すクラスメソッドgetMaxIdを追加せよ。
 * なお、このメソッドは、インスタンスをn個生成した時点で呼び出すことn個返すことになる。
 */
package ensyu_10_1;

// 連番クラス
class Id {
	static int counter = 0;
	private int id;

	// コンストラクタ
	public Id() {
		id = ++counter;
	}
	/* 
	 * 関数名：getId
	 * 説明：識別番号を取得するメソッド
	 * パラメータ：なし
	 * 返り値：識別番号(id)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public int getId() {
		// 返却
		return id;
	}
	/* 
	 * 関数名：getMaxId
	 * 説明：最後に与えた識別番号を返すメソッド
	 * パラメータ：なし
	 * 返り値：クラス変数の値(counter)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	static int getMaxId() {
		return counter;
	}
}

public class ensyu_10_1{

	public static void main(String[] args) {
		// インスタンス化
		Id a = new Id();
		// インスタンス化
		Id b = new Id();
		// インスタンス化
		Id c = new Id();
		
		// 出力
		System.out.println("aの識別番号：" + a.getId());
		// 出力
		System.out.println("bの識別番号：" + b.getId());
		// 出力
		System.out.println("cの識別番号：" + c.getId());
		// メソッドを呼び出して出力
		System.out.println("最後に付与した識別番号は" + Id.getMaxId() + "です。");
	}
}
