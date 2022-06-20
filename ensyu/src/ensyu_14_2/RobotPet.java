package ensyu_14_2;

import java.util.Scanner;

class RobotPet extends Pet implements Skinnable {
	// Scannerクラスのインスタンス化
	Scanner scanner = new Scanner(System.in);
	
	// コンストラクタ
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	/* 
	 * 関数名：introduce
	 * 説明：自己紹介するメソッド
	 * パラメータ：なし
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void introduce() {
		// 出力
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		// 出力
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
	
	/* 
	 * 関数名：changeSkin
	 * 説明：スキンを変更するメソッド
	 * パラメータ：スキン(skin)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public void changeSkin() {
		// 出力
		System.out.print("色を変更しますか？(1…yes / 2…no)：");
		// 代入
		int number = scanner.nextInt();
		
		if (number == 1) {
			// 出力
			System.out.print("何色？(1…黒 / 2…赤/ 3…緑/ 4…青/ 5…豹柄)：");
			// 代入
			int skinNumber = scanner.nextInt();
			
			switch (skinNumber) {
			// 出力
			case 1 : System.out.print("黒ロボットペット");
				// 抜ける
				break;
			// 出力
			case 2 : System.out.print("赤ロボットペット");
				// 抜ける
				break;
			// 出力
			case 3 : System.out.print("緑ロボットペット");
				// 抜ける
				break;
			// 出力
			case 4 : System.out.print("青ロボットペット");
				// 抜ける
				break;
			// 出力
			case 5 : System.out.print("豹柄ロボットペット");
				// 抜ける
				break;
			}
			// 出力
			System.out.println("になりました！！");
		}
	}
}