/*
 * コマンドライン引数で与えられた半径を持つ
 * 円の円周の長さと面積を求めて表示するプログラムを作成せよ。
 */
package ensyu_15_6;

public class ensyu_15_6 {

	public static void main(String[] args) {
		// 受け取り用の変数
		double radius = Double.parseDouble(args[0]);
		
		// 円周の計算
		double circumference = radius * 2 * Math.PI;
		// 面積の計算
		double area = radius * radius * Math.PI;
		
		// 出力
		System.out.println("半径" + radius + "円周の長さは" + circumference + "です。");
		// 出力
		System.out.println("半径" + radius + "円周の長さは" + area + "です。");
	}
}
