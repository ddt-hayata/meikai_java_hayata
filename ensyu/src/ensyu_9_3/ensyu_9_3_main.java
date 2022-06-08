/*
 * 第8章で作成した《銀行口座クラス（第2版）》に、口座開設日のフィールドとtoStringメソッドを追加せよ。
 * ※コンストラクタを変更したり、口座開設日のゲッタ（口座開設日フィールドが参照する二付インスタンスコピーを返す）
 * などのメソッドを追加せよ。
 */
package ensyu_9_3;

public class ensyu_9_3_main {

	public static void main(String[] args) {
		
		// インスタンス化	                          
		Account adachi = new Account("足立幸一", "123456", 1000, new Day(2022, 5, 1));
		// インスタンス化	 
		Account nakata = new Account("仲田真二", "654321", 200, new Day(2022, 6, 1));
		
		// 200円預金
		adachi.withdraw(200);
		// 100円引出
		nakata.deposit(100);
		
		// 出力
		System.out.println("■足立君の口座");
		// 出力
		System.out.println("口座名義：" + adachi.getName());
		// 出力
		System.out.println("口座番号：" + adachi.getNumber()); 
		// 出力
		System.out.println("預金残高：" + adachi.getBalance());
		// 出力
		System.out.println("口座開設日：" + adachi.getOpeningDate().toString());
		
		// 出力
		System.out.println("■仲田君の口座");
		// 出力
		System.out.println("口座名義：" + nakata.getName());
		// 出力
		System.out.println("口座番号：" + nakata.getNumber());
		// 出力
		System.out.println("預金残高：" + nakata.getBalance());
		// 出力
		System.out.println("預金残高：" + nakata.getOpeningDate().toString());
	}
}