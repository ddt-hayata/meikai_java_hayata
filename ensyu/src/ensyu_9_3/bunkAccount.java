package ensyu_9_3;

class Account {
	// 名前
	private String name;
	// 口座番号
	private String number;
	// 残高
	private long balance;
	// 口座開設日
	private Day openDay;
	
	// コンストラクタ
	Account(String name, String number, long money, Day day) {
		this.name = name;
		this.number = number;
		this.balance = money;
		this.openDay = new Day(day);
	}
	
	/* 
	 * 関数名：getName
	 * 説明：口座名義を返すメソッド
	 * パラメータ：なし
	 * 返り値：名前(name)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public String getName() {
		// 返却
		return name;
	}
	/* 
	 * 関数名：getNumber
	 * 説明：口座番号を返すメソッド
	 * パラメータ：なし
	 * 返り値：名前(number)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public String getNumber() {
		// 返却
		return number;
	}
	/* 
	 * 関数名：getBalance
	 * 説明：預金残高を返すメソッド
	 * パラメータ：なし
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public long getBalance() {
		// 返却
		return balance;
	}
	/* 
	 * 関数名：getName
	 * 説明：預金後の残高を返すメソッド
	 * パラメータ：預金金額(inMoney)
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public void deposit(long inMoney) {
		// 加算
		balance += inMoney;
	}
	/* 
	 * 関数名：getName
	 * 説明：引出後の残高を返すメソッド
	 * パラメータ：引出金額(outMoney)
	 * 返り値：預金残高(balance)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public void withdraw(long outMoney) {
		// 減算
		balance -= outMoney;
		}
	/* 
	 * 関数名：getOpeningDate
	 * 説明：口座開設日を返すメソッド
	 * パラメータ：なし
	 * 返り値：口座開設日(year, month, date)
	 * 作成者：早田
	 * 作成日：2022/6/8
	 */
	public Day getOpeningDate() {
		// 返却
		return new Day(openDay);
	}
}
