/*
 * 定期預金付き銀行口座クラス型変数a, bの普通預金と
 * 定期預金残高の合計額を比較した結果を返却するメソッドcompBalance(Account a, Account b)を作成せよ。
 * 合計額を比較して、aのほうが多ければ1、等しければ0、bのほうが多ければ-1を返却すること。
 * もしaやbの参照先が、定期預金を持たないAccount型のインスタンスであれば、
 * 普通預金の金額を比較すること。
 */
package ensyu_12_2;

public class ensyu_12_2 {
	
	/* 
	 * 関数名：compBalance
	 * 説明：口座名義を返すメソッド
	 * パラメータ：なし
	 * 返り値：名前(name)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	static int compBalance(Account a, Account b) {
		// 普通預金と定期預金の金額の合計を比較
		if (a.getBalance() > b.getBalance()) {
			// 返却
			return 1;
		} else if (a.getBalance() < b.getBalance()) {
			// 返却
			return -1;
		}
		// 返却
		return 0;
	}
	
	public static void main(String[] args) {
		// インスタンス化	                          
		Account a = new Account("足立幸一", "123456", 1000);
		// インスタンス化
		TimeAccount b = new TimeAccount("仲田真二", "654321", 1000, 500);
		
		// メソッドの呼び出し・出力
		if (compBalance(a, b) == 1) {
			// 出力
			System.out.println("aのほうが多いです。");
		} else if (compBalance(a, b) == -1) {
			// 出力
			System.out.println("bのほうが多いです。");
		} else {
			// 出力
			System.out.println("同じです。");
		}
	}
}

/*もしaとb両方とも定期預金を保つ場合、
 * compBalance(TimeAccount a, TimeAccount b)でメソッドを作成しなければならない。
 */
