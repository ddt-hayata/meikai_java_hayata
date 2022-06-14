import id.DateId;

public class DateIdTester {
		
	public static void main(String[] args) {
		// インスタンス化
		DateId firstDate = new DateId();
		// インスタンス化
		DateId secondDate = new DateId();
		// インスタンス化
		DateId thirdDate = new DateId();
		
		// 出力
		System.out.println("aの識別番号：" + firstDate.getId());
		// 出力
		System.out.println("bの識別番号：" + secondDate.getId());
		// 出力
		System.out.println("cの識別番号：" + thirdDate.getId());
	}
}
