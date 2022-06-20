/*
 * ここ(p.463)に示した図形クラス群を利用するプログラム例を作成せよ。
 */
package ensyu_14_1;

public class ensyu_14_1 {

	public static void main(String[] args) {
		// 配列の宣言
		Shape[] shape = new Shape[2];
		// 配列に代入
		shape[0] = new Rectangle(5, 3);
		// 配列に代入
		shape[1] = new Parallelogram(5, 3);
		
		// 配列内を繰り返し処理
		for (Shape s : shape) {
			// メソッドの呼びだし
			s.print();
			// 出力
			System.out.println("面積 = " + ((Plane2D)s).getArea());
			// 改行分の出力
			System.out.println();
		}
	}
}
