/*
 * 全問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ。
 * インスタンスを生成するたびに識別番号をnずつ増やして与える（nは整数）。
 * nの値は、指定されない限り1とするが、メソッドを通じて取得できるようにする。
 * たとえばインスタンスを3こ生成した後にnを4に変更した場合、
 * インスタンスに与える識別番号は生成順に1, 2, 3, 7, 11, 15…となる。
 */
package ensyu_10_2;
import java.util.Scanner;

// 連番クラス
class ExId {
	static int counter = 0;
	private int id;
	
	// コンストラクタ
	public ExId(int number) {
		// 指定された場合、その値分クラス変数を加算
		if (number != 0) {
			id = counter + number;
			counter = id;
		// 指定されない場合
		} else {
			id = ++counter;
		}
	}
	/* 
	 * 関数名：getId
	 * 説明：識別番号を取得するメソッド
	 * パラメータ：なし
	 * 返り値：識別番号(id)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	public int getId() {
		// 返却
		return id;
	}
	/* 
	 * 関数名：getMaxId
	 * 説明：最後に与えた識別番号を返すメソッド
	 * パラメータ：なし
	 * 返り値：クラス変数の値(counter)
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	static int getMaxId() {
		return counter;
	}
	/* 
	 * 関数名：intervalNumber
	 * 説明：
	 * パラメータ：識別番号の間隔n(number)
	 * 返り値：1以上の場合は識別番号の間隔n(number)、0の場合は整数1を返却
	 * 作成者：早田
	 * 作成日：2022/6/13
	 */
	static int intervalNumber(int number) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		if (number != 0) {
			// 返却
			return number;
		} else {
			// 返却
			return 1;
		}
	}
}

public class ensyu_10_2{

	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 間隔用変数の初期化
		int number = 0;
		// インスタンス化
		ExId a = new ExId(ExId.intervalNumber(number));
		// インスタンス化
		ExId b = new ExId(ExId.intervalNumber(number));
		// インスタンス化
		ExId c = new ExId(ExId.intervalNumber(number));
		
		// 出力
		System.out.println("aの識別番号：" + a.getId());
		// 出力
		System.out.println("bの識別番号：" + b.getId());
		// 出力
		System.out.println("cの識別番号：" + c.getId());
		
		// 出力
		System.out.print("識別番号の間隔n：");
		// 変数に代入
		number = scanner.nextInt();
		// インスタンス・メソッドの呼び出し
		ExId.intervalNumber(number);
		
		// インスタンス化
		ExId d = new ExId(ExId.intervalNumber(number));
		// インスタンス化
		ExId e = new ExId(ExId.intervalNumber(number));
		// インスタンス化
		ExId f = new ExId(ExId.intervalNumber(number));
		
		// 出力
		System.out.println("dの識別番号：" + d.getId());
		// 出力
		System.out.println("eの識別番号：" + e.getId());
		// 出力
		System.out.println("fの識別番号：" + f.getId());
		// メソッドを呼び出して出力
		System.out.println("最後に付与した識別番号は" + ExId.getMaxId() + "です。");
	}
}
