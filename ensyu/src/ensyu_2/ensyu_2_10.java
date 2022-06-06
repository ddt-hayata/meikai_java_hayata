/*
 * 名前の姓と名とを個別にキーボードに読み込んで、
 * 挨拶を行うプログラムを作成せよ。
 */
package ensyu_2;

import java.util.Scanner;

public class ensyu_2_10 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("姓名：");
		
		// 変数に代入
		String lastName = scanner.next();
		
		// コンソールに出力
		System.out.print("名：");
		
		// 変数に代入
		String firstName = scanner.next();
		
		// コンソールに出力
		System.out.println("こんにちは" + lastName + firstName + "さん。");
	}

}