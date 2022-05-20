package ensyu_3_18;

import java.util.Scanner;

public class ensyu_3_18 {

	public static void main(String[] args) {
		
		// Scannerクラスのインスタンスを作成し、引数で標準入力System.inを指定
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに出力
		System.out.print("季節の表示します。\n表示したい月を数字で入力してください。：");
		
		// 変数に代入
		int number = scanner.nextInt();
		
		switch (number) {
			
		// コンソールに出力
		case 3: 
		case 4:
		case 5:
			System.out.print(number + "月は春です。");
			break;
		
		// コンソールに出力
		case 6: 
		case 7:
		case 8:
			System.out.print(number + "月は夏です。");
			break;
			
		case 9: 
		case 10:
		case 11:
			System.out.print(number + "月は秋です。");
			break;
		
		case 12: 
		case 1:
		case 2:
			System.out.print(number + "月は冬です。");
			break;
		
		}
		
	}
	
}