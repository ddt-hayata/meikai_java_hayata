/*
 * インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示するように、
 * 銀行口座クラスAccountを変更せよ。表示はインスタンス初期化子で行うこと。
 */
package ensyu_10_5;

public class ensyu_10_5 {

	public static void main(String[] args) {
		
		// インスタンス化	                          
		Account adachi = new Account("足立幸一", "123456", 1000);
		// 出力
		System.out.println("■足立君の口座");
		// 出力
		System.out.println("口座名義：" + adachi.getName());
		// 出力
		System.out.println("口座番号：" + adachi.getNo()); 
		// 出力
		System.out.println("預金残高：" + adachi.getBalance());
		// 出力
		System.out.println("識別番号：" + adachi.getId());
		
		// インスタンス化	
		Account nakata = new Account("仲田真二", "654321", 200);
		// 出力
		System.out.println("■仲田君の口座");
		// 出力
		System.out.println("口座名義：" + nakata.getName());
		// 出力
		System.out.println("口座番号：" + nakata.getNo());
		// 出力
		System.out.println("預金残高：" + nakata.getBalance());
		// 出力
		System.out.println("識別番号：" + nakata.getId());
	}
}