/*
 * List2-6の2⃣の箇所を、小数部のもつ実数値をxとyに代入するように変更して、その結果を考察せよ。
 */
package ensyu_2;

public class ensyu_2_1 {

	public static void main(String[] args) {
		
		 // 変数の宣言
		int firstNumber;
		int secondNumber;
		
		// 変数の型が違う為エラーが発生する
		// 変数の型をdouble方に変更すれば正常に出力される
		
		firstNumber = 6.3;         // 変数に代入
		secondNumber = 1.8;        // 変数に代入
		
		// コンソールに出力
		System.out.println("xの値は" + firstNumber + "です。");
		
		// コンソールに出力
		System.out.println("yの値は" + secondNumber + "です。");
		
		// コンソールに出力
		System.out.println("合計は" + (firstNumber + secondNumber) + "です。");
		
		// コンソールに出力
		System.out.println("平均は" + (firstNumber + secondNumber) / 2 + "です。");

	}

}