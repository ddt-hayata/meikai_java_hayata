package ensyu_12_1;

public class Car {
	// 名前
	private String name;
	// 幅
	private int wight;
	// 高さ
	private int height;
	// 長さ
	private int length;
	// 現在のX座標
	private double x;
	// 現在のY座標
	private double y;
	// 残り燃料
	private double fuel;
	// 購入日
	private Day purchaseDay;
	
	// コンストラクタ
	public Car (String name, int wight, int height, int length, double fuel, Day purchaseDay) {
		this.name = name;	
		this.wight = wight;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = 0.0;
		y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}
	
	/* 
	 * 関数名：getX
	 * 説明：現在のX座標を取得するメソッド
	 * パラメータ：なし
	 * 返り値：X座標(x)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public double getX() {
		return x;
	}
	
	/* 
	 * 関数名：getY
	 * 説明：現在のY座標を取得するメソッド
	 * パラメータ：なし
	 * 返り値：Y座標(y)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public double getY() {
		return y;
	}
	
	/* 
	 * 関数名：getFuel
	 * 説明：燃料の量を返すメソッド
	 * パラメータ：なし
	 * 返り値：燃料の量(fuel)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public double getFuel() {
		return fuel;
	}
	
	/* 
	 * 関数名：getPurchaseDay
	 * 説明：購入日を返すメソッド
	 * パラメータ：なし
	 * 返り値：購入日(Day purchaseDay)
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	/* 
	 * 関数名：putSpec
	 * 説明：スペック表示するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public void putSpec() {
		// 出力
		System.out.println("名前：" + name);
		// 出力
		System.out.println("車幅：" + wight + "mm");
		// 出力
		System.out.println("車高：" + height + "mm");
		// 出力
		System.out.println("車長：" + length + "mm");
	}
	
	/* 
	 * 関数名：move
	 * 説明：移動状況を返すメソッド
	 * パラメータ：X座標(double dx), Y座標(double dy)
	 * 返り値：true or false
	 * 作成者：早田
	 * 作成日：2022/6/15
	 */
	public boolean move(double dx, double dy) {
		// 移動距離
		double distance = Math.sqrt(dx * dx + dy * dy);
		// 移動できない…燃料不足
		if (distance > fuel) {
			return false;
		// 移動距離分だけ燃料が減る
		} else {
			fuel -= distance;
			x += dx;
			y += dy;
			// 移動完了　
			return true;
		}
	}
}

