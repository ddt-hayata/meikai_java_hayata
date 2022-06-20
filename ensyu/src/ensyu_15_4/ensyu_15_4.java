/*
 * 浮動小数点値xを、小数点以下の部分をp桁で、
 * 全体を少なくともw桁で表示するメソッドprintDoubleを作成せよ。
 */
package ensyu_15_4;

public class ensyu_15_4 {
	
	/* 
	 * 関数名：printDouble
	 * 説明：浮動小数点値xを小数点以下の部分をp桁で全体を少なくともw桁で表示するメソッド
	 * パラメータ：浮動小数点値(x), 小数点以下の桁数(p), 全体の桁数(w)
	 * 返り値：なし
	 * 作成者：早田
	 * 作成日：2022/6/17
	 */
	public static void printDouble(double x, int p, int w) {
		// 出力
		System.out.printf(("%" + w + "." + p + "f"), x);
	}
	
	public static void main(String[] args) {
		// メソッドの呼び出し
		printDouble(1.111, 5, 10);
	}
}
