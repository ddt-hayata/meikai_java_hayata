package ensyu_12_2;

class TimeAccount extends Account {
	private long timeBalance = 0;
	
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	/* 
	 * 関数名：getTimeBalance
	 * 説明：定期預金の残高を返すメソッド
	 * パラメータ：なし
	 * 返り値：定期預金金額(natimeBalanceme)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	long getTimeBalance() {
		return timeBalance;
	}
	
	/* 
	 * 関数名：cancel
	 * 説明：定期預金を解約して全額を普通預金に移すメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
