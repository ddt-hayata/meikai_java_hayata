package ensyu_12_1;

public class ensyu_12_1 {

	public static void main(String[] args) {
		// インスタンス化
		CarTotalDistance myCar = new CarTotalDistance("愛車", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18), 10000);
		
		// インスタンスメソッドの呼び出し
		myCar.putSpec();
		
		// 出力
		System.out.println("購入日：" + myCar.getPurchaseDay().toString());
		// 出力
		System.out.println("総走行距離：" + myCar.getTotalDistance() + "km");
	}
}
