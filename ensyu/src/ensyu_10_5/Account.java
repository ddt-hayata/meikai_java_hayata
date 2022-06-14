package ensyu_10_5;

class Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;
	
	// インスタンス初期化子
	{
		// インクリメントして代入
		id = ++counter;
		// 出力
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	// コンストラクタ
	Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}
	
	/* 
	 * 関数名：getName
	 * 説明：口座名義を取得するメソッド
	 * パラメータ：なし
	 * 返り値：口座名義(name)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	String getName() {
		return name;
	}
	
	/* 
	 * 関数名：getNo
	 * 説明：口座名義を取得するメソッド
	 * パラメータ：なし
	 * 返り値：口座番号(no)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	String getNo() {
		return no;
	}
	
	/* 
	 * 関数名：getBalance
	 * 説明：預金残高を取得するメソッド
	 * パラメータ：なし
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	long getBalance() {
		return balance;
	}
	
	/* 
	 * 関数名：getId
	 * 説明：識別番号を取得するメソッド
	 * パラメータ：なし
	 * 返り値：識別番号(id)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	int getId() {
		return id;
	}
	
	/* 
	 * 関数名：deposit
	 * 説明：預金後の残高を取得するメソッド
	 * パラメータ：預金金額(k)
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	// k円預ける
	void deposit(long k) {
		balance += k;
	}
	
	/* 
	 * 関数名：deposit
	 * 説明：引出後の残高を取得するメソッド
	 * パラメータ：引出金額(k)
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/14
	 */
	void withdraw(long k) {
		balance -= k;
		}
}
