package ensyu_12_1;

class CarTotalDistance extends Car {
	private double totalDistance;
	
	// コンストラクタ
	CarTotalDistance(String name, int wight, int height, int length, double fuel, Day purchaseDay, double totalDistance) {
		super(name, wight, height, length, fuel, purchaseDay);
		this.totalDistance = totalDistance;
	}
	
	/* 
	 * 関数名：getTotalDistance
	 * 説明：総走行距離を返すメソッド
	 * パラメータ：なし
	 * 返り値：総走行距離(totalDistance)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	// 総走行距離を返すメソッド
	double getTotalDistance() {
		// 返却
		return totalDistance;
	}
}
