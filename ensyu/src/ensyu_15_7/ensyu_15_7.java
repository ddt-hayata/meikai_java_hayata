package ensyu_15_7;
/*
 * List15-15のfor文を拡張for文で実現したプログラムを作成せよ。
 */
public class ensyu_15_7 {
	
	public static void main(String[] args) {
		// 受け取り用の変数
		double sum = 0.0;
		// 配列用変数
		int element = args.length;
		// 配列の宣言
		double[] array = new double[element];
		// 配列への代入ループ
		for (int i = 0; i < args.length; i++) {
			// 変数に加算
			array[i] = Double.parseDouble(args[i]);
		}
		
		for (double a : array) {
			sum += a;
		}
 		// 出力
		System.out.println("合計は" + sum + "です。");
	}
}
