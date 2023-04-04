/*
 * 自動車クラスCarに対して、フィールドやメソッドを事由に追加せよ。
 */
package ensyu_8_2;

import java.util.Scanner;

class Car {
	// 名前
	private String name;
	// ナンバー
	private int carNumber;
	// 幅
	private int width;
	// 高さ
	private int height;
	// 長さ
	private int length;
	// 残り燃料
	private double fuel;
	// 燃料タンク容量
	private double fuelTank;
	// 燃費
	private double fuelConsumption;
	// 現在のX座標
	private double x;
	// 現在のY座標
	private double y;
	
	// コンストラクタ
	Car (String name, int carNumber, int width, int height, int length, double fuel, double fuelConsumption) {
		this.name = name;
		this.carNumber = carNumber;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.fuelTank = 100;
		this.fuelConsumption = fuelConsumption;
		// X座標のスタート位置
		x = 0.0;
		// Y座標のスタート位置
		y = 0.0;
	}
	// 現在のX座標を取得
	double getX() {
		return x;
	}
	// 現在のY座標を取得
	double getY() {
		return y;
	}
	// 残り燃料を取得
	double getFuel() {
		return fuel;
	}
/* 
 * 関数名：putSpec
 * 説明：Carクラスに渡された情報を表示するメソッド
 * パラメータ：なし
 * 返り値：なし
 * 作成者：早田
 * 作成日：2022/6/6
 */
	void putSpec() {
		// 出力
		System.out.println("名前：" + name);
		// 出力
		System.out.println("ナンバー：" + carNumber);
		// 出力
		System.out.println("車幅：" + width + "mm");
		// 出力
		System.out.println("車高：" + height + "mm");
		// 出力
		System.out.println("車長：" + length + "mm");
		// 出力
		System.out.println("燃料容量：" + fuelTank);
	}
/* 
 * 関数名：move
 * 説明：残り燃料で移動できるか判断するメソッド
 * パラメータ：X方向の移動距離(dx), Y方向の移動距離(dy)
 * 返り値：true or false
 * 作成者：早田
 * 作成日：2022/6/6
 */
	boolean move(double dx, double dy) {
		// 移動距離の変数
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		// 移動できない…燃料不足
		if (dist * fuelConsumption > fuel) {
			// 返却
			return false;
		// 移動距離分だけ燃料が減る
		} else {
			// 残り燃料から減算
			fuel -= dist * fuelConsumption;
			// X座標に加算
			x += dx;
			// Y座標に加算
			y += dy;
			// 返却
			return true;
		}
	}
/* 
 * 関数名：refuel
 * 説明：給油の際、給油量が容量をオーバーしないよう確認するメソッド
 * パラメータ：なし
 * 返り値：給油後の残り燃料(fuel)
 * 作成者：早田
 * 作成日：2022/6/6
 */
	double refuel() {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 正しい量が給油されているか確認
		while (true) {
			// 出力
			System.out.print("何リットル給油しますか：");
			// 変数に代入
			double refuelQuantity = scanner.nextDouble();
			// 給油量が容量より多くなる場合
			if (fuel + refuelQuantity > fuelTank) {
				// 出力
				System.out.println("容量オーバーです。");
			} else {
				// 残り燃料変数に加算
				fuel += refuelQuantity;
				// 出力
				System.out.println("給油後の燃料は" + fuel + "リットルです。");
				// ループを抜ける
				break;
			}
		}
		// 返却
		return fuel;
	}
/* 
 * 関数名：putFuelConsumption
 * 説明：移動距離・消費燃料・残り燃料を表示するメソッド
 * パラメータ：X方向の移動距離(dx), Y方向の移動距離(dy), 残り燃料(fuel)
 * 返り値：なし
 * 作成者：早田
 * 作成日：2022/6/6
 */
	void putFuelConsumption(double dx, double dy, double fuel) {
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		// 出力
		System.out.println("移動距離：" + dist + " km");
		// 消費燃料(移動距離✕燃費)
		double consumedFuel = dist * fuelConsumption;
		// 残り燃料の計算
		fuel = fuel - consumedFuel;
		// 出力
		System.out.println("消費燃料：" + consumedFuel + " リットル");
		// 出力
		System.out.println("残り燃料：" + fuel + " リットル");
	}
}

