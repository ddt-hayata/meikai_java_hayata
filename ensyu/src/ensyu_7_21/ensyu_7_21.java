/*
 * 配列aと配列bの全要素の値を交換するメソッドaryExchng()を作成せよ。
 * 二つの配列の要素数が等しくない場合は、小さいほうの要素数分の要素を交換すること。
 */
package ensyu_7_21;

import java.util.Scanner;

public class ensyu_7_21 {
	 /* 
     * 関数名：aryExchng
     * 説明：配列aと配列bの全要素の値を交換するメソッド
     * パラメータ：配列firstArrayを受け取る(int[] a)、配列secondNumberを受け取る(int[] b)
     * 返り値：なし
     * 作成者：早田
     * 作成日：2022/6/2
     */
	static void aryExchng(int[] a, int[] b) {
		// 交換用配列の宣言
		int [] change;
		// 要素数変数
		int elementCount = 0;
		// aの要素数がbの要素数以上の場合
		if (a.length >= b.length) {
			// aの要素数を持つ配列の宣言
			change = new int[a.length];
			// 要素数の少ない方の長さを代入
			elementCount = b.length;
		// bの配列数のほうが多い場合
		} else {
			// bの要素数を持つ配列の宣言
			change = new int[b.length];
			// 要素数の少ない方の長さを代入
			elementCount = a.length;
		}
		// 配列aの要素を配列changeへ
		for (int i = 0; i < elementCount; i++) {
			// 要素を移動
			change[i] = a[i];
		}
		// 配列bの要素を配列aへ
		for (int i = 0; i < elementCount; i++) {
			// 要素を移動
			a[i] = b[i];
		}
		// 配列changeの要素を配列bへ
		for (int i = 0; i <elementCount; i++) {
			// 要素を移動
			b[i] = change[i];
		}
	}
	public static void main(String[] args) {
		// Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		// 出力
		System.out.print("配列aの要素数：");
		// 変数に代入
		int firstNumber = scanner.nextInt();
		// 配列aの宣言
		int[] firstArray = new int[firstNumber];
		// 配列aに要素を代入
		for (int i = 0; i < firstArray.length; i++) {
			// 出力
			System.out.print("a[" + i + "]：");
			// 配列に代入
			firstArray[i] = scanner.nextInt();
		}
		// 出力
		System.out.print("配列bの要素数：");
		// 変数に代入
		int secondNumber = scanner.nextInt();
		// 配列aの宣言
		int[] secondArray = new int[secondNumber];
		// 配列aに要素を代入
		for (int i = 0; i < secondArray.length; i++) {
			// 出力
			System.out.print("b[" + i + "]：");
			// 配列に代入
			secondArray[i] = scanner.nextInt();
		}
		
		// 出力
		System.out.print("配列a = { ");
		// 出力ループ
		for (int i = 0; i < firstArray.length; i++) {
			// 出力
			System.out.print(firstArray[i] + " ");
		}
		// 出力
		System.out.println("}");
		
		// 出力
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < secondArray.length; i++) {
			// 出力
			System.out.print(secondArray[i] + " ");
		}
		// 出力
		System.out.println("}");
		
		// メソッドの呼び出し
		aryExchng(firstArray, secondArray);
		
		// 出力
		System.out.println("配列aと配列bの要素を入れ替えます。");
		// 出力
		System.out.print("配列a = { ");
		// 出力ループ
		for (int i = 0; i < firstArray.length; i++) {
			// 出力
			System.out.print(firstArray[i] + " ");
		}
		// 出力
		System.out.println("}");
		
		// 出力
		System.out.print("配列b = { ");
		// 出力ループ
		for (int i = 0; i < secondArray.length; i++) {
			// 出力
			System.out.print(secondArray[i] + " ");
		}
		// 出力
		System.out.println("}");
	}
}
