/*
 * 自動車クラスCarに対して、フィールドやメソッドを事由に追加せよ。
 */
package ensyu_8_2;

import java.util.Scanner;

public class ensyu_8_2_main {

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.println("車のデータを入力せよ。");
		// 出力
		System.out.print("名前は：");
		// 変数に代入
		String name = scanner.next();
		// 出力
		System.out.print("ナンバーは：");
		// 変数に代入
		int carNumber = scanner.nextInt();
		// 出力
		System.out.print("車幅は：");
		// 変数に代入
		int wight = scanner.nextInt();
		// 出力
		System.out.print("高さは：");
		// 変数に代入
		int height = scanner.nextInt();
		// 出力
		System.out.print("長さは：");
		// 変数に代入
		int length = scanner.nextInt();
		// 出力
		System.out.print("ガソリンの量は：");
		// 変数に代入
		double fuel = scanner.nextDouble();
		// 出力
		System.out.print("1km辺りの消費燃費は：");
		// 変数に代入
		double fuelConsumption = scanner.nextDouble();
		
		// インスタンス化
		Car myCar = new Car(name, carNumber, wight, height, length, fuel, fuelConsumption);
		
		// 移動距離(x軸)変数
		double dx = 0.0;
		// 移動距離(y軸)変数
		double dy = 0.0;
		
		while (true) {
			// 出力
			System.out.println("現在地（" + myCar.getX() + ", " + myCar.getY() + ")\n残り燃料： " + myCar.getFuel());
			// 出力
			System.out.print("給油しますか【0…No / 1…Yes】： ");
			// 1が入力されたら
			if (scanner.nextInt() == 1) {
				// インスタンスメソッドの呼び出し
				fuel = myCar.refuel();
			}
			// 出力
			System.out.print("移動しますか【0…No / 1…Yes】： ");
			// 0が入力されたら
			if (scanner.nextInt() == 0) {
				break;
			}
			// 出力
			System.out.print("X方向の移動距離：");
			// 変数に代入
			dx = scanner.nextDouble();
			// 出力
			System.out.print("Y方向の移動距離：");
			// 変数に代入
			dy = scanner.nextDouble();
			
			// 移動距離が残り燃料で足りない時
			if (!myCar.move(dx, dy)) {
				// 出力
				System.out.println("燃料が足りません！");
			}
		}
		// インスタンスメソッドの呼び出し
		myCar.putFuelConsumption(dx, dy, fuel);
	}
}
